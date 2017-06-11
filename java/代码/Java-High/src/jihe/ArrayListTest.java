package jihe;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("第一个元素");
		System.out.println(list.size());  //list.size()获得当前已有元素的个数
		list.add(0, "第二个元素");   //原有的所有元素向后移
		//查看集合中的元素
		for(Object obj: list) {
			System.out.print(obj + "\t");
		}
		System.out.println();
		//或者
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");  //get(i)得到i位置的元素
		}
		System.out.println();
		
		List list2 = new ArrayList();
		list2.add(100);
		list2.add(200);
		
		list.addAll(list2);   //将所有的添加到list末尾
		
		for(Object obj: list) {
			System.out.print(obj + "\t");
		}
		System.out.println();
		
		//清空
		//list.clear();
		
		//contains（）,查找集合中是否包含某个元素，返回布尔
		System.out.println(list.contains(100));
		
		//list.indexOf(Object o),查找某个元素第一次出现的索引，从0开始
		System.out.println(list.indexOf(200));
		
		//list.isEmpty()判断集合是否为空
		System.out.println(list.isEmpty());
		
		//remove(int index),通过索引删除该元素，并返回该元素
		System.out.println(list.remove(2));
		//remove(Object o),移除某个对象，如果存在，就移除并返回true，否则返回false
		System.out.println(list.remove(new Integer(200)));
		
		//set(int index, E element) 用指定的元素替代此列表中指定位置上的元素。返回被替换调的元素
		Object obj2 = list.set(0, 100);
		System.out.println(obj2);
		
		for(Object obj: list) {
			System.out.print(obj + "\t");
		}
		System.out.println();
	}
}
