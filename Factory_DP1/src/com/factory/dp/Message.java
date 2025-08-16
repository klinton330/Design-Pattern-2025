package com.factory.dp;

public abstract class Message {

	public abstract String getContent();

	public void setDefaultHeader() {
      System.out.println("Setting Default Header");
	}

	public void encrypt() {
     System.out.println("Setting ENCRYPTION");
	}

}
