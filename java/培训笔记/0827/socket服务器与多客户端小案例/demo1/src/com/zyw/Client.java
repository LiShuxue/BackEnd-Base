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
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {
		
		try {
			Socket s = new Socket("127.0.0.1",6677);
			while(true){
				Scanner input = new Scanner(System.in);
				System.out.print("我对服务器说：");
				String msg = input.next();
				DataOutputStream out = new DataOutputStream(s.getOutputStream());
				out.writeUTF(msg);
				
				if(msg.equals("exit")){
					System.out.println("与服务器断开");
					break;
				}
				
				DataInputStream in = new DataInputStream(s.getInputStream());
				System.out.print("服务器对我说：");
				System.out.println(in.readUTF());
			}
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	/**
	 * 接收消息
	 * @param s
	 */
	public synchronized static String receive(Socket s){
		String msg = null;
		BufferedReader reader = null;
		InputStream in = null;
		try {
			//in = s.getInputStream();
			reader = new BufferedReader(new InputStreamReader(System.in));
			msg = reader.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			/*try {
				reader.close();
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}*/
		}
		return msg;
	}
	/**
	 * 发送消息
	 * @param s
	 */
	public synchronized static void send(Socket s,String sendMessage){
		OutputStream out = null;
		BufferedWriter writer = null;
		try {
			out = s.getOutputStream();
			writer = new BufferedWriter(new OutputStreamWriter(out));
			writer.write(sendMessage);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			/*try {
				writer.close();
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}*/
		}
	}
}
