package com.springsecurity.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    
    
    @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
		.withUser(users.username("sai").password("sai123").roles("MANAGER"))
		.withUser(users.username("pavan").password("pavan123").roles("ADMIN"))
		.withUser(users.username("raju").password("raju123").roles("EMPLOYEE"));
	}

//	protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//        .antMatchers("/coder").hasAuthority("Coder")
//        .antMatchers("/trainer").hasAuthority("Trainees")
//        .and()
//        .formLogin().loginPage("/MyCustomLogin").permitAll()// goes to custom
//        .and().logout().permitAll()
//        .and().exceptionHandling().accessDeniedPage("/accessDenied");
//    }
}