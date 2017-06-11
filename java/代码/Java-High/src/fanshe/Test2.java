package fanshe;

import java.lang.reflect.Method;

public class Test2 {
	
	public static void main(String[] args) throws Exception {
		Test2 t = new Test2();
		Method[] methods = t.getClass().getMethods();
		for (Method m : methods) {
			if(m.getName().startsWith("set")) {  //�����������set��ͷ��
				m.invoke(t, 100);                //���õ�ǰ�����������һ�������ǵ�����������Ķ��󣬵ڶ����Ǵ���ȥ�Ĳ���
			}
			if(m.getName().startsWith("get")) {  //�����������get��ͷ��
				Object obj = m.invoke(t, null);  //�з���ֵ
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
