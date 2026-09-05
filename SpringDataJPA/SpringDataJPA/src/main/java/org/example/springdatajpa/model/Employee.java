package org.example.springdatajpa.model;


import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Data
public class Employee {
    int id=10;
    String name;
    int salary;
}
