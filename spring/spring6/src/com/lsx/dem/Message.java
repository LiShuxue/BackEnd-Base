package com.lsx.dem;

import java.util.Date;

public class Message {

	private String sysMessage;
	
	public Message() {
		this.sysMessage = "ϵͳʱ�䣺" + new Date();
	}
	
	public String toString() {
		return sysMessage;
	}
	
}
