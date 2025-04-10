package com.example.ClassRoomAPI.services;

import com.example.ClassRoomAPI.models.Registration;
import com.example.ClassRoomAPI.repository.IRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RegistrationService {

    @Autowired
    IRegistrationRepository repository;

    //Method for save
    public Registration saveRegistration(Registration dataRegistration) throws Exception {
        try {
            return this.repository.save(dataRegistration);
        }catch (Exception error){
            throw new Exception();
        }
    }

    //Method for searchAll
    public List<Registration> registrationList() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception();
        }
    }
}
