package ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	public Connection getConnection() {
		
		Connection con = null;
		
		try {
			
			String url = "jdbc:oracle:thin:@localhost:29889/xepdb1";
			String user = "sql_user";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, user, pwd); // 사용자 정보 전달
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(con != null) System.out.println("연결 성공!");
		else System.out.println("연결 실패..");
		
		return con;
	}
}
