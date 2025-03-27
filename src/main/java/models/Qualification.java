package models;

import java.util.Date;

public class Qualification {
    private Integer id;
    private Float score;
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
