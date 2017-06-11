package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectXuLieHuaTest {

	public static void main(String[] args) {
		//��ʵ������������
		ObjectXuLieHuaStudent s1 = new ObjectXuLieHuaStudent(1, "zhangsan");
		ObjectXuLieHuaStudent s2 = new ObjectXuLieHuaStudent(2, "lisi");
		ObjectXuLieHuaStudent s3 = new ObjectXuLieHuaStudent(3, "wangwu");
		
		//�����󱣴����ļ���
		try {
			//����һ���������л�   �Ķ��󣬱������ĵ�ַ��E:\\test.ser
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\test.ser"));
			//ͨ���������������ÿһ������
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			oos.writeObject(null); //��ʾ�������еĽ���
			//�ر�������л�����
			oos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//��ȡ�ļ��еĶ���
		try {
			//����һ���������л�   �Ķ��󣬶�ȡ����ĵ�ַ��E:\\test.ser���������ĵ�ַһ��
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\test.ser"));
			//ÿ�ζ�ȡһ�����󣬽��䱣�浽obj��ֻ�ܰ�Object���Ͷ�ȡ��
			//�ж� ��ǰ��ȡ���ǲ���null �����һ�εĶ�ȡ��һ��null ��ʾû�ж�����
			Object obj = null;
			while((obj=ois.readObject()) != null){
				//����ȡ���Ķ���ǿתΪ��ԭ��������
				ObjectXuLieHuaStudent s = (ObjectXuLieHuaStudent)obj;
				System.out.print(s.getId());
				System.out.println(s.getName());
			}
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
