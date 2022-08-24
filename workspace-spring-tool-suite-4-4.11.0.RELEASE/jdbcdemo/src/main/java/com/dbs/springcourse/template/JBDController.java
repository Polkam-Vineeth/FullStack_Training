package com.dbs.springcourse.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JBDController {
	
	@Autowired
	Employee emp;
	
	@GetMapping("/vin")
	public Employee Welcome(@RequestBody Employee webEmp) {
		System.out.println("Welcome");
		emp.setId(webEmp.getId());
		emp.setName(webEmp.getName());
		emp.setSalary(webEmp.getSalary()+4055);
		return emp;
	}
//	public void vin() {
////		System.out.println();
//		emp.display();
//	}
	
	

}
