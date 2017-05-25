package me.springtest.dao;

import me.springtest.entity.UserInfo;

import org.apache.ibatis.annotations.Param;

public interface UserInfoDao {

	void insert(UserInfo userinfo);
	
	UserInfo getById(@Param("id")String id);
}
