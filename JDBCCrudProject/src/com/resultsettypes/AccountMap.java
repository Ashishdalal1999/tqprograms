package com.resultsettypes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountMap {
	static Connection conn = null;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	static Scanner sc = new Scanner(System.in);
	HashMap<Integer, Long> amap;

	public AccountMap() {
		conn = DBConnection.getConn();
		try {

			st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from accounts");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		amap = new HashMap<>();

	}

	void createMap() {
		try {
			rs = st.executeQuery("Select * from accounts");
			while (rs.next()) {
				amap.put(rs.getInt(1), rs.getLong(4));

			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void DisplayMap() {
		for (Map.Entry<Integer, Long> en : amap.entrySet()) {
			System.out.println(en.getKey() + "---->" + en.getValue());
		}

	}

	public static void main(String[] args) {
		AccountMap am = new AccountMap();

		am.createMap();
		am.DisplayMap();
	}
}