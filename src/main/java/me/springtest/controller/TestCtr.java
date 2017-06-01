package me.springtest.controller;

import junit.textui.ResultPrinter;
import me.springtest.entity.Singleton;
import me.springtest.service.TestChangeSer;
import me.springtest.service.TestSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import IocClass.IocTest1;

@Controller
@RequestMapping("/Test")
public class TestCtr {
	
	@Autowired
	@Qualifier("TestSer2Impl")
	private TestSer testSer2;
	
	@Autowired
	@Qualifier("TestSerImpl")
	private TestSer testSer1;
	
	@Autowired
	private Singleton singleton;
	
	@Autowired
	private ResultPrinter hehe;
	
	@Autowired
	private IocTest1 one;
	
	@Autowired
	private TestChangeSer testChangeSer;
	

	
	@RequestMapping("/test1")
	public String Test(){
		String result = testSer1.test();
		int i = 16/0;
		return result;
	}
	
	@RequestMapping("/test2")
	public String Test2(){
		String result = testSer2.test();
		return result;
	}
	
	@RequestMapping("/test3")
	public void Test3(){
		System.out.println(hehe.getWriter());
	}
	
	@RequestMapping("/test4")
	public void Test4(){
		System.out.println(one.getName());
	}
	
	@RequestMapping("/test5")
	public void Test5(){
		String result = testChangeSer.test(singleton);
		System.out.println(result);
	}
	
	
	

}
