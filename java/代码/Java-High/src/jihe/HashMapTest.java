package jihe;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//存储的内容也是无序的
		Map map = new HashMap();
	
		//put(key, value)可以保存数据,key和value都是Object，可以是任意的类型
		map.put("a", new Date());
		map.put(null, 100);     //map可以用null作为key
		map.put(100, "hello");
		
		//get(key),可以获取数据
		System.out.println(map.get("a"));
		System.out.println(map.get(null));
		System.out.println(map.get(100));
		
		System.out.println("----------------");
		
		//获取所有的键
		Set keys = map.keySet();  //将获取到的键存在Set里面
		
		//通过遍历这个Set，可以获取map中的值
		for(Object key : keys) {
			System.out.println(map.get(key));
		}
	}
}
