package com.factory.dp;

public class Client {
	public static void main(String[] args) {
		printMessage(new TEXTMessageCreater());

	}
	public static void printMessage(MessageCreator messageCreator) {
		 Message message= messageCreator.createMessage();// Returns JSON or text
		 System.out.println(message.getContent());
	}
}
