package com.dbs.springcourse.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.springcourse.model.Employee;
import com.dbs.springcourse.repository.EmpRepo;

@Service
public class EmpService {
    @Autowired
    EmpRepo empRepo;
    
    public List<Employee> findAllEmployees() {
        
        return empRepo.getAllEmployees();
        
    }
}
