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
			//reader �� writer�ʺϲ����ı�����
			Reader in = new FileReader("D:\\test.txt");
			BufferedReader bin = new BufferedReader(in);
			
			Writer out = new FileWriter("E:\\test.txt");
			BufferedWriter bout = new BufferedWriter(out);
			
			//ÿ�ζ�ȡһ������,û�������˷���null
			String line;
			while((line=bin.readLine()) != null){
				bout.write(line + "\r\n");//  \r�ǻس�
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
