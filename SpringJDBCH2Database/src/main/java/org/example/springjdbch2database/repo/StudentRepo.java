package org.example.springjdbch2database.repo;

import org.example.springjdbch2database.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Students s) {
        String query="insert into Students (rollNo,name,marks)values(?,?,?)";
        int rows=jdbc.update(query,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(rows +" effected");
    }

    public List<Students> findAll() {
        String query = "select * from students";

        RowMapper<Students> mapper=new RowMapper<Students>() {
            @Override
            public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
                Students students=new Students();
                students.setRollNo(rs.getInt("rollNo"));
                students.setName(rs.getString("name"));
                students.setMarks(rs.getInt("marks"));

                return students;
            }
        };
       List<Students> list=jdbc.query(query,mapper);
       return list;
    }
}
