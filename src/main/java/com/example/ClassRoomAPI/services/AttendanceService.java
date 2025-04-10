package com.example.ClassRoomAPI.services;

import com.example.ClassRoomAPI.models.Attendance;
import com.example.ClassRoomAPI.repository.IAttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AttendanceService {

    @Autowired
    IAttendanceRepository repository;

    //Method for save
    public Attendance saveAttendance(Attendance dataAttendance) throws Exception{
        try {
            return this.repository.save(dataAttendance);
        } catch (Exception error) {
            throw new Exception();
        }
    }

    //Method for searchAll
    public List<Attendance> attendanceList() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception();
        }
    }

    //Method for searchById

    //Method for update

    //Method for delete
}
