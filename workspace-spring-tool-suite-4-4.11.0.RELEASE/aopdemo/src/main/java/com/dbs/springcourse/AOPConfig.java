package com.dbs.springcourse;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration

public class AOPConfig {
	@Before(value = "execution(* com.dbs.springcourse.*.*(..))")
    public void vin(JoinPoint joinPoint) {
		System.out.println("Before AOP got Executed!!!!!!!!!!!!");
	}
	
	
	
	@After(value = "execution(* com.dbs.springcourse.*.*(..))")
    public void vinee(JoinPoint joinPoint) {
		System.out.println("After AOP got Executed!!!!!!!!!!!!");
	}
}
