package exam.book_interface;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// 사용 예시
		Scanner sc = new Scanner(System.in);
		
		BookDTO bookDto = null;
		
		while(true) {
			
			System.out.print("입력 (1-6) >");
			int input = sc.nextInt();
			
			switch(input) {
				case 1: {// 책 등록
					System.out.println("책 등록 정보 입력"); 
					System.out.print("제목 입력 : "); 
					String title = sc.next();
					System.out.print("책 id 입력 : "); 
					int id = sc.nextInt();
					System.out.print("저자 입력 : "); 
					String author = sc.next();
					System.out.print("가격 입력 : "); 
					int price = sc.nextInt();
					
					//1권 등록
					bookDto = new BookDTO(title, id, author, price);
					
					IBookDAO dao = new BookDAO();
					dao.insertBook(bookDto);
					break;
				}
				
				case 2: {//1권 조회
					IBookDAO dao = new BookDAO();
					
					System.out.print("조회할 책 id 입력 : "); 
					int id = sc.nextInt();
					
					bookDto = dao.getBookById(id);
					if (!(bookDto == null)) {
						System.out.println("책 제목 : " + bookDto.getBookTitle());
						System.out.println("책 ID : " + bookDto.getbookID());
						System.out.println("저자 : " + bookDto.getAuthor());
						System.out.println("가격 : " + bookDto.getPrice());
					} else {
						System.out.println(" ID : [" + id + "]에 해당하는 책 정보는 조회되지 않습니다."); 
					}
					break;
				}
				
				case 3: {//1권 삭제
					IBookDAO dao = new BookDAO();
					
					System.out.print("제거할 책 id 입력 : "); 
					int id = sc.nextInt();
					
					bookDto = dao.getBookById(id);
					if (!(bookDto == null)) {
						dao.deleteBook(id);
					} else {
						System.out.println("제거할 책 ID : [" + id + "]에 해당하는 책 정보를 찾지 못 하였습니다."); 
					}
					break;
				}
				case 4: { // 모든 책 조회
					IBookDAO dao = new BookDAO();
					dao.getAllBooks();
					break;
				}
			}
		}
	}
}