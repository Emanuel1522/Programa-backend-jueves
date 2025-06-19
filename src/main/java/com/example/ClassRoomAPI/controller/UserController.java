package com.example.ClassRoomAPI.controller;

import com.example.ClassRoomAPI.models.User;
import com.example.ClassRoomAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    //save
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody User datosQueEnviaElCliente){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.service.saveUser(datosQueEnviaElCliente));
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
            List<User> users = service.teacherList();
            return ResponseEntity.ok(users);
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Search By Id
    @GetMapping("/getUser/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        try {
            Optional<User> user = service.searchUserById(id);
            if (user.isPresent()) {
                return ResponseEntity.ok(user.get());
            } else {
                return ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body("User not found");
            }
        } catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Update
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody User datosActualizados){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(service.updateUser(id, datosActualizados));
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
            service.deleteUser(id);
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
