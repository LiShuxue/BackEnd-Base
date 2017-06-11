package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectXuLieHuaTest {

	public static void main(String[] args) {
		//先实例化三个对象
		ObjectXuLieHuaStudent s1 = new ObjectXuLieHuaStudent(1, "zhangsan");
		ObjectXuLieHuaStudent s2 = new ObjectXuLieHuaStudent(2, "lisi");
		ObjectXuLieHuaStudent s3 = new ObjectXuLieHuaStudent(3, "wangwu");
		
		//将对象保存在文件中
		try {
			//生成一个对象序列化   的对象，保存对象的地址是E:\\test.ser
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\test.ser"));
			//通过这个对象来保存每一个对象
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			oos.writeObject(null); //表示对象序列的结束
			//关闭这个序列化对象
			oos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//读取文件中的对象
		try {
			//生成一个对象反序列化   的对象，读取对象的地址是E:\\test.ser，跟存对象的地址一样
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\test.ser"));
			//每次读取一个对象，将其保存到obj（只能按Object类型读取）
			//判断 当前读取的是不是null ，最后一次的读取是一个null 表示没有对象了
			Object obj = null;
			while((obj=ois.readObject()) != null){
				//将读取到的对象强转为他原来的类型
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
