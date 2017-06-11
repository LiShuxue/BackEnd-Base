package com.zyw.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTool {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
		System.err.println("请输入查询月份");
		Scanner sc = new Scanner(System.in); // 键盘输入
		String dateValue = sc.next();
		//将输入的字符串年月转换为util.Date
		Date date = sf.parse(dateValue);
		//将util.Date再转为字符串输出
		System.err.println(sf.format(date));
		if (sc != null) {
			sc.close();	//释放Scanner资源
		}
		getDate(date);
	}

	public static void getDate(Date nowDate) {
		//Calendar 日历类， getInstance()单例获得对象，系统当前时间
		Calendar cad = Calendar.getInstance();
		//按照你传入的时间进行设置
		cad.setTime(nowDate);
		int day_month = cad.getActualMaximum(Calendar.DAY_OF_MONTH); // 获取当月天数
		//7列表示星期，6日期的行数，不会超过6行，二维数组用来表示日历表
		int[][] array = new int[6][7];
		for (int i = 0; i <= day_month - 1; i++) { // 循环遍历每天
			cad.set(Calendar.DAY_OF_MONTH, i + 1);		//当前日期是几号
			int week_month = cad.get(Calendar.WEEK_OF_MONTH); // 获取改天在本月的第几个星期，也就是第几行
			//星期日是第一天，那么9月的1日 是第三天
			int now_day_month = cad.get(Calendar.DAY_OF_WEEK); // 获取该天在本星期的第几天
															// ，也就是第几列
			array[week_month - 1][now_day_month - 1] = i + 1; // 将改天存放到二位数组中
		}
		String[] weeks = { "日", "一", "二", "三", "四", "五", "六" };
		System.out.println("--------------------------------------");
		for (String w : weeks) {
			System.err.print(w + "\t");
		}
		System.err.println();
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = 0; j <= array[i].length - 1; j++) {
				if (array[i][j] != 0) { // 没有存放的数字默认为0，过滤
					System.err.print(array[i][j]);
				}
				System.err.print("\t");
				//内层循环每7次输出一个换行
				if ((j + 1) % 7 == 0) {
					System.err.println();
				}
			}
		}
	}
}