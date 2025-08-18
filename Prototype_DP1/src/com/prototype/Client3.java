package com.prototype;

public class Client3 {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookStore bs1 = new BookStore();
		bs1.setBookStoreName("Hari Book MART");
		bs1.loadData();
		System.out.println("Before Cloning"+bs1);
		
		BookStore bs3 = bs1.clone();
		bs1.getBookstore().remove(2);
		System.out.println("Deep Copy After removing:"+bs1);	
	    System.out.println("Deep Copy After cloning:"+bs3);
			
	}

}
