package com.example.ClassRoomAPI.controller;

import com.example.ClassRoomAPI.models.Teacher;
import com.example.ClassRoomAPI.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService service;

    //save
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Teacher datosQueEnviaElCliente){
        try{

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.service.saveTeacher(datosQueEnviaElCliente));

        }catch(Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    // Search all

    // Search By Id

    // Update

    // Delete
}

