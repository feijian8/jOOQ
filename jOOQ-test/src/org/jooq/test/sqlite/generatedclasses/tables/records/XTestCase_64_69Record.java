/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 976591091;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
	}

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	/**
	 * Create an attached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record(org.jooq.Configuration configuration) {
		super(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, configuration);
	}
}
