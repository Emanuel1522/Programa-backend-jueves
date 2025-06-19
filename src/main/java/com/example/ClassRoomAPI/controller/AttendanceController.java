package com.example.ClassRoomAPI.controller;

import com.example.ClassRoomAPI.models.Attendance;
import com.example.ClassRoomAPI.services.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    AttendanceService service;

    //Save
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Attendance datosQueEnviaElCliente){
        try{

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.service.saveAttendance(datosQueEnviaElCliente));

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
            List<Attendance> attendances = service.attendanceList();
            return ResponseEntity.ok(attendances);
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
