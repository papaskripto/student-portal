package com.papaskripto.studentportal.service;

import com.papaskripto.studentportal.data.entity.StudentEntity;
import com.papaskripto.studentportal.data.repository.StudentRepository;
import com.papaskripto.studentportal.web.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService (StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> listAllStudents () {
        List<StudentEntity> studentEntities = this.studentRepository.findAll();
        List<Student> students = new ArrayList<>(studentEntities.size ());
        studentEntities.forEach(studentEntity -> students.add (new Student(studentEntity.getAdmissionNumber(), studentEntity.getUserId(), studentEntity.getFirstName(),
                studentEntity.getMiddleName(), studentEntity.getLastName())));
        return students;
    }

    public Student getStudentById (UUID id) {
        Optional<StudentEntity> studentEntity = this.studentRepository.findById(id);
        return studentEntity.map(this::getStudentFromEntity).orElse(null);
    }

    public Student addStudent (Student student) {
        StudentEntity studentEntity = this.getStudentEntityFromStudent(student);
        studentEntity = this.studentRepository.save(studentEntity);
        return this.getStudentFromEntity(studentEntity);
    }

    public void removeStudent (UUID id) {
        this.studentRepository.deleteById(id);
    }

    private Student getStudentFromEntity (StudentEntity studentEntity) {
        return new Student (studentEntity.getAdmissionNumber(), studentEntity.getUserId(), studentEntity.getFirstName(),
                studentEntity.getMiddleName(), studentEntity.getLastName());
    }

    private StudentEntity getStudentEntityFromStudent (Student student) {
        return new StudentEntity(student.getAdmissionNumber(), student.getUserId(), student.getFirstName(),
                student.getMiddleName(), student.getLastName());
    }
}
