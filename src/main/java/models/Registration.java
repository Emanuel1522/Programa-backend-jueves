package models;

import java.sql.Timestamp;

public class Registration {

    private Integer id;
    private Timestamp registrationDate;

    public Registration() {
    }

    public Registration(Integer id, Timestamp registrationDate) {
        this.id = id;
        this.registrationDate = registrationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }
}
