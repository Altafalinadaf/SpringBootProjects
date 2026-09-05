package com.rest_springboot_rest_webapp.service;


import com.rest_springboot_rest_webapp.model.JobPost;
import com.rest_springboot_rest_webapp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServices {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);

    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();

    }

    public JobPost getJobPost(int postId) {
        return repo.getJobPost(postId);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}
