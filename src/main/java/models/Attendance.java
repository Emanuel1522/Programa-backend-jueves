package models;

import helper.State;

import java.util.Date;

public class Attendance {
    private Integer idAttendance;
    private Date date;
    private State state;

    public Attendance() {
    }

    public Attendance(Integer idAttendance, Date date, State state) {
        this.idAttendance = idAttendance;
        this.date = date;
        this.state = state;
    }

    public Integer getIdAttendance() {
        return idAttendance;
    }

    public void setIdAttendance(Integer idAttendance) {
        this.idAttendance = idAttendance;
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
