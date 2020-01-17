package com.vti.template.dto;

import com.mysql.cj.util.StringUtils;
import com.vti.template.entity.view.UserView;

/**
 * This class is login dto.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 24, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 24, 2019
 */
public class UserViewDto {

	private String account;
	private String fullName;
	private String role;

	/**
	 * Constructor for converting entity to dto.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 24, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 24, 2019
	 */
	public UserViewDto(UserView user) {
		this.account = user.getAccount();
		this.fullName = user.getFullName();
		this.role = user.getRole();
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

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = "";
		if (!StringUtils.isNullOrEmpty(account)) {
			result += "Account: " + account + " ";
		}

		if (!StringUtils.isNullOrEmpty(fullName)) {
			result += "FullName: " + fullName + " ";
		}

		if (!StringUtils.isNullOrEmpty(role)) {
			result += "Role: " + role + " ";
		}

		return result;
	}

}
