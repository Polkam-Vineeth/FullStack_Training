package com.dbs.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbs.bank.model.BankAccount;
import com.dbs.bank.service.BankService;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.dbs.bank.model.BankAccount;

@Controller
public class BankController {
    
    @GetMapping("/home")
    public String showHomePage() {
        return "Sample.jsp";
    }
    
    @GetMapping("/vin")
    public String showLifePAge() {
        return "SREE";
    }

    /*
    @GetMapping("/login")
    public String showDashboard(Model model, @RequestParam String name, @RequestParam String password){
        boolean isValidUser = service.validateUser(name, password);
        if (!isValidUser) {
            model.addAttribute("errorMessage", "Invalid Credentials");
            return "Dashboard.jsp";
        }
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        return "Login.jsp";
    }
    
    */
    
    
    @GetMapping("/login")
    public String Login() {
    	
        return "Login.jsp";
    }
    
    @Autowired
    BankService bankService;
   
    
    @GetMapping("/dashboard")
    public String DashBoard(BankAccount b, Model model) {
    	List<BankAccount> blist = bankService.getAllBankAccounts();
    	model.addAttribute("allaccounts", blist);
        return "DashBoard.jsp";
    }
}
