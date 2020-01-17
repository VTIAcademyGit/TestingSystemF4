package com.vti.template.form;

import com.vti.template.entity.User;

/**
 * This class is user form.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Jan 15, 2020
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Jan 15, 2020
 */
public class Userform {

	private String account;
	private String password;
	private String fullname;
	private String role;

	/**
	 * Constructor for class UserForm.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 15, 2020
	 * @param account
	 * @param password
	 * @param fullname
	 * @param role
	 */
	public Userform(String account, String password, String fullname, String role) {
		this.account = account;
		this.password = password;
		this.fullname = fullname;
		this.role = role;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * This method convert form to entity in order to create.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 13, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 13, 2019
	 * @return entity
	 */
	public User toEntityCreate() {
		return new User()
				.setAccount(account)
				.setFullname(fullname)
				.setPassword(password)
				.setRole(role);
	}

}
