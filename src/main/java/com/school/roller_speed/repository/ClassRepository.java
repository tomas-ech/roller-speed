package com.school.roller_speed.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.school.roller_speed.model.ClassModel;

public interface ClassRepository extends JpaRepository<ClassModel, Long> {
}
