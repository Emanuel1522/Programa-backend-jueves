package com.example.ClassRoomAPI.services;

import com.example.ClassRoomAPI.models.Subject;
import com.example.ClassRoomAPI.repository.ISubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectService {

    @Autowired
    ISubjectRepository repository;

    //Method for save
    public Subject saveSubject (Subject dataSubject) throws Exception {
        try {
            return this.repository.save(dataSubject);
        } catch (Exception error) {
            throw new Exception();
        }
    }

    //Method for searchAll
    public List<Subject> subjectList() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception();
        }
    }
}
