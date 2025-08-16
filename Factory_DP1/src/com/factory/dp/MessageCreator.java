package com.factory.dp;

public abstract class MessageCreator {
	
	public Message getMessage() {
		Message msg = createMessage();
		msg.getContent();
		msg.encrypt();
		return msg;
	}
	
	public abstract Message createMessage();

}
