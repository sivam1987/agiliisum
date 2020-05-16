package com.aglsum.test.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@SuppressWarnings("deprecation")
@Configuration
public class WebSequrityConfig extends WebSecurityConfigurerAdapter{
	
	@Value("${agilsum.id.admin}")
	private String admin;
	@Value("${agilsum.id.user}")
	private String user;
	@Value("${agilsum.pwd}")
	private String password;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println(password);
		System.out.println(user);
		auth.inMemoryAuthentication().withUser(admin).password(password).roles(admin);
		auth.inMemoryAuthentication().withUser(user).password("password").roles(user);
	}

	// security based on ROLE
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/aglsum/**").hasAnyRole(admin).anyRequest().fullyAuthenticated().and()
				.httpBasic();
	}

	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	
	
	
}


