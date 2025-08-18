package com.prototype;

public class Client1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookStore bs1 = new BookStore();
		bs1.setBookStoreName("Hari Book MART");
		bs1.loadData();
		System.out.println(bs1);
		bs1.getBookstore().remove(2);
		System.out.println(bs1);
		
		//It again call the database and fetch the content from scratch
		BookStore bs2 = new BookStore();
		bs2.setBookStoreName("bs Book MART");
		bs1.loadData();
		System.out.println(bs1);
		
		
		
	}

}
