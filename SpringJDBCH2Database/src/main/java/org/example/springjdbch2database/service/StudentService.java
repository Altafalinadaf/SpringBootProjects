package org.example.springjdbch2database.service;

import org.example.springjdbch2database.model.Students;
import org.example.springjdbch2database.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Students s) {
        repo.save(s);
    }

    public List<Students> getStudents() {
        return repo.findAll();
    }
}
