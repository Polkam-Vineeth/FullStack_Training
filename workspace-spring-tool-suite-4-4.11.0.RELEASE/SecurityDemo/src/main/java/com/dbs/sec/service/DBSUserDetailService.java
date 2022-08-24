package com.dbs.sec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dbs.sec.model.DBSUser;
import com.dbs.sec.model.MyUserDetails;
import com.dbs.sec.repo.DBSUserRepo;

@Service
public class DBSUserDetailService implements UserDetailsService{

	@Autowired
	DBSUserRepo dbsUserRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		DBSUser dbsUser = dbsUserRepo.findByUserName(username);
		MyUserDetails myUserDetails = new MyUserDetails(dbsUser);
		
		return myUserDetails;
	}
}
