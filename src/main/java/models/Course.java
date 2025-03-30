package models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Integer id;

    @Column(name = "name", length = 100, unique = false, nullable = false)
    private String name;

    //Creating relationship (many to 1)
    @ManyToOne
    @JoinColumn(name = "fk_teacher", referencedColumnName = "id")
    @JsonBackReference
    private Teacher teacher;

    public Course() {
    }

    public Course(Integer idCourse, String name) {
        this.id = idCourse;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}