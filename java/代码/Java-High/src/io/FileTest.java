package io;

import java.io.File;
import java.util.Arrays;

public class FileTest {

	public static void main(String[] args) {
		
		try {
			
			File f1 = new File("D:\\hello.txt");   //������һ���ļ�����
			
			if(f1.createNewFile()) {                //�жϴ��ļ��Ƿ���ڣ������ھʹ���
				System.out.println("�����ɹ�");
			}
			else{
				System.out.println("�Ѵ���");
			}
			
//			//��C���´���һ����ʱ�ļ���ǰ׺��hello����׺��123
//			File tempFile = File.createTempFile("hello", "123", new File("D:\\"));
//			System.out.println(tempFile.getName()); //�õ����ļ�������
			
			
			//�ж�f1����ļ��Ƿ����
			boolean isExist = f1.exists();
			if(isExist){
				System.out.println("�ļ��Ѵ���");
			}
			else{
				System.out.println("�ļ�������");
			}
			
			//�ж�f1�Ƿ�������Ķ�����ͬ
			boolean isEqual = new File("D:\\hello.txt").equals(f1);
			if(isEqual) {
				System.out.println("��ͬ");
			}else{
				System.out.println("��ͬ");
			}
			
			//�ж�f1�Ƿ�ɶ�д
			if(f1.canRead()) {
				System.out.println("�ɶ�");
			}else{
				System.out.println("���ɶ�");
			}
			
			if(f1.canWrite()) {
				System.out.println("��д");
			}else{
				System.out.println("����д");
			}
			
			
			//list()����ĳ��·���µ����е��ļ����ļ��е�������ɵ��ַ�������
			System.out.println(Arrays.toString(new File("D:\\").list()));
			
			//���ؾ���·��
			System.out.println(f1.getAbsolutePath());
			//�������·��
			System.out.println(f1.getPath());
			
			//�����ļ���С
			System.out.println(f1.length());
			
			//ɾ�����ļ�
			if(f1.delete()) {
				System.out.println("f1ɾ���ɹ�");
			}else{
				System.out.println("f1ɾ��ʧ��");
			}
			
			//mkdir() �� mkdirs()
			File f2 = new File("D:\\a\\b\\c");
			if(f2.mkdir()) {
				System.out.println("mkdir()�����ɹ�");
			}else {
				System.out.println("mkdir()����ʧ��");
			}
			if(f2.mkdirs()) {
				System.out.println("mkdirs()�����ɹ�");
			}else {
				System.out.println("mkdirs()����ʧ��");
			}
			
			//ɾ�����ļ�
			if(f2.delete()) {
				System.out.println("f2ɾ���ɹ�");
			}else{
				System.out.println("f2ɾ��ʧ��");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
