package org.example.jobapp1.repo;

import org.example.jobapp1.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    @Autowired
    private JdbcTemplate jdbc;

//    List<JobPost> jobs=new ArrayList<>();
    public void addJob(JobPost jobPost){
        String query="insert into JobPost(postId,postProfile,postDesc,reqExperience,postTechStack) " +
                "values(?,?,?,?,?)";

        String techStack=String.join(",",jobPost.getPostTechStack());

        int row=jdbc.update(query,jobPost.getPostId(),jobPost.getPostProfile(),jobPost.getPostDesc(),
                jobPost.getReqExperience(),techStack);
        System.out.println(row);

    }

    public List<JobPost> getAllJobs(){
        String query="select * from jobpost";
        RowMapper<JobPost> jobPostRowMapper=new RowMapper<JobPost>() {
            @Override
            public JobPost mapRow(ResultSet rs, int rowNum) throws SQLException {
                JobPost jobPost=new JobPost();
                jobPost.setPostId(rs.getInt("postId"));
                jobPost.setPostProfile(rs.getString("postProfile"));
                jobPost.setPostDesc(rs.getString("postDesc"));
                jobPost.setReqExperience(rs.getInt("reqExperience"));

                String techStack = rs.getString("posttechstack");

                List<String> techStackList = Arrays.asList(techStack.split(","));

                jobPost.setPostTechStack(techStackList);

                return jobPost;
            }

        };
        return jdbc.query(query,jobPostRowMapper);
    }
}
