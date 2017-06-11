package gongjulei;
/**
 * 打包，拆包（装箱，拆箱）
 */
public class BaoZhuangLei {
	
	public static void main(String[] args) {

		int num = 200;
		Integer num2 = new Integer(num);  //打包
		
		int num3 = num2.intValue();    //拆包
		
		
		//通过String创建
		String s = "100";
		Integer num4 = new Integer(s);
		
		//静态方法parseInt(String s),将字符串转换为数字
		int num5 = Integer.parseInt(s);
		
		//java提供了自动的打包拆包
		Integer num6 = 100;  //打包
		int num7 = num6;     //拆包
		
		//将对象转换为字符串
		String s2 = num6.toString();
		String s3 = num6 + "";
		
		/**
		 * 其他的包装类
		 */
		Short myShort = 10;
		Byte myByte = 10;
		Long mylLong = 10L;
		Float myfFloat = 10.1f;
		Double mydDouble = 19.9;
		Boolean myBoolean = true;
		Character myCharacter = 'c';
	}
	
	/**
	 * 定义一个方法，返回值，参数是包装类型.调用的时候直接传数字就行
	 */
	public static Double myMethod(Integer num) {
		Double d = num + 12.12;
		return d;
		
	}
	
}
