package me.springtest.entity;

import org.springframework.stereotype.Component;

@Component
public class Singleton {

	private String name = "hehe";
	
	private int num = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
