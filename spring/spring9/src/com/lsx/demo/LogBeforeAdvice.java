package com.lsx.demo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * һ����ͨ��Java��
 *
 */
public class LogBeforeAdvice {

	private Logger logger = Logger.getLogger(this.getClass().getName());

	/**
	 * �������һ����ͨjava�࣬before�Լ�����������֣�
	 * JoinPoint,getTarget()��ȡĿ�����getArgs()��ȡ������getSignature()��ȡPointcutǩ����Ϣ
	 * joinPoint :����û����Щ������,
	 */
	public void before(JoinPoint joinPoint){
													//��Щ����Ϊ����ʾ���ӵ����Ϣ
		logger.log(Level.INFO,"method start..." + joinPoint.getSignature().getName());
	}

}
