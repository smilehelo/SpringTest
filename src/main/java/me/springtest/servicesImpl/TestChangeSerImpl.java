package me.springtest.servicesImpl;

import org.springframework.stereotype.Service;

import me.springtest.entity.Singleton;
import me.springtest.service.TestChangeSer;

@Service
public class TestChangeSerImpl implements TestChangeSer{

	@Override
	public String test(Singleton singleton) {
		return singleton.getName() + singleton.getNum();
	}

}
