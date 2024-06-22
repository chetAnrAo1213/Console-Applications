package com.Spring_Jdbc_Annoation.App;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages={"com.Spring_Jdbc_Annoation.App"})
public class SpringConfigProps {

	@Bean("Ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
			ds.setUsername("root");
			ds.setPassword("21KN1A05H4");
		return ds;
	}
	
	@Bean("JdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdt = new JdbcTemplate();
		 jdt.setDataSource(getDataSource());
		return jdt;
	}
	
	@Bean("Phones")
	public PhoneDAO getPhoneDAO()
	{
		PhoneDAO pda = new PhoneDAO();
		  pda.setJdt(getTemplate());
		return pda;
		
	}
}
