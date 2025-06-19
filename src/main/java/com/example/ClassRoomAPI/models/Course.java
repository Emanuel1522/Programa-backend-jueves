package com.example.ClassRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Integer id;

    private String name;


    //Creating relationship with teacher (many to 1)
    @ManyToOne
    @JoinColumn(name = "fk_teacher", referencedColumnName = "id_teacher")
    @JsonBackReference(value = "courseTeacher")
    private Teacher teacher;

    //Creating relationship with registration (1 to Many)
    @OneToMany(mappedBy = "course")
    @JsonManagedReference(value = "registrationCourse")
    private List<Registration> registrations;

    //Creating relationship with subject (1 to many)
    @OneToMany(mappedBy = "course")
    @JsonManagedReference(value = "subjectCourse")
    private List<Subject> subjects;

    //Creating relationship with attendance (1 to many)
    @OneToMany(mappedBy = "course")
    @JsonManagedReference(value = "attendanceCourse")
    private List<Attendance> attendances;


    public Course() {
    }

    public Course(Integer idCourse, String name) {
        this.id = idCourse;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}