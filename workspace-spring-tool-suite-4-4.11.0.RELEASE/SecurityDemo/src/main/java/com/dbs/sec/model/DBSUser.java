package com.dbs.sec.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DBSUser {
	
	@Id
    String userName;
    String password;
    String roles;
    boolean active;
	
	public DBSUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBSUser(String userName, String password, String roles, boolean active) {
		super();
		this.userName = userName;
		this.password = password;
		this.roles = roles;
		this.active = active;
	}

	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
    
    
}
