package resultsettype;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetCrud {
	
	static Connection con=null;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	
	static Scanner sc= new Scanner(System.in);
	
	public ResultSetCrud()
	{
		con= DBConnection.getConn();
		try {
			st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			rs= st.executeQuery("select * from account");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void fetchData()
	{
		try
		{		
			rs.beforeFirst();
			System.out.println("----------Account Data--------------");
			System.out.println("-----------------------------------------------");
			System.out.println("AccNo  |  CustomerId   |  AccTypeId  |   Balance");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"      "+rs.getInt(2)+"           "+rs.getString(3)+"      "+rs.getInt(4));
			}
		 System.out.println("-------------------------------------------------------");		
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void insertAccount()
	{
		
		try
		{
			rs.moveToInsertRow();
			
			System.out.println("Enter the account no:");
			String accno= sc.next();
			
			System.out.println("Enter the customer id:");
			int cid= sc.nextInt();
			
			System.out.println("Enter the account type id");
			String actype=sc.next();
			
			System.out.println("Enter the balance:");
			int bal= sc.nextInt();
			
			rs.updateString(1, accno);
			rs.updateInt(2, cid);
			rs.updateString(3, actype);
			rs.updateInt(4, bal);
			
			rs.insertRow();
			fetchData();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
   public void deleteAccount(String accNo)
   {
	   try
	   {
		   rs.beforeFirst();
		   while(rs.next())
		   {
			   if(rs.getString(1).equals(accNo))
			   {
				   rs.deleteRow();
			   }
		   }
		   
		   fetchData();
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   
   }
	
   
   public void updateAccountBalance(String accNo)
   {
	   try
	   {
		   rs.beforeFirst();
		   while(rs.next())
		   {
			   if(rs.getString(1).equals(accNo))
			   {
				   System.out.println("Old balance:"+rs.getInt("balance"));
				   System.out.println("Enter new balance:");
				   int bal= sc.nextInt();
				   
				   rs.updateInt(4, bal);
				   rs.updateRow();
			   }
		   }
		   
		   fetchData();
		   
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   
   }
	
	
	public static void main(String[] args) {
		
		ResultSetCrud rst= new ResultSetCrud();
		rst.fetchData();
		//rst.insertAccount();
		rst.deleteAccount("H5678");
		
		rst.updateAccountBalance("H6780");
	}

}
