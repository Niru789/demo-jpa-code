package com.example.demojpacode;

import com.example.demojpacode.models.Student;
import com.example.demojpacode.repositories.StudentRepository;
import com.example.demojpacode.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }
    @PostMapping()
    public Student addStudents(@RequestBody Student student){
        return service.save(student);

    }
}
