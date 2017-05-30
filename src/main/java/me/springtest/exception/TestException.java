package me.springtest.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TestException {

	@ExceptionHandler(Exception.class)
	public void exception(){
		System.out.println("this is a exception!");
	}
	
}
