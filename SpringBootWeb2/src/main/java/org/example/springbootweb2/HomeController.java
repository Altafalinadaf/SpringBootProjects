package org.example.springbootweb2;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String test(){
        System.out.println("Hello world");
        return "index";
    }

//    @GetMapping("subtract")
//    public String subtract(HttpServletRequest req, HttpSession res){
//        int a = Integer.parseInt(req.getParameter("num1"));
//        int b = Integer.parseInt(req.getParameter("num2"));
//        int result = a-b;
//        res.setAttribute("res",result);
//        return "result.jsp";
//    }

//    @RequestMapping("subtract")
//    public String sub(int num1, int num2, Model model){
//        model.addAttribute("res",num1-num2);
//        return "result";
//    }


//  Example using ModelAndView
    @RequestMapping("subtract")
    public ModelAndView sub(int num1, int num2, ModelAndView mv){
        mv.addObject("res",num1-num2);
        mv.setViewName("result");

        return mv;

    }
}
