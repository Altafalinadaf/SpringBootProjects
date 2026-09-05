package com.rest_springboot_rest_webapp;

import com.rest_springboot_rest_webapp.model.JobPost;
import com.rest_springboot_rest_webapp.service.JobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

//@Controller
@RestController
@CrossOrigin( origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobServices services;

    @GetMapping("jobPosts")
//    if you using @RestController annotation for the class then no need to go for below annotation
//    use @ResponseBody when you are sending data to server
//    @ResponseBody
    public List<JobPost> getAllJobs(){
        return services.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
//    if your passing multiple variable then you have to specify variable otherwise no
    public JobPost getJobPost(@PathVariable("postId") int postId){
        return services.getJobPost(postId);
    }

//    @PostMapping("jobPost")
////    use @RequestBody when you are receiving data from server
//    public void addJob(@RequestBody JobPost jobPost){
//        services.addJob(jobPost);
//
//    }

    @PostMapping("jobPost")
//    use @RequestBody when you are receiving data from server
    public JobPost addJob(@RequestBody JobPost jobPost){
        services.addJob(jobPost);
//        saving data and the same data returning back
        return services.getJobPost(jobPost.getPostId());

    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        services.updateJob(jobPost);
        return services.getJobPost(jobPost.getPostId());

    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        services.deleteJob(postId);
        return "Deleted";
    }
}
