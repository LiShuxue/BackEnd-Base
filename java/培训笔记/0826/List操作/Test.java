package com.zyw;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/**
		 *   ���� List   ArrayList
		 */
		//����һ���ռ��ϣ���ʼ����10
		List list = new ArrayList();
		//�򼯺������һ��Ԫ�أ���������
		list.add("��һ��Ԫ��");	//���ķ���ֵtrue�����ô���
		System.out.println("���ϵ�Ԫ������:" + list.size());
		list.add(0, "�ڶ���Ԫ��");//������0��ʼ����ǰ�������һ��Ԫ�غ�ԭ�е�Ԫ�ػ�����ƶ�1λ
		//�鿴�����е�Ԫ��,��ʽ1
		for(Object obj : list){
			System.out.print(obj + "\t");
		}
		System.out.println();
		//��ʽ2,��i��Ϊ����
		for(int i=0; i<list.size(); i++){
			//Object get(����) ͨ��ָ����������ȡԪ��
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		//����һ���¼���
		List list2 = new ArrayList();
		list2.add(100);
		list2.add(200);
		//��list2���е�Ԫ�أ��list��ĩβ
		list.addAll(list2);
		for(Object obj : list){
			System.out.print(obj + "\t");
		}
		System.out.println();
		//��ռ���
		//list.clear();
		//System.out.println("��պ󣬼��ϵ�Ԫ������:" + list.size());
		//contains ���Ҽ������Ƿ����ָ����Ԫ��
		System.out.println("�Ƿ����ָ��Ԫ�أ�" + list.contains(100));
		//���ش��б����״γ��ֵ�ָ��Ԫ�ص���������������б�����Ԫ�أ��򷵻� -1��
		System.out.println("����Ԫ�ص�һ�γ��ֵ�������" + list.indexOf(200));
		//������б���û��Ԫ�أ��򷵻� true
		System.out.println("�жϼ����ǲ��ǿյģ�" + list.isEmpty());
		//remove(int index)ͨ������ɾ��Ԫ�أ������ظ�Ԫ��
		Object obj = list.remove(2);
		System.out.println("�Ƴ���Ԫ���ǣ�" + obj);
		//boolean remove(Object o) �ڼ�����ɾ����ͬ�ĸ���Ԫ��
		System.out.println("ɾ��������Ԫ��:" + list.remove(new Integer(200)));
		//set(int index, E element)  ��ָ����Ԫ��������б���ָ��λ���ϵ�Ԫ�ء����ر��滻����Ԫ��
		Object obj2 = list.set(0, 100);
		System.out.println(obj2);
		
		
	}
	
	

}

