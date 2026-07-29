package exam.book_interface;

import java.util.ArrayList;

public class BookDAO implements IBookDAO {

	private ArrayList<BookDTO> bookList = new ArrayList<>();
	
	@Override
	public void insertBook(BookDTO dto) {
		
		bookList.add(dto); // 리스트에 등록
		System.out.println(dto.getAuthor() + "(이)가 쓴 책인 " + dto.getBookTitle() + "(이)가 등록되었습니다.");
	}

	@Override
	public void deleteBook(int bookID) {
		BookDTO dto = getBookById(bookID); // 책 한권 정보 가져오기
		bookList.remove(dto); // 리스트에 제거
		System.out.println("ID : [" + bookID + "]를 가진 책인 " + dto.getBookTitle() + "(이)가 제거되었습니다.");
	}

	@Override
	public ArrayList<BookDTO> getAllBooks() {
		return bookList; // 전체 책 리스트를 반환
	}

	@Override
	public void updatePrice(int bookID, int price) {
		BookDTO dto = getBookById(bookID); // 책 한권 정보 가져오기
		
		if (dto != null) {
	        dto.setPrice(price); // 가져온 책의 가격을 price로 수정
	        System.out.println("ID : [" + bookID + "] 책의 가격이 " + price + "원으로 변경되었습니다.");
	    } else {
	        System.out.println("ID : [" + bookID + "]를 가진 책을 찾을 수 없습니다.");
	    }
	}

	@Override
	public BookDTO getBookById(int bookID) {
		for (BookDTO dto : bookList) { // 모든 책 리스트를 돌며
	        if (dto.getbookID() == bookID) { // ID가 같은지 확인
	            return dto; // 찾고자 하는 책이 발견되면 리턴
	        }
	    }
		System.out.println("ID : [" + bookID + "]를 가진 책을 찾을 수 없습니다.");
	    return null; // 찾는 ID의 책이 없을 경우 널값 반환
	}

	
}
