package org.example.springjdbcposgresdb;

import org.example.springjdbcposgresdb.model.Students;
import org.example.springjdbcposgresdb.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcPostgresDbApplication {

    public static void main(String[] args) {
        ApplicationContext context=
                SpringApplication.run(SpringJdbcPostgresDbApplication.class, args);
        System.out.println("Hello world");
        Students s=context.getBean(Students.class);
        s.setMarks(76);
        s.setName("Khan");
        s.setRollNo(105);
        System.out.println(s);

        StudentService service=context.getBean(StudentService.class);

        service.addStudent(s);
        List<Students> studentsList=service.findAllStudent();
        System.out.println(studentsList);
    }

}
