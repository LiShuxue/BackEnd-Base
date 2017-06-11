package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderAndWriter {

	/**
	 * �ֽ����ʺ�ͼƬ����������Ƶ�Ĳ���
	 * �ַ����ʺϲ����ı�
	 */
	public static void main(String[] args) {
		try {
			//���ֽ����Ĳ�������һ�������˶������������Ͳ�ͬ
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
