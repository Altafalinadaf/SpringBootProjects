package org.example.springjdbcposgresdb.service;

import org.example.springjdbcposgresdb.model.Students;
import org.example.springjdbcposgresdb.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;
    public void addStudent(Students s) {
        repo.save(s);
    }

    public List<Students> findAllStudent() {
        return repo.findAll();
    }
}
