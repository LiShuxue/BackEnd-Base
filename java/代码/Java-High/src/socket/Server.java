package socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		System.out.println("������������");
		try {
			//1.ʵ����serversocket.�ṩһ���˿ںţ��������쳣
			ServerSocket ss = new ServerSocket(6677);
			//2.дһ����ѭ����һֱ�����ͻ���
			while(true) {
				//3.����ss��accept����ȥ�����ͻ��˵����ӣ��᷵�ؿͻ��˵�socket
				Socket s = ss.accept();   //�����������ȴ�,�пͻ������Ӻ�ż���ִ��
				//4.ͨ������������ȡ�ͻ��˷��͵���Ϣ
				DataInputStream in = new DataInputStream(s.getInputStream());
				//5.ͨ���������������readUTF()��������ȡ�������ַ�����Ϣ
				String str = in.readUTF();
				
				System.out.println("�ͻ��˷�������Ϣ�ǣ�" + str);
				System.out.println("�ͻ��˵�IP�ǣ�" + s.getInetAddress());
				//����˿ں�s.getPort()�ǿͻ���socket��Ψһ��ʶ
				System.out.println("�ͻ��˵�socket�˿ں��ǣ�" + s.getPort());
				//�ر���Դ
				in.close();
				s.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
