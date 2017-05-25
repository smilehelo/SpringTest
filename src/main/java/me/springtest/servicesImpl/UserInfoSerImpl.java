package me.springtest.servicesImpl;

import me.springtest.dao.UserInfoDao;
import me.springtest.entity.UserInfo;
import me.springtest.service.UserInfoSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoSerImpl implements UserInfoSer{
	
	@Autowired
	private UserInfoDao userInfoDao;
	

	@Override
	public void insert() {
		UserInfo userInfo = new UserInfo();
		userInfo.setName("Íõ¹ú»Õ");
		userInfo.setAge(26);
		userInfo.setPwd("123456789");
		userInfoDao.insert(userInfo);
	}

	@Override
	public UserInfo getById() {
		String id = "1";
		UserInfo userInfo = userInfoDao.getById(id);
		return userInfo;
	}

}
