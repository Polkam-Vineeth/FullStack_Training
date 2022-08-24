package com.dbs.bank.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.bank.model.BankAccount;
import com.dbs.bank.service.BankService;

@RestController
public class BankAccountController {

    @Autowired
    BankService bankService;

    @GetMapping("/allBankAccounts")
    public List<BankAccount> getAllBankAccounts(){

        return bankService.getAllBankAccounts();
    }

    @PostMapping("/addAccount")
    public void addAccount(@RequestBody BankAccount bankAccount) {
        bankService.addAccount(bankAccount);
    }

    @PutMapping("/updateAccount")
    public String updateBankAccount(@RequestBody BankAccount bankAccount) {
        return bankService.updateAccount(bankAccount);
    }

    @DeleteMapping("/deleteAccount")
    public String deleteBankAccount(@RequestParam int accountId) {
        return bankService.deleteAccount(accountId);
    }
}


