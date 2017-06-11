package com.zyw.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTool {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
		System.err.println("�������ѯ�·�");
		Scanner sc = new Scanner(System.in); // ��������
		String dateValue = sc.next();
		//��������ַ�������ת��Ϊutil.Date
		Date date = sf.parse(dateValue);
		//��util.Date��תΪ�ַ������
		System.err.println(sf.format(date));
		if (sc != null) {
			sc.close();	//�ͷ�Scanner��Դ
		}
		getDate(date);
	}

	public static void getDate(Date nowDate) {
		//Calendar �����࣬ getInstance()������ö���ϵͳ��ǰʱ��
		Calendar cad = Calendar.getInstance();
		//�����㴫���ʱ���������
		cad.setTime(nowDate);
		int day_month = cad.getActualMaximum(Calendar.DAY_OF_MONTH); // ��ȡ��������
		//7�б�ʾ���ڣ�6���ڵ����������ᳬ��6�У���ά����������ʾ������
		int[][] array = new int[6][7];
		for (int i = 0; i <= day_month - 1; i++) { // ѭ������ÿ��
			cad.set(Calendar.DAY_OF_MONTH, i + 1);		//��ǰ�����Ǽ���
			int week_month = cad.get(Calendar.WEEK_OF_MONTH); // ��ȡ�����ڱ��µĵڼ������ڣ�Ҳ���ǵڼ���
			//�������ǵ�һ�죬��ô9�µ�1�� �ǵ�����
			int now_day_month = cad.get(Calendar.DAY_OF_WEEK); // ��ȡ�����ڱ����ڵĵڼ���
															// ��Ҳ���ǵڼ���
			array[week_month - 1][now_day_month - 1] = i + 1; // �������ŵ���λ������
		}
		String[] weeks = { "��", "һ", "��", "��", "��", "��", "��" };
		System.out.println("--------------------------------------");
		for (String w : weeks) {
			System.err.print(w + "\t");
		}
		System.err.println();
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = 0; j <= array[i].length - 1; j++) {
				if (array[i][j] != 0) { // û�д�ŵ�����Ĭ��Ϊ0������
					System.err.print(array[i][j]);
				}
				System.err.print("\t");
				//�ڲ�ѭ��ÿ7�����һ������
				if ((j + 1) % 7 == 0) {
					System.err.println();
				}
			}
		}
	}
}