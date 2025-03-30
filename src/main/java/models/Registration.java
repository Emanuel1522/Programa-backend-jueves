package models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registration")
    private Integer id;

    @Column(name = "registration_date")
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
