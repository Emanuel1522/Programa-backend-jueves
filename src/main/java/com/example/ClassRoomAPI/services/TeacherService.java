package com.example.ClassRoomAPI.services;

import com.example.ClassRoomAPI.helper.APIMessages;
import com.example.ClassRoomAPI.models.Teacher;
import com.example.ClassRoomAPI.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    ITeacherRepository repository;

    //Method for save
    public Teacher saveTeacher(Teacher dataTeacher) throws Exception {
        try {
            return this.repository.save(dataTeacher);
        } catch (Exception error) {
            throw new Exception();
        }
    }

    //Method for searchAll
    public List<Teacher> teacherList() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception();
        }
    }

    //Method for SearchById
    public Optional<Teacher> searchTeacherById(Integer id) throws Exception {
        try {
            Optional<Teacher> teacherSearched = this.repository.findById(id);
            if (teacherSearched.isPresent()) {
                return teacherSearched;
            } else {
                throw new Exception(APIMessages.ERROR_TEACHER_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception("Error al buscar el profesor: " + error.getMessage());
        }
    }

    //Method for update
    public Teacher updateTeacher(Integer id, Teacher newTeacherData) throws Exception {
        try {
            Optional<Teacher> teacherSearchedForUpdating = this.repository.findById(id);
            if (teacherSearchedForUpdating.isPresent()) {
                teacherSearchedForUpdating.get().setSpecialty(newTeacherData.getSpecialty());
                return this.repository.save(teacherSearchedForUpdating.get());
            } else {
                throw new Exception(APIMessages.ERROR_TEACHER_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //Method for delete
    public Boolean deleteTeacher(Integer id) throws Exception{
        try {
            Optional<Teacher> teacherSearched = this.repository.findById(id);
            if (teacherSearched.isPresent()) {
                this.repository.deleteById(id);
                return true;
            } else {
                throw new Exception(APIMessages.ERROR_TEACHER_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

}
