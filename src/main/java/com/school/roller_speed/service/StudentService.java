package com.school.roller_speed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.roller_speed.model.StudentModel;
import com.school.roller_speed.repository.StudentRepository;


@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentModel createStudent(StudentModel student){
       return studentRepository.save(student);
    }

    public List<StudentModel> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<StudentModel> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    
}
