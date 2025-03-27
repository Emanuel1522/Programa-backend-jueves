package models;

import java.util.Date;
public class Student {
    private Integer id;
    private Integer grade;
    private Date bornDate;
    private String adress;

    public Student() {
    }

    public Student(Integer id, Integer grade, Date bornDate, String adress) {
        this.id = id;
        this.grade = grade;
        this.bornDate = bornDate;
        this.adress = adress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
