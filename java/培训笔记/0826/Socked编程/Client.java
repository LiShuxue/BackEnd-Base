package com.zyw;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		System.out.println("-------�ͻ���-------");
		try {
			//����һ�����ʱ����������� �ͻ���
			Socket s = new Socket("127.0.0.1", 6677);
			//����������������������
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeUTF("hello��Server");
			out.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
