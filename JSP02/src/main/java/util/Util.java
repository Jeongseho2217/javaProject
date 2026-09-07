package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
	private static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:29889/xepdb1";
			String user = "sql_select";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, user, pwd);
			
			if(con!=null) System.out.println("DB연결 성공");
			else System.out.println("DB연결 실패");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static Connection getConn() {
		return getConnection();
	}
}
