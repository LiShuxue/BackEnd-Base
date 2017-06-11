package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferInputAndOutput {
	public static void main(String[] args) {
		try {
			
			//����һ��������
			InputStream in = new FileInputStream("D:\\test.jpg");
			//����һ���������������������in
			BufferedInputStream bin = new BufferedInputStream(in);
			
			//����һ��������������
			OutputStream out = new FileOutputStream("E:\\test.jpg");
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			int len;
			byte[] buff = new byte[1024];
			//buffered ��ֻ��read()��read(byte[], off, len)����
			//ͬ��ֻ��write()��write(byte[], off, len)����
			while( (len=bin.read(buff, 0, buff.length)) != -1 ) {
				bout.write(buff, 0, len);
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
