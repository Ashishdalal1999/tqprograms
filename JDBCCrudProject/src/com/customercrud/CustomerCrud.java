package com.customercrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class CustomerCrud {

	static Connection conn = null;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	static Scanner sc = new Scanner(System.in);

	public CustomerCrud() {
		conn = DBConnection.getConn();
		try {
			st = conn.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void menu() {
		System.out.println("1. Add a customer");
		System.out.println("2. delete a customer");
		System.out.println("3.Update phonenumber of customer");
		System.out.println("4. Display all customer");
		System.out.println("5. Display customer by id");
		System.out.println("6. Exit");
		System.out.println("Enter your choice:");
	}

	public void addCustomer() {
		System.out.println("Enter customer id");
		int id = sc.nextInt();
		System.out.println("Customer name");
		String name = sc.next();
		System.out.println("Customer contact");
		String contact = sc.next();
		System.out.println("Customer age");
		int age = sc.nextInt();
		System.out.println("customer pan no");
		String panno = sc.next();

		try {
			pst = conn.prepareStatement("insert into customer_master values(?,?,?,?,?) ");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, contact);
			pst.setInt(4, age);
			pst.setString(5, panno);
			int noOfRowsAffected = pst.executeUpdate();
			if (noOfRowsAffected > 0) {
				System.out.println("Customer has been added");
			} else {
				System.out.println("not added");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void UpdateCustomerNumber() {
		System.out.println("Enter the id of customer to be updated");
		int id = sc.nextInt();
		if (displayCustomerById(id)) {
			System.out.println("--------");
			System.out.println("Enter phone number");
			long mno = sc.nextLong();
			try {
				pst = conn.prepareStatement("update customer_master set contact=? where cust_id=?");
				pst.setLong(1, mno);
				pst.setInt(2, id);
				int noOfRowsUpdated = pst.executeUpdate();
				if (noOfRowsUpdated > 0) {
					System.out.println("--------updates values are---");
					displayCustomerById(id);

				} else {
					System.out.println("No updates");
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.out.println("no customer with this id exists");
		}
	}

	public void deleteCustomer() {
		System.out.println("Enter the id of customer to be deleted");
		int id = sc.nextInt();
		try {
			pst = conn.prepareStatement("delete from customer_master where cust_id=?");
			pst.setInt(1, id);
			int noOfRowsDeleted = pst.executeUpdate();
			if (noOfRowsDeleted > 0) {
				System.out.println("Customer is deleted");
			} else {
				System.out.println("No customer with this id found");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean displayCustomerById(int id) {

		boolean status = false;

		try {
			pst = conn.prepareStatement("Select * from customer_master where cust_id=?");
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("Customer details by id");
				System.out.println("Customer id:" + rs.getInt(1));
				System.out.println("Customer name" + rs.getString(2));
				System.out.println("Customer contact number" + rs.getString(3));
				System.out.println("Customer age:" + rs.getInt(4));
				System.out.println("Customer pan number:" + rs.getString(5));
				status = true;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static void main(String[] args) {
		CustomerCrud cust = new CustomerCrud();
		int ch;
		do {
			cust.menu();
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				cust.addCustomer();
				break;
			case 2:
				cust.deleteCustomer();
				break;
			case 3:
				cust.UpdateCustomerNumber();
				break;
			case 4:
			case 5:
				cust.displayCustomerById(11);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice ---------");
			}
			System.out.println("Do you want to perfrom more operation(1-yes/0-no)");
			ch = sc.nextInt();
		} while (ch == 1);
	}

}