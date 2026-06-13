package com.papaskripto.studentportal.data.repository;

import com.papaskripto.studentportal.data.entity.GradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GradeRepository extends JpaRepository<GradeEntity, String> {
}
