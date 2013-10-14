package com.example.dbflute.db2.dbflute.vendor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.seasar.dbflute.bhv.QueryInsertSetupper;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.ManualOrderBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.coption.DerivedReferrerOption;
import org.seasar.dbflute.exception.SQLFailureException;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.db2.dbflute.allcommon.CDef;
import com.example.dbflute.db2.dbflute.cbean.MemberCB;
import com.example.dbflute.db2.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.db2.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.db2.dbflute.cbean.PurchaseCB;
import com.example.dbflute.db2.dbflute.cbean.WithdrawalReasonCB;
import com.example.dbflute.db2.dbflute.exbhv.MemberBhv;
import com.example.dbflute.db2.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.db2.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.db2.dbflute.exbhv.WithdrawalReasonBhv;
import com.example.dbflute.db2.dbflute.exentity.Member;
import com.example.dbflute.db2.dbflute.exentity.MemberSecurity;
import com.example.dbflute.db2.dbflute.exentity.MemberWithdrawal;
import com.example.dbflute.db2.dbflute.exentity.Purchase;
import com.example.dbflute.db2.dbflute.exentity.WithdrawalReason;
import com.example.dbflute.db2.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class VendorGrammerTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;
    private WithdrawalReasonBhv withdrawalReasonBhv;
    private MemberWithdrawalBhv memberWithdrawalBhv;

    // ===================================================================================
    //                                                                           InnerJoin
    //                                                                           =========
    public void test_innerJoin_nested_basic() {
        // ## Arrange ##
        int countAll;
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberStatusCode_Equal_Withdrawal();
            cb.query().queryMemberWithdrawalAsOne().setWithdrawalReasonCode_IsNotNull();
            countAll = memberBhv.selectCount(cb);
        }

        MemberCB cb = new MemberCB();
        cb.query().queryMemberWithdrawalAsOne().queryWithdrawalReason().innerJoin();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertTrue(cb.toDisplaySql().contains("inner join"));
        assertTrue(cb.toDisplaySql().contains("left outer join"));
        assertFalse(memberList.isEmpty());
        assertEquals(countAll, memberList.size());
        for (Member member : memberList) {
            log(member.toString());
        }
    }

    public void test_innerJoin_nested_branch() {
        // ## Arrange ##
        int countAll;
        {
            PurchaseCB cb = new PurchaseCB();
            cb.query().queryMember().queryMemberWithdrawalAsOne().queryWithdrawalReason()
                    .setWithdrawalReasonCode_IsNotNull();
            countAll = purchaseBhv.selectCount(cb);
        }

        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberSecurityAsOne();
        cb.setupSelect_Member().withMemberWithdrawalAsOne().withWithdrawalReason();
        cb.query().queryMember().queryMemberSecurityAsOne().inline().setMemberId_LessThan(10);
        cb.query().queryMember().queryMemberWithdrawalAsOne().queryWithdrawalReason().innerJoin();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertTrue(cb.toDisplaySql().contains("inner join"));
        assertTrue(cb.toDisplaySql().contains("left outer join"));
        assertFalse(purchaseList.isEmpty());
        assertEquals(countAll, purchaseList.size());
        boolean existsSecurity = false;
        boolean notExistsSecurity = false;
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember();
            log(purchase.getPurchaseId() + ", " + member.getMemberId() + ", " + member.getMemberName() + ", "
                    + member.getMemberSecurityAsOne());
            MemberSecurity security = member.getMemberSecurityAsOne();
            if (security != null) {
                assertTrue(member.getMemberId() < 10);
                existsSecurity = true;
            } else {
                assertTrue(member.getMemberId() >= 10);
                notExistsSecurity = true;
            }
        }
        assertTrue(existsSecurity);
        assertTrue(notExistsSecurity);
    }

    // ===================================================================================
    //                                                                         QueryInsert
    //                                                                         ===========
    public void test_queryInsert_basic() { // and fixed value, common column, exclusive control column
        // ## Arrange ##
        // assert pending
        //int countAll = memberWithdrawalBhv.selectCount(new MemberWithdrawalCB());
        Map<Integer, Member> formalizedMemberMap = new LinkedHashMap<Integer, Member>();
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberStatusCode_Equal_Formalized();
            ListResultBean<Member> memberList = memberBhv.selectList(cb);
            for (Member member : memberList) {
                formalizedMemberMap.put(member.getMemberId(), member);
            }
        }
        final WithdrawalReason firstReason;
        {
            WithdrawalReasonCB cb = new WithdrawalReasonCB();
            cb.fetchFirst(1);
            firstReason = withdrawalReasonBhv.selectEntityWithDeletedCheck(cb);
        }

        // ## Act ##
        try {
            memberWithdrawalBhv.queryInsert(new QueryInsertSetupper<MemberWithdrawal, MemberWithdrawalCB>() {
                public ConditionBean setup(MemberWithdrawal entity, MemberWithdrawalCB intoCB) {
                    // TODO jflute fixed value unsupported now on DB2
                    entity.setWithdrawalReasonCode(firstReason.getWithdrawalReasonCode());
                    MemberCB cb = new MemberCB();

                    intoCB.specify().columnMemberId().mappedFrom(cb.specify().columnMemberId());
                    intoCB.specify().columnWithdrawalDatetime().mappedFrom(cb.specify().columnFormalizedDatetime());
                    intoCB.specify().columnWithdrawalReasonInputText().mappedFrom(cb.specify().columnMemberName());
                    // same reason
                    intoCB.specify().columnRegisterDatetime().mappedFrom(cb.specify().columnRegisterDatetime());
                    intoCB.specify().columnRegisterUser().mappedFrom(cb.specify().columnRegisterUser());
                    intoCB.specify().columnUpdateDatetime().mappedFrom(cb.specify().columnUpdateDatetime());
                    intoCB.specify().columnUpdateUser().mappedFrom(cb.specify().columnUpdateUser());
                    intoCB.specify().columnVersionNo().mappedFrom(cb.specify().columnVersionNo());

                    cb.query().setMemberStatusCode_Equal_Formalized();
                    return cb;
                }
            });

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) { // bind parameter trouble? (anyway unsupported now)
            // OK
            log(e.getMessage());
        }

        // this is for the future fixed
        //// ## Assert ##
        //assertNotSame(0, inserted);
        //int actualCountAll = memberWithdrawalBhv.selectCount(new MemberWithdrawalCB());
        //assertNotSame(countAll, actualCountAll);
        //assertTrue(countAll < actualCountAll);
        //assertEquals(actualCountAll - countAll, inserted);
        //
        //MemberWithdrawalCB cb = new MemberWithdrawalCB();
        //List<Integer> memberIdList = DfCollectionUtil.newArrayList();
        //for (Member member : formalizedMemberMap.values()) {
        //    memberIdList.add(member.getMemberId());
        //}
        //cb.query().setMemberId_InScope(memberIdList);
        //ListResultBean<MemberWithdrawal> actualList = memberWithdrawalBhv.selectList(cb);
        //assertNotSame(0, actualList.size());
        //assertEquals(memberIdList.size(), actualList.size());
        //String fmt = "yyyy-MM-dd HH:mm:ss";
        //for (MemberWithdrawal actual : actualList) {
        //    String withdrawalReasonCode = actual.getWithdrawalReasonCode();
        //    assertNotNull(withdrawalReasonCode);
        //    assertEquals(firstReason.getWithdrawalReasonCode(), withdrawalReasonCode);
        //    Member member = formalizedMemberMap.get(actual.getMemberId());
        //    assertEquals(member.getMemberName(), actual.getWithdrawalReasonInputText());
        //
        //    // common columns
        //    AccessContext accessContext = AccessContext.getAccessContextOnThread();
        //    String registerTimestamp = DfTypeUtil.toString(accessContext.getAccessDate(), fmt);
        //    assertEquals(registerTimestamp, DfTypeUtil.toString(actual.getRegisterDatetime(), fmt));
        //    assertEquals(accessContext.getAccessUser(), actual.getRegisterUser());
        //    assertEquals(registerTimestamp, DfTypeUtil.toString(actual.getUpdateDatetime(), fmt));
        //    assertEquals(accessContext.getAccessUser(), actual.getUpdateUser());
        //}
    }

    public void test_queryInsert_with_DerivedReferrer() { // and relation, order-by, no specified
        // ## Arrange ##
        Map<Integer, Member> formalizedMemberMap = new LinkedHashMap<Integer, Member>();
        {
            MemberCB cb = new MemberCB();
            cb.setupSelect_MemberStatus();
            cb.specify().derivedMemberLoginList().max(new SubQuery<MemberLoginCB>() {
                public void query(MemberLoginCB subCB) {
                    subCB.specify().columnLoginDatetime();
                    subCB.query().setMobileLoginFlg_Equal_True();
                }
            }, Member.ALIAS_latestLoginDatetime);
            cb.query().setMemberStatusCode_Equal_Formalized();
            ListResultBean<Member> memberList = memberBhv.selectList(cb);
            for (Member member : memberList) {
                formalizedMemberMap.put(member.getMemberId(), member);
            }
        }
        final Timestamp coalesce = DfTypeUtil.toTimestamp("1234-10-24 12:34:56.147");

        try {
            // ## Act ##
            memberWithdrawalBhv.queryInsert(new QueryInsertSetupper<MemberWithdrawal, MemberWithdrawalCB>() {
                public ConditionBean setup(MemberWithdrawal entity, MemberWithdrawalCB intoCB) {
                    MemberCB cb = new MemberCB();
                    cb.setupSelect_MemberStatus();
                    cb.specify().derivedMemberLoginList().max(new SubQuery<MemberLoginCB>() {
                        public void query(MemberLoginCB subCB) {
                            subCB.specify().columnLoginDatetime();
                            subCB.query().setMobileLoginFlg_Equal_True();
                        }
                    }, Member.ALIAS_latestLoginDatetime, new DerivedReferrerOption().coalesce(coalesce));

                    intoCB.specify().columnMemberId().mappedFrom(cb.specify().columnMemberId());
                    intoCB.specify().columnWithdrawalDatetime().mappedFromDerived(Member.ALIAS_latestLoginDatetime);
                    intoCB.specify().columnWithdrawalReasonInputText()
                            .mappedFrom(cb.specify().specifyMemberStatus().columnMemberStatusName());

                    cb.query().setMemberStatusCode_Equal_Formalized();
                    cb.query().addOrderBy_Birthdate_Desc().withNullsLast();
                    cb.query().addOrderBy_MemberId_Asc();
                    return cb;
                }
            });

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) { // bind parameter trouble? (anyway unsupported now)
            // OK
            log(e.getMessage());
        }

        // this is for the future fixed
        //// ## Assert ##
        //MemberWithdrawalCB cb = new MemberWithdrawalCB();
        //List<Integer> memberIdList = DfCollectionUtil.newArrayList();
        //for (Member member : formalizedMemberMap.values()) {
        //    memberIdList.add(member.getMemberId());
        //}
        //cb.query().setMemberId_InScope(memberIdList);
        //ListResultBean<MemberWithdrawal> actualList = memberWithdrawalBhv.selectList(cb);
        //assertNotSame(0, actualList.size());
        //String fmt = "yyyy-MM-dd HH:mm:ss";
        //Set<String> existsSet = new HashSet<String>();
        //for (MemberWithdrawal actual : actualList) {
        //    String withdrawalDatetime = DfTypeUtil.toString(actual.getWithdrawalDatetime(), fmt);
        //    String coalesceDatetime = DfTypeUtil.toString(coalesce, fmt);
        //    Member member = formalizedMemberMap.get(actual.getMemberId());
        //    assertNotNull(member);
        //    if (withdrawalDatetime.equals(coalesceDatetime)) {
        //        assertNull(member.getLatestLoginDatetime());
        //        existsSet.add("coalesce");
        //    } else {
        //        String latestLoginDatetime = DfTypeUtil.toString(member.getLatestLoginDatetime(), fmt);
        //        assertNotNull(latestLoginDatetime);
        //        assertEquals(latestLoginDatetime, withdrawalDatetime);
        //        existsSet.add("latest");
        //    }
        //    assertNull(actual.getWithdrawalReasonCode());
        //    assertEquals(member.getMemberStatus().getMemberStatusName(), actual.getWithdrawalReasonInputText());
        //}
        //assertEquals(2, existsSet.size());
    }

    public void test_InsertIntoSelect_binding() {
        // ## Act ##
        try {
            insertIntoSelectBinding();

            // ## Assert ##
            fail();
        } catch (SQLException e) {
            // OK
            StringBuilder sb = new StringBuilder();
            sb.append(ln()).append(e.getMessage());
            SQLException nextEx = e.getNextException();
            if (nextEx != null) {
                sb.append(ln()).append(nextEx.getMessage());
                SQLException nextNextEx = nextEx.getNextException();
                if (nextNextEx != null) {
                    sb.append(ln()).append(nextNextEx.getMessage());
                }
            }
            log(sb.toString());
        }
    }

    private void insertIntoSelectBinding() throws SQLException {
        DataSource ds = getDataSource();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // bind variables on select clause are unsupported on DB2
            // (also simple select)
            conn = ds.getConnection();
            StringBuilder sb = new StringBuilder();
            sb.append("insert into MEMBER_WITHDRAWAL (MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO)\n");
            sb.append("select dfres.MEMBER_ID, ?, dfres.MEMBER_NAME, dfres.FORMALIZED_DATETIME, dfres.REGISTER_DATETIME, dfres.REGISTER_USER, dfres.UPDATE_DATETIME, dfres.UPDATE_USER, dfres.VERSION_NO\n");
            sb.append("  from (select dfloc.MEMBER_ID as MEMBER_ID, dfloc.MEMBER_NAME as MEMBER_NAME, dfloc.FORMALIZED_DATETIME as FORMALIZED_DATETIME, dfloc.REGISTER_DATETIME as REGISTER_DATETIME, dfloc.REGISTER_USER as REGISTER_USER, dfloc.UPDATE_DATETIME as UPDATE_DATETIME, dfloc.UPDATE_USER as UPDATE_USER, dfloc.VERSION_NO as VERSION_NO\n");
            sb.append("          from MEMBER dfloc\n");
            sb.append("         where dfloc.MEMBER_STATUS_CODE = 'FML'\n");
            sb.append("       ) dfres");
            String sql = sb.toString();
            log(ln() + sql);
            ps = conn.prepareStatement(sql);
            ps.setString(1, "SIT");
            ps.execute();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // ===================================================================================
    //                                                                     OrderBy Binding
    //                                                                     ===============
    public void test_SwitchOrder_binding() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        // DB2 needs to suppress either 'then' or 'else' binding
        // she said 42610, 56098 (why?)
        // (cannot judge order column type by all binding?)
        ManualOrderBean mob = new ManualOrderBean().suppressElseBinding();
        mob.when_Equal(CDef.MemberStatus.Formalized).then(3);
        mob.when_Equal(CDef.MemberStatus.Provisional).then(4);
        mob.elseEnd(2);
        cb.query().addOrderBy_MemberStatusCode_Asc().withManualOrder(mob);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        List<CDef.MemberStatus> expectedList = newArrayList(CDef.MemberStatus.Withdrawal, CDef.MemberStatus.Formalized,
                CDef.MemberStatus.Provisional);
        Set<CDef.MemberStatus> actualSet = newLinkedHashSet();
        for (Member member : memberList) {
            actualSet.add(member.getMemberStatusCodeAsMemberStatus());
        }
        Iterator<CDef.MemberStatus> expectedIte = expectedList.iterator();
        Iterator<CDef.MemberStatus> actualIte = actualSet.iterator();
        assertEquals(expectedIte.next(), actualIte.next());
        assertEquals(expectedIte.next(), actualIte.next());
        assertEquals(expectedIte.next(), actualIte.next());
    }

    // ===================================================================================
    //                                                                       IsNullOrEmpty
    //                                                                       =============
    // DB's CLOB does not support 'equal' operand
    // so DBFlute does not generate the method for CLOB
    //public void test_isNullOrEmpty_basic() {
    //    // ## Arrange ##
    //    {
    //        MemberWithdrawalCB cb = new MemberWithdrawalCB();
    //        cb.query().setWithdrawalReasonInputText_IsNull();
    //        cb.fetchFirst(1);
    //        MemberWithdrawal before = memberWithdrawalBhv.selectEntityWithDeletedCheck(cb);
    //        before.setWithdrawalReasonInputText("");
    //        memberWithdrawalBhv.updateNonstrict(before);
    //    }
    //    {
    //        MemberWithdrawalCB cb = new MemberWithdrawalCB();
    //        cb.query().setWithdrawalReasonInputText_IsNotNull();
    //        cb.fetchFirst(1);
    //        MemberWithdrawal before = memberWithdrawalBhv.selectEntityWithDeletedCheck(cb);
    //        before.setWithdrawalReasonInputText(null);
    //        memberWithdrawalBhv.updateNonstrict(before);
    //    }
    //    MemberWithdrawalCB cb = new MemberWithdrawalCB();
    //    cb.query().setWithdrawalReasonInputText_IsNullOrEmpty(); // should not be generated
    //
    //    // ## Act ##
    //    try {
    //        memberWithdrawalBhv.selectList(cb);
    //
    //        // ## Assert ##
    //        fail();
    //    } catch (SQLFailureException e) {
    //        // OK
    //        log(e.getMessage());
    //    }
    //}
}
