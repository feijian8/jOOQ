/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.util.ansi;

import static org.jooq.util.ansi.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE;
import static org.jooq.util.ansi.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS;
import static org.jooq.util.ansi.information_schema.tables.Routines.ROUTINES;
import static org.jooq.util.ansi.information_schema.tables.Sequences.SEQUENCES;
import static org.jooq.util.ansi.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;
import static org.jooq.util.ansi.information_schema.tables.Tables.TABLES;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.util.AbstractDatabase;
import org.jooq.util.ArrayDefinition;
import org.jooq.util.ColumnDefinition;
import org.jooq.util.DefaultRelations;
import org.jooq.util.DefaultSequenceDefinition;
import org.jooq.util.EnumDefinition;
import org.jooq.util.FunctionDefinition;
import org.jooq.util.PackageDefinition;
import org.jooq.util.ProcedureDefinition;
import org.jooq.util.SequenceDefinition;
import org.jooq.util.TableDefinition;
import org.jooq.util.UDTDefinition;
import org.jooq.util.ansi.information_schema.tables.KeyColumnUsage;
import org.jooq.util.ansi.information_schema.tables.ReferentialConstraints;
import org.jooq.util.ansi.information_schema.tables.Routines;
import org.jooq.util.ansi.information_schema.tables.Sequences;
import org.jooq.util.ansi.information_schema.tables.TableConstraints;
import org.jooq.util.ansi.information_schema.tables.Tables;
import org.jooq.util.sqlserver.SQLServerTableDefinition;

/**
 * This database serves as a base class for all databases providing access to
 * the "ANSI standard" INFORMATION_SCHEMA
 *
 * @author Lukas Eder
 */
public abstract class ANSIDatabase extends AbstractDatabase {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void loadPrimaryKeys(DefaultRelations relations) throws SQLException {
        for (Record record : fetchKeys("PRIMARY KEY")) {
            String key = record.getValue(KeyColumnUsage.CONSTRAINT_NAME);
            String tableName = record.getValue(KeyColumnUsage.TABLE_NAME);
            String columnName = record.getValue(KeyColumnUsage.COLUMN_NAME);

            TableDefinition table = getTable(tableName);
            if (table != null) {
                relations.addPrimaryKey(key, table.getColumn(columnName));
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void loadUniqueKeys(DefaultRelations relations) throws SQLException {
        for (Record record : fetchKeys("UNIQUE")) {
            String key = record.getValue(KeyColumnUsage.CONSTRAINT_NAME);
            String tableName = record.getValue(KeyColumnUsage.TABLE_NAME);
            String columnName = record.getValue(KeyColumnUsage.COLUMN_NAME);

            TableDefinition table = getTable(tableName);
            if (table != null) {
                relations.addUniqueKey(key, table.getColumn(columnName));
            }
        }
    }

    private List<Record> fetchKeys(String constraintType) throws SQLException {
        return create()
            .select(KeyColumnUsage.CONSTRAINT_NAME, KeyColumnUsage.TABLE_NAME, KeyColumnUsage.COLUMN_NAME)
            .from(TABLE_CONSTRAINTS)
            .join(KEY_COLUMN_USAGE)
            .on(TableConstraints.CONSTRAINT_NAME.equal(KeyColumnUsage.CONSTRAINT_NAME))
            .where(TableConstraints.CONSTRAINT_TYPE.equal(constraintType))
            .and(TableConstraints.TABLE_SCHEMA.equal(getSchemaName()))
            .orderBy(
                KeyColumnUsage.TABLE_SCHEMA.asc(),
                KeyColumnUsage.TABLE_NAME.asc(),
                KeyColumnUsage.ORDINAL_POSITION.asc())
            .fetch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void loadForeignKeys(DefaultRelations relations) throws SQLException {
        Result<Record> result = create()
            .select(
                ReferentialConstraints.CONSTRAINT_NAME,
                ReferentialConstraints.UNIQUE_CONSTRAINT_NAME,
                KeyColumnUsage.TABLE_NAME,
                KeyColumnUsage.COLUMN_NAME)
            .from(REFERENTIAL_CONSTRAINTS)
            .join(KEY_COLUMN_USAGE)
            .on(ReferentialConstraints.CONSTRAINT_NAME.equal(KeyColumnUsage.CONSTRAINT_NAME))
            .where(ReferentialConstraints.CONSTRAINT_SCHEMA.equal(getSchemaName()))
            .orderBy(
                KeyColumnUsage.TABLE_SCHEMA.asc(),
                KeyColumnUsage.TABLE_NAME.asc(),
                KeyColumnUsage.ORDINAL_POSITION.asc())
            .fetch();

        for (Record record : result) {
            String foreignKey = record.getValue(ReferentialConstraints.CONSTRAINT_NAME);
            String foreignKeyTable = record.getValue(KeyColumnUsage.TABLE_NAME);
            String foreignKeyColumn = record.getValue(KeyColumnUsage.COLUMN_NAME);
            String uniqueKey = record.getValue(ReferentialConstraints.UNIQUE_CONSTRAINT_NAME);

            TableDefinition referencingTable = getTable(foreignKeyTable);

            if (referencingTable != null) {
                ColumnDefinition referencingColumn = referencingTable.getColumn(foreignKeyColumn);
                relations.addForeignKey(foreignKey, uniqueKey, referencingColumn);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<SequenceDefinition> getSequences0() throws SQLException {
        List<SequenceDefinition> result = new ArrayList<SequenceDefinition>();

        for (String name : create()
            .select(Sequences.SEQUENCE_NAME)
            .from(SEQUENCES)
            .where(Sequences.SEQUENCE_SCHEMA.equal(getSchemaName()))
            .orderBy(Sequences.SEQUENCE_NAME)
            .fetch(Sequences.SEQUENCE_NAME)) {

            result.add(new DefaultSequenceDefinition(this, name));
        }

        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<TableDefinition> getTables0() throws SQLException {
        List<TableDefinition> result = new ArrayList<TableDefinition>();

        for (String name : create()
            .select(Tables.TABLE_NAME)
            .from(TABLES)
            .where(Tables.TABLE_SCHEMA.equal(getSchemaName()))
            .orderBy(Tables.TABLE_NAME)
            .fetch(Tables.TABLE_NAME)) {

            String comment = "";

            TableDefinition table;
            if (getDialect() == SQLDialect.SQLSERVER) {
                table = new SQLServerTableDefinition(this, name, comment);
            }
            else {
                table = new ANSITableDefinition(this, name, comment);
            }

            result.add(table);
        }

        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<EnumDefinition> getEnums0() throws SQLException {
        List<EnumDefinition> result = new ArrayList<EnumDefinition>();
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<UDTDefinition> getUDTs0() throws SQLException {
        List<UDTDefinition> result = new ArrayList<UDTDefinition>();
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<ArrayDefinition> getArrays0() throws SQLException {
        List<ArrayDefinition> result = new ArrayList<ArrayDefinition>();
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<ProcedureDefinition> getProcedures0() throws SQLException {
        List<ProcedureDefinition> result = new ArrayList<ProcedureDefinition>();

        for (Record record : create()
            .select(Routines.ROUTINE_NAME, Routines.SPECIFIC_NAME)
            .from(ROUTINES)
            .where(Routines.ROUTINE_SCHEMA.equal(getSchemaName()))
            .and(Routines.ROUTINE_TYPE.equal("PROCEDURE"))
            .orderBy(Routines.ROUTINE_NAME)
            .fetch()) {

            String name = record.getValue(Routines.ROUTINE_NAME);
            String specificName = record.getValue(Routines.SPECIFIC_NAME);

            ANSIProcedureDefinition procedure = new ANSIProcedureDefinition(this, null, name, specificName);
            result.add(procedure);
        }

        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<FunctionDefinition> getFunctions0() throws SQLException {
        List<FunctionDefinition> result = new ArrayList<FunctionDefinition>();

        for (Record record : create()
            .select(Routines.ROUTINE_NAME, Routines.SPECIFIC_NAME, Routines.DATA_TYPE)
            .from(ROUTINES)
            .where(Routines.ROUTINE_SCHEMA.equal(getSchemaName()))
            .and(Routines.ROUTINE_TYPE.equal("FUNCTION"))
            .orderBy(Routines.ROUTINE_NAME)
            .fetch()) {

            String name = record.getValue(Routines.ROUTINE_NAME);
            String specificName = record.getValue(Routines.SPECIFIC_NAME);
            String dataType = record.getValue(Routines.DATA_TYPE);

            ANSIFunctionDefinition function = new ANSIFunctionDefinition(this, name, specificName, dataType);
            result.add(function);
        }

        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<PackageDefinition> getPackages0() throws SQLException {
        List<PackageDefinition> result = new ArrayList<PackageDefinition>();
        return result;
    }
}
