package com.papaskripto.studentportal.data.entity;

public enum Role {

    PARENT, TEACHER;

    public String toString () {
        return switch (this) {
            case PARENT -> "PARENT";
            case TEACHER -> "TEACHER";
        };
    }
}
