package com.lsx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//�õ��������
		ISome some = (ISome)ac.getBean("proxyFactoryBean");
		//System.out.println(some);
		//���ô������ķ�����ͬʱ���ȱ�OtherIntroduction��invoke ����
		some.doSome();
		
		//����doOther()��������һ�εı�����
		//((IOther)some).doOther();
		IOther other = (IOther)some;//Ϊʲô����ת����Ϊ�������ļ��й涨��otherAdvice
		//System.out.println("xx:" + other);
		other.doOther();
		
	}

}
