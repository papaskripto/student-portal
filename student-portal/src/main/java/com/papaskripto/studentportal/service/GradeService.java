package com.papaskripto.studentportal.service;

import com.papaskripto.studentportal.data.entity.GradeEntity;
import com.papaskripto.studentportal.data.entity.Role;
import com.papaskripto.studentportal.data.entity.UserEntity;
import com.papaskripto.studentportal.data.repository.GradeRepository;
import com.papaskripto.studentportal.web.model.Grade;
import com.papaskripto.studentportal.web.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service

public class GradeService {

    private final GradeRepository gradeRepository;

    public GradeService (GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    public List<Grade> listAllGrades () {
        List<GradeEntity> gradeEntities = this.gradeRepository.findAll();
        List<Grade> grades = new ArrayList<>(gradeEntities.size());
        gradeEntities.forEach(gradeEntity -> grades.add(new Grade(gradeEntity.getGradeId(), gradeEntity.getAdmissionNumber(), gradeEntity.getSubjectId(), gradeEntity.getAcademicYear(),
                gradeEntity.getScore(), gradeEntity.getCreatedAt())));
        return grades;
    }

    public Grade getGradeById (UUID id) {
        Optional<GradeEntity> gradeEntity = this.gradeRepository.findById(String.valueOf(id));
        return gradeEntity.map(this::getGradeFromEntity).orElse(null);
    }

    public Grade addGrade (Grade grade) {
        GradeEntity gradeEntity = this.getGradeEntityFromGrade(grade);
        gradeEntity = this.gradeRepository.save(gradeEntity);
        return this.getGradeFromEntity(gradeEntity);
    }

    public void deleteGrade (UUID id) {
        this.gradeRepository.deleteById(String.valueOf(id));
    }

    private Grade getGradeFromEntity (GradeEntity gradeEntity) {
        return new Grade(gradeEntity.getGradeId(), gradeEntity.getAdmissionNumber(), gradeEntity.getSubjectId(), gradeEntity.getAcademicYear(), gradeEntity.getScore(), gradeEntity.getCreatedAt());
    }

    private GradeEntity getGradeEntityFromGrade (Grade grade) {
        return new GradeEntity(grade.getGradeId(), grade.getAdmissionNumber(), grade.getSubjectId(), grade.getAcademicYear(), grade.getScore(), grade.getCreatedAt());
    }
}
