package com.zyw.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		/*
		 *  操作 文档 使用字符流
		 *  操作 图片、影音 使用字节流
		 *  输入流： 将磁盘上的内容 读取到内存
		 *  输出流：将内存中的内容 写入到磁盘
		 */
		//输入流  读到内存里就OK 你看不见
		try {
			//根据指定文件，将该图片存到内存里,完事儿了
			InputStream in = new FileInputStream("c:\\test.jpg");
			
			
			//输出流	，在控制台看，
			//通过 read方法，去读取内存中的数据，使用System.out 打印到控制台
			//1.从内存中将数据存到指定的数组中
			byte[] buf = new byte[1024];
			in.read(buf);
			//2.通过输出流对象 操作  数组
				//System.out.println(Arrays.toString(buf)); 控制台
				//文件输出流，需要提供输出指定位置
			OutputStream out = new FileOutputStream("D:\\hello.jpg");
			out.write(buf);
			
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
