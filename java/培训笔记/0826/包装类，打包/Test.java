package com.zyw;
public class Test {

	public static void main(String[] args) {
		/**
		 * Java 包装类
		 */
		//1.通过包装类的构造，进行 "打包" (装箱)
		int num = 200;	//我要将基本类型的num 转成引用类型
		Integer num2 = new Integer(num);
			//那我是不是也可以“拆包”啊？
		int num3 = num2.intValue();	//这就是拆包
		//以上就是将 基本 转为引用  将  引用再转为  基本的过程
		//为什么需要打包？
			//1.将其转为引用类型，程序中所有的变量就都是对象了。操作都是对象。oop面向对象编程
			//2.基本是没有 属性 及  方法的，而引用类型拥有，功能增多了。
		//通过字符串创建Integer
		Integer num4 = new Integer("100");
		
		//Integer的静态方法 parseInt(String s) 将字符串转换为数字
		Integer num5 = Integer.parseInt("200");
		//-------------------------------------------------------------
		//Java提供了自动的打包 、拆包
		//可以更容易的将int值 转为 Integer，相反 也可以将Integer转为int
		Integer num6 = 100;	//自动打包
		int num7 = num6;	//自动拆包
		//将Integer转为字符串
		String s1 = num6.toString();
		String s2 = num6 + "";
		//-------------------------------其他包装类
		Short myShort = 10;
		Byte myByte = 10;
		Long myLong = 10L;
		Float myFloat = 10.1F;
		Double myDouble = 19.9;
		Boolean myBoolean = true;
		Character myCharacter = 'c';
	}

}

