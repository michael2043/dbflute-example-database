/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_INCLUDE_QUERY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     INCLUDE_QUERY_ID
 * 
 * [column]
 *     INCLUDE_QUERY_ID, INCLUDE_QUERY_VARCHAR, INCLUDE_QUERY_INTEGER, INCLUDE_QUERY_DATE, INCLUDE_QUERY_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     INCLUDE_QUERY_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long includeQueryId = entity.getIncludeQueryId();
 * String includeQueryVarchar = entity.getIncludeQueryVarchar();
 * Integer includeQueryInteger = entity.getIncludeQueryInteger();
 * java.util.Date includeQueryDate = entity.getIncludeQueryDate();
 * java.sql.Timestamp includeQueryDatetime = entity.getIncludeQueryDatetime();
 * entity.setIncludeQueryId(includeQueryId);
 * entity.setIncludeQueryVarchar(includeQueryVarchar);
 * entity.setIncludeQueryInteger(includeQueryInteger);
 * entity.setIncludeQueryDate(includeQueryDate);
 * entity.setIncludeQueryDatetime(includeQueryDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteIncludeQuery implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _includeQueryId;

    /** INCLUDE_QUERY_VARCHAR: {VARCHAR(100)} */
    protected String _includeQueryVarchar;

    /** INCLUDE_QUERY_INTEGER: {INT(10)} */
    protected Integer _includeQueryInteger;

    /** INCLUDE_QUERY_DATE: {DATE(10)} */
    protected java.util.Date _includeQueryDate;

    /** INCLUDE_QUERY_DATETIME: {DATETIME(19)} */
    protected java.sql.Timestamp _includeQueryDatetime;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_include_query";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteIncludeQuery";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getIncludeQueryId() == null) { return false; }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsWhiteIncludeQuery)) { return false; }
        BsWhiteIncludeQuery other = (BsWhiteIncludeQuery)obj;
        if (!xSV(getIncludeQueryId(), other.getIncludeQueryId())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getIncludeQueryId());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String dm = ", ";
        sb.append(dm).append(getIncludeQueryId());
        sb.append(dm).append(getIncludeQueryVarchar());
        sb.append(dm).append(getIncludeQueryInteger());
        sb.append(dm).append(xfUD(getIncludeQueryDate()));
        sb.append(dm).append(getIncludeQueryDatetime());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd";
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteIncludeQuery clone() {
        try {
            return (WhiteIncludeQuery)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'INCLUDE_QUERY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getIncludeQueryId() {
        return _includeQueryId;
    }

    /**
     * [set] INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param includeQueryId The value of the column 'INCLUDE_QUERY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setIncludeQueryId(Long includeQueryId) {
        __modifiedProperties.addPropertyName("includeQueryId");
        _includeQueryId = includeQueryId;
    }

    /**
     * [get] INCLUDE_QUERY_VARCHAR: {VARCHAR(100)} <br />
     * @return The value of the column 'INCLUDE_QUERY_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getIncludeQueryVarchar() {
        return _includeQueryVarchar;
    }

    /**
     * [set] INCLUDE_QUERY_VARCHAR: {VARCHAR(100)} <br />
     * @param includeQueryVarchar The value of the column 'INCLUDE_QUERY_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludeQueryVarchar(String includeQueryVarchar) {
        __modifiedProperties.addPropertyName("includeQueryVarchar");
        _includeQueryVarchar = includeQueryVarchar;
    }

    /**
     * [get] INCLUDE_QUERY_INTEGER: {INT(10)} <br />
     * @return The value of the column 'INCLUDE_QUERY_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getIncludeQueryInteger() {
        return _includeQueryInteger;
    }

    /**
     * [set] INCLUDE_QUERY_INTEGER: {INT(10)} <br />
     * @param includeQueryInteger The value of the column 'INCLUDE_QUERY_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludeQueryInteger(Integer includeQueryInteger) {
        __modifiedProperties.addPropertyName("includeQueryInteger");
        _includeQueryInteger = includeQueryInteger;
    }

    /**
     * [get] INCLUDE_QUERY_DATE: {DATE(10)} <br />
     * @return The value of the column 'INCLUDE_QUERY_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getIncludeQueryDate() {
        return _includeQueryDate;
    }

    /**
     * [set] INCLUDE_QUERY_DATE: {DATE(10)} <br />
     * @param includeQueryDate The value of the column 'INCLUDE_QUERY_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludeQueryDate(java.util.Date includeQueryDate) {
        __modifiedProperties.addPropertyName("includeQueryDate");
        _includeQueryDate = includeQueryDate;
    }

    /**
     * [get] INCLUDE_QUERY_DATETIME: {DATETIME(19)} <br />
     * @return The value of the column 'INCLUDE_QUERY_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getIncludeQueryDatetime() {
        return _includeQueryDatetime;
    }

    /**
     * [set] INCLUDE_QUERY_DATETIME: {DATETIME(19)} <br />
     * @param includeQueryDatetime The value of the column 'INCLUDE_QUERY_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludeQueryDatetime(java.sql.Timestamp includeQueryDatetime) {
        __modifiedProperties.addPropertyName("includeQueryDatetime");
        _includeQueryDatetime = includeQueryDatetime;
    }
}