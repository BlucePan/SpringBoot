package com.study.model;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 3112656562961695336L;
	private String id;
	private String name;
	private Integer age;
	private String createTime;
	

	public String getId() {
		return id;
	}public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getCreateTime() {
		return createTime;
	}public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return id + "\t"+ name + "\t"+ age+"\t"+createTime;
	}
	

}
