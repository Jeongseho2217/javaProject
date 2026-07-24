package classInfo;

public class BookEx {

	public static void main(String[] args) {
		// Book 클래스는 서로다른 생성자가 2개 있음 파라미터3 파라미터0
		Book b1 = new Book("Java","홍길동", 20000);
		Book b2 = new Book();
		
		System.out.println("*************b1 도서*************");
		b1.show();
		System.out.println("\n*************b2 도서*************");
		b2.show();
	}

}
