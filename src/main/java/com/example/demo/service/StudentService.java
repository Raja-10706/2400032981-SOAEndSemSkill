package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Student;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Student updateStudent(int id, Student newStudent) {

        Student student = repository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));

        student.setName(newStudent.getName());
        student.setDepartment(newStudent.getDepartment());
        student.setAge(newStudent.getAge());

        return repository.save(student);
    }
}
