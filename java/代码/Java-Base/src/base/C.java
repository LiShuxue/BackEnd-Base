package base;
public class C {
	public static void main(String[] args) {
		double score = 98.5;
		String name = "张三";
		char sex = '男';

		System.out.println("本次考试成绩最高分：" + score);//任意类型与字符串相连接都会转成字符串
		System.out.println("本次最高分得主：" + name);
		System.out.println("性别:" + sex);
		
	}
}
