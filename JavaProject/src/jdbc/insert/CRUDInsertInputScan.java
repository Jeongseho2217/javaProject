package jdbc.insert;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.DBConn;

import java.sql.PreparedStatement;

public class CRUDInsertInputScan {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		DBConn dbcon = new DBConn();
		String bookNo, bookTitle, bookAuthor, bookDate, pubNo;
		int bookStock, bookPrice;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			con = dbcon.getConnection();

			String sql = "INSERT INTO BOOK VALUES(?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			System.out.print("도서번호 입력 : ");
			bookNo = sc.nextLine();
			System.out.print("도서명 입력 : ");
			bookTitle = sc.nextLine();
			System.out.print("저자 입력 : ");
			bookAuthor = sc.nextLine();
			System.out.print("도서 가격 입력 : ");
			// 그냥 NextInt를 사용하면 enter를 처리 못해서 다른 입력에 영향을 미침
			bookPrice = Integer.parseInt(sc.nextLine());
			System.out.print("도서 발행일 입력(yyyy-mm-dd) : ");
			bookDate = sc.nextLine();
			System.out.print("도서 재고량 입력 : ");
			bookStock = sc.nextInt();
			System.out.print("출판사 번호 입력 : ");
			pubNo = sc.nextLine();
			
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
