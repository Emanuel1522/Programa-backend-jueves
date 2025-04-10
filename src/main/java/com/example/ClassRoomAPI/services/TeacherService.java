package com.example.ClassRoomAPI.services;

import com.example.ClassRoomAPI.models.Subject;
import com.example.ClassRoomAPI.models.Teacher;
import com.example.ClassRoomAPI.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeacherService {

    @Autowired
    ITeacherRepository repository;

    //Method for save
    public Teacher saveTeacher(Teacher dataTeacher) throws Exception{
        try {
            return this.repository.save(dataTeacher);
        } catch (Exception error) {
            throw new Exception();
        }
    }

    //Method for searchAll
    public List<Teacher> teacherList() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception();
        }
    }

    //Method for SearchById

    //Method for update

    //Method for delete
}
