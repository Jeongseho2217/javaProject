package bookcrud;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input=null;
		
		BookDAO dao = new BookDAO();
		
		while(true) {
			try {
				System.out.println("*********************");
				System.out.println("\t도서관리 프로그램");
				System.out.println("*********************");
				System.out.println("\t다음 메뉴에서 선택");
				System.out.println("1.도서 등록");
				System.out.println("2.도서 정보 조회");
				System.out.println("3.도서 정보 수정");
				System.out.println("4.도서 정보 삭제");
				System.out.println("5.종료");
				System.out.println("----------------------");
				System.out.print("메뉴 번호 입력 : ");
				input = sc.nextLine();
			} catch(Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
			}
			
			switch(input) {
				case "1":
					dao.InsertBook(ReadWrite.getBookInfo(sc));
					break;
				case "2":
					System.out.println("*********************");
					System.out.println("도서 정보 조회");
					System.out.println("*********************");
					break;
				case "3":
					System.out.println("*********************");
					System.out.println("도서 정보 수정");
					System.out.println("*********************");
					break;
				case "4":
					System.out.println("*********************");
					System.out.println("도서 정보 삭제");
					System.out.println("*********************");
					break;
				case "5":
					System.out.println("종료합니다. ----------------------");
					sc.close();
					System.exit(0);
				default:
					
					break;
			}
		}
	}

}
