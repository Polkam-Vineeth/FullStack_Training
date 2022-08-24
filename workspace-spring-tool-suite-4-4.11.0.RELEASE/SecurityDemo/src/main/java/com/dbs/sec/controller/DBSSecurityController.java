package com.dbs.sec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBSSecurityController {

	@GetMapping("/home")
    public String showWelcome(){

        return "<h1>Welcome Home</h1>";
    }
	
	@GetMapping("/admin")
    public String showAdmin(){

        return "<h1>Welcome Admin!</h1>";
    }
	
	@GetMapping("/user")
    public String showUser(){

        return "<h1>Welcome User!</h1>";
    }
	
	@GetMapping("/")
    public String showVinSree(){

        return "<h1>Hey there! Vineethness here!!</h1>";
    }
}
