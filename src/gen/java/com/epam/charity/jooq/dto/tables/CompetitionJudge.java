/*
 * This file is generated by jOOQ.
*/
package com.epam.charity.jooq.dto.tables;


import com.epam.charity.jooq.dto.Dev;
import com.epam.charity.jooq.dto.Keys;
import com.epam.charity.jooq.dto.tables.records.CompetitionJudgeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompetitionJudge extends TableImpl<CompetitionJudgeRecord> {

    private static final long serialVersionUID = 256948493;

    /**
     * The reference instance of <code>dev.competition_judge</code>
     */
    public static final CompetitionJudge COMPETITION_JUDGE = new CompetitionJudge();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompetitionJudgeRecord> getRecordType() {
        return CompetitionJudgeRecord.class;
    }

    /**
     * The column <code>dev.competition_judge.competition_id</code>.
     */
    public final TableField<CompetitionJudgeRecord, Integer> COMPETITION_ID = createField("competition_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dev.competition_judge.judge_id</code>.
     */
    public final TableField<CompetitionJudgeRecord, Integer> JUDGE_ID = createField("judge_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>dev.competition_judge</code> table reference
     */
    public CompetitionJudge() {
        this("competition_judge", null);
    }

    /**
     * Create an aliased <code>dev.competition_judge</code> table reference
     */
    public CompetitionJudge(String alias) {
        this(alias, COMPETITION_JUDGE);
    }

    private CompetitionJudge(String alias, Table<CompetitionJudgeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompetitionJudge(String alias, Table<CompetitionJudgeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dev.DEV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CompetitionJudgeRecord> getPrimaryKey() {
        return Keys.PRIMARY21;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompetitionJudgeRecord>> getKeys() {
        return Arrays.<UniqueKey<CompetitionJudgeRecord>>asList(Keys.PRIMARY21);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CompetitionJudgeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CompetitionJudgeRecord, ?>>asList(Keys.COMPETITION_JUDGE__COMPETITION_COMPETITION, Keys.COMPETITION_JUDGE__COMPETITION_JUDGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompetitionJudge as(String alias) {
        return new CompetitionJudge(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompetitionJudge rename(String name) {
        return new CompetitionJudge(name, null);
    }
}