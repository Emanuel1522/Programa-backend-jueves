package com.example.ClassRoomAPI.controller;

import com.example.ClassRoomAPI.models.Registration;
import com.example.ClassRoomAPI.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
    @Autowired
    RegistrationService service;

    //save
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Registration datosQueEnviaElCliente){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.service.saveRegistration(datosQueEnviaElCliente));
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
            List<Registration> registrations = service.registrationList();
            return ResponseEntity.ok(registrations);
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
