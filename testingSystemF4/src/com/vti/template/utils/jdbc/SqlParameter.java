package com.vti.template.utils.jdbc;

/**
 * This class is model of 1 param in statement query.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 7, 2019
 */
public class SqlParameter {

	private int index;
	private Object values;

	/**
	 * Constructor for class SqlParameter.
	 * 
	 * @Description: .
	 * @author: CTAnh
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: CTAnh
	 * @modifer_date: Dec 7, 2019
	 * @param number
	 *            - number of field
	 * @param values
	 *            - value for field
	 */
	public SqlParameter(int number, Object values) {
		this.index = number;
		this.values = values;
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @return the values
	 */
	public Object getValues() {
		return values;
	}

}
