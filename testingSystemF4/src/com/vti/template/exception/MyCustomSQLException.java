package com.vti.template.exception;

/**
 * This class is custom Exception.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Jan 10, 2020
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Jan 10, 2020
 */
public class MyCustomSQLException extends Exception {

	//
	private static final long serialVersionUID = 1L;
	private int code;
	private String message;

	/**
	 * Constructor for class MyCustomSQLException.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 10, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 10, 2020
	 * @param message
	 */
	public MyCustomSQLException(String message) {
		this.message = message;
	}

	/**
	 * Constructor for class MyCustomSQLException.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 10, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 10, 2020
	 * @param code
	 * @param message
	 */
	public MyCustomSQLException(int code, String message) {
		this.message = message;
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @return the reason
	 */
	@Override
	public String getMessage() {
		return message;
	}

}
