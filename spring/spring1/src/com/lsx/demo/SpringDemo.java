package com.lsx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		//ͨ��spring����ȡ�����ļ���Ϊ����helloword����ֵ
		//����src�µ�xml
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//���xml�����õ�HelloBean����getBean��������xml�е�id
		HelloBean hello1 = (HelloBean)context.getBean("helloBean");
		System.out.println(hello1.getHelloword());
		
		//���ǲ���spring�Ļ�,����ֵ����ԭ����Ĭ��ֵ
		HelloBean hello2 = new HelloBean();
		System.out.println(hello2.getHelloword());
		
		//springĬ��bean �ǵ����ġ������һ��HelloBean����,�����һ���µõ���HelloBean����
		//�� <bean> ��ʹ������   scope="prototype"  ��ȡ������
		System.out.println(hello1);
		System.out.println(context.getBean("helloBean"));
	}
}
