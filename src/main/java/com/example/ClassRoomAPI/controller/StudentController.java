package com.example.ClassRoomAPI.controller;

import com.example.ClassRoomAPI.models.Student;
import com.example.ClassRoomAPI.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;

    //save
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Student datosQueEnviaElCliente){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.service.saveStudent(datosQueEnviaElCliente));
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
            List<Student> students = service.studentList();
            return ResponseEntity.ok(students);
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Search By Id
    @GetMapping("/getStudent/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        try {
            Optional<Student> student = service.searchStudentById(id);
            if (student.isPresent()) {
                return ResponseEntity.ok(student.get());
            } else {
                return ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body("Student not found");
            }
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Update
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Student datosActualizados){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(service.updateStudent(id, datosActualizados));
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
            service.deleteStudent(id);
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
