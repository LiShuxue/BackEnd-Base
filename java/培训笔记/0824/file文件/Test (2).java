package com.zyw;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		
		//getAbsolutePath( ) ���File����ľ���·��
		File file = new File("src\\my.txt");
		//System.out.println(file.getAbsolutePath());
		//getName( )����ļ���
		//System.out.println(file.getName());
		//String getPath( ) ���·��
		//System.out.println(file.getPath());
		//listFiles()����Ŀ¼����ȡ��Ŀ¼�����е��ļ����󣬷��ض�������
		/*File srcFile = new File("src");
		for(File f : srcFile.listFiles()){
			//���f����ͬ��getPath()
			System.out.println(f + "\t name=" + f.getName());
		}*/
		//renameTo(File dest ) �����øú�����file���ƶ�������file��λ�ã��ɸ�������
		//�����λ�ô�����ͬĿ¼���ļ����ƶ�ʧ�ܣ�����false
		System.out.println(new File("c:\\hello.txt").renameTo(new File("D:\\hello.txt")));
		
		//length() ��ȡ�ļ��Ĵ�С���ֽ���
		//System.out.println("�ļ���С��" + new File("c:\\hello.txt").length());
		
		//mkdir ����ָ����"һ��Ŀ¼(Ŀ¼�ṹ�����һ��)"
		//�磺c:\\a\\b\\c ���a��b����û�е� c���޷�������
		//���a��b���Ѵ���Ŀ¼���Żᴴ��c		ֻ�ܴ���һ��Ŀ¼
		//file = new File("C:\\a\\b\\c");
		/*file = new File("C:\\a");
		if(!file.exists()){
			file.mkdir();	//ʲô��û��
		}*/
		//mkdirs �������ָ����Ŀ¼�ĸ�·��Ҳ�����ڵĻ�����һ�𱻴���
		//�磺c:\\a\\b\\c ���a��b����û�е� ������a��b��c
		/*file = new File("C:\\a\\b\\c");
		if(!file.exists()){
			file.mkdirs();
		}*/
	}
	
	
}



