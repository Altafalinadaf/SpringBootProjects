package org.example.springbootweb1;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home controller method is called");
        return "index.jsp";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2= Integer.parseInt(req.getParameter("num2"));
//
//        session.setAttribute("result",num1+num2);
//        System.out.println(num1+num2);
//        return "result.jsp";
//    }


//      @RequestMapping("add")
////    need to pass the same name as we passed in jsp page
//      public String add(int num1, int num2, Model model){
//          model.addAttribute("result",num1+num2);
//          System.out.println(num1+num2);
//          return "result.jsp";
//     }

    @RequestMapping("add")
//    need to pass the same name as we passed in jsp page
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
        model.addAttribute("result",num1+num2);
        System.out.println(num1+num2);
        return "result.jsp";
    }
}
