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
			//使用比较多的
			//File f = new File("绝对路径")
			
			//------------------------------------------
			//创建C盘的文件对象
			File file = new File("c:\\hello.txt");
			//查看C盘下是否存在Hello.txt文件，如果存在返回false，不存在创建该文件，返回true
			if(file.createNewFile()){
				System.out.println("创建新文件");
			}else{
				System.out.println("存在，不可以创建");
			}
			
			//在指定路径，创建临时文件，提供文件前、后缀
			//createTempFile 返回你创建的File对象
			//File tempFile = File.createTempFile("hello", "123", new File("C:\\"));
			//System.out.println(tempFile.getName());
			
			//判断指定的路径或文件 是否存在
			if(file.exists()){
				System.out.println("文件存在");
			}else{
				System.out.println("文件不存在");
			}
			
			//如果指定路径存在该文件/目录 能删除true
			if(file.delete()){
				System.out.println("删除成功");
			}else{
				System.out.println("删除失败");
			}
			
			System.out.println("是否可以读取:" + file.canRead());
			System.out.println("是否可以写入:" + file.canWrite());
			
			//获得指定"目录" 下的所有文件名
			System.out.println(Arrays.toString(new File("C:\\").list()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}



