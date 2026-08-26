package org.example.project1;

import org.example.project1.model.Laptop;
import org.example.project1.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Project1Application {

    public static void main(String[] args) {
        ApplicationContext context=
                SpringApplication.run(Project1Application.class, args);

        LaptopService service=context.getBean(LaptopService.class);
        Laptop laptop=context.getBean(Laptop.class);

        service.addLaptop(laptop);
        System.out.println(service.isGoodProgramming());



    }



}
