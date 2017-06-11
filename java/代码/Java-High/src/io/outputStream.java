package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class outputStream {

	public static void main(String[] args) {
		try {
			//创建一个字节输入流去读取某个文件对象"d:\\test.jpg"
			InputStream in = new FileInputStream("d:\\test.jpg");
			//创建一个字节输出流去将某些内容输出到某个对象
			OutputStream out = new FileOutputStream("e:\\test.jpg");
			//创建一个字节数组，去接收读取到的内容或要输出的内容
			byte[] buff = new byte[1024];
			//定义一个变量len,接收读取到的数据的个数
			int len;
			//当读取到的数据的个数为-1时，即没有内容可读了，终止循环
			while((len=in.read(buff)) != -1) {   
				//将数组中从0开始的 len个字节写入此输出流,此输出流会将内容输出到你规定的对象"e:\\test.jpg"里
				out.write(buff, 0, len);
			}
			//关闭两个流
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
