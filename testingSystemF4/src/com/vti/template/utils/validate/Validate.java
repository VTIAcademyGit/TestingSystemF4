package com.vti.template.utils.validate;

import com.mysql.cj.util.StringUtils;
import com.vti.template.exception.ExceptionConstant;
import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.utils.Constant;
import com.vti.template.utils.MethodUtil;

/**
 * This class uses for validating field .
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 6, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 6, 2019
 */
public class Validate {

	/**
	 * This method is check validate email.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 6, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 6, 2019
	 * @param input
	 *            - input from user
	 */
	public static void isEmail(final String input) throws MyCustomSQLException{
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			throw new MyCustomSQLException(
					ExceptionConstant.ValidateForm.CODE_VALIDATE_EMAIL_EMPTY,
					ExceptionConstant.ValidateForm.MS_VALIDATE_EMAIL_EMPTY);
		}

		// max length, min length
		if (!isSatisfyMaxLength(input, 30) || !isSatisfyMinLength(input, 6)) {
			throw new MyCustomSQLException(
					ExceptionConstant.ValidateForm.CODE_VALIDATE_EMAIL_MAX_AND_MIN_LENGTH,
					ExceptionConstant.ValidateForm.MS_VALIDATE_EMAIL_MAX_AND_MIN_LENGTH);
		}

		// regular expression
		boolean result = MethodUtil.checkRegularExpression(input, Constant.PATTERN_EMAIL);
		if (!result) {
			throw new MyCustomSQLException(
					ExceptionConstant.ValidateForm.CODE_VALIDATE_EMAIL_RULE,
					ExceptionConstant.ValidateForm.MS_VALIDATE_EMAIL_RULE);
		}
	}

	/**
	 * This method is check validate email.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 6, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 6, 2019
	 * @param input
	 *            - input from user
	 */
	public static void isPassword(final String input) throws MyCustomSQLException{
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			throw new MyCustomSQLException(
					ExceptionConstant.ValidateForm.CODE_VALIDATE_EMAIL_EMPTY,
					ExceptionConstant.ValidateForm.MS_VALIDATE_EMAIL_EMPTY);
		}
	}

	/**
	 * This method is check validate phone.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 6, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 6, 2019
	 * @param input
	 *            - input from user
	 */
	public static void isPhone(final String input) throws MyCustomSQLException{
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			throw new MyCustomSQLException(
					ExceptionConstant.ValidateForm.CODE_VALIDATE_PHONE_EMPTY,
					ExceptionConstant.ValidateForm.MS_VALIDATE_PHONE_EMPTY);
		}

		// max length, min length
		if (!isSatisfyMaxLength(input, 11) || !isSatisfyMinLength(input, 9)) {
			throw new MyCustomSQLException(
					ExceptionConstant.ValidateForm.CODE_VALIDATE_PHONE_MAX_AND_MIN_LENGTH,
					ExceptionConstant.ValidateForm.MS_VALIDATE_PHONE_MAX_AND_MIN_LENGTH);
		}

		// regular expression
		boolean result = MethodUtil.checkRegularExpression(input, Constant.PATTERN_PHONE);
		if (!result) {
			throw new MyCustomSQLException(
					ExceptionConstant.ValidateForm.CODE_VALIDATE_PHONE_RULE,
					ExceptionConstant.ValidateForm.MS_VALIDATE_PHONE_RULE);
		}
	}

	/**
	 * This method validate max length of String .
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 24, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 24, 2019
	 * @param input
	 *            - input String
	 * @param maxLength
	 *            - Max length of String
	 * @return boolean
	 */
	public static boolean isSatisfyMaxLength(String input, int maxLength) {
		if (!StringUtils.isNullOrEmpty(input) && input.length() <= maxLength) {
			return true;
		}
		return false;
	}

	/**
	 * This method validate min length of String .
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 24, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 24, 2019
	 * @param input
	 *            - input String
	 * @param minLength
	 *            - Min length of String
	 * @return boolean
	 */
	public static boolean isSatisfyMinLength(String input, int minLength) {
		if (!StringUtils.isNullOrEmpty(input) && input.length() >= minLength) {
			return true;
		}
		return false;
	}
}
