package jdbc.crudmodule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
	// DB의 연결과 종료를 관리
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			String url = "jdbc:oracle:thin:@localhost:29889/xepdb1";
			String user = "sql_select";
			String pwd = "1234";
			con = DriverManager.getConnection(url, user, pwd);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		if (con != null) System.out.println("DB 연결 성공");
		else System.out.println("DB 연결 실패");
		return con;
	}
	
	// db 관련 객체 해체 메소드
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
		
			if(pstmt!=null) {
				pstmt.close();
				pstmt=null;
			}
			
			if(con!= null) {
				con.close();
				con=null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
	//3. Connection 자원 1개 반환
	public static void close(Connection con) {
		try {
		
			if(con!= null) {
				con.close();
				con=null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//4. PreparedStatement, Resultset 자원 2개 반환
	public static void close(PreparedStatement pstmt, ResultSet rs) {
		try {
		
			if(rs!= null) {
				rs.close();
				rs=null;
			}
			
			if(pstmt!= null) {
				pstmt.close();
				pstmt=null;
			}			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}	
	
	//5. PreparedStatement 자원 1개 반환
	public static void close(PreparedStatement pstmt) {
		try {
			
			if(pstmt!= null) {
				pstmt.close();
				pstmt=null;
			}			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
