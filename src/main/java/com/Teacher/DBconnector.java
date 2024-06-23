package com.Teacher;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnector {

	private static String url = "jdbc:mysql://localhost:3306/school_info";
	private static String userName = "root";
	private static String password = "2210";
	
	private static Connection con;

	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);
			
		}
		catch (Exception e) {
			System.out.println("Database connection  not success!!!");
		}
		
		return con;
	}
}
