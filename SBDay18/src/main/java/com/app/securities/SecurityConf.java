package com.app.securities;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConf extends WebSecurityConfigurerAdapter{
//
//	@Autowired
//	private DataSource dataSource;
	
//	//otentikasi
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder authBuilder) throws Exception {
		
		//inMemoryAuthentication
		authBuilder.inMemoryAuthentication().
		withUser("Andrian").password("{noop}123").roles("STAFF")
		.and()
		.withUser("Heru").password("{noop}111").roles("ADMIN")
		.and()
		.withUser("Wawan").password("{noop}222").roles("SPV");
		
		//jdbcAuthentication
//		authBuilder.jdbcAuthentication().dataSource(dataSource)
//		.usersByUsernameQuery("select username, CONCAT('{noop}',password), enabled from m_users where username = ?")
//		.authoritiesByUsernameQuery("select username, role from m_users where username = ?");
		
		
	}
	
	//otorisasi
	@Override
	protected void configure(HttpSecurity httpSec) throws Exception {
		httpSec
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/api/def/list").hasAnyRole("STAFF","ADMIN","SPV")		
		.antMatchers("/api/def/add").hasAnyRole("ADMIN","SPV")
		.antMatchers("/api/def/delete").hasRole("SPV")
		.anyRequest().authenticated()
		.and()
		.httpBasic()
		.and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
