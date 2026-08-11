package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {

	public Connection getConnection() {
		// db 연결 test
				Connection con = null;
				
				// 외부 자원을 사용하기 때문에 반드시 try-catch or throw 둘 중 하나로 예외처리를 진행해야한다.
				
				try {
					//dbms 연결 관련 코드를 넣음
					//1. JDBC DPRIVER 클래스의 객체 생성 : 런타임시 JDBC 드라이버를 로드
					// Class.forName("oracle.jdbc.driver.OracleDriver");
					// 접속 변수 생성
					// "oracle 접속 종류:@dbms주소(도메인 or IP):포트:sid 또는 서비스name
					String url = "jdbc:oracle:thin:@localhost:29889/xepdb1";
					String user = "sql_select";
					String pwd = "1234";
					// 2. Connection Interface 참조변수에 구현객체 대입(db 접속 후 접속 객체 반환) -> DriverManager
					con = DriverManager.getConnection(url, user, pwd);
					// db 접속 실패하면 catch, 저장값은 null;
				} catch(Exception e) {
					e.printStackTrace();
				}
				if (con != null) {
					System.out.println("DB 연결 성공");
				} else {
					System.out.println("DB 연결 실해");
				}
				return con;
	}

}
