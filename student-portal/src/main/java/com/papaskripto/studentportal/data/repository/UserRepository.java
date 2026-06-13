package com.papaskripto.studentportal.data.repository;

import com.papaskripto.studentportal.data.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
}
