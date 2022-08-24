package com.dbs.springcourse.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.dbs.springcourse.model.Employee;

@Repository
public class EmpRepo {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
    
    RowMapper<Employee> mapRower = (resSet,num)->{
    	
//    	@Autowired
        Employee emp= new Employee();
        
        emp.setId(resSet.getInt(1));
        emp.setName(resSet.getString(2));
        emp.setSalary(resSet.getInt(3));
        
        return emp;
    };
    public List<Employee>  getAllEmployees() {
    
        List<Employee> empList = jdbcTemplate.query("SELECT * FROM EMP ", mapRower);
        
        return empList;
        
    }
}
