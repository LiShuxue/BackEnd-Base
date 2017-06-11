package com.lsx.dem;

import java.util.Date;

public class Message {

	private String sysMessage;
	
	public Message() {
		this.sysMessage = "系统时间：" + new Date();
	}
	
	public String toString() {
		return sysMessage;
	}
	
}
