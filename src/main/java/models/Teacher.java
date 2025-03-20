package models;

public class Teacher {

    private Integer idTeacher;
    private String specialty;

    public Teacher() {
    }

    public Teacher(Integer idTeacher, String specialty) {
        this.idTeacher = idTeacher;
        this.specialty = specialty;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
