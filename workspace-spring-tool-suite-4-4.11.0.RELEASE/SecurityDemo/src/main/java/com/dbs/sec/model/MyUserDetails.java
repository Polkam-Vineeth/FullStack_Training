package com.dbs.sec.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails{
    
    
    
    private String userName;
    private String password;
    private boolean active;
    private List<GrantedAuthority> authorities;
    
    public MyUserDetails(DBSUser dBSUser) {
        
        this.userName = dBSUser.getUserName();
        this.password = dBSUser.getPassword();
        this.active = dBSUser.isActive();
        
        String[] roles = dBSUser.getRoles().split(",");
        String eachRole ="";
        List<GrantedAuthority> localAuth = new ArrayList<GrantedAuthority>();
        for(int i=0;i<roles.length;i++) {
            eachRole = roles[i];
            
            localAuth.add(new SimpleGrantedAuthority(eachRole));
        }
        this.authorities = localAuth;
        
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        
        return authorities;
    }
    @Override
    public String getPassword() {
        
        return password;
    }
    @Override
    public String getUsername() {
        
        return userName;
    }
    @Override
    public boolean isAccountNonExpired() {
        
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
    
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        
        return true;
    }
    @Override
    public boolean isEnabled() {
        
        return active;
    }
}