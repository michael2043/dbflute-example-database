package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of REGION.
 * @author oracleman
 */
public abstract class AbstractBsRegionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsRegionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "REGION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, NUMBER(22)}
     * @param regionId The value of regionId as equal. (NullAllowed: if null, no condition)
     */
    public void setRegionId_Equal(java.math.BigDecimal regionId) {
        doSetRegionId_Equal(regionId);
    }

    protected void doSetRegionId_Equal(java.math.BigDecimal regionId) {
        regRegionId(CK_EQ, regionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, NUMBER(22)}
     * @param regionId The value of regionId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegionId_GreaterThan(java.math.BigDecimal regionId) {
        regRegionId(CK_GT, regionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, NUMBER(22)}
     * @param regionId The value of regionId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegionId_LessThan(java.math.BigDecimal regionId) {
        regRegionId(CK_LT, regionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, NUMBER(22)}
     * @param regionId The value of regionId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegionId_GreaterEqual(java.math.BigDecimal regionId) {
        regRegionId(CK_GE, regionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, NUMBER(22)}
     * @param regionId The value of regionId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegionId_LessEqual(java.math.BigDecimal regionId) {
        regRegionId(CK_LE, regionId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, NUMBER(22)}
     * @param minNumber The min number of regionId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of regionId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRegionId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRegionId(), "REGION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REGION_ID: {PK, NotNull, NUMBER(22)}
     * @param regionIdList The collection of regionId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionId_InScope(Collection<java.math.BigDecimal> regionIdList) {
        doSetRegionId_InScope(regionIdList);
    }

    protected void doSetRegionId_InScope(Collection<java.math.BigDecimal> regionIdList) {
        regINS(CK_INS, cTL(regionIdList), getCValueRegionId(), "REGION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REGION_ID: {PK, NotNull, NUMBER(22)}
     * @param regionIdList The collection of regionId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionId_NotInScope(Collection<java.math.BigDecimal> regionIdList) {
        doSetRegionId_NotInScope(regionIdList);
    }

    protected void doSetRegionId_NotInScope(Collection<java.math.BigDecimal> regionIdList) {
        regINS(CK_NINS, cTL(regionIdList), getCValueRegionId(), "REGION_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberAddressList</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberAddressList for 'exists'. (NotNull)
     */
    public void existsMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepRegionId_ExistsReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_ExistsReferrer_MemberAddressList(MemberAddressCQ sq);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberAddressList</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of RegionId_NotExistsReferrer_MemberAddressList for 'not exists'. (NotNull)
     */
    public void notExistsMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepRegionId_NotExistsReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_NotExistsReferrer_MemberAddressList(MemberAddressCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepRegionId_InScopeRelation_MemberAddressList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_InScopeRelation_MemberAddressList(MemberAddressCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberAddressList(SubQuery<MemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepRegionId_NotInScopeRelation_MemberAddressList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_NotInScopeRelation_MemberAddressList(MemberAddressCQ sq);

    public void xsderiveMemberAddressList(String fn, SubQuery<MemberAddressCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepRegionId_SpecifyDerivedReferrer_MemberAddressList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList", al, op);
    }
    public abstract String keepRegionId_SpecifyDerivedReferrer_MemberAddressList(MemberAddressCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedMemberAddressList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberAddressCB> derivedMemberAddressList() {
        return xcreateQDRFunctionMemberAddressList();
    }
    protected HpQDRFunction<MemberAddressCB> xcreateQDRFunctionMemberAddressList() {
        return new HpQDRFunction<MemberAddressCB>(new HpQDRSetupper<MemberAddressCB>() {
            public void setup(String fn, SubQuery<MemberAddressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMemberAddressList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMemberAddressList(String fn, SubQuery<MemberAddressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepRegionId_QueryDerivedReferrer_MemberAddressList(cb.query()); // for saving query-value.
        String prpp = keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "REGION_ID", "REGION_ID", sqpp, "memberAddressList", rd, vl, prpp, op);
    }
    public abstract String keepRegionId_QueryDerivedReferrer_MemberAddressList(MemberAddressCQ sq);
    public abstract String keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, NUMBER(22)}
     */
    public void setRegionId_IsNull() { regRegionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, NUMBER(22)}
     */
    public void setRegionId_IsNotNull() { regRegionId(CK_ISNN, DOBJ); }

    protected void regRegionId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegionId(), "REGION_ID"); }
    protected abstract ConditionValue getCValueRegionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR2(50)}
     * @param regionName The value of regionName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_Equal(String regionName) {
        doSetRegionName_Equal(fRES(regionName));
    }

    protected void doSetRegionName_Equal(String regionName) {
        regRegionName(CK_EQ, regionName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR2(50)}
     * @param regionName The value of regionName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_NotEqual(String regionName) {
        doSetRegionName_NotEqual(fRES(regionName));
    }

    protected void doSetRegionName_NotEqual(String regionName) {
        regRegionName(CK_NES, regionName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR2(50)}
     * @param regionNameList The collection of regionName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_InScope(Collection<String> regionNameList) {
        doSetRegionName_InScope(regionNameList);
    }

    public void doSetRegionName_InScope(Collection<String> regionNameList) {
        regINS(CK_INS, cTL(regionNameList), getCValueRegionName(), "REGION_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR2(50)}
     * @param regionNameList The collection of regionName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_NotInScope(Collection<String> regionNameList) {
        doSetRegionName_NotInScope(regionNameList);
    }

    public void doSetRegionName_NotInScope(Collection<String> regionNameList) {
        regINS(CK_NINS, cTL(regionNameList), getCValueRegionName(), "REGION_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR2(50)}
     * @param regionName The value of regionName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_PrefixSearch(String regionName) {
        setRegionName_LikeSearch(regionName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setRegionName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regionName The value of regionName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegionName_LikeSearch(String regionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regionName), getCValueRegionName(), "REGION_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR2(50)}
     * @param regionName The value of regionName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegionName_NotLikeSearch(String regionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regionName), getCValueRegionName(), "REGION_NAME", likeSearchOption);
    }

    protected void regRegionName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegionName(), "REGION_NAME"); }
    protected abstract ConditionValue getCValueRegionName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RegionCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<RegionCB> xcreateSSQFunction(final String rd) {
        return new HpSSQFunction<RegionCB>(new HpSSQSetupper<RegionCB>() {
            public void setup(String fn, SubQuery<RegionCB> sq, HpSSQOption<RegionCB> op) {
                xscalarCondition(fn, sq, rd, op);
            }
        });
    }

    protected void xscalarCondition(String fn, SubQuery<RegionCB> sq, String rd, HpSSQOption<RegionCB> op) {
        assertObjectNotNull("subQuery", sq);
        RegionCB cb = xcreateScalarConditionCB(); sq.query(cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(RegionCQ sq);

    protected RegionCB xcreateScalarConditionCB() {
        RegionCB cb = new RegionCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected RegionCB xcreateScalarConditionPartitionByCB() {
        RegionCB cb = new RegionCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<RegionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RegionCB cb = new RegionCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "REGION_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(RegionCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<RegionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<RegionCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<RegionCB>(new HpQDRSetupper<RegionCB>() {
            public void setup(String fn, SubQuery<RegionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMyselfDerived(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMyselfDerived(String fn, SubQuery<RegionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RegionCB cb = new RegionCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "REGION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(RegionCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<RegionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        RegionCB cb = new RegionCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(RegionCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<RegionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        RegionCB cb = new RegionCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(RegionCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn, String conditionValue) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue);
    }

    /**
     * Match for full-text search. <br />
     * The specified condition value is escaped in this method automatically.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return xescapeOracleFullTextSearchValue(conditionValue);
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new OracleMatchLikeSearch();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return RegionCB.class.getName(); }
    protected String xabCQ() { return RegionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
