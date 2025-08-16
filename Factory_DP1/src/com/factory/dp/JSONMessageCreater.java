package com.factory.dp;

public class JSONMessageCreater extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
