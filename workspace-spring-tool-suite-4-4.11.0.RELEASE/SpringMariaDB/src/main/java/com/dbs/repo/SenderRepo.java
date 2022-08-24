package com.dbs.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dbs.model.Sender;

public interface SenderRepo extends JpaRepository<Sender, Integer>{

}