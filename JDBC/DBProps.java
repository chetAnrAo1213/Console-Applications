package com.Jdbc.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBProps {

	private static String url = "jdbc:mysql://localhost:3306/jdbc";
	private static String userName = "root";
	private static String password = "21KN1A05H4";

	public static Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection(url,userName,password);
	}
}
