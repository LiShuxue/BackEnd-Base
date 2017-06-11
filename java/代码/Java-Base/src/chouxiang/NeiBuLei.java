package chouxiang;

import oop.a;

/**
 * 内部类的作用一般就是为了隐藏
 * 一般不用内部类
 *
 */
public class NeiBuLei {
	public static void main(String[] args) {
		//D d = new D();         //main方法中不能直接new非静态的内部类，而可以new静态的内部类
		E e = new E();
		D d = new NeiBuLei().new D(); //但是可以通过外部类的对象去new内部类
	}
	public void a() {
		D d1 = new D();          //不是main方法就可以随便用
		E e1 = new E();
		D d2 = new NeiBuLei().new D();
	}
	
	class D{
		
	}
	static class E{
		
	}
}

