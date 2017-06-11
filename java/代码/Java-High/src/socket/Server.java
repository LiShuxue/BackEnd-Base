package socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		System.out.println("服务器。。。");
		try {
			//1.实例化serversocket.提供一个端口号，捕获处理异常
			ServerSocket ss = new ServerSocket(6677);
			//2.写一个死循环，一直监听客户端
			while(true) {
				//3.调用ss的accept方法去监听客户端的连接，会返回客户端的socket
				Socket s = ss.accept();   //程序会在这里等待,有客户端连接后才继续执行
				//4.通过输入流来获取客户端发送的信息
				DataInputStream in = new DataInputStream(s.getInputStream());
				//5.通过输入流对象调用readUTF()方法来读取发来的字符串信息
				String str = in.readUTF();
				
				System.out.println("客户端发来的信息是：" + str);
				System.out.println("客户端的IP是：" + s.getInetAddress());
				//这个端口号s.getPort()是客户端socket的唯一标识
				System.out.println("客户端的socket端口号是：" + s.getPort());
				//关闭资源
				in.close();
				s.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
