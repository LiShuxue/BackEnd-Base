package com.zyw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;

public class Test {

	public static void main(String[] args) {
		
		/**
		 *  ��
		 *  ����InputStream��Reader��OutputStream��Writer,���Ƕ�������
		 *  ��Щ�� �ǲ���ʵ�����ģ�Ҳ���ܹ�������Ĺ�����������Ҫ������������Ķ�����������
		 *  ��Ȼ�����ǾͿ���ʹ�á���̬�������������� ������ �Ķ���
		 *  �ַ���(Reader��Writer) ���ǵĵײ㶼��ͨ�� �ֽ���������
		 *  
		 *  InputStream �������ݶ�ȡ�� �ڴ�
		 */
		
		//��ȡC�̸�Ŀ¼ 20�ֽڵ�hello.txt�ļ�
		//1.�����ļ�����
		File file = new File("C:\\hello.txt");
		//2.����һ�� �ļ�������
		try {
			//��ΪFileInputStream�ĸ�����InputStream���� ʹ���˶�̬
			InputStream in = new FileInputStream(file);
			//3. ͨ��in��ȡ����
			//System.out.println(in.read());	//��ȡһ���ֽڣ�����������-1����û��������
			//System.out.println(in.read());
			//System.out.println(in.read());
			//System.out.println(in.read());
			//��3��������
			int msg = 0;
			//��ִ��in.read()����msg��ֵ����ȥͨ��msg ��-1�Ƚ�
			//�����Ϣ�������ģ������������ֽ�
			while( (msg = in.read()) != -1){
				//out��һ������̨�������
				System.out.println(msg);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}



