package jihe;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//�洢������Ҳ�������
		Map map = new HashMap();
	
		//put(key, value)���Ա�������,key��value����Object�����������������
		map.put("a", new Date());
		map.put(null, 100);     //map������null��Ϊkey
		map.put(100, "hello");
		
		//get(key),���Ի�ȡ����
		System.out.println(map.get("a"));
		System.out.println(map.get(null));
		System.out.println(map.get(100));
		
		System.out.println("----------------");
		
		//��ȡ���еļ�
		Set keys = map.keySet();  //����ȡ���ļ�����Set����
		
		//ͨ���������Set�����Ի�ȡmap�е�ֵ
		for(Object key : keys) {
			System.out.println(map.get(key));
		}
	}
}
