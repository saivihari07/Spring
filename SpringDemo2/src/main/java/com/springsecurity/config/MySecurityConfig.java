package com.springsecurity.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		UserBuilder users = User.withDefaultPasswordEncoder();
//		
//		auth.inMemoryAuthentication()
//		.withUser(users.username("sai").password("sai123").roles("MANAGER","EMPLOYEE","ADMIN"))
//		.withUser(users.username("pavan").password("pavan123").roles("EMPLOYEE","ADMIN"))
//		.withUser(users.username("raju").password("raju123").roles("EMPLOYEE"));

		auth.jdbcAuthentication().dataSource(dataSource);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/leaders", "/systems")
		.authenticated().and().formLogin()
		.loginPage("/showLoginPage").loginProcessingUrl("/authenticateTheUser").permitAll().and().logout()
		.permitAll().and().exceptionHandling().accessDeniedPage("/access-denied");
	}

}

//
//@Override
//protected void configure(HttpSecurity http) throws Exception {
//	http.authorizeRequests() 
//	.antMatchers("/").hasRole("EMPLOYEE")
//	.antMatchers("/leaders").hasRole("MANAGER")
//	.antMatchers("/systems").hasRole("ADMIN")
//	.and()
//	.formLogin()
//		.loginPage("/showLoginPage")
//		.loginProcessingUrl("/authenticateTheUser")
//		.permitAll()
//	.and()
//	.logout()
//	.permitAll()
//	.and()
//	.exceptionHandling().accessDeniedPage("/access-denied");
//}
