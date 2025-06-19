package com.example.ClassRoomAPI.controller;

import com.example.ClassRoomAPI.models.Subject;
import com.example.ClassRoomAPI.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectService service;

    //save
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Subject datosQueEnviaElCliente){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.service.saveSubject(datosQueEnviaElCliente));
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
            List<Subject> subjects = service.subjectList();
            return ResponseEntity.ok(subjects);
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
