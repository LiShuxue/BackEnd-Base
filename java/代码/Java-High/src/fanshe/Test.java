package fanshe;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {

	public static void main(String[] args) throws Exception {
		
		
		// 获得类路径
		myClass my = new myClass();
		String s = my.getClass().getName();  //通过类的对象来获得类路径。.getClass().getName()
		System.out.println("类路径：" + s); 
		
		//一、使用反射，首先要得到这个类的Class对象
		//1.通过类路径   包名.类名
		try {
			Class c1 = Class.forName(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//2.通过类名
		Class c2 = myClass.class;
		//3.通过对象
		Class c3 = my.getClass();
		

		//二、通过这个Class对象来得到类的信息
		
		// 父类和接口
		Class sup = c3.getSuperclass(); // 通过这个类的Class对象调getSuperclass()获得父类
		System.out.println("父类：" + sup.getName());
		// 获得接口
		System.out.println("所有接口：");
		Class[] inters = c3.getInterfaces(); // 通过这个类的Class对象调getInterfaces()获得所有的接口，返回一个数组
		for (Class inte : inters) {
			System.out.println(inte.getName());
		}	
		//获取myClass类中的所有属性
		System.out.println("属性：");
		Field[] fs = c3.getDeclaredFields(); // 通过这个类的Class对象调getDeclaredFields()获得所有的属性，返回一个数组
		for (Field f : fs) {
			System.out.print(f.getType() + " ");   //获得属性的类型
			System.out.print(f.getName() + " = "); //获得属性的名字
			
			//如果你要得到的是属性值，用get（）方法。就必须要提供一个对象，表示获得这个对象的属性值
			//如果属性是 静态的， 就不需要对象了，直接通过null就可以获取
			f.setAccessible(true);		//如果属性是私有，必须设置访问权限
			
			System.out.println(f.get(my));  //获得属性的值
			
		}
		
		//获取该类的所有方法,包括那些由该类或接口声明的以及从超类和超接口继承的那些的类或接口的公共方法。
		System.out.println("所有方法：");
		Method[] methods = c3.getMethods();   //获取该类的所有方法，返回一个数组
		for (Method m : methods) {
			System.out.print( Modifier.toString( m.getModifiers() ) + " ");  //获得访问修饰符
			System.out.print( m.getReturnType().getName() + " ");            //获得返回值类型
			System.out.print(m.getName() + "(");                             //获得方法名
			Class[] types = m.getParameterTypes();                           //获得所有参数类型
			for(int i=0; i < types.length; i++){
				System.out.print(i < types.length-1 ? types[i].getName() + "," : types[i].getName());
			}
			System.out.println(")");
		}
	}
}

class myClass implements Serializable,Cloneable {
	int id=100;
	String name = "zhangsan";
	
	public void method1() {
		System.out.println("方法1");
	}
	
	public String method2() {
		return "方法2";
	}
}
