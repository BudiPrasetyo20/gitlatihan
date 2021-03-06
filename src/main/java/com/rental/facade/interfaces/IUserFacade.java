package com.rental.facade.interfaces;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface IUserFacade<T> {
	
	public void save(T entity);
	public void update(T entity);
	public void delete(T entity);
	public void findBykey(Object object);
	public List<T> find(DetachedCriteria detachedCriteria) throws Exception;
	

}
