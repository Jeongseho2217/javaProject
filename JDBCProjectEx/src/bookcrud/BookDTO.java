package bookcrud;

import java.sql.Date;

public class BookDTO {
	
	private String bookNo, bookName, bookAuthor, pubNo;
	private int bookPrice, bookStock;
	private Date bookDate;
	
	public BookDTO(String bookNo, String bookName, String bookAuthor, int bookPrice, java.util.Date bookDate, int bookStock, String pubNo) {
		
		bookNo = this.bookNo;
		bookName = this.bookName;
		bookAuthor = this.bookAuthor;
		bookPrice = this.bookPrice;
		bookDate = this.bookDate;
		bookStock = this.bookStock;
		pubNo = this.pubNo;
		
	}
	
	// GETTER/SETTER
	
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getPubNo() {
		return pubNo;
	}
	public void setPubNo(String pubNo) {
		this.pubNo = pubNo;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookStock() {
		return bookStock;
	}
	public void setBookStock(int bookStock) {
		this.bookStock = bookStock;
	}
	public Date getBookDate() {
		return bookDate;
	}
	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}
}
