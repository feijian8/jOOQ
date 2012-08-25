/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 941317465;

	/**
	 * The singleton instance of T_BOOK
	 */
	public static final org.jooq.test.firebird.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.firebird.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The table column <code>T_BOOK.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>T_BOOK.AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES T_AUTHOR (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>T_BOOK.CO_AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES T_AUTHOR (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>T_BOOK.DETAILS_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>T_BOOK.TITLE</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>T_BOOK.PUBLISHED_IN</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>T_BOOK.LANGUAGE_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, org.jooq.test.firebird.generatedclasses.enums.TLanguage> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.firebird.generatedclasses.enums.TLanguage.class), this);

	/**
	 * The table column <code>T_BOOK.CONTENT_TEXT</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>T_BOOK.CONTENT_PDF</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The table column <code>T_BOOK.REC_VERSION</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, java.lang.Integer> REC_VERSION = createField("REC_VERSION", org.jooq.impl.SQLDataType.INTEGER, this);

	public TBook() {
		super("T_BOOK");
	}

	public TBook(java.lang.String alias) {
		super(alias, null, org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.firebird.generatedclasses.Keys.PK_T_BOOK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.firebird.generatedclasses.Keys.PK_T_BOOK);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.firebird.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.firebird.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID);
	}

	@Override
	public org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord, java.lang.Integer> getRecordVersion() {
		return org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.REC_VERSION;
	}

	@Override
	public org.jooq.test.firebird.generatedclasses.tables.TBook as(java.lang.String alias) {
		return new org.jooq.test.firebird.generatedclasses.tables.TBook(alias);
	}
}