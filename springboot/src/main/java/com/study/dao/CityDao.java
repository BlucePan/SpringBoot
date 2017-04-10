package com.study.dao;

import java.util.List;


import org.apache.ibatis.annotations.Select;

import com.study.BaseDao;
import com.study.model.City;
public interface CityDao extends BaseDao {
	
	    @Select("select * from city")
	    public List<City> getAll();

}
