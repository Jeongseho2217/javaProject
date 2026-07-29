package exam.book_interface;

import java.util.ArrayList;

public interface IBookDAO {
	
	public void insertBook(BookDTO dto); // 1개의 책 정보를 받아 DB에 저장
	
	public void deleteBook(int bookID); // 특정 ID를 가진 책을 찾아 DB에서 제거
	
	public ArrayList<BookDTO> getAllBooks(); // 모든 책의 정보를 조회
	
	public void updatePrice(int bookID, int price); // ID를 받아 가격을 수정 
	
	public BookDTO getBookById(int bookID); // ID를 받아 특정 책을 검색
}
