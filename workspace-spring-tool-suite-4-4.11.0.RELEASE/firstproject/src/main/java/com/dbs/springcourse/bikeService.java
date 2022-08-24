package com.dbs.springcourse;
import org.springframework.stereotype.Component;

@Component("bike")
public class bikeService implements Vehicle {
	public void displayprice() {
		System.out.println("5500 rupees only");
	}
	
	public void service() {
		System.out.println("Bike Service Available");
	}
}