/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ansi.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class Columns extends org.jooq.impl.TableImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord> {

	private static final long serialVersionUID = -754109616;

	/**
	 * The singleton instance of COLUMNS
	 */
	public static final org.jooq.util.ansi.information_schema.tables.Columns COLUMNS = new org.jooq.util.ansi.information_schema.tables.Columns();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord> __RECORD_TYPE = org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> COLUMN_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long> ORDINAL_POSITION = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long>("ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> COLUMN_DEFAULT = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_NULLABLE = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("IS_NULLABLE", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> DATA_TYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long> CHARACTER_MAXIMUM_LENGTH = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long>("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long> CHARACTER_OCTET_LENGTH = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long>("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long> NUMERIC_PRECISION = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long>("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long> NUMERIC_PRECISION_RADIX = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long>("NUMERIC_PRECISION_RADIX", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long> NUMERIC_SCALE = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long>("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long> DATETIME_PRECISION = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long>("DATETIME_PRECISION", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> INTERVAL_TYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("INTERVAL_TYPE", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long> INTERVAL_PRECISION = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long>("INTERVAL_PRECISION", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> CHARACTER_SET_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("CHARACTER_SET_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> CHARACTER_SET_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("CHARACTER_SET_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> CHARACTER_SET_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> COLLATION_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("COLLATION_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> COLLATION_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("COLLATION_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> COLLATION_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> DOMAIN_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("DOMAIN_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> DOMAIN_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("DOMAIN_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> DOMAIN_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("DOMAIN_NAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> UDT_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("UDT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> UDT_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("UDT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> UDT_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("UDT_NAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> SCOPE_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("SCOPE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> SCOPE_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("SCOPE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> SCOPE_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("SCOPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long> MAXIMUM_CARDINALITY = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long>("MAXIMUM_CARDINALITY", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> DTD_IDENTIFIER = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("DTD_IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_SELF_REFERENCING = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("IS_SELF_REFERENCING", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_IDENTITY = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("IS_IDENTITY", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_GENERATION = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("IDENTITY_GENERATION", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_START = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("IDENTITY_START", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_INCREMENT = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("IDENTITY_INCREMENT", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_MAXIMUM = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("IDENTITY_MAXIMUM", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_MINIMUM = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("IDENTITY_MINIMUM", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_CYCLE = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("IDENTITY_CYCLE", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_GENERATED = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("IS_GENERATED", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> GENERATION_EXPRESSION = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("GENERATION_EXPRESSION", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_UPDATABLE = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("IS_UPDATABLE", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String> DECLARED_DATA_TYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.String>("DECLARED_DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long> DECLARED_NUMERIC_PRECISION = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long>("DECLARED_NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long> DECLARED_NUMERIC_SCALE = new org.jooq.impl.TableFieldImpl<org.jooq.util.ansi.information_schema.tables.records.ColumnsRecord, java.lang.Long>("DECLARED_NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, COLUMNS);

	/**
	 * No further instances allowed
	 */
	private Columns() {
		super("COLUMNS", org.jooq.util.ansi.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}
