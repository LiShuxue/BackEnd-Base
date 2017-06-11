package com.lsx.demo;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;
/**
 * ����ͬʱʵ��Ҫ���빦�ܵĽӿ� 
 * IOther,������Ҫ����Ĺ���
 *
 */
public class OtherIntroduction implements IntroductionInterceptor, IOther {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		//���ִ�еķ�������IOther�ӿ�
		/*
		 * methodInvocation ��������Ĵ���
		 * getMethod()	�õ������Ķ���
		 * getDeclaringClass() �õ��÷��������  "�ӿ�"	�õ��ӿڵ�Class����
		 */
		//System.out.println("1:"+methodInvocation.getMethod().getDeclaringClass());
		
		if(this.implementsInterface(methodInvocation.getMethod().getDeclaringClass())){
			//ִ�ж���������Ϊ������ǰ�Ĵ���������Ϊ��ǰ��Ķ���ִ�е�ǰ���е�doOther()����
			return methodInvocation.getMethod().invoke(this, methodInvocation.getArguments());
		}
		//ִ��ԭ����Ϊ ����proceed() ����ִ�и÷���
		//System.out.println("2:"+methodInvocation);
		
		//���ؽ����ˣ� ִ�д����������
		return methodInvocation.proceed();	
	}

	/**
	 *  clazz ��  IOther �Ƿ�����ͬ���ӿڣ��������丸��򳬽ӿ�
	 */
	@Override
	public boolean implementsInterface(Class<?> clazz) {
		return clazz.isAssignableFrom(IOther.class);
	}

	@Override
	public void doOther() {
		System.out.println("�������ӵ�ְ�𡣡�����");
	}

	
	

}
