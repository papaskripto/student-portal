package com.papaskripto.studentportal.data.repository;

import com.papaskripto.studentportal.data.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<StudentEntity, UUID> {
}
