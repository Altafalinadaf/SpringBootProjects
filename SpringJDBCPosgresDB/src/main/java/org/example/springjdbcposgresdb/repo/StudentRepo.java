package org.example.springjdbcposgresdb.repo;

import org.example.springjdbcposgresdb.model.Students;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentRepo {
    @Autowired
    private JdbcTemplate jdbc;
    public void save(Students s) {
        String sql="insert into Students (rollNo,name,marks)values(?,?,?)";
        int row=jdbc.update(sql,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(row);
    }

    public List<Students> findAll() {
        String sql="select * from Students";
        RowMapper<Students> mapper=new RowMapper() {
            @Override
            public @Nullable Students mapRow(ResultSet rs, int rowNum) throws SQLException {
                Students s=new Students();
                s.setRollNo(rs.getInt("rollNo"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };
        return jdbc.query(sql,mapper);
    }
}
