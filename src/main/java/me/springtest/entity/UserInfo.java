package me.springtest.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserInfo {
	
	private String id;
	@NotNull(message="{userinfo.name}")
	@Size(min=5,max=100)
	private String name;

	private Integer age;
	@NotNull(message="12121212121212121")
	@Size(min=5,max=100)
	private String pwd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", age=" + age
				+ ", pwd=" + pwd + "]";
	}
	
	
}
