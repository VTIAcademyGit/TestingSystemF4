package com.vti.template.utils.jdbc;

/**
 * This class is contain sql statement
 * 
 * @author CTAnh
 * @version 1.0
 * @Date Oct 31, 2017
 */
public class SqlStatement {
	
	 // login
	 public static final String SQL_LOGIN = 
		      "SELECT 	`Account`, `FullName`, `Role` "
		      + "FROM 	`User` "
		      + "WHERE 	`Account` = ? AND `Password` = ?";
	
	 // user
	 public static final String SELECT_ALL_USER_BY_ID_PROCEDURE_NAME = "call getUserById(?, ?, ?, ?)";
	 
	 public static final String SQL_CREATE_USER = 
		      "INSERT INTO 	User (Account, Password, FullName, Role) " 
		      + "VALUES 			(?, ?, ?, ?)";
	 
	  public static final String SQL_EXITS_USER_BY_LIST_ACCOUNT = 
		      "SELECT 	1 "
		      + "FROM 	User "
		      + "WHERE 	Account IN ";
	  
	 // student
	 public static final String SELECT_ALL_STUDENT = 
		      "SELECT 	RN, Name, Age, Gender, Password "
		      + "FROM 	Student";
	 
	  public static final String SQL_GET_BY_ID_STUDENT = 
		      "SELECT 	RN, Name, Age, Gender, Password "
		      + "FROM 	Student "
		      + "WHERE 	RN = ?";
	 
	 public static final String SQL_CREATE_STUDENT = 
		      "INSERT INTO 	Student (Name, Age, Gender, Password) " 
		      + "VALUES 			(?, ?, ?, ?)";
	 
	 public static final String SQL_UPDATE_STUDENT = 
		      "UPDATE 	Student " 
		      + "SET	Name = ?, Age = ?, `Password` = ? "
		      + "WHERE 	RN = ?";
	 
	 public static final String SQL_DELETE_STUDENT = 
		      "DELETE " 
		      + "FROM	Student "
		      + "WHERE 	RN = ?";
	 
	  public static final String SQL_EXITS_STUDENT_BY_ID = 
		      "SELECT 	RN, Name, Age, Gender, Password "
		      + "FROM 	Student "
		      + "WHERE 	RN = ?";
	 
	  public static final String SQL_EXITS_STUDENT_BY_NAME = 
		      "SELECT 	RN, Name, Age, Gender, Password "
		      + "FROM 	Student "
		      + "WHERE 	Name = ?";
}
