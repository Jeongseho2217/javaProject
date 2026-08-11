package exam.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import jdbc.DBConn;

public class BookEx {

	public static void main(String[] args) {
		// book 테이블의 정보를 조회하는 프로그램
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DBConn dbcon = new DBConn();
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 총 도서 권수 출력
		try {
			
			con = dbcon.getConnection();

			String sql = "SELECT COUNT(bookNo) FROM BOOK";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.print("총 도서 권수: ");
			
		while(rs.next()) {
			String bookNo = rs.getString(1);
			
			System.out.format("%-10s", bookNo);
		}
			
		}catch(Exception e) {
			System.out.println("검색 중 오류 발생");
		}

		// 2. 2021년 이후 발행된 도서만 출력
		try {
			
			con = dbcon.getConnection();
			
			System.out.print("기준 날짜 입력(yyyy-mm-dd) : ");
			String inputDate = sc.nextLine();

			String sql = "SELECT * FROM BOOK WHERE bookDate >= ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, inputDate);
			
			rs = pstmt.executeQuery();
			System.out.println("도서번호 \t 도서명 \t\t\t\t 저자 \t\t 가격 \t\t 발행일 \t 재고 \t 출판사 번호");
			
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
		}catch(Exception e) {
			System.out.println("검색 중 오류 발생");
		}
		
		// 3. 이름에 길동이 들어간 도서만 출력
		try {
			
			con = dbcon.getConnection();
			
			System.out.print("저자 입력 : ");
			String inputAuthor = sc.nextLine();

			String sql = "SELECT * FROM BOOK WHERE bookAuthor Like '%?'";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, inputAuthor);
			
			rs = pstmt.executeQuery();
			System.out.println("도서번호 \t 도서명 \t\t\t\t 저자 \t\t 가격 \t\t 발행일 \t 재고 \t 출판사 번호");
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
			
		}catch(Exception e) {
			System.out.println("검색 중 오류 발생");
		}
		
		// 4. 가격이 30000원 이상인 도서 검색 가격입력받기
		
	}

}
