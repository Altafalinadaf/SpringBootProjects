package org.example.springdatajpa.repo;

import org.example.springdatajpa.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeRepo {

    @Autowired
    private JdbcTemplate jdbc;

    public void save(Employee employee) {
        String query = "insert into Employee(id,name,salary)values(?,?,?)";
        int row = jdbc.update
                (query,employee.getId(),employee.getName(),employee.getSalary());
        System.out.println("Row affected = "+row);



    }

    public List<Employee> findAll() {
        String query = "select * from employee";
        RowMapper<Employee> rowMapper=new RowMapper<>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee employee=new Employee();
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setSalary(rs.getInt("salary"));
                return employee;
            }
        };
        return jdbc.query(query,rowMapper);
    }
}
