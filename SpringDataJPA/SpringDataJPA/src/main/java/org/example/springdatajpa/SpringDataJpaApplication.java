package org.example.springdatajpa;

import org.example.springdatajpa.model.Employee;
import org.example.springdatajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class, args);

        Employee employee=context.getBean(Employee.class);
        employee.setId(4);
        employee.setName("Altaf");
        employee.setSalary(60000);

        EmployeeService service=context.getBean(EmployeeService.class);
        service.add(employee);

        List<Employee> employees=service.getAllEmp();
        System.out.println(employees);
    }

}
