/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class SystemRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.SystemRecord> {

	private static final long serialVersionUID = -1678252716;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.System.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.System.ID);
	}

	/**
	 * Create a detached SystemRecord
	 */
	public SystemRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.System.SYSTEM);
	}

	/**
	 * Create an attached SystemRecord
	 * @deprecated - (#363) use the other constructor instead
	 */
	@Deprecated
	public SystemRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.System.SYSTEM, configuration);
	}
}
