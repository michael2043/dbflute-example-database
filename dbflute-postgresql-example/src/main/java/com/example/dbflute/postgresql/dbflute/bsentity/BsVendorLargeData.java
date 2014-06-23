package com.example.dbflute.postgresql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_large_data as TABLE. <br />
 * <pre>
 * [primary-key]
 *     large_data_id
 * 
 * [column]
 *     large_data_id, string_index, string_no_index, string_unique_index, intflg_index, numeric_integer_index, numeric_integer_no_index
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
 *     
 * 
 * [referrer table]
 *     vendor_large_data_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorLargeDataRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long largeDataId = entity.getLargeDataId();
 * String stringIndex = entity.getStringIndex();
 * String stringNoIndex = entity.getStringNoIndex();
 * String stringUniqueIndex = entity.getStringUniqueIndex();
 * Integer intflgIndex = entity.getIntflgIndex();
 * Integer numericIntegerIndex = entity.getNumericIntegerIndex();
 * Integer numericIntegerNoIndex = entity.getNumericIntegerNoIndex();
 * entity.setLargeDataId(largeDataId);
 * entity.setStringIndex(stringIndex);
 * entity.setStringNoIndex(stringNoIndex);
 * entity.setStringUniqueIndex(stringUniqueIndex);
 * entity.setIntflgIndex(intflgIndex);
 * entity.setNumericIntegerIndex(numericIntegerIndex);
 * entity.setNumericIntegerNoIndex(numericIntegerNoIndex);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorLargeData implements Entity, Serializable, Cloneable {

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
    /** large_data_id: {PK, NotNull, int8(19)} */
    protected Long _largeDataId;

    /** string_index: {IX, NotNull, varchar(200)} */
    protected String _stringIndex;

    /** string_no_index: {NotNull, varchar(200)} */
    protected String _stringNoIndex;

    /** string_unique_index: {UQ, NotNull, varchar(200)} */
    protected String _stringUniqueIndex;

    /** intflg_index: {NotNull, int4(10)} */
    protected Integer _intflgIndex;

    /** numeric_integer_index: {IX, NotNull, numeric(8)} */
    protected Integer _numericIntegerIndex;

    /** numeric_integer_no_index: {NotNull, numeric(8)} */
    protected Integer _numericIntegerNoIndex;

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
        return "vendor_large_data";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorLargeData";
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
        if (getLargeDataId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param stringUniqueIndex : UQ, NotNull, varchar(200). (NotNull)
     */
    public void uniqueBy(String stringUniqueIndex) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("stringUniqueIndex");
        setStringUniqueIndex(stringUniqueIndex);
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
    /** vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefList'. */
    protected List<VendorLargeDataRef> _vendorLargeDataRefList;

    /**
     * [get] vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefList'.
     * @return The entity list of referrer property 'vendorLargeDataRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefList() {
        if (_vendorLargeDataRefList == null) { _vendorLargeDataRefList = newReferrerList(); }
        return _vendorLargeDataRefList;
    }

    /**
     * [set] vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefList'.
     * @param vendorLargeDataRefList The entity list of referrer property 'vendorLargeDataRefList'. (NullAllowed)
     */
    public void setVendorLargeDataRefList(List<VendorLargeDataRef> vendorLargeDataRefList) {
        _vendorLargeDataRefList = vendorLargeDataRefList;
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
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsVendorLargeData)) { return false; }
        BsVendorLargeData other = (BsVendorLargeData)obj;
        if (!xSV(getLargeDataId(), other.getLargeDataId())) { return false; }
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
        hs = xCH(hs, getLargeDataId());
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
        String li = "\n  ";
        if (_vendorLargeDataRefList != null) { for (Entity et : _vendorLargeDataRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorLargeDataRefList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
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
        sb.append(dm).append(getLargeDataId());
        sb.append(dm).append(getStringIndex());
        sb.append(dm).append(getStringNoIndex());
        sb.append(dm).append(getStringUniqueIndex());
        sb.append(dm).append(getIntflgIndex());
        sb.append(dm).append(getNumericIntegerIndex());
        sb.append(dm).append(getNumericIntegerNoIndex());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_vendorLargeDataRefList != null && !_vendorLargeDataRefList.isEmpty())
        { sb.append(cm).append("vendorLargeDataRefList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorLargeData clone() {
        try {
            return (VendorLargeData)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] large_data_id: {PK, NotNull, int8(19)} <br />
     * @return The value of the column 'large_data_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        return _largeDataId;
    }

    /**
     * [set] large_data_id: {PK, NotNull, int8(19)} <br />
     * @param largeDataId The value of the column 'large_data_id'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        __modifiedProperties.addPropertyName("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] string_index: {IX, NotNull, varchar(200)} <br />
     * @return The value of the column 'string_index'. (basically NotNull if selected: for the constraint)
     */
    public String getStringIndex() {
        return _stringIndex;
    }

    /**
     * [set] string_index: {IX, NotNull, varchar(200)} <br />
     * @param stringIndex The value of the column 'string_index'. (basically NotNull if update: for the constraint)
     */
    public void setStringIndex(String stringIndex) {
        __modifiedProperties.addPropertyName("stringIndex");
        _stringIndex = stringIndex;
    }

    /**
     * [get] string_no_index: {NotNull, varchar(200)} <br />
     * @return The value of the column 'string_no_index'. (basically NotNull if selected: for the constraint)
     */
    public String getStringNoIndex() {
        return _stringNoIndex;
    }

    /**
     * [set] string_no_index: {NotNull, varchar(200)} <br />
     * @param stringNoIndex The value of the column 'string_no_index'. (basically NotNull if update: for the constraint)
     */
    public void setStringNoIndex(String stringNoIndex) {
        __modifiedProperties.addPropertyName("stringNoIndex");
        _stringNoIndex = stringNoIndex;
    }

    /**
     * [get] string_unique_index: {UQ, NotNull, varchar(200)} <br />
     * @return The value of the column 'string_unique_index'. (basically NotNull if selected: for the constraint)
     */
    public String getStringUniqueIndex() {
        return _stringUniqueIndex;
    }

    /**
     * [set] string_unique_index: {UQ, NotNull, varchar(200)} <br />
     * @param stringUniqueIndex The value of the column 'string_unique_index'. (basically NotNull if update: for the constraint)
     */
    public void setStringUniqueIndex(String stringUniqueIndex) {
        __modifiedProperties.addPropertyName("stringUniqueIndex");
        _stringUniqueIndex = stringUniqueIndex;
    }

    /**
     * [get] intflg_index: {NotNull, int4(10)} <br />
     * @return The value of the column 'intflg_index'. (basically NotNull if selected: for the constraint)
     */
    public Integer getIntflgIndex() {
        return _intflgIndex;
    }

    /**
     * [set] intflg_index: {NotNull, int4(10)} <br />
     * @param intflgIndex The value of the column 'intflg_index'. (basically NotNull if update: for the constraint)
     */
    public void setIntflgIndex(Integer intflgIndex) {
        __modifiedProperties.addPropertyName("intflgIndex");
        _intflgIndex = intflgIndex;
    }

    /**
     * [get] numeric_integer_index: {IX, NotNull, numeric(8)} <br />
     * @return The value of the column 'numeric_integer_index'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumericIntegerIndex() {
        return _numericIntegerIndex;
    }

    /**
     * [set] numeric_integer_index: {IX, NotNull, numeric(8)} <br />
     * @param numericIntegerIndex The value of the column 'numeric_integer_index'. (basically NotNull if update: for the constraint)
     */
    public void setNumericIntegerIndex(Integer numericIntegerIndex) {
        __modifiedProperties.addPropertyName("numericIntegerIndex");
        _numericIntegerIndex = numericIntegerIndex;
    }

    /**
     * [get] numeric_integer_no_index: {NotNull, numeric(8)} <br />
     * @return The value of the column 'numeric_integer_no_index'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumericIntegerNoIndex() {
        return _numericIntegerNoIndex;
    }

    /**
     * [set] numeric_integer_no_index: {NotNull, numeric(8)} <br />
     * @param numericIntegerNoIndex The value of the column 'numeric_integer_no_index'. (basically NotNull if update: for the constraint)
     */
    public void setNumericIntegerNoIndex(Integer numericIntegerNoIndex) {
        __modifiedProperties.addPropertyName("numericIntegerNoIndex");
        _numericIntegerNoIndex = numericIntegerNoIndex;
    }
}
