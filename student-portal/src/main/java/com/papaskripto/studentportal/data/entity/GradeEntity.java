package com.papaskripto.studentportal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table (name = "GRADES", uniqueConstraints = {
        @UniqueConstraint(
                name = "UNIQUE_SUBJECT_STUDENT_YEAR",
                columnNames = {"ADMISSION_NUMBER, SUBJECT_ID, ACADEMIC_YEAR"}
        )
})
@Data
@AllArgsConstructor
@NoArgsConstructor

public class GradeEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)

    @Column (name = "GRADE_ID")
    private UUID gradeId;

    @Column (name = "ADMISSION_NUMBER", nullable = false)
    private String admissionNumber;

    @Column (name = "SUBJECT_ID")
    private UUID subjectId;

    @Column (name = "ACADEMIC_YEAR")
    private int academicYear;

    @Column (name = "SCORE")
    private float score;

    @Column (name = "CREATED_AT")
    private LocalDateTime createdAt;

}
