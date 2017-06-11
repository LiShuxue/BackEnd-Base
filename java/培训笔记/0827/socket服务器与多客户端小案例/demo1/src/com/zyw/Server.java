package com.zyw;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	
	
	public static void main(String[] args) {
		try {
			System.out.println("服务器启动。。。");
			ServerSocket server = new ServerSocket(6677);
			Socket s = null;
			while(true){
				s = server.accept();
				
				SendThread st = new SendThread(s);
				ReceiveThread rt = new ReceiveThread(s,st);
				st.start();
				rt.start();
				

				
			}
			/*s.close();
			server.close();*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class ReceiveThread extends Thread{

	private Socket s;
	private SendThread send;
	
	public ReceiveThread(Socket s,SendThread send){
		this.s = s;
		this.send = send;
	}
	@Override
	public void run() {
		while(true){
			try {
				DataInputStream in = new DataInputStream(s.getInputStream());
				String msg = in.readUTF();
				System.out.print("客户端"+s.getPort()+"对我说：");
				System.out.println(msg);
				
					synchronized (this.send) {
						if(msg.equals("hello")){
							this.send.setMsg("hello");
						}else if(msg.equals("haha")){
							this.send.setMsg("haha");
						}else if(msg.equals("exit")){
							System.out.println("客户端"+s.getPort()+"退出");
							//this.send.setMsg("exit");
							return;
						}else{
							this.send.setMsg("en");
						}
						this.send.setFlag(false);
						this.send.notify();
						this.send.setFlag(true);
					}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

class SendThread extends Thread{

	private boolean flag = true;
	private String msg = null;
	private Socket s = null;

	public SendThread(Socket s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		try{
			while(true){
				if(flag){
					synchronized (this) {
						wait();
					}
				}
				DataOutputStream out = new DataOutputStream(s.getOutputStream());
				out.writeUTF(msg);
				
				//System.out.println(msg);
				if(msg.equals("exit")){
					s.close();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}


