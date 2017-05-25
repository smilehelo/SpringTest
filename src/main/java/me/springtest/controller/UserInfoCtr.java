package me.springtest.controller;

import me.springtest.entity.UserInfo;
import me.springtest.service.UserInfoSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/userinfo")
public class UserInfoCtr {

	@Autowired
	private UserInfoSer userInfoSer;
	
	@RequestMapping("/insert")
	public void insert(){
		userInfoSer.insert();
	}
	
	@RequestMapping("/getById")
	public void getById(){
		UserInfo userInfo = userInfoSer.getById();
		System.out.println(userInfo);
	}
}
