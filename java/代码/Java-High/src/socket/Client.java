package socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		System.out.println("�ͻ��ˡ�����");
		try {
			//1.����һ�����ʷ���Ŀͻ���socket
			Socket s = new Socket("127.0.0.1", 6677);
			//2.ͨ�����������������˷��͵���Ϣ
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			//3.ͨ��������������writeUTF()����������Ҫ���͵��ַ�����Ϣ
			out.writeUTF("hello ������");
			//4.�ر���Դ
			out.close();
			s.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
