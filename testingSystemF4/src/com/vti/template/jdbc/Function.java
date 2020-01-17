//
package com.vti.template.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.template.controller.UserController;
import com.vti.template.dto.LoginInformationDto;
import com.vti.template.form.LoginForm;
import com.vti.template.form.Userform;
import com.vti.template.utils.Constant;
import com.vti.template.utils.ScannerUtil;

/**
 * This class is all functions of program.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 29, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 29, 2019
 */
public class Function {

	
	
	private UserController userController;

	/**
	 * Constructor for class Function.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 8, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 8, 2020
	 */
	public Function() {
		
		userController = new UserController();
	}

	/**
	 * This method is used login .
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 10, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 10, 2020
	 */
	public void login() {
		// demo login
		Scanner scanner = new Scanner(System.in);
		
		// input
		LoginForm loginForm = null;
		System.out.println("********* Demo Login *********");
		while (true) {
			// input account
			System.out.println("Inputting Account: ");
			String account = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);

			// input password
			System.out.println("Inputting Password: ");
			String password = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);

			// convert to Object LoginForm
			loginForm = new LoginForm(account, password);

			// request login
			LoginInformationDto loginInformationDto = userController.login(loginForm);

			// get result
			if (null != loginInformationDto) {
				System.out.println("Login success!");

				if ("Admin".equals(loginInformationDto.getRole())) {
					System.out.println("Welcome Admin!");
				} else if ("Teacher".equals(loginInformationDto.getRole())) {
					System.out.println("Welcome Teacher " + loginInformationDto.getFullName() + "!");
				} else {
					System.out.println("Welcome Student " + loginInformationDto.getFullName() + "!");
				}
				// break while
				break;
			} else {
				System.out.println("Please! input again!");
			}
		}

		System.out.println("Home Page");
	}


	/**
	 * This method gets all the users .
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 8, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 8, 2020
	 */
	public void getUserByID() {
		// get by ID
		System.out.println("\n\n\n**********************************");
		System.out.println("Get User By ID");

		System.out.println(userController.getUserById(3));
	}
	

	/**
	 * This method import list user.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Jan 8, 2020
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Jan 8, 2020
	 */
	public void importListUser() {
		// create
		System.out.println("\n\n\n**********************************");
		System.out.println("Create List User");

		Userform user1 = new Userform("anh.cantuan@vti.com.vn", "ctanh", "Cấn Tuấn Anh", "Student");
		Userform user2 = new Userform("hanh.havan@vti.com.vn", "hvhanh", "Hà Văn Hanh", "Student");
		Userform user3 = new Userform("a.nguyenvan@vti.com.vn", "nva", "Nguyễn Văn A", "Student");
		
		List<Userform> userForms = new ArrayList<>();
		userForms.add(user1);
		userForms.add(user2);
		userForms.add(user3);
		
		userController.importListUser(userForms);
	}
}
