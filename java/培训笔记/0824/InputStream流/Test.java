package com.zyw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;

public class Test {

	public static void main(String[] args) {
		
		/**
		 *  流
		 *  对于InputStream、Reader、OutputStream、Writer,他们都抽象类
		 *  这些类 是不能实例化的，也不能够做具体的工作，我们需要创建他们子类的对象，来工作。
		 *  当然，我们就可以使用“多态”，来创建他们 子类们 的对象
		 *  字符流(Reader、Writer) 他们的底层都是通过 字节流操作的
		 *  
		 *  InputStream ，将数据读取到 内存
		 */
		
		//读取C盘根目录 20字节的hello.txt文件
		//1.创建文件对象
		File file = new File("C:\\hello.txt");
		//2.创建一个 文件流对象
		try {
			//因为FileInputStream的父类是InputStream所以 使用了多态
			InputStream in = new FileInputStream(file);
			//3. 通过in读取数据
			//System.out.println(in.read());	//读取一个字节，输出，如果是-1代表没有数据了
			//System.out.println(in.read());
			//System.out.println(in.read());
			//System.out.println(in.read());
			//第3部，升级
			int msg = 0;
			//先执行in.read()并向msg赋值，再去通过msg 和-1比较
			//如果信息中有中文，中文是两个字节
			while( (msg = in.read()) != -1){
				//out是一个控制台的输出流
				System.out.println(msg);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}



