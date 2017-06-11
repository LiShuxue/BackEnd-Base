package fanshe;

import java.lang.reflect.Method;

public class Test2 {
	
	public static void main(String[] args) throws Exception {
		Test2 t = new Test2();
		Method[] methods = t.getClass().getMethods();
		for (Method m : methods) {
			if(m.getName().startsWith("set")) {  //方法名如果是set开头的
				m.invoke(t, 100);                //调用当前这个方法，第一个参数是调用这个方法的对象，第二个是传进去的参数
			}
			if(m.getName().startsWith("get")) {  //方法名如果是get开头的
				Object obj = m.invoke(t, null);  //有返回值
				System.out.println(obj);
			}
		}
	}
	
	private int num;
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}
