package com.dbs.sec.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.dbs.sec.service.DBSUserDetailService;
//import com.dbs.security.service.DBSUserDetailsService;

@Configuration
@EnableWebSecurity
public class DBSSecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Autowired
    DBSUserDetailService dBSUserDetailsService;
		
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
		auth.userDetailsService(dBSUserDetailsService);
//        auth.inMemoryAuthentication()
//        .withUser("Vin")
//        .password("55")
//        .roles("ADMIN")
//        .and()
//        .withUser("Sree")
//        .password("40")
//        .roles("DBS_USER");
        
    }
    
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        
        http.httpBasic()
        .and()
        .authorizeRequests()
        .antMatchers("/admin").hasAuthority("ADMIN")
        .antMatchers("/user").hasAnyAuthority("ADMIN", "USER")
        .antMatchers("/home").permitAll()
        .antMatchers("/register").permitAll()
        .and()
        .cors().disable()
        .formLogin();
        
    }
	
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//       http.authorizeRequests()
//       .antMatchers("/admin").hasRole("ADMIN")
//       .antMatchers("/user").hasAnyRole("DBS_USER","ADMIN")
//       .antMatchers("/home").permitAll()
//       .and()
//       .formLogin();
//	}
	
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
