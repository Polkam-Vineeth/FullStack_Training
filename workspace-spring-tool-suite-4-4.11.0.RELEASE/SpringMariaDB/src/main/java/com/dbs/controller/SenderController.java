package com.dbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SenderController {
	
    @GetMapping("/home")
    public String showHomePage() {
        return "sample.jsp";
    }
	

}
