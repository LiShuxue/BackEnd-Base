package com.zyw;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/**
		 * �򼯺��б��漯��
		 * �򼯺��б���5�ͼ���
		 * ��һ�����󱣴浽�����У��ö���״̬�ı��ˣ������б���Ķ���Ҳ��ͬʱ�ı�
		 * �򼯺��д洢Ԫ�أ����Ǳ������á�
		 */
		List parent = new ArrayList();
		
		List child01 = new ArrayList();
		List child02 = new ArrayList();
		List child03 = new ArrayList();
		List child04 = new ArrayList();
		List child05 = new ArrayList();
		parent.add(child01);
		parent.add(child02);
		parent.add(child03);
		parent.add(child04);
		parent.add(child05);
		
		for(Object obj : parent){
			List childList = (List)obj;
			System.out.println("�����е�Ԫ�صģ�Ԫ��������:" + childList.size());
		}
		System.out.println("---------------------------------");
		child01.add(100);
		child03.add(100);
		for(Object obj : parent){
			List childList = (List)obj;
			System.out.println("�����е�Ԫ�صģ�Ԫ��������:" + childList.size());
		}
	}
}

