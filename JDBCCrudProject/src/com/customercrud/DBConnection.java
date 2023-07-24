package com.customercrud;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/bikeshowroom";
	public static final String USER="root";
	public static final String PASS="Ashish@1999";
	
	static Connection conn=null;
	
	public static Connection getConn()
	{
		try
		{
			Class.forName(JDBC_DRIVER);
			System.out.println("driver loaded");
			conn=DriverManager.getConnection(JDBC_URL, USER, PASS);

		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		return conn;
	}
	

}
