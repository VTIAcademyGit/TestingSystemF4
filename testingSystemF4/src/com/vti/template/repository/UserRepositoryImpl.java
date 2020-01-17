package com.vti.template.repository;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.util.StringUtils;
import com.vti.template.entity.User;
import com.vti.template.entity.view.UserView;
import com.vti.template.exception.ExceptionConstant;
import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.utils.jdbc.JdbcUtil;
import com.vti.template.utils.jdbc.SqlParameter;
import com.vti.template.utils.jdbc.SqlProcedureParameter;
import com.vti.template.utils.jdbc.SqlStatement;

/**
 * This class is implement student repository.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 7, 2019
 */
public class UserRepositoryImpl implements UserRepository {

	private JdbcUtil jdbc;

	/**
	 * Constructor for class LoginRepositoryImpl.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 24, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 24, 2019
	 */
	public UserRepositoryImpl() {
		jdbc = JdbcUtil.getInstance();
	}

	/**
	 * @return the jdbc
	 */
	private JdbcUtil getJdbc() {
		return jdbc;
	}

	/*
	 * @see com.vti.template.repository.LoginRepository#login(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public UserView login(String userName, String password) throws MyCustomSQLException {
		// init list parameters
		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, userName));
		params.add(new SqlParameter(2, password));

		try {
			// execute query
			ResultSet result = getJdbc().selectPreparationStatement(SqlStatement.SQL_LOGIN, params);
			
			// get result
			// if has any records
			if(result.next()){
				return new UserView(
						result.getString("Account"), 
						result.getString("FullName"),
						result.getString("Role"));
			}else{
				// if has not any records
				throw new MyCustomSQLException(
						ExceptionConstant.CODE_LOGIN_INCORRECT_ACCOUNT_OR_PASSWORD, 
						ExceptionConstant.MS_LOGIN_INCORRECT_ACCOUNT_OR_PASSWORD);
			}
				
		} catch (SQLException e) {
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_LOGIN, 
					e.getMessage());
		} finally {
			getJdbc().disconnect();
		}
	}
	
	/* 
	* @see com.vti.template.repository.UserRepository#getUserById(int)
	*/
	@Override
	public UserView getById(int id) throws MyCustomSQLException {
		try {
			SqlProcedureParameter sqlProcedureParameter = new SqlProcedureParameter();
			
			// add in parameter
			List<SqlProcedureParameter.In> inParams = new ArrayList<>();
			inParams.add(sqlProcedureParameter.new In("IN_ID", id));
			
			// add out parameter
			List<SqlProcedureParameter.Out> outParams = new ArrayList<>();
			outParams.add(sqlProcedureParameter.new Out("OUT_Account", Types.CHAR));
			outParams.add(sqlProcedureParameter.new Out("OUT_FullName", Types.NVARCHAR));
			outParams.add(sqlProcedureParameter.new Out("OUT_Role", Types.CHAR));
			
			// execute query
			CallableStatement callableStatement = getJdbc()
					.callProcedure(SqlStatement.SELECT_ALL_USER_BY_ID_PROCEDURE_NAME, inParams, outParams);
			
			// get result
			if(!StringUtils.isNullOrEmpty(callableStatement.getString("OUT_Account"))){
				return new UserView(
						callableStatement.getString("OUT_Account"),
						callableStatement.getString("OUT_FullName"),
						callableStatement.getString("OUT_Role"));
			}else{
				// if has not any records
				throw new MyCustomSQLException(
						ExceptionConstant.CODE_GET_USER_BY_ID_CANNOT_FIND_ID, 
						ExceptionConstant.MS_GET_USER_BY_ID_CANNOT_FIND_ID);
			}
		} catch (SQLException e) {	
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_GET_USER_BY_ID_COMMON_ERROR, 
					e.getMessage());
		} finally {
			getJdbc().disconnect();
		}
	}

	/* 
	* @see com.vti.template.repository.UserRepository#create(java.util.List)
	*/
	@Override
	public void create(List<User> entities) throws MyCustomSQLException {		
		// execute transaction
		try{
			getJdbc().beginTransaction();
				
			// execute list queries
			for(int i = 0; i < entities.size(); i ++){
				
				// init list parameters
				List<SqlParameter> params = new ArrayList<>();
				params.add(new SqlParameter(1, entities.get(i).getAccount()));
				params.add(new SqlParameter(2, entities.get(i).getPassword()));
				params.add(new SqlParameter(3, entities.get(i).getFullname()));
				params.add(new SqlParameter(4, entities.get(i).getRole()));
					
				try {
					// execute query
					int result = getJdbc().updatePreparationStatement(SqlStatement.SQL_CREATE_USER, params);
						
					// create fail
					if(result != 1){
						// rollback
						getJdbc().rollbackTransaction();
							
						throw new MyCustomSQLException(
									ExceptionConstant.CODE_COMMON_ERROR_THE_NUMBER_OF_ROWS_AFFECTED	,
									ExceptionConstant.MS_COMMON_ERROR_THE_NUMBER_OF_ROWS_AFFECTED + " && Index: " + i);
					}	
						
				} catch (SQLException e) {
					// rollback
					getJdbc().rollbackTransaction();
					
					throw new MyCustomSQLException(
							ExceptionConstant.CODE_CREATE_USER_COMMON_ERROR, 
							e.getMessage()+ " && Index: " + i);
				}
			}
				
			getJdbc().commitTransaction();	

		} finally {
			getJdbc().endTransaction();
			getJdbc().disconnect();
		}
	}

	/* 
	* @see com.vti.template.repository.UserRepository#exists(java.util.List)
	*/
	@Override
	public boolean exists(List<String> accounts) throws MyCustomSQLException {
		// init list parameters
		List<SqlParameter> params = new ArrayList<>();
		String questionmark = "(";
		for (int i = 0; i < accounts.size(); i++) {
			params.add(new SqlParameter(i + 1, accounts.get(i)));
			questionmark += "?,";
		}
		questionmark = questionmark.substring(0,questionmark.length() - 1) + ")";
		
		
		try {
			// execute query
			ResultSet result = getJdbc().selectPreparationStatement(SqlStatement.SQL_EXITS_USER_BY_LIST_ACCOUNT + questionmark, params);

			// get result
			return result.next();
			
		} catch (SQLException e) {	
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_EXISTS_NAME_STUDENT_COMMON_ERROR, 
					e.getMessage());
		} finally {
			getJdbc().disconnect();
		}
	}
}
