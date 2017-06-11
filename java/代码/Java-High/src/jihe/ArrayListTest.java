package jihe;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("��һ��Ԫ��");
		System.out.println(list.size());  //list.size()��õ�ǰ����Ԫ�صĸ���
		list.add(0, "�ڶ���Ԫ��");   //ԭ�е�����Ԫ�������
		//�鿴�����е�Ԫ��
		for(Object obj: list) {
			System.out.print(obj + "\t");
		}
		System.out.println();
		//����
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");  //get(i)�õ�iλ�õ�Ԫ��
		}
		System.out.println();
		
		List list2 = new ArrayList();
		list2.add(100);
		list2.add(200);
		
		list.addAll(list2);   //�����е���ӵ�listĩβ
		
		for(Object obj: list) {
			System.out.print(obj + "\t");
		}
		System.out.println();
		
		//���
		//list.clear();
		
		//contains����,���Ҽ������Ƿ����ĳ��Ԫ�أ����ز���
		System.out.println(list.contains(100));
		
		//list.indexOf(Object o),����ĳ��Ԫ�ص�һ�γ��ֵ���������0��ʼ
		System.out.println(list.indexOf(200));
		
		//list.isEmpty()�жϼ����Ƿ�Ϊ��
		System.out.println(list.isEmpty());
		
		//remove(int index),ͨ������ɾ����Ԫ�أ������ظ�Ԫ��
		System.out.println(list.remove(2));
		//remove(Object o),�Ƴ�ĳ������������ڣ����Ƴ�������true�����򷵻�false
		System.out.println(list.remove(new Integer(200)));
		
		//set(int index, E element) ��ָ����Ԫ��������б���ָ��λ���ϵ�Ԫ�ء����ر��滻����Ԫ��
		Object obj2 = list.set(0, 100);
		System.out.println(obj2);
		
		for(Object obj: list) {
			System.out.print(obj + "\t");
		}
		System.out.println();
	}
}
