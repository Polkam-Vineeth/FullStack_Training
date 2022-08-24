package com.dbs.vin.jpa.repo;

import com.dbs.vin.jpa.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepo extends JpaRepository<BankAccount, Integer>{

}

