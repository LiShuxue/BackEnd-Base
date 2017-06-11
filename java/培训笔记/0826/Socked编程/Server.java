package com.zyw;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		/**
		 *  TCPЭ�飺 �����ͨѶЭ��
		 *  IP���������� һ̨���� ��Ψһ��ʶ
		 *  �˿ںţ������ϳ���ı�ʶ
		 */
		//1.ʵ����ServerSocket,�ṩ�˿�
		try {
			System.out.println("-------������------");
			ServerSocket server = new ServerSocket(6677);
			//2.��ѭ����һֱ�����ͻ�������
			Socket s = null;
			while(true){
				//3.����server�� accept�����ͻ��˵����ӣ��᷵�ؿͻ��˵�Socket
				s = server.accept();	//�����������ȴ������пͻ������ӣ�������ִ��
				//4.����������ӷ������ˣ�����ͨ��������ȡ�ͻ��˷�����Ϣ
				//ͨ������������ȡ�ͻ��˷���������
				DataInputStream in = new DataInputStream(s.getInputStream());
				String msg = in.readUTF();	//��ȡ����������
				System.out.println("�ͻ��˷�������Ϣ�ǣ�" + msg);
				System.out.println("�ͻ��˵�IP:" + s.getInetAddress());
				//�ͻ���Socket��Ψһ��ʾ
				System.out.println("�ͻ��˷��ʵĶ˿ں�:" + s.getPort());
				in.close();
				if(msg.equals("exit")){
					break;
				}
			}
			s.close();
			server.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


