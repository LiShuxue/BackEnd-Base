package com.zyw;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		System.out.println("-------客户端-------");
		try {
			//创建一个访问本机服务器的 客户端
			Socket s = new Socket("127.0.0.1", 6677);
			//输出流，向服务器发送数据
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeUTF("hello，Server");
			out.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
