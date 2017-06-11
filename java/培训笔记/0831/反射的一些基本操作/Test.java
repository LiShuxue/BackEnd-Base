package com.zyw.test;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {
	
	public static void main(String[] args) throws Exception{
		/**
		 *  反射 ： 分析类的程序（一种Java技术）
		 *  通过反射可以根据一个类路径（或对象、类名）来获取这个类中的所有信息（包括私有）
		 */
		//使用反射，首先你要得到这个类的 Class对象，有以下几种方式来获取
		//1.通过类路径
		try {
			Class c1 = Class.forName("com.zyw.test.MyClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//2.通过类名，这是  依赖于代码
		Class c2 = MyClass.class;
		//3.通过对象
		MyClass my = new MyClass();
		Class c3 = my.getClass();
		//获得类路径
		System.out.println(my.getClass().getName());
		//父类和接口
		Class sup = c3.getSuperclass();
		System.out.println("父类：" + sup.getName());
		//获得接口
		System.out.println("所有接口：");
		Class[] inters = c3.getInterfaces();
		for (Class inte : inters) {
			System.out.println(inte.getName());
		}
		
		//---------------------------------------------
		//java.lang.reflect.Field  //反射都是reflect包中
		//获取MyClass类中所有的属性
		System.out.println("属性：");
		Field[] fs = c3.getDeclaredFields();
		for (Field f : fs) {
			System.out.print(f.getType() + " ");
			System.out.print(f.getName() + " = ");
			//如果你要得到的是属性值，就必须要一共一个对象，表示获得这个对象的属性值
			//如果属性是 静态的， 就不需要对象了，直接通过null就可以获取
			f.setAccessible(true);		//如果属性是私有，必须设置访问权限
			System.out.println(f.get(my));
		}
		//分析该类方法,获取该类所有方法
		System.out.println("方法：");
		Method[] methods = c3.getMethods();
		for(Method m : methods){
			System.out.print( Modifier.toString( m.getModifiers() ) + " ");
			System.out.print( m.getReturnType().getName() + " ");
			System.out.print(m.getName() + "(");
			//所有参数类型
			Class[] types = m.getParameterTypes();
			for(int i=0; i < types.length; i++){
				System.out.print(i < types.length-1 ? types[i].getName() + "," : types[i].getName());
			}
			System.out.println(")");
		}
	}
}

class MyClass implements Serializable,Cloneable{
	private int id = 100;
	private String name = "zhangsan";
	public void method1(){
		System.out.println("方法1");
	}
	public String method2(){
		return "方法2";
	}
}
