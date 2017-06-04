package me.springtest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import me.springtest.entity.UserInfo;
import me.springtest.service.UserInfoSer;


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
	
	@RequestMapping("/validator")
	public void validator(@Valid UserInfo userinfo,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			List<ObjectError> lists = bindingResult.getAllErrors();
			System.out.println(lists.size());
			for(ObjectError one : lists){
				System.out.println(one.getDefaultMessage());	
			}
		}
//		System.out.println(userinfo.getName() + userinfo.getPwd());
	}
}
