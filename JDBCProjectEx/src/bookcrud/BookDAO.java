package bookcrud;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO implements IBookDAO{
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	BookDTO book = null;
	ArrayList<BookDTO> bookList = null;
	
	public BookDAO() { // DB연결
		con = DBConn.getConnection();
	}

	@Override
	public void InsertBook(BookDTO dto) {
		
		try {
			String query = "insert into book values(?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, dto.getBookNo());
			pstmt.setString(2, dto.getBookName());
			pstmt.setString(3, dto.getBookAuthor());
			pstmt.setInt(4, dto.getBookPrice());
			pstmt.setDate(5, new java.sql.Date(dto.getBookDate().getTime()));
			pstmt.setInt(6, dto.getBookStock());
			pstmt.setString(7, dto.getPubNo());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) System.out.println("성공 : 도서 정보가 등록되었습니다.");
			else System.out.println("실패 : 정보 등록에 실패하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConn.close(pstmt);
		}
		
	}

	@Override
	public ArrayList<BookDTO> getAllBooks() {

		bookList = new ArrayList<BookDTO>();
		
		try {
			
			ResultSet rs = null;
			
			String query = "select * from book";
			pstmt = con.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookName = rs.getString(2);
				String bookAuthor = rs.getString(3);
				int bookPrice = rs.getInt(4);
				Date bookDate = rs.getDate(5);
				int bookStock = rs.getInt(6);
				String pubNo = rs.getString(7);
				
				book = new BookDTO(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
				bookList.add(book);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConn.close(pstmt, rs);
		}
		
		return null;
	}

	@Override
	public void UpdateBook(BookDTO dto) {
		try {

			String query = "update book set bookName=?, bookAuthor=?, bookPrice=?, bookDate=?, bookStock=?, pubNo=? where bookNo=?";
			pstmt = con.prepareStatement(query);
			
			pstmt.executeUpdate();
			
			pstmt.setString(7, dto.getBookNo());
			pstmt.setString(1, dto.getBookName());
			pstmt.setString(2, dto.getBookAuthor());
			pstmt.setInt(3, dto.getBookPrice());
			pstmt.setDate(4, new java.sql.Date(dto.getBookDate().getTime()));
			pstmt.setInt(5, dto.getBookStock());
			pstmt.setString(6, dto.getPubNo());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConn.close(pstmt);
		}
	}

	@Override
	public void DeleteBook(String bookNo) {
		try {

			String query = "delete book where bookNo=?";
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, bookNo);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConn.close(pstmt);
		}
	}
}
