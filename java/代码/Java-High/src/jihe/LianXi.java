package jihe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LianXi {

	public static void main(String[] args) {
		
		List list = new ArrayList();  //�½�һ��list����
		
		Map map1 = new HashMap();     //����5��map����
		Map map2 = new HashMap();
		Map map3 = new HashMap();
		Map map4 = new HashMap();
		Map map5 = new HashMap();
		
		map1.put(1, "����map1");       //ÿ��map����ֱ�����Ӧ��ֵ
		map2.put(2, "����map2");
		map3.put(3, "����map3");
		map4.put(4, "����map4");
		map5.put(5, "����map5");
		
		list.add(map1);              //��5�����󶼴���list��
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		
		Iterator iter = list.iterator();  //����һ��list�ĵ�����
		
		while(iter.hasNext()) {          //�ж�list���Ƿ���Ԫ��
			Object obj = iter.next();    //��ȡlist�е�Ԫ��
			Map m = (Map)obj;            //����ȡ����Ԫ��ת��ΪMap����
			Set keys = m.keySet();       //��ȡ��map��������е�key 
			for(Object key : keys) {     //������ȡ����key�����ÿһ����ȡ����map�������������
				System.out.println(m.get(key));
			}
			
		}
		
	}
}
