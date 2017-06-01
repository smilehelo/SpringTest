package me.springtest.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import me.springtest.entity.Singleton;

@Aspect
@Component
public class TestChangeAOP {

	@Pointcut("execution(* me.springtest.service.TestChangeSer.test(..))")
	public void pointcut(){};
	
	@Around("pointcut()")
	public Object around(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("���濪ʼ����");
		Object[] os = jp.getArgs();
		Singleton singleton = (Singleton)os[0];
		System.out.println("����Ϊ" + singleton.getName() + "**" + singleton.getNum());
		System.out.println("��ʼ�޸ģ�");
		singleton.setName("���˸�ȥ");
		singleton.setNum(123);
		os[0] = (Object)singleton;
		Object result = jp.proceed(os);
		return result;
	}
}
