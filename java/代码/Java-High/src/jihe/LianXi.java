package jihe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LianXi {

	public static void main(String[] args) {
		
		List list = new ArrayList();  //新建一个list对象
		
		Map map1 = new HashMap();     //创建5个map对象
		Map map2 = new HashMap();
		Map map3 = new HashMap();
		Map map4 = new HashMap();
		Map map5 = new HashMap();
		
		map1.put(1, "我是map1");       //每个map对象分别存入对应的值
		map2.put(2, "我是map2");
		map3.put(3, "我是map3");
		map4.put(4, "我是map4");
		map5.put(5, "我是map5");
		
		list.add(map1);              //将5个对象都存入list中
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		
		Iterator iter = list.iterator();  //生成一个list的迭代器
		
		while(iter.hasNext()) {          //判断list中是否有元素
			Object obj = iter.next();    //获取list中的元素
			Map m = (Map)obj;            //将获取到的元素转换为Map类型
			Set keys = m.keySet();       //获取此map对象的所有的key 
			for(Object key : keys) {     //遍历获取到的key，输出每一个获取到的map对象的所有数据
				System.out.println(m.get(key));
			}
			
		}
		
	}
}
