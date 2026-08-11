package jdbc.insert;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.DBConn;

public class CRUDTestInsert {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		// Insert이기 때문에 Select처럼 ResultSet은 임포트 필요 x
		DBConn dbcon = new DBConn();
		
		try {
			con = dbcon.getConnection();
			stmt = con.createStatement();
			// 쿼리, 삽입되는 데이터가 상수
			String sql = "INSERT INTO BOOK VALUES('1000','자바 개정판', '김바로','18000','2025-01-05',5,'2')";
			//statement 객체는 매번 형식 검사(전처리)를 진행함
			//stmt.executeUpdate(sql); // 삽입, 삭제, 변경에 사용 가능
			int tmpRes = stmt.executeUpdate(sql);
			// tmpRes는 db가 수행한 질의 수를 반환함
			if(tmpRes == 1) System.out.println("인서트 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// 확인용 출력
			ResultSet rs = null;
			// 쿼리
			String query = "SELECT * FROM book";
			
			// 쿼리를 저장하고 전달, 실행 담당 객체를 하나 생성 : statement 객체 생성
			stmt = con.createStatement();
			// 쿼리를 DBMS에 전달 및 실행 요청, 실행 결과 반환 : 반환이 성공하면 조회된 결과가 rs의 참조로 반환
			rs = stmt.executeQuery(query); // select 구문일때 사용하는 메서드, ResultSet 반환
			
			System.out.println("--------------전체 도서 정보 조회-----------------");
			System.out.println("도서번호 \t 도서명 \t\t\t\t 저자 \t\t 가격 \t\t 발행일 \t 재고 \t 출판사 번호");
			//ResultSet 객체 활용 포인터 이동해가면서 각 속성 값 추출
			//getXXX(속성 번호) : XXX -> String, Int, Date
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookName = rs.getString(2);
				String bookAuthor = rs.getString(3);
				int bookPrice = rs.getInt(4);
				Date bookDate = rs.getDate(5);
				int bookStock = rs.getInt(6);
				String pubNo = rs.getString(7);
				
				// 한행씩 출력
				System.out.format("%-10s\t %-20s\t %-10s %6d %13s \t%3d %10s\n", bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
			}
			rs.close();
			stmt.close();
			con.close();
			} catch(Exception e) {
				System.out.println("오류 발생");
				e.printStackTrace();
			}
		
	}
}
