package com.school.roller_speed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.roller_speed.model.UserModel;
import com.school.roller_speed.repository.UserRepository;

@Service
public class userService {

    @Autowired
    private UserRepository userRepository;

    List<UserModel> getAllUsers() {

        return userRepository.findAll();

    }
    
}
