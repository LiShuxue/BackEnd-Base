package com.zyw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
		/**
		 * ��<E>E��λ����дһ���������ͣ���ô�Ժ�������Ͼ�ֻ�ܴ洢�����͵�����
		 * �����ȡ���������ݵ�ʱ��Ҳ����Ҫǿ��ת����
		 */
		//ֻ��add(Integer)
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		//��ȡ����  get() ����ֵ ��Integer
		System.out.println(list.get(0));
		for(Integer i : list){
			System.out.println(i);
		}
		System.out.println("-----------------------------");
		Map<String, Integer> map = new HashMap<String, Integer>();
		//�������ݵ�ʱ��key�������ַ�����ֵ����������
		map.put("a", 100);
		map.put("b", 200);
		System.out.println(map.get("a"));		//�Ҳ�������null
		Set<String> keys = map.keySet();	//���е�key
		
	}
}


