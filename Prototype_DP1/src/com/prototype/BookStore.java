package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable {

	private String bookStoreName;
	List<Book> bookstore = new ArrayList<>();

	public String getBookStoreName() {
		return bookStoreName;
	}

	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	public List<Book> getBookstore() {
		return bookstore;
	}

	public void setBookstore(List<Book> bookstore) {
		this.bookstore = bookstore;
	}

	@Override
	public String toString() {
		return "BookStore [bookStoreName=" + bookStoreName + ", bookstore=" + bookstore + "]";
	}

	public void loadData() {
		for (int i = 1; i < 6; i++) {
			Book book = new Book();
			book.setBid(i);
			book.setBookName("book" + " " + i);
			bookstore.add(book);
		}
	}
//     Shallow copy
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	// DEEP copy
	@Override
	public BookStore clone() throws CloneNotSupportedException {
		BookStore bs = new BookStore();
		bs.setBookStoreName("Deep Copy");
		for (Book b : this.getBookstore()) {
			bs.getBookstore().add(b);
		}
		return bs;
	}

}
