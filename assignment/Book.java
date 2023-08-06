package com.assignment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@Column(name="b_id")
	private long bookId;
	@Column(name="b_name")
	private String bookName;
	@Column(name="b_author")
	private String author;
	@Column(name="b_page")
	private String pageCount;
	public Book(long bookId, String bookName, String author, String pageCount) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.pageCount = pageCount;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPageCount() {
		return pageCount;
	}
	public void setPageCount(String pageCount) {
		this.pageCount = pageCount;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", pageCount=" + pageCount
				+ "]";
	}
	
	
}
