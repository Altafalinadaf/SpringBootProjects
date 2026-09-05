package org.example.springdatajpa.service;

import org.example.springdatajpa.model.Employee;
import org.example.springdatajpa.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;
    public void add(Employee employee) {
        repo.save(employee);

    }

    public List<Employee> getAllEmp() {
        return repo.findAll();
    }
}
