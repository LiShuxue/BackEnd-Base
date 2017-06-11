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
		//���÷���1
		Test t = new Test();
		//�����������
		InputStream in = t.getInputStream("c:\\test.jpg");
		t.writeFile(in, "d:\\hello.jpg");
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * ͨ��ָ���ļ�·�� ����ø��ļ���������
	 * �����а��ļ���ȡ�����ڴ�
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
	 * ͨ��һ���ļ������󣬽����ļ�д��C�̸�Ŀ¼������·��Ҳ���ԣ�
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
