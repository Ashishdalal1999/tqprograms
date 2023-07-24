package com.jdbconn;

import java.sql.Connection;

public class AccessDB {
	public static Connection con=null;
	
	public AccessDB()
	{
		con=DBConnection.getConnection();
		System.out.println("connection established....");
	}
	
	public static void main(String args[])
	{
		AccessDB obj=new AccessDB();
	}
}
