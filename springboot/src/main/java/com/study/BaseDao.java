package com.study;

import java.util.List;
import java.util.Map;

public interface BaseDao {

	/**
	 * ����dao�ӿڣ�ʵ�ֻ�������ɾ�Ĳ�
	 * @param <T>
	 * @param map
	 * @return
	 */
public <T> List<T> findByPage(Map<?, ?> map);
	
	public int getCount(Map<?, ?> map);  
	
	public <T> List<T> queryAll(Object obj);
	
	public <T> Object queryEntityById(Integer id);
	
	public void addEntity(Object obj);
	
	public void deleteEntity(String id);
	
	public void editEntity(Object obj);
	
	public <T> Object queryEntity(Object obj);
}
