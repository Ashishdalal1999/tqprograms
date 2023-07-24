package resultsettype;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.HashMap;

public class PurchaseMap {
	static Connection conn = null;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	static Scanner sc = new Scanner(System.in);
	HashMap<Integer, String> amap;

	public PurchaseMap() {
		conn = DBConnection.getConn();
		try {
			st = conn.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		amap = new HashMap<>();
	}

	void createMap() {
		try {
			rs = st.executeQuery(
					"select p.purchase_id,m.model_name,c.first_name,c.last_name,c.mobile_no,p.booking_amount,pa.payment_type,f.rating from purchase p \r\n"
							+ "join model m on  p.model_id=m.model_id\r\n"
							+ "join customer c on p.cust_id=c.cust_id \r\n"
							+ "join payment_mode pa on p.payment_id=pa.payment_id\r\n"
							+ "join feedback_rating f on p.rating_id=f.rating_id");

			while (rs.next()) {
				String value = rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5)
						+ "  " + rs.getInt(6) + " " + rs.getString(7) + " " + rs.getString(8);
				amap.put(rs.getInt(1), value);
			}

			System.out.println(amap);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {
		PurchaseMap pm = new PurchaseMap();
		pm.createMap();

	}

}