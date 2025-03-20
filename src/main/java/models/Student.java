package models;

import java.util.Date;
public class Student {
    private Integer idStudent;
    private Integer grade;
    private Date bornDate;
    private String adress;

    public Student() {
    }

    public Student(Integer idStudent, Integer grade, Date bornDate, String adress) {
        this.idStudent = idStudent;
        this.grade = grade;
        this.bornDate = bornDate;
        this.adress = adress;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
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
