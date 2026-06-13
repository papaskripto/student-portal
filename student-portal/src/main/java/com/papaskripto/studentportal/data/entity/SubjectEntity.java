package com.papaskripto.studentportal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table (name = "SUBJECTS")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SubjectEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)

    @Column (name = "SUBJECT_ID")
    private UUID subjectId;

    @Column (name = "SUBJECT_NAME")
    private String subjectName;
}