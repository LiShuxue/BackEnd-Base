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
		 *  ���� �ĵ� ʹ���ַ���
		 *  ���� ͼƬ��Ӱ�� ʹ���ֽ���
		 *  �������� �������ϵ����� ��ȡ���ڴ�
		 *  ����������ڴ��е����� д�뵽����
		 */
		//������  �����ڴ����OK �㿴����
		try {
			//����ָ���ļ�������ͼƬ�浽�ڴ���,���¶���
			InputStream in = new FileInputStream("c:\\test.jpg");
			
			
			//�����	���ڿ���̨����
			//ͨ�� read������ȥ��ȡ�ڴ��е����ݣ�ʹ��System.out ��ӡ������̨
			//1.���ڴ��н����ݴ浽ָ����������
			byte[] buf = new byte[1024];
			in.read(buf);
			//2.ͨ����������� ����  ����
				//System.out.println(Arrays.toString(buf)); ����̨
				//�ļ����������Ҫ�ṩ���ָ��λ��
			OutputStream out = new FileOutputStream("D:\\hello.jpg");
			out.write(buf);
			
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
