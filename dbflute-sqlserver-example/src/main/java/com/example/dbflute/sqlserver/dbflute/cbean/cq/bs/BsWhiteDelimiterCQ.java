package com.example.dbflute.sqlserver.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.sqlserver.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.sqlserver.dbflute.cbean.*;
import com.example.dbflute.sqlserver.dbflute.cbean.cq.*;

/**
 * The base condition-query of WHITE_DELIMITER.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDelimiterCQ extends AbstractBsWhiteDelimiterCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteDelimiterCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDelimiterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_DELIMITER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteDelimiterCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteDelimiterCIQ xcreateCIQ() {
        WhiteDelimiterCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteDelimiterCIQ xnewCIQ() {
        return new WhiteDelimiterCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_DELIMITER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteDelimiterCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteDelimiterCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _delimiterId;
    public ConditionValue getDelimiterId()
    { if (_delimiterId == null) { _delimiterId = nCV(); }
      return _delimiterId; }
    protected ConditionValue getCValueDelimiterId() { return getDelimiterId(); }

    /** 
     * Add order-by as ascend. <br />
     * DELIMITER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addOrderBy_DelimiterId_Asc() { regOBA("DELIMITER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * DELIMITER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addOrderBy_DelimiterId_Desc() { regOBD("DELIMITER_ID"); return this; }

    protected ConditionValue _numberNullable;
    public ConditionValue getNumberNullable()
    { if (_numberNullable == null) { _numberNullable = nCV(); }
      return _numberNullable; }
    protected ConditionValue getCValueNumberNullable() { return getNumberNullable(); }

    /** 
     * Add order-by as ascend. <br />
     * NUMBER_NULLABLE: {int(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addOrderBy_NumberNullable_Asc() { regOBA("NUMBER_NULLABLE"); return this; }

    /**
     * Add order-by as descend. <br />
     * NUMBER_NULLABLE: {int(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addOrderBy_NumberNullable_Desc() { regOBD("NUMBER_NULLABLE"); return this; }

    protected ConditionValue _stringConverted;
    public ConditionValue getStringConverted()
    { if (_stringConverted == null) { _stringConverted = nCV(); }
      return _stringConverted; }
    protected ConditionValue getCValueStringConverted() { return getStringConverted(); }

    /** 
     * Add order-by as ascend. <br />
     * STRING_CONVERTED: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addOrderBy_StringConverted_Asc() { regOBA("STRING_CONVERTED"); return this; }

    /**
     * Add order-by as descend. <br />
     * STRING_CONVERTED: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addOrderBy_StringConverted_Desc() { regOBD("STRING_CONVERTED"); return this; }

    protected ConditionValue _stringNonConverted;
    public ConditionValue getStringNonConverted()
    { if (_stringNonConverted == null) { _stringNonConverted = nCV(); }
      return _stringNonConverted; }
    protected ConditionValue getCValueStringNonConverted() { return getStringNonConverted(); }

    /** 
     * Add order-by as ascend. <br />
     * STRING_NON_CONVERTED: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addOrderBy_StringNonConverted_Asc() { regOBA("STRING_NON_CONVERTED"); return this; }

    /**
     * Add order-by as descend. <br />
     * STRING_NON_CONVERTED: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addOrderBy_StringNonConverted_Desc() { regOBD("STRING_NON_CONVERTED"); return this; }

    protected ConditionValue _dateDefault;
    public ConditionValue getDateDefault()
    { if (_dateDefault == null) { _dateDefault = nCV(); }
      return _dateDefault; }
    protected ConditionValue getCValueDateDefault() { return getDateDefault(); }

    /** 
     * Add order-by as ascend. <br />
     * DATE_DEFAULT: {NotNull, datetime(23, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addOrderBy_DateDefault_Asc() { regOBA("DATE_DEFAULT"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATE_DEFAULT: {NotNull, datetime(23, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addOrderBy_DateDefault_Desc() { regOBD("DATE_DEFAULT"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteDelimiterCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteDelimiterCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteDelimiterCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteDelimiterCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteDelimiterCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteDelimiterCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteDelimiterCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteDelimiterCQ> _myselfExistsMap;
    public Map<String, WhiteDelimiterCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteDelimiterCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteDelimiterCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteDelimiterCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteDelimiterCB.class.getName(); }
    protected String xCQ() { return WhiteDelimiterCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
