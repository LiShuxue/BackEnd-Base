package com.zyw;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
		try {
			File f1 = new File("c:\\logs");	
			File f2 = new File(f1,"notify-subscription.log");
			//ʹ�ñȽ϶��
			//File f = new File("����·��")
			
			//------------------------------------------
			//����C�̵��ļ�����
			File file = new File("c:\\hello.txt");
			//�鿴C�����Ƿ����Hello.txt�ļ���������ڷ���false�������ڴ������ļ�������true
			if(file.createNewFile()){
				System.out.println("�������ļ�");
			}else{
				System.out.println("���ڣ������Դ���");
			}
			
			//��ָ��·����������ʱ�ļ����ṩ�ļ�ǰ����׺
			//createTempFile �����㴴����File����
			//File tempFile = File.createTempFile("hello", "123", new File("C:\\"));
			//System.out.println(tempFile.getName());
			
			//�ж�ָ����·�����ļ� �Ƿ����
			if(file.exists()){
				System.out.println("�ļ�����");
			}else{
				System.out.println("�ļ�������");
			}
			
			//���ָ��·�����ڸ��ļ�/Ŀ¼ ��ɾ��true
			if(file.delete()){
				System.out.println("ɾ���ɹ�");
			}else{
				System.out.println("ɾ��ʧ��");
			}
			
			System.out.println("�Ƿ���Զ�ȡ:" + file.canRead());
			System.out.println("�Ƿ����д��:" + file.canWrite());
			
			//���ָ��"Ŀ¼" �µ������ļ���
			System.out.println(Arrays.toString(new File("C:\\").list()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}



