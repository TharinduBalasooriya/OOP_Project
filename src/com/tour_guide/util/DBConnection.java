package com.tour_guide.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
 * 
 * configuring data base connection
 * */


public class DBConnection {
	
	
	public static Connection conn;
	public static Connection getConnection()  {
		
		if(conn == null) {
			
			 try {
				 Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tour_guide","root","Ananda@1886");
			} catch (SQLException | ClassNotFoundException e ) {
				
				e.printStackTrace();
				/*
				 * Catching the exceptions
				 * */
			}
			
		}
	
		
		
		
		return conn;
	}

}
