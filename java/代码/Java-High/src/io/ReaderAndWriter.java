package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderAndWriter {

	/**
	 * 字节流适合图片，声音，视频的操作
	 * 字符流适合操作文本
	 */
	public static void main(String[] args) {
		try {
			//与字节流的操作几乎一样，除了定义的数组的类型不同
			Reader in = new FileReader("D:\\test.txt");
			Writer out = new FileWriter("E:\\test.txt");
			char[] buff = new char[10];
			int len;
			while((len=in.read(buff)) != -1){
				out.write(buff, 0, len);
			}
			
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
