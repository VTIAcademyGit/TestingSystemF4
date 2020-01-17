package com.vti.template.service;

import java.util.List;

import com.vti.template.dto.LoginInformationDto;
import com.vti.template.dto.UserViewDto;
import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.form.LoginForm;
import com.vti.template.form.Userform;

/**
 * This class is login service.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 7, 2019
 */
public interface UserService {

	/**
	 * This method is login.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 24, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 24, 2019
	 * @param dto
	 * @return
	 */
	public LoginInformationDto login(LoginForm dto) throws MyCustomSQLException;

	/**
	 * This method get user by id .
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
	public UserViewDto getUserById(int id) throws MyCustomSQLException;
	
	/**
	 * This method is imported list of user form. 
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 14, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 14, 2020
	 * @param forms
	 * @throws MyCustomSQLException
	 */
	public void importListUser(List<Userform> forms) throws MyCustomSQLException; 

}
