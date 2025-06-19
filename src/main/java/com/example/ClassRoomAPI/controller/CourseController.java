package com.example.ClassRoomAPI.controller;

import com.example.ClassRoomAPI.models.Course;
import com.example.ClassRoomAPI.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService service;

    //Save
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Course datosQueEnviaElCliente){
        try{

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.service.saveCourse(datosQueEnviaElCliente));

        }catch(Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    // Search all
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        try {
            List<Course> courses = service.courseList();
            return ResponseEntity.ok(courses);
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
