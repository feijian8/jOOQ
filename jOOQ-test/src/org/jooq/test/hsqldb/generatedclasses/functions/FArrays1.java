/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.functions;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class FArrays1 extends org.jooq.impl.StoredFunctionImpl<java.lang.Integer[]> {

	private static final long serialVersionUID = 2006419085;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer[]> IN_ARRAY = new org.jooq.impl.ParameterImpl<java.lang.Integer[]>("IN_ARRAY", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

	/**
	 * Create a new function call instance
	 */
	public FArrays1() {
		super(org.jooq.SQLDialect.HSQLDB, "F_ARRAYS1", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 */
	public void setInArray(java.lang.Integer[] value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setInArray(org.jooq.Field<java.lang.Integer[]> field) {
		setField(IN_ARRAY, field);
	}
}
