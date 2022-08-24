package com.dbs.oauth;

import org.springframework.web.bind.annotation.GetMapping;

public class DBSControllerOauth {

	@GetMapping("/home")
    public String showWelcome(){
        return "<h1>Welcome Home</h1>";
    }
}
