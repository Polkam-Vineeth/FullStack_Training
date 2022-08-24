package com.dbs.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DBSProcess {
	
	@Autowired //handle object creation
	
	@Qualifier("car") 
	Vehicle v;	
	
	public void display() {
		System.out.println("Vineeth");
	}
	
	public void event() {
		v.displayprice();
		v.service();
	}
}
