package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferReaderAndWriter {

	public static void main(String[] args) {
		try {
			//reader 和 writer适合操作文本内容
			Reader in = new FileReader("D:\\test.txt");
			BufferedReader bin = new BufferedReader(in);
			
			Writer out = new FileWriter("E:\\test.txt");
			BufferedWriter bout = new BufferedWriter(out);
			
			//每次读取一行数据,没有数据了返回null
			String line;
			while((line=bin.readLine()) != null){
				bout.write(line + "\r\n");//  \r是回车
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
