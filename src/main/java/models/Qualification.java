package models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qualification")
public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_qualification")
    private Integer id;

    @Column(name = "score", nullable = false)
    private Float score;

    @Column(name = "test_date", nullable = false)
    private Date testDate;

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
