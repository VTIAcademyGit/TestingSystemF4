package com.vti.template.controller;

import java.util.List;

import com.vti.template.dto.LoginInformationDto;
import com.vti.template.dto.UserViewDto;
import com.vti.template.exception.ExceptionConstant;
import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.form.LoginForm;
import com.vti.template.form.Userform;
import com.vti.template.service.UserService;
import com.vti.template.service.UserServiceImpl;
import com.vti.template.utils.validate.ValidateForm;

/**
 * This class is User controller.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 7, 2019
 */
public class UserController {

	private UserService service;
	private ValidateForm validate;

	/**
	 * Constructor for class UserController.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 7, 2019
	 */
	public UserController() {
		service = new UserServiceImpl();
		validate = new ValidateForm();
	}

	/**
	 * This method login to system.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 7, 2019
	 * @param form
	 *            - LoginDto
	 */
	public LoginInformationDto login(LoginForm form) {
		try {
			validate.isValidateLoginForm(form);
			return service.login(form);

		} catch (MyCustomSQLException e) {
			System.out.println("Code Exception Login: " + e.getCode());
			if (e.getCode() > 100) {
				System.out.println("Message Exception Login: " + e.getMessage());
			} else {
				System.out.println("Message Exception Login: " + ExceptionConstant.MS_LOGIN);
				System.out.println("Detail messgage: " + e.getMessage());
			}
			return null;
		}
	}
	
	/**
	 * This method is got user by input id.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 7, 2019
	 * @return UserViewDto
	 */
	public UserViewDto getUserById(int id) {
		try {
			return service.getUserById(id);

		} catch (MyCustomSQLException e) {
			System.out.println("Code Exception Get User By ID: " + e.getCode());
			if (e.getCode() > 100) {
				System.out.println("Message Exception Get User By ID: " + e.getMessage());
			} else {
				System.out.println(
						"Message Exception Get User By ID: " + ExceptionConstant.MS_GET_USER_BY_ID_COMMON_ERROR);
				System.out.println("Detail messgage: " + e.getMessage());
			}
			return null;
		}
	}
	
	/**
	 * This method is imported list user.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 7, 2019
	 * @param List<UserDto>
	 */
	public void importListUser(List<Userform> forms){
		try {
			validate.isValidateImportListUserForm(forms);
			service.importListUser(forms);
			System.out.println("Import success!");
			
		} catch (MyCustomSQLException e) {
			System.out.println("Code Exception Import List User: " + e.getCode());
			if (e.getCode() > 100) {
				System.out.println("Message Exception Import List User: " + e.getMessage());
			} else {
				System.out.println(
						"Message Exception Import List User: " + ExceptionConstant.MS_IMPORT_LIST_USER_COMMON_ERROR);
				System.out.println("Detail messgage: " + e.getMessage());
			}
		}
	}
}
