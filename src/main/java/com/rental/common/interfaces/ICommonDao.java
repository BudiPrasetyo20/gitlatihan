package com.rental.common.interfaces;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

public interface ICommonDao<T> {
	
	public Session getActiveSession();
	public void save(T entity);
	public void update(T entity);
	public void delete(T entity);
	public void findBykey(Object object);
	public List<T> find(DetachedCriteria detachedCriteria) throws Exception;

}
