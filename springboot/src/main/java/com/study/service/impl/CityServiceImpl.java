package com.study.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.study.dao.CityDao;
import com.study.model.City;
import com.study.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	@Resource
	private CityDao cityDao;

	public List<City> queryAll(City city) {
	   List<City> cityList=cityDao.getAll();
		return cityList;
	}	
	
}
