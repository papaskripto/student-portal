package com.papaskripto.studentportal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table (name = "STUDENTS")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)

    @Column (name = "ADMISSION_NUMBER")
    private String admissionNumber;

    @Column (name = "USER_ID", nullable = false)
    private UUID userId;

    @Column (name = "FIRST_NAME")
    private String firstName;

    @Column (name = "MIDDLE_NAME")
    private String middleName;

    @Column (name = "LAST_NAME")
    private String lastName;
}