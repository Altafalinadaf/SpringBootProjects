package org.example.springbootweb3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//    @RequestMapping("/")
//    public String home(){
//        System.out.println("hello world2");
//        return "index";
//    }

    @RequestMapping("/")
    public String test(){
        System.out.println("Hello world10");
        return "index";
    }

//    @RequestMapping("employee")
//    public ModelAndView addEmp(int id,String name,ModelAndView mv){
//        Employee emp=new Employee();
//        emp.setId(id);
//        emp.setName(name);
//        mv.addObject("emp",emp);
//        mv.setViewName("result");
//        return  mv;
//    }

//    use ModelAttribute when you want to have different names in object and jsp
//    @RequestMapping("employee")
//    The ModelAttribute name will represent in jsp page
//    public String addEmp(@ModelAttribute("employee) Employee emp){
//        return "result";
//    }

//    ModelAttribute is optional when jsp calles name object name(basically classname)
    @RequestMapping("employee")
    public String addEmp(Employee employee){
        return "result";
    }
}
