package com.skilrock.common;

import java.sql.Connection;
import java.sql.DriverManager;


public class Utility {

	public static Connection getConnection(){
		Connection con=null;
		String url = "jdbc:mysql://localhost/TEST_DB";		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,"root","root");
		}catch(Exception e){System.out.println(e);}
		
		return con;
	}
}
