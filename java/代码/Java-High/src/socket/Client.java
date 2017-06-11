package socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		System.out.println("客户端。。。");
		try {
			//1.创建一个访问服务的客户端socket
			Socket s = new Socket("127.0.0.1", 6677);
			//2.通过输出流来向服务器端发送的信息
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			//3.通过输出流对象调用writeUTF()方法来发送要发送的字符串信息
			out.writeUTF("hello 服务器");
			//4.关闭资源
			out.close();
			s.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
