package com.vti.template.service;

import java.util.ArrayList;
import java.util.List;

import com.vti.template.dto.LoginInformationDto;
import com.vti.template.dto.UserViewDto;
import com.vti.template.entity.User;
import com.vti.template.entity.view.UserView;
import com.vti.template.exception.ExceptionConstant;
import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.form.LoginForm;
import com.vti.template.form.Userform;
import com.vti.template.repository.UserRepository;
import com.vti.template.repository.UserRepositoryImpl;

/**
 * This class is implement User Service.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 7, 2019
 */
public class UserServiceImpl implements UserService {

	private UserRepository repository;

	/**
	 * Constructor for class UserServiceImpl.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 7, 2019
	 */
	public UserServiceImpl() {
		repository = new UserRepositoryImpl();
	}

	/*
	 * @see com.vti.template.service.LoginService#login(com.vti.template.dto.
	 * LoginDto)
	 */
	@Override
	public LoginInformationDto login(LoginForm dto) throws MyCustomSQLException {
		UserView entity = repository.login(dto.getAccount(), dto.getPassword());

		// convert entity to dto
		return new LoginInformationDto(entity);
	}

	/*
	 * @see com.vti.template.service.UserService#getById(int)
	 */
	@Override
	public UserViewDto getUserById(int id) throws MyCustomSQLException {
		return new UserViewDto(repository.getById(id));
	}

	/*
	 * @see com.vti.template.service.UserService#createListUser(java.util.List)
	 */
	@Override
	public void importListUser(List<Userform> forms) throws MyCustomSQLException {
		
		// extract list account from list forms
		List<String> accounts = new ArrayList<>();
		for (Userform form : forms) {
		    accounts.add(form.getAccount());
		}
		
		// if name exist then return business exception
		if (repository.exists(accounts)) {
			throw new MyCustomSQLException(ExceptionConstant.CODE_IMPORT_LIST_USER_EXISTS_ACCOUNT,
					ExceptionConstant.MS_IMPORT_LIST_USER_EXISTS_ACCOUNT);
		}

		// convert form to entity in order creating
		List<User> entities = new ArrayList<>(); 	
		for (Userform dto : forms) {
			entities.add(dto.toEntityCreate());
		}
		
		// create
		repository.create(entities);

	}
}
