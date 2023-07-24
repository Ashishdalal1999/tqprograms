package com.jdbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchBike_ShowroomData {

	static Connection conn=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	
	public FetchBike_ShowroomData() throws SQLException
	{
		conn=DBConnection.getConnection();
		System.out.println("Connection");
		st=conn.createStatement();
	}
	
	public void fetchmodelData()
	{
		try
		{
			pst=conn.prepareStatement("select * from model where model_id=?");
			pst.setInt(1, 101);
			rs=pst.executeQuery();
					
			//System.out.println("Model details:");
			//System.out.println("model id          model name         cost");
			while(rs.next())
			{
				//System.out.println(rs.getInt(1)+"           "+rs.getString(2)+"            "+rs.getInt(3));
				System.out.println("model details");
				System.out.println("model id:"+rs.getInt(1));
				System.out.println("model name:"+rs.getString(2));
				System.out.println("cost:"+rs.getInt(3));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		FetchBike_ShowroomData fbsd=new FetchBike_ShowroomData();
		fbsd.fetchmodelData();
		

	}

}
