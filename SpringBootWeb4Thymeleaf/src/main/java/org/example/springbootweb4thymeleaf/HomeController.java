package org.example.springbootweb4thymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String show(){
        System.out.println("hello ");
        return "index";
    }

    @RequestMapping("employee")
    public String addEmp(Employee employee){
        return "result";

    }
}
