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
		 * ͨ��BufferedReader��BufferedWriter���ı��ĵ�����
		 * �ص㣺 ���԰�������ȡ����
		 */
		try {
			//�����ַ�������
			Reader in = new FileReader("c:\\hello.txt");
			//ͨ��reader����BufferedReader
			BufferedReader bin = new BufferedReader(in);
			
			//�����ַ������
			Writer out = new FileWriter("d:\\a.txt");
			//ͨ��writer������BufferedWriter
			BufferedWriter bout = new BufferedWriter(out);
			String line;
			//ÿ�ζ�ȡһ�����ݣ����û�������˷���null
			while( (line = bin.readLine()) != null ){
				//����ȡ��һ������ �����a.txt ���ַ�����ʽ���
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



