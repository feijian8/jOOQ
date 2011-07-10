/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ansi.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TableConstraints extends org.jooq.impl.TableImpl<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord> {

	private static final long serialVersionUID = 1979519092;

	/**
	 * The singleton instance of TABLE_CONSTRAINTS
	 */
	public static final org.jooq.util.ansi.information_schema.tables.TableConstraints TABLE_CONSTRAINTS = new org.jooq.util.ansi.information_schema.tables.TableConstraints();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord> __RECORD_TYPE = org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String>("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String>("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String>("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_TYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String>("CONSTRAINT_TYPE", org.jooq.impl.SQLDataType.VARCHAR, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String> TABLE_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String>("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String> TABLE_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String>("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String> TABLE_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String>("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String> IS_DEFERRABLE = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String>("IS_DEFERRABLE", org.jooq.impl.SQLDataType.VARCHAR, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String> INITIALLY_DEFERRED = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.TableConstraintsRecord, java.lang.String>("INITIALLY_DEFERRED", org.jooq.impl.SQLDataType.VARCHAR, TABLE_CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private TableConstraints() {
		super("TABLE_CONSTRAINTS", org.jooq.util.ansi.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}
