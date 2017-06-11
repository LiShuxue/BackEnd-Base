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
			
			//创建一个输入流
			InputStream in = new FileInputStream("D:\\test.jpg");
			//创建一个带缓冲的输入流，根据in
			BufferedInputStream bin = new BufferedInputStream(in);
			
			//创建一个带缓冲的输出流
			OutputStream out = new FileOutputStream("E:\\test.jpg");
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			int len;
			byte[] buff = new byte[1024];
			//buffered 中只有read()和read(byte[], off, len)方法
			//同理只有write()和write(byte[], off, len)方法
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
