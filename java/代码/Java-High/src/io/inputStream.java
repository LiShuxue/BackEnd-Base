package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class inputStream {

	public static void main(String[] args) {
		
		try {
			//����һ���ļ�����
			File file = new File("D:\\HELLO.txt");
			file.createNewFile();
			//����һ���ļ�����������
			InputStream in = new FileInputStream(file);
			//ͨ������read()��������ָ�����ļ����а��ֽڶ�ȡ.���û�����ݿ��Զ��ˣ��᷵�ء� -1���������������ֽ�
			while(in.read() != -1) {
				System.out.println(in.read());
			}
			in.close();
			file.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
