package com.example.ClassRoomAPI.controller;

import com.example.ClassRoomAPI.models.Teacher;
import com.example.ClassRoomAPI.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService service;

    //save
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Teacher datosQueEnviaElCliente){
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(service.saveTeacher(datosQueEnviaElCliente));
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Search all
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        try {
            List<Teacher> teachers = service.teacherList();
            return ResponseEntity.ok(teachers);
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Search By Id
    @GetMapping("/getTeacher/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        try {
            Optional<Teacher> teacher = service.searchTeacherById(id);
            if (teacher.isPresent()) {
                return ResponseEntity.ok(teacher.get());
            } else {
                return ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body("Teacher not found");
            }
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Update
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Teacher datosActualizados){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(service.updateTeacher(id, datosActualizados));
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        try {
            service.deleteTeacher(id);
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .build();
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}

