package com.vti.template.exception;

/**
 * This class is constant using for exception.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Jan 10, 2020
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Jan 10, 2020
 */
public class ExceptionConstant {

	/**
	 * This class is constant for validating form.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 10, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 10, 2020
	 */
	public class ValidateForm {
		// form login
		public static final String MS_VALIDATE_FORM_EMPTY = "all the fields in form must not be empty";
		public static final int CODE_VALIDATE_FORM_EMPTY = 10000;

		// email
		public static final String MS_VALIDATE_EMAIL_EMPTY = "Email must not be empty";
		public static final int CODE_VALIDATE_EMAIL_EMPTY = 10001;

		public static final String MS_VALIDATE_EMAIL_MAX_AND_MIN_LENGTH = "Email must has 6 to 30 characters";
		public static final int CODE_VALIDATE_EMAIL_MAX_AND_MIN_LENGTH = 10002;

		public static final String MS_VALIDATE_EMAIL_RULE = "Email must has 6 to 30 characters and include @, lower, upper characters, ...";
		public static final int CODE_VALIDATE_EMAIL_RULE = 10003;

		// password
		public static final String MS_VALIDATE_PASSWORD_EMPTY = "Password must not be empty";
		public static final int CODE_VALIDATE_PASSWORD_EMPTY = 10004;

		// phone
		public static final String MS_VALIDATE_PHONE_EMPTY = "Phone number must not be empty";
		public static final int CODE_VALIDATE_PHONE_EMPTY = 10005;

		public static final String MS_VALIDATE_PHONE_MAX_AND_MIN_LENGTH = "Phone number must has 9 to 11 numbers";
		public static final int CODE_VALIDATE_PHONE_MAX_AND_MIN_LENGTH = 10006;

		public static final String MS_VALIDATE_PHONE_RULE = "Phone number must has 9 to 11 numbers and include 0-9";
		public static final int CODE_VALIDATE_PHONE_RULE = 10007;
	}

	// *********Common Error***********
	public static final String MS_COMMON_ERROR_THE_NUMBER_OF_ROWS_AFFECTED = "The number of rows affected is greater than 1";
	public static final int CODE_COMMON_ERROR_THE_NUMBER_OF_ROWS_AFFECTED = 0;

	// login
	public static final String MS_LOGIN = "1 error found while login";
	public static final int CODE_LOGIN = 1;
	
	// get all User
	public static final String MS_GET_USER_BY_ID_COMMON_ERROR = "1 error found while getting user by id";
	public static final int CODE_GET_USER_BY_ID_COMMON_ERROR = 9;

	// create list user
	public static final String MS_IMPORT_LIST_USER_COMMON_ERROR = "1 error found while importting list user";
	public static final int CODE_IMPORT_LIST_USER_COMMON_ERROR = 10;
	
	// get all student
	public static final String MS_SELECT_ALL_STUDENT_COMMON_ERROR = "1 error found while selecting student";
	public static final int CODE_GET_ALL_STUDENT_COMMON_ERROR = 2;

	// get student by ID
	public static final String MS_GET_STUDENT_BY_ID_COMMON_ERROR = "1 error found while getting student by id";
	public static final int CODE_GET_STUDENT_BY_ID_COMMON_ERROR = 3;

	// create Student
	public static final String MS_CREATE_STUDENT_COMMON_ERROR = "1 error found while creating student";
	public static final int CODE_CREATE_STUDENT_COMMON_ERROR = 4;

	// update Student
	public static final String MS_UPDATE_STUDENT_COMMON_ERROR = "1 error found while updating student";
	public static final int CODE_UPDATE_STUDENT_COMMON_ERROR = 5;

	// delete Student
	public static final int CODE_DELETE_STUDENT_COMMON_ERROR = 6;
	public static final String MS_DELETE_STUDENT_COMMON_ERROR = "1 error found while deleting student";

	// exists
	public static final int CODE_EXISTS_ID_STUDENT_COMMON_ERROR = 7;
	public static final String MS_EXISTS_ID_STUDENT_COMMON_ERROR = "1 error found while checking exists student";

	public static final int CODE_EXISTS_NAME_STUDENT_COMMON_ERROR = 8;
	public static final String MS_EXISTS_NAME_STUDENT_COMMON_ERROR = "1 error found while checking exists student";

	// *********Function***********
	// login
	public static final int CODE_LOGIN_INCORRECT_ACCOUNT_OR_PASSWORD = 1000;
	public static final String MS_LOGIN_INCORRECT_ACCOUNT_OR_PASSWORD = "Login failure! Incorrect account or password";

	public static final String MS_GET_USER_BY_ID_CANNOT_FIND_ID = "Cannot find any User's ID similar to input ID";
	public static final int CODE_GET_USER_BY_ID_CANNOT_FIND_ID = 1005;
	
	// create Student
	public static final String MS_CREATE_STUDENT_EXISTS = "Create failure! Exist Student with same name.";
	public static final int CODE_CREATE_STUDENT_EXISTS = 1001;

	// get student by id
	public static final String MS_GET_STUDENT_BY_ID_CANNOT_FIND_ID = "Cannot find any Student's ID similar to input ID";
	public static final int CODE_GET_STUDENT_BY_ID_CANNOT_FIND_ID = 1002;

	// update Student
	public static final String MS_UPDATE_STUDENT_NOT_EXISTS = "Update failure! Not Exist Student's ID.";
	public static final int CODE_UPDATE_STUDENT_NOT_EXISTS = 1003;

	// delete Student
	public static final String MS_DELETE_STUDENT_NOT_EXISTS = "Delete failure! Not Exist Student's ID.";
	public static final int CODE_DELETE_STUDENT_NOT_EXISTS = 1004;
	
	// create user
	public static final String MS_CREATE_USER_COMMON_ERROR = "1 error found while creating user";
	public static final int CODE_CREATE_USER_COMMON_ERROR = 4;
	
	public static final String MS_IMPORT_LIST_USER_EXISTS_ACCOUNT = "Create failure! Exist User with same name.";
	public static final int CODE_IMPORT_LIST_USER_EXISTS_ACCOUNT = 1006;

}
