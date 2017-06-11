package com.zyw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;



public class Test {

	public static void main(String[] args) {
		/*
		 * 将c盘下的test.jpg读取到内存
		 */
		try {
			InputStream in = new FileInputStream("c:\\test.jpg");
			//通过byte数组，将数据读取到数组中
			byte[] buff = new byte[1024];	//1k
			//如果没有数据，依然返回-1,有数据的话，返回读取数据的数量
			/*int k = in.read(buff);
			System.out.println("数量是：" + k);
			System.out.println("数据是：" + Arrays.toString(buff));*/
			int len;
			//一个7k多个图片，读取了8次
			//读取的图，我们看不到，只能将该图，使用“输出流”,将其输出到磁盘上来查看。
			//1.定义输出流对象,你要输出的是什么？文件就要用文件输出流,填一个保存文件的位置
			File toFile = new File("d:\\test.jpg");
			//创建toFile这个文件，if创建成功（路径下没有该文件，才能创建）
			//else 创建不成功（文件已存在了） 删除该文件，创建一个新的空文件
			if(toFile.createNewFile()){
				
			}else{
				toFile.delete();
				toFile.createNewFile();
			}
			//out只能向toFile里输出内容
			OutputStream out = new FileOutputStream(toFile);

			while( (len = in.read(buff)) != -1){
				//System.out.println(len);
				//System.out.println(Arrays.toString(buff));
				//向out的文件中输出 从数组0开始len数量的字节
				//关键是最后一次，如果不满1024,比如len=123,从数组0 写入123个字节
				out.write(buff, 0, len);
	
			}
			//后开的流，先关
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}



