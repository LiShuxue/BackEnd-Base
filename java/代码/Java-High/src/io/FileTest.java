package io;

import java.io.File;
import java.util.Arrays;

public class FileTest {

	public static void main(String[] args) {
		
		try {
			
			File f1 = new File("D:\\hello.txt");   //先声明一个文件对象
			
			if(f1.createNewFile()) {                //判断此文件是否存在，不存在就创建
				System.out.println("创建成功");
			}
			else{
				System.out.println("已存在");
			}
			
//			//在C盘下创建一个临时文件，前缀是hello，后缀是123
//			File tempFile = File.createTempFile("hello", "123", new File("D:\\"));
//			System.out.println(tempFile.getName()); //得到此文件的名称
			
			
			//判断f1这个文件是否存在
			boolean isExist = f1.exists();
			if(isExist){
				System.out.println("文件已存在");
			}
			else{
				System.out.println("文件不存在");
			}
			
			//判断f1是否与给定的对象相同
			boolean isEqual = new File("D:\\hello.txt").equals(f1);
			if(isEqual) {
				System.out.println("相同");
			}else{
				System.out.println("不同");
			}
			
			//判断f1是否可读写
			if(f1.canRead()) {
				System.out.println("可读");
			}else{
				System.out.println("不可读");
			}
			
			if(f1.canWrite()) {
				System.out.println("可写");
			}else{
				System.out.println("不可写");
			}
			
			
			//list()返回某个路径下的所有的文件或文件夹的名字组成的字符串数组
			System.out.println(Arrays.toString(new File("D:\\").list()));
			
			//返回绝对路径
			System.out.println(f1.getAbsolutePath());
			//返回相对路径
			System.out.println(f1.getPath());
			
			//返回文件大小
			System.out.println(f1.length());
			
			//删除该文件
			if(f1.delete()) {
				System.out.println("f1删除成功");
			}else{
				System.out.println("f1删除失败");
			}
			
			//mkdir() 与 mkdirs()
			File f2 = new File("D:\\a\\b\\c");
			if(f2.mkdir()) {
				System.out.println("mkdir()创建成功");
			}else {
				System.out.println("mkdir()创建失败");
			}
			if(f2.mkdirs()) {
				System.out.println("mkdirs()创建成功");
			}else {
				System.out.println("mkdirs()创建失败");
			}
			
			//删除该文件
			if(f2.delete()) {
				System.out.println("f2删除成功");
			}else{
				System.out.println("f2删除失败");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
