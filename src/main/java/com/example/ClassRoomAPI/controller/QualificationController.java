package com.example.ClassRoomAPI.controller;

import com.example.ClassRoomAPI.models.Qualification;
import com.example.ClassRoomAPI.services.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qualification")
public class QualificationController {
    @Autowired
    QualificationService service;

    //Save
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Qualification datosQueEnviaElCliente){
        try{

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.service.saveQualification(datosQueEnviaElCliente));

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
            List<Qualification> qualifications = service.qualificationList();
            return ResponseEntity.ok(qualifications);
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
