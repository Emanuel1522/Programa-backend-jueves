package com.example.ClassRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "qualifications")
public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_qualification")
    private Integer id;

    private Float score;

    @Column(name = "test_date", nullable = false)
    private Date testDate;


    //Creating relationship with student (many to one)
    @ManyToOne
    @JoinColumn(name = "fk_student", referencedColumnName = "id_student")
    @JsonBackReference(value = "qualificationStudent")
    private Student student;

    //Creating relationship with subject (many to one)
    @ManyToOne
    @JoinColumn(name = "fk_subject", referencedColumnName = "id_subject")
    @JsonBackReference(value = "qualificationSubject")
    private Subject subject;


    public Qualification() {
    }

    public Qualification(Integer id, Float score, Date testDate) {
        this.id = id;
        this.score = score;
        this.testDate = testDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }
}
