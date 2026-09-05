package com.rest_springboot_rest_webapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

//basically we are using lambok, so need to create getter setter,constr,tostring, we can use annotations


// @data means everything
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

}
