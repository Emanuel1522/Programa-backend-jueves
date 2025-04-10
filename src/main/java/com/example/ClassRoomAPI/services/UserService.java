package com.example.ClassRoomAPI.services;

import com.example.ClassRoomAPI.models.User;
import com.example.ClassRoomAPI.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    IUserRepository repository;

    //Method for save
    public User saveUser (User dataUser) throws Exception {
        try {
            return this.repository.save(dataUser);
        } catch (Exception error) {
            throw new Exception();
        }
    }

    //Method for searchAll
    public List<User> teacherList() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception();
        }
    }

}
