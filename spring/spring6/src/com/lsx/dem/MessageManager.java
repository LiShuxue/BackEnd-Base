package com.lsx.dem;

public abstract class MessageManager {

	public void display() {
		Message message = new Message();
		System.out.println(message);
	}
	
	protected abstract Message createMessage();
}
