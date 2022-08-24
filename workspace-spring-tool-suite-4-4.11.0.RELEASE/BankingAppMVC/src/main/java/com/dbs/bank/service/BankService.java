package com.dbs.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.bank.model.BankAccount;
import com.dbs.bank.repo.BankAccountRepo;

@Service
public class BankService {

    @Autowired
    BankAccountRepo bankAccountRepo;

    public boolean validateUser(String name, String password) {
        return name.equalsIgnoreCase("vin") && password.equalsIgnoreCase("sree");
    }
    
    public void addAccount(BankAccount bankAccount) {

        bankAccountRepo.save(bankAccount);
    }

    public List<BankAccount> getAllBankAccounts(){

        return bankAccountRepo.findAll();
    }

    public String updateAccount(BankAccount bankAccount) {
        String res = "";
        try{
            BankAccount existBankAccount = bankAccountRepo.findById(bankAccount.getAccountNo()).orElse(new BankAccount());

            if((existBankAccount != null) && (existBankAccount.getAccountNo() == bankAccount.getAccountNo() )) {
                bankAccountRepo.save(bankAccount);
                res = "Successfully account got updated";
            }
            else {
                res = "Account not Found";
            }

        }catch(Exception e) {
            res = "problem occured while updating account";
            e.printStackTrace();
        }

        return res;
    }

    public String deleteAccount(int accountNo) {

        String res = "";

        try {

            BankAccount existBankAccount = bankAccountRepo.findById(accountNo).orElse(new BankAccount());

            if((existBankAccount != null) && (existBankAccount.getAccountNo() == accountNo)) {
                bankAccountRepo.deleteById(accountNo);
                res = "Successfully account got deleted";
            }
            else {
                res = "Account not Found";
            }

        }catch(Exception e) {
            res = "problem occured while deleting account";
            e.printStackTrace();
        }
        return res;

    }


}