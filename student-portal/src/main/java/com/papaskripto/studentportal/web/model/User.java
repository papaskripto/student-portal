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

public class User {

    private UUID userId;
    private String username;
    private String password;
    private String role;

}
