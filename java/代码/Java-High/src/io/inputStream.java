package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class inputStream {

	public static void main(String[] args) {
		
		try {
			//创建一个文件对象
			File file = new File("D:\\HELLO.txt");
			file.createNewFile();
			//创建一个文件输入流对象
			InputStream in = new FileInputStream(file);
			//通过调用read()方法来对指定的文件进行按字节读取.如果没有数据可以读了，会返回” -1”。中文是两个字节
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
