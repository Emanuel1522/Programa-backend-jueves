package models;

import helper.State;
import jakarta.persistence.*;

import java.beans.ConstructorProperties;
import java.util.Date;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_attendance")
    private Integer id;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "state", nullable = false)
    private State state;

    public Attendance() {
    }

    public Attendance(Integer id, Date date, State state) {
        this.id = id;
        this.date = date;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
