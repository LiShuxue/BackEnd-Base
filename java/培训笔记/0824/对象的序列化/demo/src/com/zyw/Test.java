package com.zyw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		/*
		 *  ���л�������ġ����󡱱�����ָ�����ļ��У����ڿ���ȥ��ȡ�������
		 *  һ������ı��棬�㲻Ҫ�����������ԣ��Լ������Եĵ�ǰֵ
		 *  ��Щ���ԣ���������Ҫ������������ԭ��
		 *  ���������ִ�е�ĳһ���׶Σ�����Ҫ����������¼������û�����ݿ������
		 *  ���ڵĲ����������ᷢ���仯����ô����޷�ȥ�õ� ��ʱ�Ǹ�������
		 *  ----���̲�----
		 *  1.��Ҫ����Ķ���   �������Ҫʵ�ֽӿ�Serializable���ýӿ�û����Ҫʵ�ֵķ�����  ��ʶ �����Ķ���������л�
		 */
		//����������ļ�
		/*try {
			Student s = new Student(1, "zhangsan");
			Student s2 = new Student(2, "lisi");
			Student s3 = new Student(3, "wangwu");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\stu.ser"));
			oos.writeObject(s);
			oos.writeObject(s2);
			oos.writeObject(s3);
			oos.writeObject(null);	//��ʾ�������еĽ���
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		//��ȡ�ļ��еĶ���
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\stu.ser"));
			Object obj = null;
			//ÿ�ζ�ȡһ�����󣬽��䱣�浽obj��ֻ�ܰ�Object���Ͷ�ȡ��
			//�ж� ��ǰ��ȡ���ǲ���null �����һ�εĶ�ȡ��һ��null ��ʾû�ж�����
			while((obj=ois.readObject()) != null){

				Student s = (Student)obj;
				System.out.println(s.getId());
				System.out.println(s.getName());
			}

			ois.close();

		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
