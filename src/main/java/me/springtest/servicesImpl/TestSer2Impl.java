package me.springtest.servicesImpl;

import org.springframework.stereotype.Service;

import me.springtest.service.TestSer;

@Service("TestSer2Impl")
public class TestSer2Impl implements TestSer{

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "test2";
	}

}
