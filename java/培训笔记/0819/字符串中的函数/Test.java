package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		String s = " 12345 ";//可以通过输入得到
		//获得s的长度，先 trim() 一下，再获得长度
		/*
		 * trim() 返回值是去掉前后空格的  字符串
		 * length() 返回int
		 */
		int len = s.trim().length();
		System.out.println("长度是:" + len);
		
		/*
		 * 	booealn equalsIgnoreCase() 忽略大小写比较两个字符串，返回boolean
		 * 	String toLowerCase()	将字符串转换小写	返回string
		 * 	String toUpperCase()	将字符串转换大写	返回string
		 * 	String concat(String str)  将两个字符串连接   注意 返回值是连接后的字符串
		 * 	int indexOf(char)		查找一个字符串中是否包含某个 字符  或  字符串
		 * 	int indexOf(String)	没找到-1 第一个位置0
		 * 	int lastIndexOf(char)	从字符串的后面开始找某个字符串 或字符
		 * 	int lastIndexOf(String)	返回结果 同上
		 * 	String substring(int)	从指定为（0开始）截取到最后的 子串
		 * 	String substring(begin,end) 截取从 begin 到  end 之前。不包括end
		 * 	String trim()	去掉字符串两端的空格
		 */
		System.out.println("hello".indexOf("o"));
		System.out.println("hello".substring(1));
		System.out.println("hellohello".substring(1,5));
		System.out.println("------------------------------");
		String str = "长亭外 古道边 芳草碧连天 晚风扶 笛声残 夕阳山外山";
		//通过空格 将字符串str拆分成数组
		String[] strArr = str.split(" ");
		for (String st : strArr) {
			System.out.println(st);
		}
	
	}

}
