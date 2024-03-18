package edu.kh.bookList.model.dto;

public class BookList {
	
	private String bookTitle;
	private String bookWriter;
	private String readDate;
	
	
	
	
	public BookList(String bookTitle, String bookWriter, String readDate) {
		super();
		this.bookTitle = bookTitle;
		this.bookWriter = bookWriter;
		this.readDate = readDate;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	public String getReadDate() {
		return readDate;
	}
	public void setReadDate(String readDate) {
		this.readDate = readDate;
	}
	
	
	@Override
	public String toString() {
		return "BookList [bookTitle=" + bookTitle + ", bookWriter=" + bookWriter + ", readDate=" + readDate + "]";
	}
	
	
	
	
	
	

}
