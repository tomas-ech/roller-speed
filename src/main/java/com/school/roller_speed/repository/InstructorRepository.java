package com.school.roller_speed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.roller_speed.model.InstructorModel;

public interface InstructorRepository extends JpaRepository<InstructorModel, Long> {
    
}
