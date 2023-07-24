package com.resultsettypes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetScrollable {

	static Connection conn = null;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	public ResultSetScrollable() {
		conn = DBConnection.getConn();
		try {

			st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from accounts");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void fetchData() {
		try {
			rs.beforeFirst();

			System.out.println("--------Account Data-------");
			System.out.println("----------------------");
			System.out.println("Accno  |  customerId  |   AcctypeId  |   Balance");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "         " + rs.getInt(2) + "           " + rs.getInt(3)
						+ "           " + rs.getInt(4));

			}
			System.out.println("------------");

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public void fetchDataReverse() {
		try {
			rs.afterLast();
			System.out.println("--------Account Data Reverse--------");
			System.out.println("----------------------");
			System.out.println("Accno  |  customerId  |   AcctypeId  |   Balance");
			while (rs.previous()) {
				System.out.println(rs.getInt(1) + "         " + rs.getInt(2) + "           " + rs.getInt(3)
						+ "           " + rs.getInt(4));

			}
			System.out.println("------------");

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void main(String[] args) {
		ResultSetScrollable rst = new ResultSetScrollable();
		rst.fetchData();
		rst.fetchDataReverse();

	}

}