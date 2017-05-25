package me.springtest.entity;

public class UserInfo {
	
	private String id;
	
	private String name;
	
	private Integer age;
	
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
