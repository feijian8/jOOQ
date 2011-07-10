/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ansi.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class ReferentialConstraintsRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.ansi.information_schema.tables.records.ReferentialConstraintsRecord> {

	private static final long serialVersionUID = 179257277;

	/**
	 * An uncommented item
	 */
	public void setConstraintCatalog(java.lang.String value) {
		setValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.CONSTRAINT_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintCatalog() {
		return getValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.CONSTRAINT_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintSchema(java.lang.String value) {
		setValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.CONSTRAINT_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintSchema() {
		return getValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.CONSTRAINT_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintName(java.lang.String value) {
		setValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintName() {
		return getValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.CONSTRAINT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueConstraintCatalog(java.lang.String value) {
		setValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.UNIQUE_CONSTRAINT_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getUniqueConstraintCatalog() {
		return getValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.UNIQUE_CONSTRAINT_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueConstraintSchema(java.lang.String value) {
		setValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.UNIQUE_CONSTRAINT_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getUniqueConstraintSchema() {
		return getValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.UNIQUE_CONSTRAINT_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueConstraintName(java.lang.String value) {
		setValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.UNIQUE_CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getUniqueConstraintName() {
		return getValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.UNIQUE_CONSTRAINT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setMatchOption(java.lang.String value) {
		setValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.MATCH_OPTION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getMatchOption() {
		return getValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.MATCH_OPTION);
	}

	/**
	 * An uncommented item
	 */
	public void setUpdateRule(java.lang.String value) {
		setValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.UPDATE_RULE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getUpdateRule() {
		return getValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.UPDATE_RULE);
	}

	/**
	 * An uncommented item
	 */
	public void setDeleteRule(java.lang.String value) {
		setValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.DELETE_RULE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDeleteRule() {
		return getValue(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.DELETE_RULE);
	}

	/**
	 * Create a detached ReferentialConstraintsRecord
	 */
	public ReferentialConstraintsRecord() {
		super(org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS);
	}
}
