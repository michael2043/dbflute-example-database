package com.example.dbflute.oracle.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_UQ_FK_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     UQ_FK_REF_ID
 * 
 * [column]
 *     UQ_FK_REF_ID, FK_TO_PK_ID, FK_TO_UQ_CODE, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     WHITE_UQ_FK
 * 
 * [referrer table]
 *     WHITE_UQ_FK_REF_NEST
 * 
 * [foreign property]
 *     whiteUqFkByFkToPkId, whiteUqFkByFkToUqCode
 * 
 * [referrer property]
 *     whiteUqFkRefNestList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqFkRefId = entity.getUqFkRefId();
 * Long fkToPkId = entity.getFkToPkId();
 * String fkToUqCode = entity.getFkToUqCode();
 * String compoundUqFirstCode = entity.getCompoundUqFirstCode();
 * String compoundUqSecondCode = entity.getCompoundUqSecondCode();
 * entity.setUqFkRefId(uqFkRefId);
 * entity.setFkToPkId(fkToPkId);
 * entity.setFkToUqCode(fkToUqCode);
 * entity.setCompoundUqFirstCode(compoundUqFirstCode);
 * entity.setCompoundUqSecondCode(compoundUqSecondCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFkRef implements Entity, Serializable, Cloneable {

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
    /** UQ_FK_REF_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _uqFkRefId;

    /** FK_TO_PK_ID: {NotNull, NUMBER(16), FK to WHITE_UQ_FK} */
    protected Long _fkToPkId;

    /** FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK} */
    protected String _fkToUqCode;

    /** COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)} */
    protected String _compoundUqFirstCode;

    /** COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)} */
    protected String _compoundUqSecondCode;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
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
        return "WHITE_UQ_FK_REF";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqFkRef";
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
        if (getUqFkRefId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_UQ_FK by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'. */
    protected WhiteUqFk _whiteUqFkByFkToPkId;

    /**
     * WHITE_UQ_FK by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @return The entity of foreign property 'whiteUqFkByFkToPkId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqFk getWhiteUqFkByFkToPkId() {
        return _whiteUqFkByFkToPkId;
    }

    /**
     * WHITE_UQ_FK by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @param whiteUqFkByFkToPkId The entity of foreign property 'whiteUqFkByFkToPkId'. (NullAllowed)
     */
    public void setWhiteUqFkByFkToPkId(WhiteUqFk whiteUqFkByFkToPkId) {
        _whiteUqFkByFkToPkId = whiteUqFkByFkToPkId;
    }

    /** WHITE_UQ_FK by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'. */
    protected WhiteUqFk _whiteUqFkByFkToUqCode;

    /**
     * WHITE_UQ_FK by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @return The entity of foreign property 'whiteUqFkByFkToUqCode'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqFk getWhiteUqFkByFkToUqCode() {
        return _whiteUqFkByFkToUqCode;
    }

    /**
     * WHITE_UQ_FK by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @param whiteUqFkByFkToUqCode The entity of foreign property 'whiteUqFkByFkToUqCode'. (NullAllowed)
     */
    public void setWhiteUqFkByFkToUqCode(WhiteUqFk whiteUqFkByFkToUqCode) {
        _whiteUqFkByFkToUqCode = whiteUqFkByFkToUqCode;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_UQ_FK_REF_NEST by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'. */
    protected List<WhiteUqFkRefNest> _whiteUqFkRefNestList;

    /**
     * WHITE_UQ_FK_REF_NEST by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
     * @return The entity list of referrer property 'whiteUqFkRefNestList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqFkRefNest> getWhiteUqFkRefNestList() {
        if (_whiteUqFkRefNestList == null) { _whiteUqFkRefNestList = newReferrerList(); }
        return _whiteUqFkRefNestList;
    }

    /**
     * WHITE_UQ_FK_REF_NEST by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
     * @param whiteUqFkRefNestList The entity list of referrer property 'whiteUqFkRefNestList'. (NullAllowed)
     */
    public void setWhiteUqFkRefNestList(List<WhiteUqFkRefNest> whiteUqFkRefNestList) {
        _whiteUqFkRefNestList = whiteUqFkRefNestList;
    }

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
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteUqFkRef)) { return false; }
        BsWhiteUqFkRef otherEntity = (BsWhiteUqFkRef)other;
        if (!xSV(getUqFkRefId(), otherEntity.getUqFkRefId())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getUqFkRefId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
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
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_whiteUqFkByFkToPkId != null)
        { sb.append(l).append(xbRDS(_whiteUqFkByFkToPkId, "whiteUqFkByFkToPkId")); }
        if (_whiteUqFkByFkToUqCode != null)
        { sb.append(l).append(xbRDS(_whiteUqFkByFkToUqCode, "whiteUqFkByFkToUqCode")); }
        if (_whiteUqFkRefNestList != null) { for (Entity e : _whiteUqFkRefNestList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteUqFkRefNestList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
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
        String delimiter = ", ";
        sb.append(delimiter).append(getUqFkRefId());
        sb.append(delimiter).append(getFkToPkId());
        sb.append(delimiter).append(getFkToUqCode());
        sb.append(delimiter).append(getCompoundUqFirstCode());
        sb.append(delimiter).append(getCompoundUqSecondCode());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteUqFkByFkToPkId != null) { sb.append(c).append("whiteUqFkByFkToPkId"); }
        if (_whiteUqFkByFkToUqCode != null) { sb.append(c).append("whiteUqFkByFkToUqCode"); }
        if (_whiteUqFkRefNestList != null && !_whiteUqFkRefNestList.isEmpty())
        { sb.append(c).append("whiteUqFkRefNestList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteUqFkRef clone() {
        try {
            return (WhiteUqFkRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_FK_REF_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'UQ_FK_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqFkRefId() {
        return _uqFkRefId;
    }

    /**
     * [set] UQ_FK_REF_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param uqFkRefId The value of the column 'UQ_FK_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkRefId(Long uqFkRefId) {
        __modifiedProperties.addPropertyName("uqFkRefId");
        this._uqFkRefId = uqFkRefId;
    }

    /**
     * [get] FK_TO_PK_ID: {NotNull, NUMBER(16), FK to WHITE_UQ_FK} <br />
     * @return The value of the column 'FK_TO_PK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFkToPkId() {
        return _fkToPkId;
    }

    /**
     * [set] FK_TO_PK_ID: {NotNull, NUMBER(16), FK to WHITE_UQ_FK} <br />
     * @param fkToPkId The value of the column 'FK_TO_PK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFkToPkId(Long fkToPkId) {
        __modifiedProperties.addPropertyName("fkToPkId");
        this._fkToPkId = fkToPkId;
    }

    /**
     * [get] FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK} <br />
     * @return The value of the column 'FK_TO_UQ_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getFkToUqCode() {
        return _fkToUqCode;
    }

    /**
     * [set] FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK} <br />
     * @param fkToUqCode The value of the column 'FK_TO_UQ_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setFkToUqCode(String fkToUqCode) {
        __modifiedProperties.addPropertyName("fkToUqCode");
        this._fkToUqCode = fkToUqCode;
    }

    /**
     * [get] COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @return The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqFirstCode() {
        return _compoundUqFirstCode;
    }

    /**
     * [set] COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @param compoundUqFirstCode The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqFirstCode(String compoundUqFirstCode) {
        __modifiedProperties.addPropertyName("compoundUqFirstCode");
        this._compoundUqFirstCode = compoundUqFirstCode;
    }

    /**
     * [get] COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)} <br />
     * @return The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqSecondCode() {
        return _compoundUqSecondCode;
    }

    /**
     * [set] COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)} <br />
     * @param compoundUqSecondCode The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqSecondCode(String compoundUqSecondCode) {
        __modifiedProperties.addPropertyName("compoundUqSecondCode");
        this._compoundUqSecondCode = compoundUqSecondCode;
    }
}