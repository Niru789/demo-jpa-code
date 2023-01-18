package com.example.demojpacode.service;

import com.example.demojpacode.models.Student;
import com.example.demojpacode.repositories.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    private final StudentRepository repo;

    public StudentService(StudentRepository repo){
        this.repo = repo;
    }

    public Student save(Student student){
        return repo.save(student);
    }



}
