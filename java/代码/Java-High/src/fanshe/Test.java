package fanshe;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {

	public static void main(String[] args) throws Exception {
		
		
		// �����·��
		myClass my = new myClass();
		String s = my.getClass().getName();  //ͨ����Ķ����������·����.getClass().getName()
		System.out.println("��·����" + s); 
		
		//һ��ʹ�÷��䣬����Ҫ�õ�������Class����
		//1.ͨ����·��   ����.����
		try {
			Class c1 = Class.forName(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//2.ͨ������
		Class c2 = myClass.class;
		//3.ͨ������
		Class c3 = my.getClass();
		

		//����ͨ�����Class�������õ������Ϣ
		
		// ����ͽӿ�
		Class sup = c3.getSuperclass(); // ͨ��������Class�����getSuperclass()��ø���
		System.out.println("���ࣺ" + sup.getName());
		// ��ýӿ�
		System.out.println("���нӿڣ�");
		Class[] inters = c3.getInterfaces(); // ͨ��������Class�����getInterfaces()������еĽӿڣ�����һ������
		for (Class inte : inters) {
			System.out.println(inte.getName());
		}	
		//��ȡmyClass���е���������
		System.out.println("���ԣ�");
		Field[] fs = c3.getDeclaredFields(); // ͨ��������Class�����getDeclaredFields()������е����ԣ�����һ������
		for (Field f : fs) {
			System.out.print(f.getType() + " ");   //������Ե�����
			System.out.print(f.getName() + " = "); //������Ե�����
			
			//�����Ҫ�õ���������ֵ����get�����������ͱ���Ҫ�ṩһ�����󣬱�ʾ���������������ֵ
			//��������� ��̬�ģ� �Ͳ���Ҫ�����ˣ�ֱ��ͨ��null�Ϳ��Ի�ȡ
			f.setAccessible(true);		//���������˽�У��������÷���Ȩ��
			
			System.out.println(f.get(my));  //������Ե�ֵ
			
		}
		
		//��ȡ��������з���,������Щ�ɸ����ӿ��������Լ��ӳ���ͳ��ӿڼ̳е���Щ�����ӿڵĹ���������
		System.out.println("���з�����");
		Method[] methods = c3.getMethods();   //��ȡ��������з���������һ������
		for (Method m : methods) {
			System.out.print( Modifier.toString( m.getModifiers() ) + " ");  //��÷������η�
			System.out.print( m.getReturnType().getName() + " ");            //��÷���ֵ����
			System.out.print(m.getName() + "(");                             //��÷�����
			Class[] types = m.getParameterTypes();                           //������в�������
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
		System.out.println("����1");
	}
	
	public String method2() {
		return "����2";
	}
}
