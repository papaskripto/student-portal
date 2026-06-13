package com.papaskripto.studentportal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table (name = "USERS")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)

    @Column (name = "USER_ID")
    private UUID userId;

    @Column (name = "USERNAME")
    private String username;

    @Column (name = "PASSWORD")
    private String password;

    @Enumerated (EnumType.STRING)
    @Column (name = "ROLE")
    private Role role;
}