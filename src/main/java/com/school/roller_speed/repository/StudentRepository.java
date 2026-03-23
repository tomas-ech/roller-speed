package com.school.roller_speed.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.roller_speed.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {

    List<StudentModel> findByLevel(String level);
    
}
