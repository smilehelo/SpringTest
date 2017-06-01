package me.springtest.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAOP {
	
	
	/**
	 *  声明切面
	 */
	@Pointcut("execution(* me.springtest.service.TestSer.test(..))")
	public void pointcut(){};
	
	
	
	@Before("pointcut()")
	public void testBefore(){
		System.out.println("before");
	}
	
	@After("pointcut()")
	public void testAfter(){
		System.out.println("after");
	}
	

}
