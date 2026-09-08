package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.Util;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

public class MemberDAO {
	// DAO 객체가 생성될 때 connection 객체를 factory(connection pool)에서 할당받도록 생성자 구성
	private DataSource dataFactory;
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context env = (Context)ctx.lookup("java:/comp/env");
			this.dataFactory = (DataSource)env.lookup("jdbc/oracle");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemberDTO> memberSelect() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MemberDTO> memList = new ArrayList<MemberDTO>();
		
		try {
			//con = Util.getConn(); // 사용할때 직접 연결
			System.out.println("checkc");
			dataFactory.getConnection(); // connection pool에서 미리 준비한 connection 객체 얻어옴
			String query = "select * from member";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// 1개의 레코드(resultset)를 처리 -> rs에서 추출해서 memberVO에 저장하고 arrayList에 추가
				String id = rs.getString("memId");
				String pwd = rs.getString("memPwd");
				String name = rs.getString("memName"); 
				String email = rs.getString("memEmail"); 
				
				MemberDTO vo = new MemberDTO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				
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
