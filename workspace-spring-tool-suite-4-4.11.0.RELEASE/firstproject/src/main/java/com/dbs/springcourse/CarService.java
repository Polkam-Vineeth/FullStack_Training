package com.dbs.springcourse;
import org.springframework.stereotype.Component;

@Component("car")
public class CarService implements Vehicle {
	public void displayprice() {
		System.out.println("40000 rupees only");
	}
	
	public void service() {
		System.out.println("Car Service Available ");
	}
}