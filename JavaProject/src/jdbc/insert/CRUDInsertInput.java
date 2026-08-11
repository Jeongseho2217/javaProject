package jdbc.insert;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.DBConn;

import java.sql.PreparedStatement;

public class CRUDInsertInput {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		DBConn dbcon = new DBConn();
		String bookNo, bookTitle, bookAuthor, bookDate, pubNo;
		int bookStock, bookPrice;
		
		try {
			con = dbcon.getConnection();
			stmt = con.createStatement();
					
			bookNo = "98";
			bookTitle = "자바 개정판";
			bookAuthor = "김바로";
			bookPrice = 20000;
			bookDate = "2025-01-01";
			bookStock = 5;
			pubNo = "2";
			// statement 객체는 매번 전처리(형식 검사 진행) - 완성된 쿼리를 전달해줘야 함
			// 변수와 문자열 결합이 복잡함, 자바 보안 측면에서 취약한 쿼리 결합으로 분류됨
			//String sql = "INSERT INTO BOOK VALUES('"+bookNo+"','"+bookTitle+"', '"+bookAuthor+"',"+bookPrice+",'"+bookDate+"', "+bookStock+",'"+pubNo+"')";	
			//int tmpRes = stmt.executeUpdate(sql);
			
			// PreparedStatement 객체 - 복잡한 쿼리 구성의 간결화, 보안 측면에서 취약한 쿼리를 배체 시킬 수 있음
			//Statement 객체의 하위 인터페이스, 쳥식검사를 미리 진행 함(컴파일러) - 쿼리 완성 후 형식검사 진행하지 않음
			// 변수 바인딩 진행 : ? 바인딩 문자 -> 플레이스 홀더 사용, 인수가 많은 쿼리에 적합
			// 처음 한번 전처리 후 다음 사용시엔 전처리 하지 않음
			
			
			bookNo = "88";
			// 미완성으로 먼저 쿼리 구문을 만든다.
			String sql = "INSERT INTO BOOK VALUES(?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			//?의 실제값 적용 : setXXX
			pstmt.setString(1, bookNo);
			pstmt.setString(2, bookTitle);
			pstmt.setString(3, bookAuthor);
			pstmt.setInt(4, bookPrice);
			pstmt.setString(5, bookDate);
			pstmt.setInt(6, bookStock);
			pstmt.setString(7, pubNo);
			
			int tmpRes = pstmt.executeUpdate(); //바인딩 완료된 쿼리를 실행
			if(tmpRes == 1) System.out.println("삽입 성공");
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
				bookNo = rs.getString(1);
				bookTitle = rs.getString(2);
				bookAuthor = rs.getString(3);
				bookPrice = rs.getInt(4);
				Date bookDate1 = rs.getDate(5);
				bookStock = rs.getInt(6);
				pubNo = rs.getString(7);
				
				// 한행씩 출력
				System.out.format("%-10s\t %-20s\t %-10s %6d %13s \t%3d %10s\n", bookNo, bookTitle, bookAuthor, bookPrice, bookDate1, bookStock, pubNo);
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
