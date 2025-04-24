package com.example.ClassRoomAPI.helper;

public enum APIMessages {

    ERROR_USER_NOT_FOUND("The user searched is not in the database"),
    ERROR_TEACHER_NOT_FOUND("The teacher searched is not in the database"),
    ERROR_STUDENT_NOT_FOUND("The student searched is not in the database"),
    ERROR_REGISTRATION_NOT_FOUND("The registration searched is not in the database"),
    ERROR_SUBJECT_NOT_FOUND("The subject searched is not in the database"),
    ERROR_QUALIFICATION_NOT_FOUND("The qualification searched is not in the database"),
    ERROR_COURSE_NOT_FOUND("The subject searched is not in the database"),
    ERROR_ATTENDANCE_NOT_FOUND("The attendance searched is not in the database"),
    ;

    private String message;

    APIMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
