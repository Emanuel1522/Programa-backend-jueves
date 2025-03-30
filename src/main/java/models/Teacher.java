package models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_teacher")
    private Integer id;

    @Column(name = "specialty", length = 100, nullable = false)
    private String specialty;

    //Creating relationship (1 to many)
    @OneToMany(mappedBy = "teacher")
    @JsonManagedReference
    private List<Course> courses;


    public Teacher() {
    }

    public Teacher(Integer id, String specialty) {
        this.id = id;
        this.specialty = specialty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
