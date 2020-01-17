package com.vti.template.entity.view;

/**
 * This class is login view.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 24, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 24, 2019
 */
public class UserView {

	private String account;
	private String fullName;
	private String role;

	/**
	 * Constructor for class Logining.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 24, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 24, 2019
	 * @param account
	 * @param fullName
	 * @param role
	 */
	public UserView(String account, String fullName, String role) {
		this.account = account;
		this.fullName = fullName;
		this.role = role;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

}
