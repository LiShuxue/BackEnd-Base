package com.zyw;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		
		//getAbsolutePath( ) 获得File对象的绝对路径
		File file = new File("src\\my.txt");
		//System.out.println(file.getAbsolutePath());
		//getName( )获得文件名
		//System.out.println(file.getName());
		//String getPath( ) 获得路径
		//System.out.println(file.getPath());
		//listFiles()根据目录，获取该目录下所有的文件对象，返回对象数组
		/*File srcFile = new File("src");
		for(File f : srcFile.listFiles()){
			//输出f，等同于getPath()
			System.out.println(f + "\t name=" + f.getName());
		}*/
		//renameTo(File dest ) 将调用该函数的file，移动至参数file的位置（可改名），
		//如果该位置存在相同目录或文件，移动失败，返回false
		System.out.println(new File("c:\\hello.txt").renameTo(new File("D:\\hello.txt")));
		
		//length() 获取文件的大小，字节数
		//System.out.println("文件大小：" + new File("c:\\hello.txt").length());
		
		//mkdir 创建指定的"一个目录(目录结构中最后一个)"
		//如：c:\\a\\b\\c 如果a、b都是没有的 c是无法创建的
		//如果a、b是已存在目录，才会创建c		只能创建一个目录
		//file = new File("C:\\a\\b\\c");
		/*file = new File("C:\\a");
		if(!file.exists()){
			file.mkdir();	//什么都没做
		}*/
		//mkdirs 如果你所指定的目录的父路径也不存在的话，将一起被创建
		//如：c:\\a\\b\\c 如果a、b都是没有的 将创建a、b、c
		/*file = new File("C:\\a\\b\\c");
		if(!file.exists()){
			file.mkdirs();
		}*/
	}
	
	
}



