package com.zyw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;



public class Test {

	public static void main(String[] args) {
		/*
		 * ��c���µ�test.jpg��ȡ���ڴ�
		 */
		try {
			InputStream in = new FileInputStream("c:\\test.jpg");
			//ͨ��byte���飬�����ݶ�ȡ��������
			byte[] buff = new byte[1024];	//1k
			//���û�����ݣ���Ȼ����-1,�����ݵĻ������ض�ȡ���ݵ�����
			/*int k = in.read(buff);
			System.out.println("�����ǣ�" + k);
			System.out.println("�����ǣ�" + Arrays.toString(buff));*/
			int len;
			//һ��7k���ͼƬ����ȡ��8��
			//��ȡ��ͼ�����ǿ�������ֻ�ܽ���ͼ��ʹ�á��������,������������������鿴��
			//1.�������������,��Ҫ�������ʲô���ļ���Ҫ���ļ������,��һ�������ļ���λ��
			File toFile = new File("d:\\test.jpg");
			//����toFile����ļ���if�����ɹ���·����û�и��ļ������ܴ�����
			//else �������ɹ����ļ��Ѵ����ˣ� ɾ�����ļ�������һ���µĿ��ļ�
			if(toFile.createNewFile()){
				
			}else{
				toFile.delete();
				toFile.createNewFile();
			}
			//outֻ����toFile���������
			OutputStream out = new FileOutputStream(toFile);

			while( (len = in.read(buff)) != -1){
				//System.out.println(len);
				//System.out.println(Arrays.toString(buff));
				//��out���ļ������ ������0��ʼlen�������ֽ�
				//�ؼ������һ�Σ��������1024,����len=123,������0 д��123���ֽ�
				out.write(buff, 0, len);
	
			}
			//�󿪵������ȹ�
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}



