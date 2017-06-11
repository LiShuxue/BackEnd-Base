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
		 *  序列化，将你的“对象”保存在指定的文件中（后期可以去读取这个对象）
		 *  一个对象的保存，你不要忽略他的属性，以及它属性的当前值
		 *  这些属性，就是我们要保存这个对象的原因
		 *  如果当程序执行到某一个阶段，你需要将这个对象记录下来（没有数据库情况）
		 *  后期的操作这个对象会发生变化，那么你就无法去得到 当时那个对象了
		 *  ----腌咸菜----
		 *  1.你要保存的对象   的类必须要实现接口Serializable（该接口没有需要实现的方法）  标识 这个类的对象可以序列化
		 */
		//将对象存入文件
		/*try {
			Student s = new Student(1, "zhangsan");
			Student s2 = new Student(2, "lisi");
			Student s3 = new Student(3, "wangwu");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\stu.ser"));
			oos.writeObject(s);
			oos.writeObject(s2);
			oos.writeObject(s3);
			oos.writeObject(null);	//表示对象序列的结束
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		//读取文件中的对象
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\stu.ser"));
			Object obj = null;
			//每次读取一个对象，将其保存到obj（只能按Object类型读取）
			//判断 当前读取的是不是null ，最后一次的读取是一个null 表示没有对象了
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
