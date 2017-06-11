package com.lsx.tag;
/**
 *  EL方法的程序处理类
 *  	其中的方法必须是静态方法 ，通常方法都是有返回值的。
 *		参数 是数字、字符串。
 *
 *		类写完之后，需要tld，配置el方法类。
 */
public class MyFunctions {
	
	 public static String formatMyName(String name) {
	       return "your name is " + name;
	 }

	 public static int add(int a, int b) {
	       return a+b;
	 }
}
