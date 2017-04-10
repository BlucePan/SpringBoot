package com.study.model;

import java.io.Serializable;

public class City implements Serializable {
	private static final long serialVersionUID = 1884055695000636648L;
	
	private Integer id;
	private String provinceId;
	private String cityName;
	private String description;
	
	public Integer getId() {
		return id;
	}public void setId(Integer id) {
		this.id = id;
	}
	
	public String getProvinceId() {
		return provinceId;
	}public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	
	public String getCityName() {
		return cityName;
	}public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getDescription() {
		return description;
	}public void setDescription(String description) {
		this.description = description;
	}
	
}
