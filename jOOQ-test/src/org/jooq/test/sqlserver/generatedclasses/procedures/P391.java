/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class P391 extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = 1573448040;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> I1 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("i1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> IO1 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("io1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> O1 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("o1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> O2 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("o2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> IO2 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("io2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> I2 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("i2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new procedure call instance
	 */
	public P391() {
		super(org.jooq.SQLDialect.SQLSERVER, "p391", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);

		addInParameter(I1);
		addInOutParameter(IO1);
		addInOutParameter(O1);
		addInOutParameter(O2);
		addInOutParameter(IO2);
		addInParameter(I2);
	}

	public void setI1(java.lang.Integer value) {
		setValue(I1, value);
	}

	public void setIo1(java.lang.Integer value) {
		setValue(IO1, value);
	}

	public void setO1(java.lang.Integer value) {
		setValue(O1, value);
	}

	public void setO2(java.lang.Integer value) {
		setValue(O2, value);
	}

	public void setIo2(java.lang.Integer value) {
		setValue(IO2, value);
	}

	public void setI2(java.lang.Integer value) {
		setValue(I2, value);
	}

	public java.lang.Integer getIo1() {
		return getValue(IO1);
	}

	public java.lang.Integer getO1() {
		return getValue(O1);
	}

	public java.lang.Integer getO2() {
		return getValue(O2);
	}

	public java.lang.Integer getIo2() {
		return getValue(IO2);
	}
}
