package com.zyw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Test {

	public static void main(String[] args) {
		/*
		 * 通过BufferedReader、BufferedWriter对文本文档操作
		 * 特点： 可以按行来读取数据
		 */
		try {
			//创建字符输入流
			Reader in = new FileReader("c:\\hello.txt");
			//通过reader构建BufferedReader
			BufferedReader bin = new BufferedReader(in);
			
			//创建字符输出流
			Writer out = new FileWriter("d:\\a.txt");
			//通过writer来构建BufferedWriter
			BufferedWriter bout = new BufferedWriter(out);
			String line;
			//每次读取一行数据，如果没有数据了返回null
			while( (line = bin.readLine()) != null ){
				//将读取的一行数据 输出到a.txt 以字符串形式输出
				bout.write(line + "\r\n");	
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



