package bookcrud;

import java.util.ArrayList;

public interface IBookDAO {

	public void InsertBook(BookDTO dto); // 1. 도서 등록 메소드
	
	public ArrayList<BookDTO> getAllBooks(); // 2. 전체 도서 정보 조회
	
	public void UpdateBook(BookDTO dto); // 3. 도서 정보 수정
	
	public void DeleteBook(String bookNo); // 4. 도서 정보 삭제
}
