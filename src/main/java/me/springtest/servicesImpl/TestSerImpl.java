package me.springtest.servicesImpl;

import org.springframework.stereotype.Service;

import me.springtest.service.TestSer;

@Service("TestSerImpl")
public class TestSerImpl implements TestSer{

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "test";
	}

}
