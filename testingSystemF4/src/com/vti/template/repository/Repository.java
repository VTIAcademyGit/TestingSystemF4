//
package com.vti.template.repository;

import java.util.List;

import com.vti.template.exception.MyCustomSQLException;

/**
 * This class is base of repository with CRUD.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 7, 2019
 */
public interface Repository<T> {

	/**
	 * This method use for getting all the entity. 
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 15, 2020
	 * @return List<Entity>
	 * @throws MyCustomSQLException
	 */
	public List<T> getAll() throws MyCustomSQLException;

	/**
	 * This method use for getting entity by id. 
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 15, 2020
	 * @param id
	 * @return entity
	 * @throws MyCustomSQLException
	 */
	public T getByID(int id) throws MyCustomSQLException;

	/**
	 * This method use for creating entity . 
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 15, 2020
	 * @param entity
	 * @throws MyCustomSQLException
	 */
	public void create(T entity) throws MyCustomSQLException;

	/**
	 * This method use for updating entity . 
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 15, 2020
	 * @param entity
	 * @throws MyCustomSQLException
	 */
	public void update(T entity) throws MyCustomSQLException;

	/**
	 * This method use for deleting entity . 
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 15, 2020
	 * @param id
	 * @throws MyCustomSQLException
	 */
	public void delete(int id) throws MyCustomSQLException;

	/**
	 * This method is checked entity exists by id. 
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 15, 2020
	 * @param id
	 * @return
	 * @throws MyCustomSQLException
	 */
	public boolean exists(int id) throws MyCustomSQLException;
}
