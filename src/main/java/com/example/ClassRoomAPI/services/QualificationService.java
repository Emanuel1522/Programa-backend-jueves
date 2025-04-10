package com.example.ClassRoomAPI.services;

import com.example.ClassRoomAPI.models.Qualification;
import com.example.ClassRoomAPI.repository.IQualificationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QualificationService {

    @Autowired
    IQualificationRepository repository;

    //Method for save
    public Qualification saveQualification(Qualification dataQualification) throws Exception {
        try {
            return this.repository.save(dataQualification);
        } catch (Exception error){
            throw new Exception();
        }
    }

    //Method for searchAll
    public List<Qualification> qualificationList() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception();
        }
    }
}
