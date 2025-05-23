package com.example.ClassRoomAPI.repository;

import com.example.ClassRoomAPI.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends JpaRepository<Course, Integer> {
}
