package com.example.ClassRoomAPI.services;

import com.example.ClassRoomAPI.models.Student;
import com.example.ClassRoomAPI.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentRepository {

    @Autowired
    IStudentRepository repository;

    //Method for save
    public Student saveStudent(Student dataStudent) throws Exception {
        try {
            return this.repository.save(dataStudent);
        } catch (Exception error) {
            throw new Exception();
        }
    }

    //Method for searchAll
    public List<Student> studentList() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception();
        }
    }
}
