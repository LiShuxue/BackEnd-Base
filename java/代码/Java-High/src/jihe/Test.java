package jihe;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map map = new HashMap();
		//map.put(key�� value)�������أ��� key �����ľ�ֵ�����ԭ���� key û���κ�ӳ���ϵ���򷵻� null��
		//������ null �����ܱ�ʾ��ӳ��֮ǰ�� null �� key ��������
		System.out.println(map.put(1, 2));
		System.out.println(map.put(1, 3));
		System.out.println(map.put(1, 4));
		
	}
}
