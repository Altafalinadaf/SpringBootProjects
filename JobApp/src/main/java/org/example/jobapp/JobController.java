package org.example.jobapp;

import org.example.jobapp.model.JobPost;
import org.example.jobapp.service.JobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobServices services;

    @RequestMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }


    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        services.addJob(jobPost);
        System.out.println(services.getAllJobs());
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(Model m){
        List<JobPost> jobs=services.getAllJobs();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }


}
