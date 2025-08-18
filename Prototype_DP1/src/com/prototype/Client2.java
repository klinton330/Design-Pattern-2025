package com.prototype;

public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookStore bs1 = new BookStore();
		bs1.setBookStoreName("Hari Book MART");
		bs1.loadData();
		System.out.println("Shallow Copy Before cloning:"+bs1);
		//Shallow Cloining
		BookStore bs3 = (BookStore) bs1.clone();
		bs1.getBookstore().remove(2);
		System.out.println("Shallow Copy After removing:"+bs1);
		System.out.println("Shallow Copy After cloning:"+bs3);
		
	}

}
