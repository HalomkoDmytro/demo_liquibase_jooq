/*
 * This file is generated by jOOQ.
*/
package com.epam.charity.jooq.dto.tables.records;


import com.epam.charity.jooq.dto.tables.Video;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class VideoRecord extends UpdatableRecordImpl<VideoRecord> implements Record6<Integer, String, String, String, Double, Integer> {

    private static final long serialVersionUID = -104361145;

    /**
     * Setter for <code>dev.video.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dev.video.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dev.video.url</code>.
     */
    public void setUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dev.video.url</code>.
     */
    public String getUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dev.video.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dev.video.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dev.video.author</code>.
     */
    public void setAuthor(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>dev.video.author</code>.
     */
    public String getAuthor() {
        return (String) get(3);
    }

    /**
     * Setter for <code>dev.video.duration</code>.
     */
    public void setDuration(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>dev.video.duration</code>.
     */
    public Double getDuration() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>dev.video.application_id</code>.
     */
    public void setApplicationId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>dev.video.application_id</code>.
     */
    public Integer getApplicationId() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Double, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Double, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Video.VIDEO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Video.VIDEO.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Video.VIDEO.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Video.VIDEO.AUTHOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Video.VIDEO.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Video.VIDEO.APPLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VideoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VideoRecord value2(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VideoRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VideoRecord value4(String value) {
        setAuthor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VideoRecord value5(Double value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VideoRecord value6(Integer value) {
        setApplicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VideoRecord values(Integer value1, String value2, String value3, String value4, Double value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VideoRecord
     */
    public VideoRecord() {
        super(Video.VIDEO);
    }

    /**
     * Create a detached, initialised VideoRecord
     */
    public VideoRecord(Integer id, String url, String name, String author, Double duration, Integer applicationId) {
        super(Video.VIDEO);

        set(0, id);
        set(1, url);
        set(2, name);
        set(3, author);
        set(4, duration);
        set(5, applicationId);
    }
}