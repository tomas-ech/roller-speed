package com.school.roller_speed.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.school.roller_speed.model.RoleModel;

public interface RoleRepository extends JpaRepository<RoleModel, Long>  {


    
}