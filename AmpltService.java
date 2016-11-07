package com.sds.anyframe.mobile.amplt.rest.service;

import java.util.List;

import com.sds.anyframe.mobile.amplt.rest.vo.RequestVO;

public interface AmpltService<T> {
	public List<T> getEntities();
	
	public RequestVO<T> createEntity(T entity);
	
	public T getEntity(String id);
	
	public RequestVO<T> updateEntity(T entity);
	
	public RequestVO<T> deleteEntity(String id);
	
	public RequestVO<T> deleteEntities(String[] ids);
}
