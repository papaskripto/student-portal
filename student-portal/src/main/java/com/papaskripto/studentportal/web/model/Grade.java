package com.papaskripto.studentportal.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Grade {

    private UUID gradeId;
    private String admissionNumber;
    private UUID subjectId;
    private int academicYear;
    private float score;
    private LocalDateTime createdAt;
}
