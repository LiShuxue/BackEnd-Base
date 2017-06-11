package com.zyw.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		//调用方法1
		Test t = new Test();
		//这就是输入流
		InputStream in = t.getInputStream("c:\\test.jpg");
		t.writeFile(in, "d:\\hello.jpg");
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 通过指定文件路径 ，获得该文件的流对象
	 * 过程中把文件读取到了内存
	 */
	public InputStream getInputStream(String pathname){
		InputStream in = null;
		try {
			in = new FileInputStream(pathname);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return in;
	}
	
	
	/**
	 * 通过一个文件流对象，将其文件写入C盘根目录（给定路径也可以）
	 */
	public void writeFile(InputStream in,String pathName){
		byte[] buf = new byte[102400];
		OutputStream out = null;
		try {
			out = new FileOutputStream(pathName);
			int len;
			while( (len=in.read(buf)) != -1 ){
				out.write(buf, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	

}
