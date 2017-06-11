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
		//BufferedInputStream(输入流对象，自定义的缓冲区大小"字节" )
		//BufferedOutputStream(输出流对象)
		// 使用缓冲流，来操作图片的读写
		
		try {
			//创建一个带缓冲的输入流
			InputStream in = new FileInputStream("c:\\test.jpg");
			//通过in来构建BufferedInputStream
			BufferedInputStream bin = new BufferedInputStream(in);
			
			//创建一个带缓冲的输出流
			OutputStream out = new FileOutputStream("d:\\test.jpg");
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			int len;
			byte[] buf = new byte[1024];
			//只有 read() 和 read(byte[] ,int ,int) 是BufferedInputStream的方法
			//read(byte[]) 这个方法是父类FilterInputStream的方法
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



