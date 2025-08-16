package com.factory.dp;

public class TEXTMessageCreater extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TEXTMessage();
	}


}
