package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class MemberDAO {
	private Connection getConnection() {
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
	
	public ArrayList<MemberVO> memberSelect() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MemberVO> memList = new ArrayList<MemberVO>();
		
		try {
			con = getConnection();
			String query = "select * from member";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// 1개의 레코드(resultset)를 처리 -> rs에서 추출해서 memberVO에 저장하고 arrayList에 추가
				String id = rs.getString("memId");
				String pwd = rs.getString("memPwd");
				String name = rs.getString("memName"); 
				String email = rs.getString("memEmail"); 
				Date joinDate = rs.getDate("memJoinDate");
				
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				
				memList.add(vo);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return memList;
	}
}
