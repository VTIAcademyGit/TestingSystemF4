//
package com.vti.template.entity;

/**
 * This class is entity of user.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Jan 14, 2020
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Jan 14, 2020
 */
public class User {
	private int id;
	private String account;
	private String password;
	private String fullname;
	private String role;

	/**
	 * @param id
	 *            the id to set
	 */
	public User setId(int id) {
		this.id = id;
		return this;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public User setAccount(String account) {
		this.account = account;
		return this;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public User setPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * @param fullname
	 *            the fullname to set
	 */
	public User setFullname(String fullname) {
		this.fullname = fullname;
		return this;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public User setRole(String role) {
		this.role = role;
		return this;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
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

}
