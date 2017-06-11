package Proxy.jingtai;

public class Test {

	public static void main(String[] args) {
		/*
		 * 通过代理执行hello方法
		 * 首先，HelloSpeaker和HelloProxy 都实现了IHello接口
		 * 而 HelloProxy类里 又有一个IHello类型的helloObject属性，
		 * 		可以保存一个实现了IHello接口的对象，如HelloSpeaker（HelloSpeaker实现了IHello接口）
		 * 在HelloProxy里的Hello()方法 中 又调用 HelloSpeaker的 hello()方法，前后加了日志
		 * 将HelloProxy 多态到了 IHello ，调用hello() 执行
		 * 		HelloProxy里的Hello()
		 * 			日志
		 * 				HelloSpeaker的 hello()
		 * 			日志
		 * 
		 * 	静态代理的特点：需要代理在自己类中 一一表明要代理的行为。（重写N个方法）
		 * 		重写接口中的所有方法。
		 */
		
		//通过代理执行
		IHello proxy = new HelloProxy(new HelloSpeaker());
		proxy.hello("lisi");
		//不用代理
		IHello proxy2 = new HelloSpeaker();
		proxy2.hello("lisi");
	}

}
