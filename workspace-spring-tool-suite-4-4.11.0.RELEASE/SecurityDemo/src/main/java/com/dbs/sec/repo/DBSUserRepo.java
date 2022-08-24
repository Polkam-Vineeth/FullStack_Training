package com.dbs.sec.repo;

import com.dbs.sec.model.DBSUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBSUserRepo extends JpaRepository<DBSUser, Integer>{
	
	DBSUser findByUserName(String name);

}
