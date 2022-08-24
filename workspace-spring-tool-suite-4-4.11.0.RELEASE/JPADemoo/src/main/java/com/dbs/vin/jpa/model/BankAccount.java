package com.dbs.vin.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccount {

    @Id
    int accountNo;
    String name;
    int balance;

    public BankAccount() {
        super();
    }
    public BankAccount(int account, String name, int balance) {
        super();
        this.accountNo = account;
        this.name = name;
        this.balance = balance;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccount(int account) {
        this.accountNo = account;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

}