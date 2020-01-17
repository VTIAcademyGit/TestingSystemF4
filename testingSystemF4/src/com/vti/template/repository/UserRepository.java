package com.vti.template.repository;

import java.util.List;

import com.vti.template.entity.User;
import com.vti.template.entity.view.UserView;
import com.vti.template.exception.MyCustomSQLException;

/**
 * This class is repository for logining.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 7, 2019
 */
public interface UserRepository {

	/**
	 * This method is used for login.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 10, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 10, 2020
	 * @param userName
	 * @param password
	 * @return
	 * @throws MyCustomSQLException
	 */
	public UserView login(String userName, String password) throws MyCustomSQLException;

	/**
	 * This method gets user by id .
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 13, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 13, 2020
	 * @param id
	 * @return
	 * @throws MyCustomSQLException
	 */
	public UserView getById(int id) throws MyCustomSQLException;
	
	/**
	 * This method is created list of user entity. 
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 14, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 14, 2020
	 * @param entities
	 * @throws MyCustomSQLException
	 */
	public void create(List<User> entities) throws MyCustomSQLException; 
	
	/**
	 * This method is checked user exists by user's account. 
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 15, 2020
	 * @param accounts
	 * @return
	 * @throws MyCustomSQLException
	 */
	public boolean exists(List<String> accounts) throws MyCustomSQLException;
}
