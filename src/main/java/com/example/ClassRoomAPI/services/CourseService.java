package com.example.ClassRoomAPI.services;

import com.example.ClassRoomAPI.models.Course;
import com.example.ClassRoomAPI.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseService {

    @Autowired
    ICourseRepository repository;

    //Method for save
    public Course saveCourse(Course dataCourse) throws Exception {
        try {
            return this.repository.save(dataCourse);
        } catch (Exception error) {
            throw new Exception();
        }
    }

    //Method for searchAll
    public List<Course> courseList() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception();
        }
    }
}
