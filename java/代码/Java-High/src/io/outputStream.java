package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class outputStream {

	public static void main(String[] args) {
		try {
			//����һ���ֽ�������ȥ��ȡĳ���ļ�����"d:\\test.jpg"
			InputStream in = new FileInputStream("d:\\test.jpg");
			//����һ���ֽ������ȥ��ĳЩ���������ĳ������
			OutputStream out = new FileOutputStream("e:\\test.jpg");
			//����һ���ֽ����飬ȥ���ն�ȡ�������ݻ�Ҫ���������
			byte[] buff = new byte[1024];
			//����һ������len,���ն�ȡ�������ݵĸ���
			int len;
			//����ȡ�������ݵĸ���Ϊ-1ʱ����û�����ݿɶ��ˣ���ֹѭ��
			while((len=in.read(buff)) != -1) {   
				//�������д�0��ʼ�� len���ֽ�д��������,��������Ὣ�����������涨�Ķ���"e:\\test.jpg"��
				out.write(buff, 0, len);
			}
			//�ر�������
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
