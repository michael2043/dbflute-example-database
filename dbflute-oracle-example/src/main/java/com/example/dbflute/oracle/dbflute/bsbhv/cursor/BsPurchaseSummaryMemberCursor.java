package com.example.dbflute.oracle.dbflute.bsbhv.cursor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.dbflute.jdbc.ValueType;
import org.seasar.dbflute.s2dao.valuetype.TnValueTypes;

/**
 * The cursor of PurchaseSummaryMember. <br />
 * @author oracleman
 */
public class BsPurchaseSummaryMemberCursor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                        Column DB Name
    //                                        --------------
    /** DB name of MEMBER_ID. */
    public static final String DB_NAME_MEMBER_ID = "MEMBER_ID";

    /** DB name of MEMBER_NAME. */
    public static final String DB_NAME_MEMBER_NAME = "MEMBER_NAME";

    /** DB name of BIRTHDATE. */
    public static final String DB_NAME_BIRTHDATE = "BIRTHDATE";

    /** DB name of FORMALIZED_DATETIME. */
    public static final String DB_NAME_FORMALIZED_DATETIME = "FORMALIZED_DATETIME";

    /** DB name of PURCHASE_SUMMARY. */
    public static final String DB_NAME_PURCHASE_SUMMARY = "PURCHASE_SUMMARY";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Wrapped result set. */
    protected ResultSet _rs;

    protected ValueType _vtMemberId = vt(Long.class);
    protected ValueType _vtMemberName = vt(String.class);
    protected ValueType _vtBirthdate = vt(java.util.Date.class);
    protected ValueType _vtFormalizedDatetime = vt(java.sql.Timestamp.class);
    protected ValueType _vtPurchaseSummary = vt(java.math.BigDecimal.class);

    protected ValueType vt(Class<?> type) {
        return TnValueTypes.getValueType(type);
    }

    protected ValueType vt(Class<?> type, String name) {
        ValueType valueType = TnValueTypes.getPluginValueType(name);
        return valueType != null ? valueType : vt(type);
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchaseSummaryMemberCursor() {
    }

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    /**
     * Accept the result set.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     */
    public void accept(ResultSet rs) {
        this._rs = rs;
    }

    // ===================================================================================
    //                                                                              Direct
    //                                                                              ======
    /**
     * Get the wrapped cursor (result set).
     * @return The instance of result set. (NotNull)
     */
    public ResultSet cursor() {
        return _rs;
    }

    // ===================================================================================
    //                                                                            Delegate
    //                                                                            ========
    /**
     * Move to next result.
     * @return Is exist next result.
     * @throws SQLException
     */
    public boolean next() throws SQLException {
        return _rs.next();
    }

    // ===================================================================================
    //                                                                  Type Safe Accessor
    //                                                                  ==================
    /**
     * [get] MEMBER_ID: {NUMBER(16)} <br />
     * @return The value of memberId. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public Long getMemberId() throws SQLException {
        return (Long)_vtMemberId.getValue(_rs, DB_NAME_MEMBER_ID);
    }

    /**
     * [get] MEMBER_NAME: {VARCHAR2(200)} <br />
     * @return The value of memberName. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public String getMemberName() throws SQLException {
        return (String)_vtMemberName.getValue(_rs, DB_NAME_MEMBER_NAME);
    }

    /**
     * [get] BIRTHDATE: {DATE(7)} <br />
     * @return The value of birthdate. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.util.Date getBirthdate() throws SQLException {
        return (java.util.Date)_vtBirthdate.getValue(_rs, DB_NAME_BIRTHDATE);
    }

    /**
     * [get] FORMALIZED_DATETIME: {TIMESTAMP(11, 3)} <br />
     * @return The value of formalizedDatetime. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.sql.Timestamp getFormalizedDatetime() throws SQLException {
        return (java.sql.Timestamp)_vtFormalizedDatetime.getValue(_rs, DB_NAME_FORMALIZED_DATETIME);
    }

    /**
     * [get] PURCHASE_SUMMARY: {NUMBER(22)} <br />
     * @return The value of purchaseSummary. (NullAllowed)
     * @throws java.sql.SQLException
     */
    public java.math.BigDecimal getPurchaseSummary() throws SQLException {
        return (java.math.BigDecimal)_vtPurchaseSummary.getValue(_rs, DB_NAME_PURCHASE_SUMMARY);
    }

}
