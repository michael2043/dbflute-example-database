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
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_escaped_java_doc.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteEscapedJavaDocCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteEscapedJavaDocCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_escaped_java_doc";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @param escapedJavaDocCode The value of escapedJavaDocCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedJavaDocCode_Equal(String escapedJavaDocCode) {
        doSetEscapedJavaDocCode_Equal(fRES(escapedJavaDocCode));
    }

    /**
     * Equal(=). As EscapedJavaDocCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br />
     * /*IF pmb.yourTop&#42;/&gt;&lt;&
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setEscapedJavaDocCode_Equal_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls cdef) {
        doSetEscapedJavaDocCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As First (FOO). And OnlyOnceRegistered. <br />
     * First: /*IF pmb.yourFooComment&#42;/&gt;&lt;&
     */
    public void setEscapedJavaDocCode_Equal_First() {
        setEscapedJavaDocCode_Equal_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls.First);
    }

    /**
     * Equal(=). As Second (BAR). And OnlyOnceRegistered. <br />
     * Second: /*IF pmb.yourBarComment&#42;/&gt;&lt;&
     */
    public void setEscapedJavaDocCode_Equal_Second() {
        setEscapedJavaDocCode_Equal_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls.Second);
    }

    protected void doSetEscapedJavaDocCode_Equal(String escapedJavaDocCode) {
        regEscapedJavaDocCode(CK_EQ, escapedJavaDocCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @param escapedJavaDocCode The value of escapedJavaDocCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedJavaDocCode_NotEqual(String escapedJavaDocCode) {
        doSetEscapedJavaDocCode_NotEqual(fRES(escapedJavaDocCode));
    }

    /**
     * NotEqual(&lt;&gt;). As EscapedJavaDocCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br />
     * /*IF pmb.yourTop&#42;/&gt;&lt;&
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setEscapedJavaDocCode_NotEqual_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls cdef) {
        doSetEscapedJavaDocCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As First (FOO). And OnlyOnceRegistered. <br />
     * First: /*IF pmb.yourFooComment&#42;/&gt;&lt;&
     */
    public void setEscapedJavaDocCode_NotEqual_First() {
        setEscapedJavaDocCode_NotEqual_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls.First);
    }

    /**
     * NotEqual(&lt;&gt;). As Second (BAR). And OnlyOnceRegistered. <br />
     * Second: /*IF pmb.yourBarComment&#42;/&gt;&lt;&
     */
    public void setEscapedJavaDocCode_NotEqual_Second() {
        setEscapedJavaDocCode_NotEqual_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls.Second);
    }

    protected void doSetEscapedJavaDocCode_NotEqual(String escapedJavaDocCode) {
        regEscapedJavaDocCode(CK_NES, escapedJavaDocCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @param escapedJavaDocCodeList The collection of escapedJavaDocCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedJavaDocCode_InScope(Collection<String> escapedJavaDocCodeList) {
        doSetEscapedJavaDocCode_InScope(escapedJavaDocCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As EscapedJavaDocCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br />
     * /*IF pmb.yourTop&#42;/&gt;&lt;&
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedJavaDocCode_InScope_AsEscapedJavaDocCls(Collection<CDef.EscapedJavaDocCls> cdefList) {
        doSetEscapedJavaDocCode_InScope(cTStrL(cdefList));
    }

    /**
     * InScope {in ('a', 'b')}. As EscapedJavaDocCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * /*IF pmb.yourTop&#42;/&gt;&lt;& <br />
     * /*IF pmb.yourGroup&#42;/&gt;&lt;& <br />
     * The group elements:[First, Second]
     */
    public void setEscapedJavaDocCode_InScope_LineGroup() {
        setEscapedJavaDocCode_InScope_AsEscapedJavaDocCls(CDef.EscapedJavaDocCls.listOfLineGroup());
    }

    public void doSetEscapedJavaDocCode_InScope(Collection<String> escapedJavaDocCodeList) {
        regINS(CK_INS, cTL(escapedJavaDocCodeList), getCValueEscapedJavaDocCode(), "ESCAPED_JAVA_DOC_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @param escapedJavaDocCodeList The collection of escapedJavaDocCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedJavaDocCode_NotInScope(Collection<String> escapedJavaDocCodeList) {
        doSetEscapedJavaDocCode_NotInScope(escapedJavaDocCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As EscapedJavaDocCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br />
     * /*IF pmb.yourTop&#42;/&gt;&lt;&
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedJavaDocCode_NotInScope_AsEscapedJavaDocCls(Collection<CDef.EscapedJavaDocCls> cdefList) {
        doSetEscapedJavaDocCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetEscapedJavaDocCode_NotInScope(Collection<String> escapedJavaDocCodeList) {
        regINS(CK_NINS, cTL(escapedJavaDocCodeList), getCValueEscapedJavaDocCode(), "ESCAPED_JAVA_DOC_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     */
    public void setEscapedJavaDocCode_IsNull() { regEscapedJavaDocCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     */
    public void setEscapedJavaDocCode_IsNotNull() { regEscapedJavaDocCode(CK_ISNN, DOBJ); }

    protected void regEscapedJavaDocCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueEscapedJavaDocCode(), "ESCAPED_JAVA_DOC_CODE"); }
    protected abstract ConditionValue getCValueEscapedJavaDocCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocName The value of escapedJavaDocName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedJavaDocName_Equal(String escapedJavaDocName) {
        doSetEscapedJavaDocName_Equal(fRES(escapedJavaDocName));
    }

    protected void doSetEscapedJavaDocName_Equal(String escapedJavaDocName) {
        regEscapedJavaDocName(CK_EQ, escapedJavaDocName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocName The value of escapedJavaDocName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedJavaDocName_NotEqual(String escapedJavaDocName) {
        doSetEscapedJavaDocName_NotEqual(fRES(escapedJavaDocName));
    }

    protected void doSetEscapedJavaDocName_NotEqual(String escapedJavaDocName) {
        regEscapedJavaDocName(CK_NES, escapedJavaDocName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocNameList The collection of escapedJavaDocName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedJavaDocName_InScope(Collection<String> escapedJavaDocNameList) {
        doSetEscapedJavaDocName_InScope(escapedJavaDocNameList);
    }

    public void doSetEscapedJavaDocName_InScope(Collection<String> escapedJavaDocNameList) {
        regINS(CK_INS, cTL(escapedJavaDocNameList), getCValueEscapedJavaDocName(), "ESCAPED_JAVA_DOC_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocNameList The collection of escapedJavaDocName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedJavaDocName_NotInScope(Collection<String> escapedJavaDocNameList) {
        doSetEscapedJavaDocName_NotInScope(escapedJavaDocNameList);
    }

    public void doSetEscapedJavaDocName_NotInScope(Collection<String> escapedJavaDocNameList) {
        regINS(CK_NINS, cTL(escapedJavaDocNameList), getCValueEscapedJavaDocName(), "ESCAPED_JAVA_DOC_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocName The value of escapedJavaDocName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setEscapedJavaDocName_PrefixSearch(String escapedJavaDocName) {
        setEscapedJavaDocName_LikeSearch(escapedJavaDocName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)} <br />
     * <pre>e.g. setEscapedJavaDocName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param escapedJavaDocName The value of escapedJavaDocName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEscapedJavaDocName_LikeSearch(String escapedJavaDocName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(escapedJavaDocName), getCValueEscapedJavaDocName(), "ESCAPED_JAVA_DOC_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @param escapedJavaDocName The value of escapedJavaDocName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEscapedJavaDocName_NotLikeSearch(String escapedJavaDocName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(escapedJavaDocName), getCValueEscapedJavaDocName(), "ESCAPED_JAVA_DOC_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     */
    public void setEscapedJavaDocName_IsNull() { regEscapedJavaDocName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     */
    public void setEscapedJavaDocName_IsNullOrEmpty() { regEscapedJavaDocName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     */
    public void setEscapedJavaDocName_IsNotNull() { regEscapedJavaDocName(CK_ISNN, DOBJ); }

    protected void regEscapedJavaDocName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueEscapedJavaDocName(), "ESCAPED_JAVA_DOC_NAME"); }
    protected abstract ConditionValue getCValueEscapedJavaDocName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteEscapedJavaDocCB&gt;() {
     *     public void query(WhiteEscapedJavaDocCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedJavaDocCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteEscapedJavaDocCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteEscapedJavaDocCB&gt;() {
     *     public void query(WhiteEscapedJavaDocCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedJavaDocCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteEscapedJavaDocCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteEscapedJavaDocCB&gt;() {
     *     public void query(WhiteEscapedJavaDocCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedJavaDocCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteEscapedJavaDocCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteEscapedJavaDocCB&gt;() {
     *     public void query(WhiteEscapedJavaDocCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedJavaDocCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteEscapedJavaDocCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteEscapedJavaDocCB&gt;() {
     *     public void query(WhiteEscapedJavaDocCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedJavaDocCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteEscapedJavaDocCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteEscapedJavaDocCB&gt;() {
     *     public void query(WhiteEscapedJavaDocCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteEscapedJavaDocCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteEscapedJavaDocCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteEscapedJavaDocCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteEscapedJavaDocCQ sq);

    protected WhiteEscapedJavaDocCB xcreateScalarConditionCB() {
        WhiteEscapedJavaDocCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteEscapedJavaDocCB xcreateScalarConditionPartitionByCB() {
        WhiteEscapedJavaDocCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteEscapedJavaDocCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "ESCAPED_JAVA_DOC_CODE";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteEscapedJavaDocCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteEscapedJavaDocCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteEscapedJavaDocCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ESCAPED_JAVA_DOC_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteEscapedJavaDocCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteEscapedJavaDocCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteEscapedJavaDocCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteEscapedJavaDocCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteEscapedJavaDocCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, No modifier specified)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue, modifier);
    }

    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, no modifier specified)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteEscapedJavaDocCB newMyCB() {
        return new WhiteEscapedJavaDocCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteEscapedJavaDocCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
