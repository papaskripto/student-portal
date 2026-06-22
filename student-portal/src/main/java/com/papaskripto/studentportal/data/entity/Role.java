package com.papaskripto.studentportal.data.entity;

public enum Role {

    PARENT, TEACHER, ADMIN;

    public String toString () {
        return switch (this) {
            case PARENT -> "PARENT";
            case TEACHER -> "TEACHER";
            case ADMIN -> "ADMIN";
        };
    }
}
