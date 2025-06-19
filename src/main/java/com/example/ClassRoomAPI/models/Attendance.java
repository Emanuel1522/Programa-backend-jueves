package com.example.ClassRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.example.ClassRoomAPI.helper.State;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "attendances")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_attendance")
    private Integer id;

    private Date date;

    private State state;


    //Creating relationship with student (many to one)
    @ManyToOne
    @JoinColumn(name = "fk_student", referencedColumnName = "id_student")
    @JsonBackReference(value = "attendanceStudent")
    private Student student;

    //Creating relationship with course (many to one)
    @ManyToOne
    @JoinColumn(name = "fk_course", referencedColumnName = "id_course")
    @JsonBackReference(value = "attendanceCourse")
    private Course course;


    public Attendance() {
    }

    public Attendance(Integer id, Date date, State state) {
        this.id = id;
        this.date = date;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
