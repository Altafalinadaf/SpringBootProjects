package org.example.springbootweb4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String test() {
        System.out.println("Hello world");
        return "index.jsp";
    }
}
