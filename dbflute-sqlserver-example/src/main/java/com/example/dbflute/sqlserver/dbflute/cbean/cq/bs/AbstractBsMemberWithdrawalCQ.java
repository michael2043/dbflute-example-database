package com.example.dbflute.sqlserver.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.sqlserver.dbflute.allcommon.*;
import com.example.dbflute.sqlserver.dbflute.cbean.*;
import com.example.dbflute.sqlserver.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of MEMBER_WITHDRAWAL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberWithdrawalCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberWithdrawalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
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
        return "MEMBER_WITHDRAWAL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, int(10), FK to MEMBER}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, int(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, int(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, int(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, int(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, int(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {PK, NotNull, int(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {PK, NotNull, int(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER where ...)} <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'in-scope'. (NotNull)
     */
    public void inScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemberId_InScopeRelation_Member(cb.query());
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "member");
    }
    public abstract String keepMemberId_InScopeRelation_Member(MemberCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER where ...)} <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'not in-scope'. (NotNull)
     */
    public void notInScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemberId_NotInScopeRelation_Member(cb.query());
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "member");
    }
    public abstract String keepMemberId_NotInScopeRelation_Member(MemberCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, int(10), FK to MEMBER}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, NotNull, int(10), FK to MEMBER}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {char(3), FK to WITHDRAWAL_REASON}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_Equal(String withdrawalReasonCode) {
        doSetWithdrawalReasonCode_Equal(fRES(withdrawalReasonCode));
    }

    protected void doSetWithdrawalReasonCode_Equal(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_EQ, withdrawalReasonCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {char(3), FK to WITHDRAWAL_REASON}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_NotEqual(String withdrawalReasonCode) {
        doSetWithdrawalReasonCode_NotEqual(fRES(withdrawalReasonCode));
    }

    protected void doSetWithdrawalReasonCode_NotEqual(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_NES, withdrawalReasonCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {char(3), FK to WITHDRAWAL_REASON}
     * @param withdrawalReasonCodeList The collection of withdrawalReasonCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_InScope(Collection<String> withdrawalReasonCodeList) {
        doSetWithdrawalReasonCode_InScope(withdrawalReasonCodeList);
    }

    public void doSetWithdrawalReasonCode_InScope(Collection<String> withdrawalReasonCodeList) {
        regINS(CK_INS, cTL(withdrawalReasonCodeList), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {char(3), FK to WITHDRAWAL_REASON}
     * @param withdrawalReasonCodeList The collection of withdrawalReasonCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_NotInScope(Collection<String> withdrawalReasonCodeList) {
        doSetWithdrawalReasonCode_NotInScope(withdrawalReasonCodeList);
    }

    public void doSetWithdrawalReasonCode_NotInScope(Collection<String> withdrawalReasonCodeList) {
        regINS(CK_NINS, cTL(withdrawalReasonCodeList), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {char(3), FK to WITHDRAWAL_REASON}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonCode_PrefixSearch(String withdrawalReasonCode) {
        setWithdrawalReasonCode_LikeSearch(withdrawalReasonCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {char(3), FK to WITHDRAWAL_REASON} <br />
     * <pre>e.g. setWithdrawalReasonCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param withdrawalReasonCode The value of withdrawalReasonCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWithdrawalReasonCode_LikeSearch(String withdrawalReasonCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(withdrawalReasonCode), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {char(3), FK to WITHDRAWAL_REASON}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWithdrawalReasonCode_NotLikeSearch(String withdrawalReasonCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(withdrawalReasonCode), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select WITHDRAWAL_REASON_CODE from WITHDRAWAL_REASON where ...)} <br />
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * @param subQuery The sub-query of WithdrawalReason for 'in-scope'. (NotNull)
     */
    public void inScopeWithdrawalReason(SubQuery<WithdrawalReasonCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WithdrawalReasonCB cb = new WithdrawalReasonCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepWithdrawalReasonCode_InScopeRelation_WithdrawalReason(cb.query());
        registerInScopeRelation(cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", pp, "withdrawalReason");
    }
    public abstract String keepWithdrawalReasonCode_InScopeRelation_WithdrawalReason(WithdrawalReasonCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select WITHDRAWAL_REASON_CODE from WITHDRAWAL_REASON where ...)} <br />
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * @param subQuery The sub-query of WithdrawalReason for 'not in-scope'. (NotNull)
     */
    public void notInScopeWithdrawalReason(SubQuery<WithdrawalReasonCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WithdrawalReasonCB cb = new WithdrawalReasonCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepWithdrawalReasonCode_NotInScopeRelation_WithdrawalReason(cb.query());
        registerNotInScopeRelation(cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", pp, "withdrawalReason");
    }
    public abstract String keepWithdrawalReasonCode_NotInScopeRelation_WithdrawalReason(WithdrawalReasonCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {char(3), FK to WITHDRAWAL_REASON}
     */
    public void setWithdrawalReasonCode_IsNull() { regWithdrawalReasonCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {char(3), FK to WITHDRAWAL_REASON}
     */
    public void setWithdrawalReasonCode_IsNotNull() { regWithdrawalReasonCode(CK_ISNN, DOBJ); }

    protected void regWithdrawalReasonCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE"); }
    protected abstract ConditionValue getCValueWithdrawalReasonCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_Equal(String withdrawalReasonInputText) {
        doSetWithdrawalReasonInputText_Equal(fRES(withdrawalReasonInputText));
    }

    protected void doSetWithdrawalReasonInputText_Equal(String withdrawalReasonInputText) {
        regWithdrawalReasonInputText(CK_EQ, withdrawalReasonInputText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_NotEqual(String withdrawalReasonInputText) {
        doSetWithdrawalReasonInputText_NotEqual(fRES(withdrawalReasonInputText));
    }

    protected void doSetWithdrawalReasonInputText_NotEqual(String withdrawalReasonInputText) {
        regWithdrawalReasonInputText(CK_NES, withdrawalReasonInputText);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputTextList The collection of withdrawalReasonInputText as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_InScope(Collection<String> withdrawalReasonInputTextList) {
        doSetWithdrawalReasonInputText_InScope(withdrawalReasonInputTextList);
    }

    public void doSetWithdrawalReasonInputText_InScope(Collection<String> withdrawalReasonInputTextList) {
        regINS(CK_INS, cTL(withdrawalReasonInputTextList), getCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputTextList The collection of withdrawalReasonInputText as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_NotInScope(Collection<String> withdrawalReasonInputTextList) {
        doSetWithdrawalReasonInputText_NotInScope(withdrawalReasonInputTextList);
    }

    public void doSetWithdrawalReasonInputText_NotInScope(Collection<String> withdrawalReasonInputTextList) {
        regINS(CK_NINS, cTL(withdrawalReasonInputTextList), getCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalReasonInputText_PrefixSearch(String withdrawalReasonInputText) {
        setWithdrawalReasonInputText_LikeSearch(withdrawalReasonInputText, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)} <br />
     * <pre>e.g. setWithdrawalReasonInputText_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWithdrawalReasonInputText_LikeSearch(String withdrawalReasonInputText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(withdrawalReasonInputText), getCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     * @param withdrawalReasonInputText The value of withdrawalReasonInputText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWithdrawalReasonInputText_NotLikeSearch(String withdrawalReasonInputText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(withdrawalReasonInputText), getCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     */
    public void setWithdrawalReasonInputText_IsNull() { regWithdrawalReasonInputText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     */
    public void setWithdrawalReasonInputText_IsNullOrEmpty() { regWithdrawalReasonInputText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {text(2147483647)}
     */
    public void setWithdrawalReasonInputText_IsNotNull() { regWithdrawalReasonInputText(CK_ISNN, DOBJ); }

    protected void regWithdrawalReasonInputText(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWithdrawalReasonInputText(), "WITHDRAWAL_REASON_INPUT_TEXT"); }
    protected abstract ConditionValue getCValueWithdrawalReasonInputText();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetime The value of withdrawalDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_Equal(java.sql.Timestamp withdrawalDatetime) {
        regWithdrawalDatetime(CK_EQ,  withdrawalDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetime The value of withdrawalDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_GreaterThan(java.sql.Timestamp withdrawalDatetime) {
        regWithdrawalDatetime(CK_GT,  withdrawalDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetime The value of withdrawalDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_LessThan(java.sql.Timestamp withdrawalDatetime) {
        regWithdrawalDatetime(CK_LT,  withdrawalDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetime The value of withdrawalDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_GreaterEqual(java.sql.Timestamp withdrawalDatetime) {
        regWithdrawalDatetime(CK_GE,  withdrawalDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetime The value of withdrawalDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setWithdrawalDatetime_LessEqual(java.sql.Timestamp withdrawalDatetime) {
        regWithdrawalDatetime(CK_LE, withdrawalDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>e.g. setWithdrawalDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of withdrawalDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of withdrawalDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setWithdrawalDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueWithdrawalDatetime(), "WITHDRAWAL_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of withdrawalDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of withdrawalDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setWithdrawalDatetime_DateFromTo(Date fromDate, Date toDate) {
        setWithdrawalDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetimeList The collection of withdrawalDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalDatetime_InScope(Collection<java.sql.Timestamp> withdrawalDatetimeList) {
        doSetWithdrawalDatetime_InScope(withdrawalDatetimeList);
    }

    protected void doSetWithdrawalDatetime_InScope(Collection<java.sql.Timestamp> withdrawalDatetimeList) {
        regINS(CK_INS, cTL(withdrawalDatetimeList), getCValueWithdrawalDatetime(), "WITHDRAWAL_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_DATETIME: {NotNull, datetime(23, 3)}
     * @param withdrawalDatetimeList The collection of withdrawalDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWithdrawalDatetime_NotInScope(Collection<java.sql.Timestamp> withdrawalDatetimeList) {
        doSetWithdrawalDatetime_NotInScope(withdrawalDatetimeList);
    }

    protected void doSetWithdrawalDatetime_NotInScope(Collection<java.sql.Timestamp> withdrawalDatetimeList) {
        regINS(CK_NINS, cTL(withdrawalDatetimeList), getCValueWithdrawalDatetime(), "WITHDRAWAL_DATETIME");
    }

    protected void regWithdrawalDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueWithdrawalDatetime(), "WITHDRAWAL_DATETIME"); }
    protected abstract ConditionValue getCValueWithdrawalDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetime The value of registerDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueRegisterDatetime(), "REGISTER_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of registerDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setRegisterDatetime_DateFromTo(Date fromDate, Date toDate) {
        setRegisterDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetimeList The collection of registerDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterDatetime_InScope(Collection<java.sql.Timestamp> registerDatetimeList) {
        doSetRegisterDatetime_InScope(registerDatetimeList);
    }

    protected void doSetRegisterDatetime_InScope(Collection<java.sql.Timestamp> registerDatetimeList) {
        regINS(CK_INS, cTL(registerDatetimeList), getCValueRegisterDatetime(), "REGISTER_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REGISTER_DATETIME: {NotNull, datetime(23, 3)}
     * @param registerDatetimeList The collection of registerDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterDatetime_NotInScope(Collection<java.sql.Timestamp> registerDatetimeList) {
        doSetRegisterDatetime_NotInScope(registerDatetimeList);
    }

    protected void doSetRegisterDatetime_NotInScope(Collection<java.sql.Timestamp> registerDatetimeList) {
        regINS(CK_NINS, cTL(registerDatetimeList), getCValueRegisterDatetime(), "REGISTER_DATETIME");
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue getCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_Equal(String registerProcess) {
        doSetRegisterProcess_Equal(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_Equal(String registerProcess) {
        regRegisterProcess(CK_EQ, registerProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_NotEqual(String registerProcess) {
        doSetRegisterProcess_NotEqual(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_NotEqual(String registerProcess) {
        regRegisterProcess(CK_NES, registerProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcessList The collection of registerProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_InScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_InScope(registerProcessList);
    }

    public void doSetRegisterProcess_InScope(Collection<String> registerProcessList) {
        regINS(CK_INS, cTL(registerProcessList), getCValueRegisterProcess(), "REGISTER_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcessList The collection of registerProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_NotInScope(registerProcessList);
    }

    public void doSetRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        regINS(CK_NINS, cTL(registerProcessList), getCValueRegisterProcess(), "REGISTER_PROCESS");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_PrefixSearch(String registerProcess) {
        setRegisterProcess_LikeSearch(registerProcess, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_PROCESS: {NotNull, nvarchar(200)} <br />
     * <pre>e.g. setRegisterProcess_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerProcess The value of registerProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterProcess_LikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerProcess), getCValueRegisterProcess(), "REGISTER_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_PROCESS: {NotNull, nvarchar(200)}
     * @param registerProcess The value of registerProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegisterProcess_NotLikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerProcess), getCValueRegisterProcess(), "REGISTER_PROCESS", likeSearchOption);
    }

    protected void regRegisterProcess(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterProcess(), "REGISTER_PROCESS"); }
    protected abstract ConditionValue getCValueRegisterProcess();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUserList The collection of registerUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    public void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), getCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUserList The collection of registerUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    public void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), getCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_PrefixSearch(String registerUser) {
        setRegisterUser_LikeSearch(registerUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, nvarchar(200)} <br />
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), getCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, nvarchar(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), getCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue getCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetime The value of updateDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueUpdateDatetime(), "UPDATE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of updateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of updateDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setUpdateDatetime_DateFromTo(Date fromDate, Date toDate) {
        setUpdateDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetimeList The collection of updateDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateDatetime_InScope(Collection<java.sql.Timestamp> updateDatetimeList) {
        doSetUpdateDatetime_InScope(updateDatetimeList);
    }

    protected void doSetUpdateDatetime_InScope(Collection<java.sql.Timestamp> updateDatetimeList) {
        regINS(CK_INS, cTL(updateDatetimeList), getCValueUpdateDatetime(), "UPDATE_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UPDATE_DATETIME: {NotNull, datetime(23, 3)}
     * @param updateDatetimeList The collection of updateDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateDatetime_NotInScope(Collection<java.sql.Timestamp> updateDatetimeList) {
        doSetUpdateDatetime_NotInScope(updateDatetimeList);
    }

    protected void doSetUpdateDatetime_NotInScope(Collection<java.sql.Timestamp> updateDatetimeList) {
        regINS(CK_NINS, cTL(updateDatetimeList), getCValueUpdateDatetime(), "UPDATE_DATETIME");
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue getCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_Equal(String updateProcess) {
        doSetUpdateProcess_Equal(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_Equal(String updateProcess) {
        regUpdateProcess(CK_EQ, updateProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_NotEqual(String updateProcess) {
        doSetUpdateProcess_NotEqual(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_NotEqual(String updateProcess) {
        regUpdateProcess(CK_NES, updateProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcessList The collection of updateProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_InScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_InScope(updateProcessList);
    }

    public void doSetUpdateProcess_InScope(Collection<String> updateProcessList) {
        regINS(CK_INS, cTL(updateProcessList), getCValueUpdateProcess(), "UPDATE_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcessList The collection of updateProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_NotInScope(updateProcessList);
    }

    public void doSetUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        regINS(CK_NINS, cTL(updateProcessList), getCValueUpdateProcess(), "UPDATE_PROCESS");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_PrefixSearch(String updateProcess) {
        setUpdateProcess_LikeSearch(updateProcess, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_PROCESS: {NotNull, nvarchar(200)} <br />
     * <pre>e.g. setUpdateProcess_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateProcess The value of updateProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateProcess_LikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateProcess), getCValueUpdateProcess(), "UPDATE_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_PROCESS: {NotNull, nvarchar(200)}
     * @param updateProcess The value of updateProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdateProcess_NotLikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateProcess), getCValueUpdateProcess(), "UPDATE_PROCESS", likeSearchOption);
    }

    protected void regUpdateProcess(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateProcess(), "UPDATE_PROCESS"); }
    protected abstract ConditionValue getCValueUpdateProcess();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUserList The collection of updateUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    public void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), getCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUserList The collection of updateUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    public void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), getCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_PrefixSearch(String updateUser) {
        setUpdateUser_LikeSearch(updateUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, nvarchar(200)} <br />
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), getCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, nvarchar(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), getCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue getCValueUpdateUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Long versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Long versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Long versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Long versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Long> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Long> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {NotNull, bigint(19)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Long> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Long> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberWithdrawalCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberWithdrawalCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, MemberWithdrawalCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberWithdrawalCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberWithdrawalCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, MemberWithdrawalCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberWithdrawalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberWithdrawalCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, MemberWithdrawalCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberWithdrawalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberWithdrawalCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, MemberWithdrawalCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberWithdrawalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberWithdrawalCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, MemberWithdrawalCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberWithdrawalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberWithdrawalCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, MemberWithdrawalCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        MemberWithdrawalCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(MemberWithdrawalCQ sq);

    protected MemberWithdrawalCB xcreateScalarConditionCB() {
        MemberWithdrawalCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberWithdrawalCB xcreateScalarConditionPartitionByCB() {
        MemberWithdrawalCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberWithdrawalCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MEMBER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberWithdrawalCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberWithdrawalCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberWithdrawalCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberWithdrawalCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberWithdrawalCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(MemberWithdrawalCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderBean mob) { // is user public!
        xdoWithManualOrder(mob);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    @Override
    protected void filterFromToOption(FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MemberWithdrawalCB newMyCB() {
        return new MemberWithdrawalCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberWithdrawalCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
