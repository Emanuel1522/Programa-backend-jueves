package models;

import java.util.Date;

public class Qualification {
    private Integer idQualification;
    private Float score;
    private Date testDate;

    public Qualification() {
    }

    public Qualification(Integer idQualification, Float score, Date testDate) {
        this.idQualification = idQualification;
        this.score = score;
        this.testDate = testDate;
    }

    public Integer getIdQualification() {
        return idQualification;
    }

    public void setIdQualification(Integer idQualification) {
        this.idQualification = idQualification;
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
