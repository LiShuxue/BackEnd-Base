package com.zyw;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		/**
		 *  TCP协议： 网络的通讯协议
		 *  IP：在网络中 一台机器 的唯一标识
		 *  端口号：机器上程序的标识
		 */
		//1.实例化ServerSocket,提供端口
		try {
			System.out.println("-------服务器------");
			ServerSocket server = new ServerSocket(6677);
			//2.死循环，一直监听客户端连接
			Socket s = null;
			while(true){
				//3.调用server的 accept监听客户端的连接，会返回客户端的Socket
				s = server.accept();	//程序会在这里等待，如有客户端连接，将继续执行
				//4.如果有人连接服务器了，下面通过流来获取客户端发的信息
				//通过输入流，获取客户端发来的数据
				DataInputStream in = new DataInputStream(s.getInputStream());
				String msg = in.readUTF();	//获取发来的数据
				System.out.println("客户端发来的信息是：" + msg);
				System.out.println("客户端的IP:" + s.getInetAddress());
				//客户端Socket的唯一表示
				System.out.println("客户端访问的端口号:" + s.getPort());
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


