package com.example.education.repository;

import com.example.education.model.Student;
import com.example.education.service.StudentService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository implements StudentService {

    List<Student> akaDB;
    @Override
    public Student save(Student student) {
        String name = student.getName();
        String email = student.getEmail();
        String subject = student.getSubject();
        String message = student.getMessage();

        student.setName(name);
        student.setEmail(email);
        student.setSubject(subject);
        student.setMessage(message);

        akaDB.add(student);

        return student;
    }

    public StudentRepository(List<Student> akaDB) {
        this.akaDB = akaDB;
    }
}
