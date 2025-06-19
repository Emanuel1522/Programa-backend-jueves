package com.example.ClassRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_teacher")
    private Integer id;

    private String specialty;


    //Creating relationship with user (1 to 1)
    @OneToOne
    @JoinColumn(name = "fk_user", referencedColumnName = "id_user")
    @JsonBackReference(value = "teacherUser")
    private User user;

    //Creating relationship with course (1 to many)
    @OneToMany(mappedBy = "teacher")
    @JsonManagedReference(value = "courseTeacher")
    private List<Course> courses;


    public Teacher() {
    }

    public Teacher(Integer id, String specialty) {
        this.id = id;
        this.specialty = specialty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
