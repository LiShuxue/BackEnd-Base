//题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。

package 水仙花数;
public class Flowers {
	public static void main(String[] args) {
		int a1,a2,a3;
		for(int i=100; i<1000; i++) {
			a1= i % 10;
			a2= i % 100 / 10;    //取模和除法的优先级是一样的
			a3= i / 100;
			
			if(i== a1*a1*a1+a2*a2*a2+a3*a3*a3)
				System.out.println(i);
			
		}

	}

}
