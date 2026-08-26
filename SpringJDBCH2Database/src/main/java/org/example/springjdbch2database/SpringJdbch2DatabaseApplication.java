package org.example.springjdbch2database;

import org.example.springjdbch2database.model.Students;
import org.example.springjdbch2database.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbch2DatabaseApplication {

    public static void main(String[] args) {
        ApplicationContext context=
                SpringApplication.run(SpringJdbch2DatabaseApplication.class, args);

        Students s=context.getBean(Students.class);
        s.setMarks(78);
        s.setName("Altaf");
        s.setRollNo(104);
//        System.out.println(s);

        StudentService service=context.getBean(StudentService.class);
        service.addStudent(s);

        List<Students> students=service.getStudents();
        System.out.println(students);

    }

}
