package com.zyw;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {
		//BufferedInputStream(�����������Զ���Ļ�������С"�ֽ�" )
		//BufferedOutputStream(���������)
		// ʹ�û�������������ͼƬ�Ķ�д
		
		try {
			//����һ���������������
			InputStream in = new FileInputStream("c:\\test.jpg");
			//ͨ��in������BufferedInputStream
			BufferedInputStream bin = new BufferedInputStream(in);
			
			//����һ��������������
			OutputStream out = new FileOutputStream("d:\\test.jpg");
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			int len;
			byte[] buf = new byte[1024];
			//ֻ�� read() �� read(byte[] ,int ,int) ��BufferedInputStream�ķ���
			//read(byte[]) ��������Ǹ���FilterInputStream�ķ���
			while( (len = bin.read(buf, 0, buf.length)) != -1){
				bout.write(buf, 0, len);
			}
			bout.close();
			out.close();
			bin.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}



