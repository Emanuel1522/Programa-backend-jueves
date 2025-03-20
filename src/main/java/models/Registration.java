package models;

import java.sql.Timestamp;

public class Registration {

    private Integer idRegistration;
    private Timestamp registrationDate;

    public Registration() {
    }

    public Registration(Integer idRegistration, Timestamp registrationDate) {
        this.idRegistration = idRegistration;
        this.registrationDate = registrationDate;
    }

    public Integer getIdRegistration() {
        return idRegistration;
    }

    public void setIdRegistration(Integer idRegistration) {
        this.idRegistration = idRegistration;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }
}
