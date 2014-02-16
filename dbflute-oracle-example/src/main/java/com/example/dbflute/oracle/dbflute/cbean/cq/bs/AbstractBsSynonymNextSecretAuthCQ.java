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
 * The abstract condition-query of SYNONYM_NEXT_SECRET_AUTH.
 * @author oracleman
 */
public abstract class AbstractBsSynonymNextSecretAuthCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSynonymNextSecretAuthCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SYNONYM_NEXT_SECRET_AUTH";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_Equal(String secretAuthCode) {
        doSetSecretAuthCode_Equal(fRES(secretAuthCode));
    }

    protected void doSetSecretAuthCode_Equal(String secretAuthCode) {
        regSecretAuthCode(CK_EQ, hSC("SECRET_AUTH_CODE", secretAuthCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_NotEqual(String secretAuthCode) {
        doSetSecretAuthCode_NotEqual(fRES(secretAuthCode));
    }

    protected void doSetSecretAuthCode_NotEqual(String secretAuthCode) {
        regSecretAuthCode(CK_NES, hSC("SECRET_AUTH_CODE", secretAuthCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)}
     * @param secretAuthCodeList The collection of secretAuthCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_InScope(Collection<String> secretAuthCodeList) {
        doSetSecretAuthCode_InScope(secretAuthCodeList);
    }

    public void doSetSecretAuthCode_InScope(Collection<String> secretAuthCodeList) {
        regINS(CK_INS, cTL(secretAuthCodeList), getCValueSecretAuthCode(), "SECRET_AUTH_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)}
     * @param secretAuthCodeList The collection of secretAuthCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_NotInScope(Collection<String> secretAuthCodeList) {
        doSetSecretAuthCode_NotInScope(secretAuthCodeList);
    }

    public void doSetSecretAuthCode_NotInScope(Collection<String> secretAuthCodeList) {
        regINS(CK_NINS, cTL(secretAuthCodeList), getCValueSecretAuthCode(), "SECRET_AUTH_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_PrefixSearch(String secretAuthCode) {
        setSecretAuthCode_LikeSearch(secretAuthCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setSecretAuthCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secretAuthCode The value of secretAuthCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecretAuthCode_LikeSearch(String secretAuthCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secretAuthCode), getCValueSecretAuthCode(), "SECRET_AUTH_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecretAuthCode_NotLikeSearch(String secretAuthCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secretAuthCode), getCValueSecretAuthCode(), "SECRET_AUTH_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecretAuthCode_IsNull() { regSecretAuthCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecretAuthCode_IsNotNull() { regSecretAuthCode(CK_ISNN, DOBJ); }

    protected void regSecretAuthCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSecretAuthCode(), "SECRET_AUTH_CODE"); }
    protected abstract ConditionValue getCValueSecretAuthCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)}
     * @param secretAuthName The value of secretAuthName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthName_Equal(String secretAuthName) {
        doSetSecretAuthName_Equal(fRES(secretAuthName));
    }

    protected void doSetSecretAuthName_Equal(String secretAuthName) {
        regSecretAuthName(CK_EQ, secretAuthName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)}
     * @param secretAuthName The value of secretAuthName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthName_NotEqual(String secretAuthName) {
        doSetSecretAuthName_NotEqual(fRES(secretAuthName));
    }

    protected void doSetSecretAuthName_NotEqual(String secretAuthName) {
        regSecretAuthName(CK_NES, secretAuthName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)}
     * @param secretAuthNameList The collection of secretAuthName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthName_InScope(Collection<String> secretAuthNameList) {
        doSetSecretAuthName_InScope(secretAuthNameList);
    }

    public void doSetSecretAuthName_InScope(Collection<String> secretAuthNameList) {
        regINS(CK_INS, cTL(secretAuthNameList), getCValueSecretAuthName(), "SECRET_AUTH_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)}
     * @param secretAuthNameList The collection of secretAuthName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthName_NotInScope(Collection<String> secretAuthNameList) {
        doSetSecretAuthName_NotInScope(secretAuthNameList);
    }

    public void doSetSecretAuthName_NotInScope(Collection<String> secretAuthNameList) {
        regINS(CK_NINS, cTL(secretAuthNameList), getCValueSecretAuthName(), "SECRET_AUTH_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)}
     * @param secretAuthName The value of secretAuthName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthName_PrefixSearch(String secretAuthName) {
        setSecretAuthName_LikeSearch(secretAuthName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setSecretAuthName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secretAuthName The value of secretAuthName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecretAuthName_LikeSearch(String secretAuthName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secretAuthName), getCValueSecretAuthName(), "SECRET_AUTH_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)}
     * @param secretAuthName The value of secretAuthName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecretAuthName_NotLikeSearch(String secretAuthName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secretAuthName), getCValueSecretAuthName(), "SECRET_AUTH_NAME", likeSearchOption);
    }

    protected void regSecretAuthName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSecretAuthName(), "SECRET_AUTH_NAME"); }
    protected abstract ConditionValue getCValueSecretAuthName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;SynonymNextSecretAuthCB&gt;() {
     *     public void query(SynonymNextSecretAuthCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextSecretAuthCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SynonymNextSecretAuthCB&gt;() {
     *     public void query(SynonymNextSecretAuthCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextSecretAuthCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SynonymNextSecretAuthCB&gt;() {
     *     public void query(SynonymNextSecretAuthCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextSecretAuthCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;SynonymNextSecretAuthCB&gt;() {
     *     public void query(SynonymNextSecretAuthCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextSecretAuthCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SynonymNextSecretAuthCB&gt;() {
     *     public void query(SynonymNextSecretAuthCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextSecretAuthCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SynonymNextSecretAuthCB&gt;() {
     *     public void query(SynonymNextSecretAuthCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextSecretAuthCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<SynonymNextSecretAuthCB> xcreateSSQFunction(final String rd) {
        return new HpSSQFunction<SynonymNextSecretAuthCB>(new HpSSQSetupper<SynonymNextSecretAuthCB>() {
            public void setup(String fn, SubQuery<SynonymNextSecretAuthCB> sq, HpSSQOption<SynonymNextSecretAuthCB> op) {
                xscalarCondition(fn, sq, rd, op);
            }
        });
    }

    protected void xscalarCondition(String fn, SubQuery<SynonymNextSecretAuthCB> sq, String rd, HpSSQOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("subQuery", sq);
        SynonymNextSecretAuthCB cb = xcreateScalarConditionCB(); sq.query(cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(SynonymNextSecretAuthCQ sq);

    protected SynonymNextSecretAuthCB xcreateScalarConditionCB() {
        SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected SynonymNextSecretAuthCB xcreateScalarConditionPartitionByCB() {
        SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SynonymNextSecretAuthCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "SECRET_AUTH_CODE";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SynonymNextSecretAuthCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SynonymNextSecretAuthCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<SynonymNextSecretAuthCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<SynonymNextSecretAuthCB>(new HpQDRSetupper<SynonymNextSecretAuthCB>() {
            public void setup(String fn, SubQuery<SynonymNextSecretAuthCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMyselfDerived(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMyselfDerived(String fn, SubQuery<SynonymNextSecretAuthCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "SECRET_AUTH_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SynonymNextSecretAuthCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<SynonymNextSecretAuthCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SynonymNextSecretAuthCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<SynonymNextSecretAuthCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(SynonymNextSecretAuthCQ sq);

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
    protected String xabCB() { return SynonymNextSecretAuthCB.class.getName(); }
    protected String xabCQ() { return SynonymNextSecretAuthCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
