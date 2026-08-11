package ex1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCProjectEx {
	public static void main(String[] args) {
		DBConn dbcon = new DBConn();
		Connection con = dbcon.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		if (con==null) System.out.println("접속 실패..");
		else {
			System.out.println("접속 성공!");
			try {
				
				String query = "SELECT * FROM PRODUCTFIN";
				
				stmt = con.createStatement(); // 포장
				rs = stmt.executeQuery(query); // 전달
				
				System.out.println("-------------- 제품 정보 조회-----------------");
				System.out.println("제품번호 \t 제품명 \t\t\t\t 가격 \t\t 제조사 \t\t 제품색 \t ctgNo");
				
				while(rs.next()) {
					String prdNo = rs.getString(1);
					String prdName = rs.getString(2);
					int prdPrice = rs.getInt(3);
					String prdMaker = rs.getString(4);
					String prdColor = rs.getString(5);
					int ctgNo = rs.getInt(6);
					
					System.out.format("%-10s\t %-50s\t %8d \t %-30s \t %-30s %4d\n", prdNo, prdName, prdPrice, prdMaker, prdColor, ctgNo);
					rs.close();
					stmt.close();
					con.close();
				}
				
			} catch(Exception e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
