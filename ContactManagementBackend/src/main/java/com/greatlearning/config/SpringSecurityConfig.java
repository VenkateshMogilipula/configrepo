//package com.greatlearning.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
//	
//	@Override
//	public void configure(HttpSecurity http) throws Exception{
//		http.csrf().disable()
//		.authorizeRequests()
//		.antMatchers("/login","/user/save").permitAll()
//		.anyRequest().authenticated()
//		.and()
//		.httpBasic();
//	}
//
//}
//
//		<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-security</artifactId>
//		</dependency>
