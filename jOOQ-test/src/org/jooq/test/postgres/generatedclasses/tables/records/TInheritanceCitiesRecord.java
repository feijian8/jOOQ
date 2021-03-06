/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInheritanceCitiesRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TInheritanceCitiesRecord> implements org.jooq.Record3<java.lang.String, java.lang.Integer, java.lang.Integer>, org.jooq.test.postgres.generatedclasses.tables.interfaces.ITInheritanceCities {

	private static final long serialVersionUID = 2107386178;

	/**
	 * Setter for <code>public.t_inheritance_cities.name</code>. 
	 */
	public TInheritanceCitiesRecord setName(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_inheritance_cities.name</code>. 
	 */
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.t_inheritance_cities.population</code>. 
	 */
	public TInheritanceCitiesRecord setPopulation(java.lang.Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_inheritance_cities.population</code>. 
	 */
	@Override
	public java.lang.Integer getPopulation() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.t_inheritance_cities.altitude</code>. 
	 */
	public TInheritanceCitiesRecord setAltitude(java.lang.Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_inheritance_cities.altitude</code>. 
	 */
	@Override
	public java.lang.Integer getAltitude() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TInheritanceCities.T_INHERITANCE_CITIES.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TInheritanceCities.T_INHERITANCE_CITIES.POPULATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.TInheritanceCities.T_INHERITANCE_CITIES.ALTITUDE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getPopulation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getAltitude();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TInheritanceCitiesRecord
	 */
	public TInheritanceCitiesRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TInheritanceCities.T_INHERITANCE_CITIES);
	}

	/**
	 * Create a detached, initialised TInheritanceCitiesRecord
	 */
	public TInheritanceCitiesRecord(java.lang.String name, java.lang.Integer population, java.lang.Integer altitude) {
		super(org.jooq.test.postgres.generatedclasses.tables.TInheritanceCities.T_INHERITANCE_CITIES);

		setValue(0, name);
		setValue(1, population);
		setValue(2, altitude);
	}
}
