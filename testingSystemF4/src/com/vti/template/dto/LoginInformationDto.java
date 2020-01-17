package com.vti.template.dto;

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
public class LoginInformationDto {

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
	public LoginInformationDto(UserView user) {
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

}
