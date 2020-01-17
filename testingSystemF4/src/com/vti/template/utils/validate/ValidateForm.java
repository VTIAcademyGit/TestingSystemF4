package com.vti.template.utils.validate;

import java.util.List;

import com.vti.template.exception.ExceptionConstant;
import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.form.LoginForm;
import com.vti.template.form.Userform;

/**
 * This class uses for validating form.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 24, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 24, 2019
 */
public class ValidateForm {

	/**
	 * This method is validate login form.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 24, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 24, 2019
	 * @param form
	 *            - login form
	 */
	public void isValidateLoginForm(LoginForm form) throws MyCustomSQLException {

		if (null == form) {
			throw new MyCustomSQLException(
					ExceptionConstant.ValidateForm.CODE_VALIDATE_FORM_EMPTY,
					ExceptionConstant.ValidateForm.MS_VALIDATE_FORM_EMPTY);
		}

		Validate.isEmail(form.getAccount());

		Validate.isPassword(form.getPassword());
	}
	
	/**
	 * This method is validate Import List User Form.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 24, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 24, 2019
	 * @param forms
	 *            - list user forms
	 */
	public void isValidateImportListUserForm(List<Userform> forms) throws MyCustomSQLException {
		// TODO
	}

}
