package com.Hibernate_Annotated.App;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry; 

public class Hibernate_Props {

	public static SessionFactory sf;
	
	public static SessionFactory getSessionFactory()
	{

		try 
		{
			if(sf==null)
			{
				Configuration cfg = new Configuration();
				Properties props = new Properties();
				 props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				 props.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
				 props.put(Environment.USER, "root");
				 props.put(Environment.PASS, "21KN1A05H4");
				 props.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
				 props.put(Environment.HBM2DDL_AUTO, "update");
				 props.put(Environment.SHOW_SQL, true);
				cfg.setProperties(props);
				cfg.addAnnotatedClass(CustomerPOJO.class);
				
				ServiceRegistry sry = new StandardServiceRegistryBuilder()
											.applySettings(cfg.getProperties())
											.build();
				sf=cfg.buildSessionFactory(sry);
			}
		} 
		catch (Exception e) 
		{
			System.err.println("Configuration Exception!!!"+e.getMessage());
			e.printStackTrace();
		}
		return sf;
	}
}
