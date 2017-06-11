package jihe;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map map = new HashMap();
		//map.put(key， value)方法返回：与 key 关联的旧值；如果原来的 key 没有任何映射关系，则返回 null。
		//（返回 null 还可能表示该映射之前将 null 与 key 关联。）
		System.out.println(map.put(1, 2));
		System.out.println(map.put(1, 3));
		System.out.println(map.put(1, 4));
		
	}
}
