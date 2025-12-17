package com.example.demo.service.implement;

import org. springframework.beans. factory. annotation. Autowired;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import org. springframework.stereotype.Service;

@Servicepublic class ServiceImplement implements StudentService {

    @AutowiredStudentRepository repo;

    @Override
    public Student createDAta(Student stu) {
        return repo.save(stu);
    }

    @Overridepublic List<Student> fetchDAta(){
        return repo.findAll();
        }

}