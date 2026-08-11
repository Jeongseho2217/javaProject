package bookcrud;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ReadWrite {
	// 사용자로부터 입력에 사용하는 메서드
	public static BookDTO getBookInfo(Scanner sc) {
		BookDTO dto = null;
		try {
			System.out.println("*********************");
			System.out.println("도서 정보 등록");
			System.out.println("*********************");
			System.out.print("도서번호 입력 : ");
			String bookNo = sc.nextLine();
			
			System.out.print("도서명 입력 : ");
			String bookName = sc.nextLine();

			System.out.print("저자 입력 : ");
			String bookAuthor = sc.nextLine();
			
			System.out.print("가격 입력 : ");
			int bookPrice = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("발행일 입력 : ");
			String bookDateY = sc.nextLine();	
			
			SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
			Date bookDate = fm.parse(bookDateY);
			
			System.out.print("재고 입력 : ");
			int bookStock = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사 번호 입력 : ");
			String pubNo = sc.nextLine();
			
			dto = new BookDTO(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
			
		} catch(Exception e) {
			System.out.println("입력 오류");
			e.printStackTrace();
		}
		return dto;
	}
	
	//////////// 출력 메소드

	public static void writeStdInfo(ArrayList<BookDTO> bookList) {
		System.out.format("%-10s\t %-40s\t %-30s\t %-8s\t %13s %-8s %-10s\n", "도서번호", "도서명", "저자", "가격", "출판일", "재고", "출판사 번호");
		for (BookDTO dto : bookList) {
			String bookNo = dto.getBookNo();
			String bookName = dto.getBookName();
			String bookAuthor = dto.getBookAuthor();
			int bookPrice = dto.getBookPrice();
			Date bookDate = dto.getBookDate();
			int bookStock = dto.getBookStock();
			String pubNo = dto.getPubNo();
			
			System.out.format("%-10s\\t %-40s\\t %-30s\\t %-8s\\t %13s %-8s %-10s\\n", bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
		}
	}
	
	public static void writeStdInfo(BookDTO dto) {
		System.out.format("%-10s\t %-40s\t %-30s\t %-8s\t %13s %-8s %-10s\n", "도서번호", "도서명", "저자", "가격", "출판일", "재고", "출판사 번호");
		String bookNo = dto.getBookNo();
		String bookName = dto.getBookName();
		String bookAuthor = dto.getBookAuthor();
		int bookPrice = dto.getBookPrice();
		Date bookDate = dto.getBookDate();
		int bookStock = dto.getBookStock();
		String pubNo = dto.getPubNo();
		
		System.out.format("%-10s\\t %-40s\\t %-30s\\t %-8s\\t %13s %-8s %-10s\\n", bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
	}
}
