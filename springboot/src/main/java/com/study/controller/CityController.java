package com.study.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.model.City;
import com.study.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Resource
	private CityService cityService;
	
	@RequestMapping("/study")
	@ResponseBody
	public String getAll(){
		City city=new City();
		List<City> cityList=cityService.queryAll(city);
		
		return  "-----Ò»¹²ÓÐ£º----"+cityList.size();
	}
	
}
