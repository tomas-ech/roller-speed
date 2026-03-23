package com.school.roller_speed.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.roller_speed.model.RoleModel;

public interface RoleRepository extends JpaRepository<RoleModel, Long>  {

    Optional<RoleModel> findByName(String name);
    
}