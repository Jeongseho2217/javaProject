package exam.book_interface;

public class BookDTO {
	
	private String bookTitle;
	private int bookID;
	private String author;
	private int price;
	
	public BookDTO(String bookTitle, int bookID, String author, int price) {
		this.bookTitle = bookTitle;
		this.bookID = bookID;
		this.author = author;
		this.price = price;
	}
	// getter-setter
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getbookID() {
		return bookID;
	}

	public void setbookID(int bookID) {
		this.bookID = bookID;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
