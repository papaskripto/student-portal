package com.papaskripto.studentportal.data.repository;

import com.papaskripto.studentportal.data.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SubjectRepository extends JpaRepository<SubjectEntity, UUID> {
}
