package firstproject;
import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth
//			.inMemoryAuthentication()
//				.withUser("user").password("password").roles("USER");
		
//		auth.userDetailsService(userDetailsManager());
		
		auth.jdbcAuthentication().dataSource((javax.sql.DataSource) dataSource)
		.usersByUsernameQuery(
			"select firstname,lastname,enabled from employees where firstname=?")
		.authoritiesByUsernameQuery(
			"select firstname, authority from authorities where firstname=?");
	}

	
}