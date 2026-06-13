package com.papaskripto.studentportal.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    private String admissionNumber;
    private UUID userId;
    private String firstName;
    private String middleName;
    private String lastName;

}
