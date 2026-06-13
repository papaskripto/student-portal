package com.papaskripto.studentportal.service;

import com.papaskripto.studentportal.data.entity.StudentEntity;
import com.papaskripto.studentportal.data.entity.SubjectEntity;
import com.papaskripto.studentportal.data.entity.UserEntity;
import com.papaskripto.studentportal.data.repository.SubjectRepository;
import com.papaskripto.studentportal.web.model.Student;
import com.papaskripto.studentportal.web.model.Subject;
import com.papaskripto.studentportal.web.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service

public class SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> listAllSubjects() {
        List<SubjectEntity> subjectEntities = this.subjectRepository.findAll();
        List<Subject> subjects = new ArrayList<>(subjectEntities.size());
        subjectEntities.forEach(subjectEntity -> subjects.add(new Subject(subjectEntity.getSubjectId(), subjectEntity.getSubjectName())));
        return subjects;
    }

    public Subject getSubjectById(UUID id) {
        Optional<SubjectEntity> subjectEntity = this.subjectRepository.findById(id);
        return subjectEntity.map(this::getSubjectFromEntity).orElse(null);
    }

    public Subject addSubject(Subject subject) {
        SubjectEntity subjectEntity = this.getSubjectEntityFromSubject(subject);
        subjectEntity = this.subjectRepository.save(subjectEntity);
        return this.getSubjectFromEntity(subjectEntity);
    }

    public void deleteSubject (UUID id) {
        this.subjectRepository.deleteById(id);
    }

    private Subject getSubjectFromEntity (SubjectEntity subjectEntity) {
        return new Subject(subjectEntity.getSubjectId(), subjectEntity.getSubjectName());
    }

    private SubjectEntity getSubjectEntityFromSubject (Subject subject) {
        return new SubjectEntity (subject.getSubjectId(), subject.getSubjectName());
    }
}
