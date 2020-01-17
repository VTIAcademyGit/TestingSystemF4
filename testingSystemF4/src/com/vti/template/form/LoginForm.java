package com.vti.template.form;

/**
 * This class is login form.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 24, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 24, 2019
 */
public class LoginForm {

	private String account;
	private String password;

	/**
	 * Constructor for class LoginDto.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 24, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 24, 2019
	 * @param userName
	 * @param password
	 */
	public LoginForm(String userName, String password) {
		this.account = userName;
		this.password = password;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
