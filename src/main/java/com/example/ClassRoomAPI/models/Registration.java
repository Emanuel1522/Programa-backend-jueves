package com.example.ClassRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "registrations")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registration")
    private Integer id;

    @Column(name = "registration_date")
    private Timestamp registrationDate;


    //Creating relationship with student (1 to 1)
    @OneToOne
    @JoinColumn(name = "fk_student", referencedColumnName = "id_student")
    @JsonBackReference(value = "registrationStudent")
    private Student student;

    //Creating relationship with course (Many to 1)
    @ManyToOne
    @JoinColumn(name = "fk_course", referencedColumnName = "id_course")
    @JsonBackReference(value = "registrationCourse")
    private Course course;

    public Registration() {
    }

    public Registration(Integer id, Timestamp registrationDate) {
        this.id = id;
        this.registrationDate = registrationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }
}
