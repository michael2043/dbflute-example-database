package com.example.dbflute.firebird.dbflute.howto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.jdbc.StatementConfig;

import com.example.dbflute.firebird.dbflute.allcommon.CDef;
import com.example.dbflute.firebird.dbflute.cbean.MemberAddressCB;
import com.example.dbflute.firebird.dbflute.cbean.MemberCB;
import com.example.dbflute.firebird.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.firebird.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.firebird.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.firebird.dbflute.cbean.PurchaseCB;
import com.example.dbflute.firebird.dbflute.exbhv.MemberBhv;
import com.example.dbflute.firebird.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.firebird.dbflute.exentity.Member;
import com.example.dbflute.firebird.dbflute.exentity.MemberAddress;
import com.example.dbflute.firebird.dbflute.exentity.MemberWithdrawal;
import com.example.dbflute.firebird.dbflute.exentity.Product;
import com.example.dbflute.firebird.dbflute.exentity.Purchase;
import com.example.dbflute.firebird.unit.AppContainerTestCase;

/**
 * @author jflute
 */
public class ConditionBeanPlatinumTest extends AppContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The behavior of Member. (Injection Object) */
    private MemberBhv memberBhv;

    /** The behavior of MemberWithdrawal. (Injection Object) */
    private MemberWithdrawalBhv memberWithdrawalBhv;

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    // -----------------------------------------------------
    //                                            LikeSearch
    //                                            ----------
    public void test_query_LikeSearch_likeContain_splitBySpace() {
        // ## Arrange ##
        String keyword = "S jko ic";
        MemberCB cb = new MemberCB();

        // *Point!
        LikeSearchOption option = new LikeSearchOption().likeContain().splitBySpace();
        cb.query().setMemberName_LikeSearch(keyword, option);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log("memberName=" + member.getMemberName());
            assertTrue(member.getMemberName().contains("S"));
            assertTrue(member.getMemberName().contains("jko"));
            assertTrue(member.getMemberName().contains("ic"));
        }
    }

    public void test_query_setMember_LikeSearch_likeContain_splitBySpace_asOrSplit() {
        // ## Arrange ##
        String keyword = "Sto avi uke";
        MemberCB cb = new MemberCB();

        // *Point!
        LikeSearchOption option = new LikeSearchOption().likeContain().splitBySpace().asOrSplit();
        cb.query().setMemberName_LikeSearch(keyword, option);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            String memberName = member.getMemberName();
            log("memberName=" + memberName);
            assertTrue(memberName.contains("Sto") || memberName.contains("avi") || memberName.contains("uke"));
        }
    }

    // -----------------------------------------------------
    //                                          Column Query
    //                                          ------------
    public void test_columnQuery() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).lessThan(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().specifyMemberWithdrawalAsOne().columnWithdrawalDatetime();
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member);
        }
    }

    // -----------------------------------------------------
    //                                        ExistsReferrer
    //                                        --------------
    public void test_query_exists_union() {
        final MemberCB cb = new MemberCB();
        final LikeSearchOption option = new LikeSearchOption().likeContain();
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB purchaseCB) {
                purchaseCB.query().setPurchaseCount_GreaterThan(2);
                purchaseCB.union(new UnionQuery<PurchaseCB>() {
                    public void query(PurchaseCB purchaseUnionCB) {
                        purchaseUnionCB.query().queryProduct().setProductName_LikeSearch("s", option);
                    }
                });
                purchaseCB.union(new UnionQuery<PurchaseCB>() {
                    public void query(PurchaseCB purchaseUnionCB) {
                        purchaseUnionCB.query().queryProduct().setProductName_LikeSearch("a", option);
                    }
                });
            }
        });

        // ## Act ##
        final ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        final ConditionBeanSetupper<PurchaseCB> setuppper = new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB cb) {
                cb.setupSelect_Product();
            }
        };
        memberBhv.loadPurchaseList(memberList, setuppper);
        for (Member member : memberList) {
            log("[member] " + member.getMemberId() + ", " + member.getMemberName());
            final List<Purchase> purchaseList = member.getPurchaseList();
            boolean existsPurchase = false;
            for (Purchase purchase : purchaseList) {
                final Product product = purchase.getProduct();
                final Integer purchaseCount = purchase.getPurchaseCount();
                final String productName = product.getProductName();
                log("  [purchase] " + purchase.getPurchaseId() + ", " + purchaseCount + ", " + productName);
                if (purchaseCount > 2 || productName.contains("s") || productName.contains("a")) {
                    existsPurchase = true;
                }
            }
            assertTrue(existsPurchase);
        }
    }

    // -----------------------------------------------------
    //                                      Nulls First/Last
    //                                      ----------------
    public void test_query_addOrderBy_withNullsFirst() {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();
        cb.query().addOrderBy_Birthdate_Asc().withNullsFirst();

        // ## Act ##
        final ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        boolean nulls = true;
        boolean border = false;
        for (Member member : memberList) {
            final Date birthday = member.getBirthdate();
            log(member.getMemberId() + ", " + member.getMemberName() + ", " + birthday);
            if (nulls) {
                if (birthday != null && !border) {
                    nulls = false;
                    border = true;
                    continue;
                }
                assertNull(birthday);
            } else {
                assertNotNull(birthday);
            }
        }
        assertTrue(border);
    }

    public void test_query_addOrderBy_withNullsLast() {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();
        cb.query().addOrderBy_Birthdate_Asc().withNullsLast();

        // ## Act ##
        final ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        boolean nulls = false;
        boolean border = false;
        for (Member member : memberList) {
            final Date birthday = member.getBirthdate();
            log(member.getMemberId() + ", " + member.getMemberName() + ", " + birthday);
            if (nulls) {
                assertNull(birthday);
            } else {
                if (birthday == null && !border) {
                    nulls = true;
                    border = true;
                    continue;
                }
                assertNotNull(birthday);
            }
        }
        assertTrue(border);
    }

    // unsupported
    //    public void test_query_addOrderBy_withNullsLast_and_union() {
    //        // ## Arrange ##
    //        final MemberCB cb = new MemberCB();
    //        cb.query().setBirthdate_IsNull();
    //        cb.union(new UnionQuery<MemberCB>() {
    //            public void query(MemberCB unionCB) {
    //                unionCB.query().setBirthdate_IsNotNull();
    //            }
    //        });
    //        cb.query().addOrderBy_Birthdate_Asc().withNullsLast();
    //
    //        // ## Act ##
    //        final ListResultBean<Member> memberList = memberBhv.selectList(cb);
    //
    //        // ## Assert ##
    //        boolean nulls = false;
    //        boolean border = false;
    //        for (Member member : memberList) {
    //            final Date birthday = member.getBirthdate();
    //            log(member.getMemberId() + ", " + member.getMemberName() + ", " + birthday);
    //            if (nulls) {
    //                assertNull(birthday);
    //            } else {
    //                if (birthday == null && !border) {
    //                    nulls = true;
    //                    border = true;
    //                    continue;
    //                }
    //                assertNotNull(birthday);
    //            }
    //        }
    //        assertTrue(border);
    //    }

    // -----------------------------------------------------
    //                                          Manual Order
    //                                          ------------
    public void test_query_addOrderBy_withManualOrder() {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();
        List<String> manualValueList = new ArrayList<String>();
        manualValueList.add(CDef.MemberStatus.WithdrawalMember.code());
        manualValueList.add(CDef.MemberStatus.FormalizedMember.code());
        manualValueList.add(CDef.MemberStatus.ProvisionalMember.code());
        cb.query().addOrderBy_MemberStatusCode_Asc().withManualOrder(manualValueList);
        cb.query().addOrderBy_Birthdate_Desc().withNullsLast();
        cb.query().addOrderBy_MemberName_Asc();

        // ## Act ##
        final ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        for (Member member : memberList) {
            String memberStatusCode = member.getMemberStatusCode();
            log(member.getMemberId() + ", " + member.getMemberName() + ", " + memberStatusCode);
            linkedHashSet.add(memberStatusCode);
        }
        List<String> list = new ArrayList<String>(linkedHashSet);
        assertEquals(CDef.MemberStatus.WithdrawalMember.code(), list.get(0));
        assertEquals(CDef.MemberStatus.FormalizedMember.code(), list.get(1));
        assertEquals(CDef.MemberStatus.ProvisionalMember.code(), list.get(2));
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    public void test_selectList_union_LoopIndefiniteSetting() {
        // ## Arrange ##
        String keywordDelimiterString = "S M D";
        List<String> keywordList = Arrays.asList(keywordDelimiterString.split(" "));

        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();

        final LikeSearchOption prefixOption = new LikeSearchOption().likePrefix();
        boolean first = true;
        for (final String keyword : keywordList) {
            if (first) {
                cb.query().setMemberAccount_LikeSearch(keyword, prefixOption);
                first = false;
                continue;
            }
            cb.union(new UnionQuery<MemberCB>() {
                public void query(MemberCB unionCB) {
                    unionCB.query().setMemberAccount_LikeSearch(keyword, prefixOption);
                }
            });
        }

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        log("/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        assertFalse(memberList.isEmpty());
        for (Member member : memberList) {
            String memberName = member.getMemberName();
            String memberAccount = member.getMemberAccount();
            log(memberName + "(" + memberAccount + ")");
            assertTrue("Unexpected memberAccount = " + memberAccount, memberAccount.startsWith("S")
                    || memberAccount.startsWith("M") || memberAccount.startsWith("D"));
        }
        log("* * * * * * * * * */");
    }

    public void test_selectPage_union_existsSubQuery() {
        // ## Arrange ##
        int fetchSize = 3;
        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_WithdrawalMember();
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
                unionCB.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.query().setPurchasePrice_GreaterEqual(1500);
                    }
                });
            }
        });
        cb.query().addOrderBy_Birthdate_Desc().addOrderBy_MemberId_Asc();

        // ## Act ##
        cb.paging(fetchSize, 1);
        PagingResultBean<Member> page1 = memberBhv.selectPage(cb);
        cb.paging(fetchSize, 2);
        PagingResultBean<Member> page2 = memberBhv.selectPage(cb);
        cb.paging(fetchSize, 3);
        PagingResultBean<Member> page3 = memberBhv.selectPage(cb);
        cb.paging(fetchSize, page1.getAllPageCount());// Last Page
        PagingResultBean<Member> lastPage = memberBhv.selectPage(cb);

        // ## Assert ##
        showPage(page1, page2, page3, lastPage);
        assertEquals(fetchSize, page1.size());
        assertEquals(fetchSize, page2.size());
        assertEquals(fetchSize, page3.size());
        assertNotSame(page1.get(0).getMemberId(), page2.get(0).getMemberId());
        assertNotSame(page2.get(0).getMemberId(), page3.get(0).getMemberId());
        assertNotSame(page3.get(0).getMemberId(), lastPage.get(0).getMemberId());
        assertEquals(1, page1.getCurrentPageNumber());
        assertEquals(2, page2.getCurrentPageNumber());
        assertEquals(3, page3.getCurrentPageNumber());
        assertEquals(page1.getAllPageCount(), lastPage.getCurrentPageNumber());
        assertEquals(page1.getAllRecordCount(), page2.getAllRecordCount());
        assertEquals(page2.getAllRecordCount(), page3.getAllRecordCount());
        assertEquals(page3.getAllRecordCount(), lastPage.getAllRecordCount());
        assertEquals(page1.getAllPageCount(), page2.getAllPageCount());
        assertEquals(page2.getAllPageCount(), page3.getAllPageCount());
        assertEquals(page3.getAllPageCount(), lastPage.getAllPageCount());
        assertFalse(page1.isExistPrePage());
        assertTrue(page1.isExistNextPage());
        assertTrue(lastPage.isExistPrePage());
        assertFalse(lastPage.isExistNextPage());

        ConditionBeanSetupper<PurchaseCB> setupper = new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB cb) {
                cb.query().setPurchasePrice_GreaterEqual(1500);
            }
        };
        memberBhv.loadPurchaseList(page1, setupper);
        memberBhv.loadPurchaseList(page2, setupper);
        memberBhv.loadPurchaseList(page3, setupper);
        memberBhv.loadPurchaseList(lastPage, setupper);
        SelectPageUnionExistsReferrerAssertBoolean bl = new SelectPageUnionExistsReferrerAssertBoolean();
        findTarget_of_selectPage_union_existsSubQuery(page1, bl);
        findTarget_of_selectPage_union_existsSubQuery(page2, bl);
        findTarget_of_selectPage_union_existsSubQuery(page3, bl);
        findTarget_of_selectPage_union_existsSubQuery(lastPage, bl);
        assertTrue(bl.isExistsWithdrawalOnly());
        assertTrue(bl.isExistsPurchasePriceOnly());

        log("/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        log(ln() + cb.toDisplaySql());
        log("* * * * * * * * * */");
    }

    protected void findTarget_of_selectPage_union_existsSubQuery(PagingResultBean<Member> memberPage,
            SelectPageUnionExistsReferrerAssertBoolean bl) {
        for (Member member : memberPage) {
            List<Purchase> purchaseList = member.getPurchaseList();
            boolean existsPurchaseTarget = false;
            for (Purchase purchase : purchaseList) {
                if (purchase.getPurchasePrice() >= 1500) {
                    existsPurchaseTarget = true;
                }
            }
            if (!existsPurchaseTarget && member.isMemberStatusCodeWithdrawalMember()) {
                bl.setExistsWithdrawalOnly(true);
            } else if (existsPurchaseTarget && !member.isMemberStatusCodeWithdrawalMember()) {
                bl.setExistsPurchasePriceOnly(true);
            }
        }
    }

    protected static class SelectPageUnionExistsReferrerAssertBoolean {
        protected boolean existsWithdrawalOnly = false;
        protected boolean existsPurchasePriceOnly = false;

        public boolean isExistsWithdrawalOnly() {
            return existsWithdrawalOnly;
        }

        public void setExistsWithdrawalOnly(boolean existsWithdrawalOnly) {
            this.existsWithdrawalOnly = existsWithdrawalOnly;
        }

        public boolean isExistsPurchasePriceOnly() {
            return existsPurchasePriceOnly;
        }

        public void setExistsPurchasePriceOnly(boolean existsPurchasePriceOnly) {
            this.existsPurchasePriceOnly = existsPurchasePriceOnly;
        }
    }

    // ===================================================================================
    //                                                                            OnClause
    //                                                                            ========
    public void test_selectList_query_queryForeign_on() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberWithdrawalAsOne();

        // left outer join xxx on xxx = xxx and WithdrawalReasonCode is not null
        cb.query().queryMemberWithdrawalAsOne().on().setWithdrawalReasonCode_IsNotNull();

        // left outer join (select * from xxx where WithdrawalReasonCode is not null) xxx on xxx = xxx
        // cb.query().queryMemberWithdrawalAsOne().inline().setWithdrawalReasonCode_IsNotNull();

        cb.query().inScopeMemberWithdrawalAsOne(new SubQuery<MemberWithdrawalCB>() {
            public void query(MemberWithdrawalCB subCB) {
            }
        });
        cb.query().queryMemberWithdrawalAsOne().addOrderBy_WithdrawalDatetime_Desc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean existsMemberWithdrawal = false;
        boolean notExistsMemberWithdrawal = false;
        List<Integer> notExistsMemberIdList = new ArrayList<Integer>();
        for (Member member : memberList) {
            MemberWithdrawal memberWithdrawal = member.getMemberWithdrawalAsOne();
            if (memberWithdrawal != null) {
                log(member.getMemberName() + " -- " + memberWithdrawal.getWithdrawalReasonCode() + ", "
                        + memberWithdrawal.getWithdrawalDatetime());
                String withdrawalReasonCode = memberWithdrawal.getWithdrawalReasonCode();
                assertNotNull(withdrawalReasonCode);
                existsMemberWithdrawal = true;
            } else {
                log(member.getMemberName() + " -- " + memberWithdrawal);
                notExistsMemberWithdrawal = true;
                notExistsMemberIdList.add(member.getMemberId());
            }
        }
        assertTrue(existsMemberWithdrawal);
        assertTrue(notExistsMemberWithdrawal);
        for (Integer memberId : notExistsMemberIdList) {
            memberWithdrawalBhv.selectByPKValueWithDeletedCheck(memberId);// Expected no exception
        }
    }

    // ===================================================================================
    //                                                                      Specify Column
    //                                                                      ==============
    public void test_specifyColumn() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        cb.specify().columnMemberName();
        cb.specify().specifyMemberStatus().columnMemberStatusName();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            assertNotNull(member.getMemberId()); // PK
            assertNotNull(member.getMemberName()); // Specified
            assertNull(member.getMemberAccount());
            assertNull(member.getBirthdate());
            assertNull(member.getFormalizedDatetime());
            assertNull(member.getTableNameRegisterDatetime());
            assertNull(member.getTableNameRegisterProcess());
            assertNull(member.getTableNameRegisterUser());
            assertNull(member.getTableNameUpdateDatetime());
            assertNull(member.getTableNameUpdateProcess());
            assertNull(member.getTableNameUpdateUser());
            assertNull(member.getVersionNo());
            assertNotNull(member.getMemberStatusCode()); // SetupSelect FK
            assertNotNull(member.getMemberStatus().getMemberStatusCode()); // PK
            assertNotNull(member.getMemberStatus().getMemberStatusName()); // Specified
            assertNull(member.getMemberStatus().getDisplayOrder());
        }
    }

    // ===================================================================================
    //                                                            (Specify)DerivedReferrer
    //                                                            ========================
    public void test_sepcify_derivedReferrer_max() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedMemberLoginList().max(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().columnLoginDatetime();// *Point!
                subCB.query().setMobileLoginFlg_Equal_False();// Except Mobile
            }
        }, Member.ALIAS_latestLoginDatetime);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean existsLoginDatetime = false;
        boolean existsNullLoginDatetime = false;
        for (Member member : memberList) {
            String memberName = member.getMemberName();
            Date latestLoginDatetime = member.getLatestLoginDatetime();
            if (latestLoginDatetime != null) {
                existsLoginDatetime = true;
            } else {
                // ログインを一度もしていない会員、もしくは、モバイルでしかログイン
                // したことのない会員の最終ログイン日時はnullになる。
                existsNullLoginDatetime = true;
            }
            log("memberName=" + memberName + ", latestLoginDatetime=" + latestLoginDatetime);
        }
        assertTrue(existsLoginDatetime);
        assertTrue(existsNullLoginDatetime);
    }

    public void test_query_addSepcifidDerivedOrderBy_count() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedMemberLoginList().count(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().columnMemberLoginId();// *Point!
                subCB.query().setMobileLoginFlg_Equal_False();// Except Mobile
            }
        }, Member.ALIAS_loginCount);
        cb.query().addSpecifiedDerivedOrderBy_Desc(Member.ALIAS_loginCount);
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            String memberName = member.getMemberName();
            Integer loginCount = member.getLoginCount();
            assertNotNull(loginCount);// count()なので0件の場合は0になる(DB次第かも...)
            log("memberName=" + memberName + ", loginCount=" + loginCount);
        }
    }

    public void test_sepcify_derivedReferrer_countDistinct() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchaseList().countDistinct(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnProductId();
                subCB.query().setPaymentCompleteFlg_Equal_True();
            }
        }, Member.ALIAS_productKindCount);
        cb.query().addSpecifiedDerivedOrderBy_Desc(Member.ALIAS_productKindCount);
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            String memberName = member.getMemberName();
            Integer productKindCount = member.getProductKindCount();
            assertNotNull(productKindCount);// count()なので0件の場合は0になる(DB次第かも...)
            log("memberName=" + memberName + ", productKindCount=" + productKindCount);
        }
        assertTrue(cb.toDisplaySql().contains("count(distinct"));
    }

    // ===================================================================================
    //                                                              (Query)DerivedReferrer
    //                                                              ======================
    public void test_query_derivedReferrer_max_greaterEqual() {
        // ## Arrange ##
        Integer expected = 1800;

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_FormalizedMember();
        cb.query().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchasePrice(); // *Point!
                subCB.query().setPaymentCompleteFlg_Equal_True();
            }
        }).greaterEqual(expected); // *Don't forget!

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        memberBhv.loadPurchaseList(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB cb) {
                cb.query().setPaymentCompleteFlg_Equal_True();
            }
        });
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member);
            List<Purchase> purchaseList = member.getPurchaseList();
            boolean exists = false;
            for (Purchase purchase : purchaseList) {
                Integer purchasePrice = purchase.getPurchasePrice();
                if (purchasePrice >= expected) {
                    exists = true;
                }
            }
            assertTrue(exists);
        }
    }

    // ===================================================================================
    //                                                                      ScalarSubQuery
    //                                                                      ==============
    public void test_scalarSubQuery_Equal_max() {
        // ## Arrange ##
        Date expected = selectExpectedMaxBirthdayOnFormalized();

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_FormalizedMember();
        cb.query().scalar_Equal().max(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnBirthdate(); // *Point!
                subCB.query().setMemberStatusCode_Equal_FormalizedMember();
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            Date Birthdate = member.getBirthdate();
            assertEquals(expected, Birthdate);
        }
    }

    protected Date selectExpectedMaxBirthdayOnFormalized() {
        Date expected = null;
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberStatusCode_Equal_FormalizedMember();
            ListResultBean<Member> listAll = memberBhv.selectList(cb);
            for (Member member : listAll) {
                Date day = member.getBirthdate();
                if (day != null && (expected == null || expected.getTime() < day.getTime())) {
                    expected = day;
                }
            }
        }
        return expected;
    }

    // ===================================================================================
    //                                                                     Fixed Condition
    //                                                                     ===============
    public void test_fixedCondition_setupSelect() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2005, 11, 12); // 2005/12/12
        Date targetDate = cal.getTime();

        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsValid(targetDate);
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean existsAddress = false;
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
        String formattedTargetDate = fmt.format(targetDate);
        log("[" + formattedTargetDate + "]");
        for (Member member : memberList) {
            String memberName = member.getMemberName();
            MemberAddress memberAddressAsValid = member.getMemberAddressAsValid();
            if (memberAddressAsValid != null) {
                assertNotNull(memberAddressAsValid.getValidBeginDate());
                assertNotNull(memberAddressAsValid.getValidEndDate());
                String validBeginDate = fmt.format(memberAddressAsValid.getValidBeginDate());
                String validEndDate = fmt.format(memberAddressAsValid.getValidEndDate());
                assertTrue(validBeginDate.compareTo(formattedTargetDate) <= 0);
                assertTrue(validEndDate.compareTo(formattedTargetDate) >= 0);
                String address = memberAddressAsValid.getAddress();
                log(memberName + ", " + validBeginDate + ", " + validEndDate + ", " + address);
                existsAddress = true;
            } else {
                log(memberName + ", null");
            }
        }
        assertTrue(existsAddress);
        assertFalse(cb.toDisplaySql().contains("where")); // not use where clause
    }

    public void test_fixedCondition_query() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2005, 11, 12); // 2005/12/12
        final Date targetDate = cal.getTime();
        final String targetChar = "i";

        MemberCB cb = new MemberCB();
        LikeSearchOption likeSearchOption = new LikeSearchOption().likeContain();
        cb.query().queryMemberAddressAsValid(targetDate).setAddress_LikeSearch(targetChar, likeSearchOption);
        cb.query().queryMemberAddressAsValid(targetDate).addOrderBy_Address_Asc();
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        memberBhv.loadMemberAddressList(memberList, new ConditionBeanSetupper<MemberAddressCB>() {
            public void setup(MemberAddressCB cb) {
                cb.query().setAddress_LikeSearch(targetChar, new LikeSearchOption().likeContain());
                cb.query().setValidBeginDate_LessEqual(targetDate);
                cb.query().setValidEndDate_GreaterEqual(targetDate);
            }
        });
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
        String formattedTargetDate = fmt.format(targetDate);
        log("[" + formattedTargetDate + "]");
        for (Member member : memberList) {
            MemberAddress memberAddressAsValid = member.getMemberAddressAsValid();
            assertNull(memberAddressAsValid); // because of no setup-select.
            List<MemberAddress> memberAddressList = member.getMemberAddressList();
            assertEquals(1, memberAddressList.size());
            MemberAddress memberAddress = memberAddressList.get(0);
            String memberName = member.getMemberName();
            Date validBeginDate = memberAddress.getValidBeginDate();
            Date validEndDate = memberAddress.getValidEndDate();
            String address = memberAddress.getAddress();
            log(memberName + ", " + validBeginDate + ", " + validEndDate + ", " + address);
            assertTrue(memberAddress.getAddress().contains("a"));
        }
    }

    // ===================================================================================
    //                                                                    Statement Config
    //                                                                    ================
    public void test_configure_statementConfig() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.configure(new StatementConfig().typeForwardOnly().queryTimeout(7).fetchSize(4).maxRows(3));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertEquals(4, memberList.size()); // maxRows does not work at SQLite
    }

    // ===================================================================================
    //                                                                        ArrangeQuery
    //                                                                        ============
    public void test_arrangeQuery() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().arrangeServiceMember();
        cb.query().addOrderBy_MemberName_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member.toString());
            assertTrue(member.getMemberName().startsWith("S"));
            assertTrue(member.isMemberStatusCodeFormalizedMember());
        }
    }

    // ===================================================================================
    //                                                                         Display SQL
    //                                                                         ===========
    public void test_toDisplaySql_Check_FormattedSQL() {
        final MemberStatusCB cb = new MemberStatusCB();
        cb.query().setDisplayOrder_Equal(3);
        cb.query().existsMemberList(new SubQuery<MemberCB>() {
            public void query(MemberCB memberCB) {
                memberCB.query().setBirthdate_LessEqual(new Date());
                memberCB.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB purchaseCB) {
                        purchaseCB.query().setPurchaseCount_GreaterEqual(2);
                    }
                });
                memberCB.query().existsMemberWithdrawalAsOne(new SubQuery<MemberWithdrawalCB>() {
                    public void query(MemberWithdrawalCB subCB) {
                        final LikeSearchOption option = new LikeSearchOption().likeContain().escapeByPipeLine();
                        subCB.query().queryWithdrawalReason().setWithdrawalReasonCode_LikeSearch("xxx", option);
                        subCB.union(new UnionQuery<MemberWithdrawalCB>() {
                            public void query(MemberWithdrawalCB unionCB) {
                                unionCB.query().setWithdrawalReasonInputText_IsNotNull();
                            }
                        });
                    }
                });
            }
        });
        cb.query().setMemberStatusCode_Equal_FormalizedMember();
        cb.query().existsMemberLoginList(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.query().inScopeMember(new SubQuery<MemberCB>() {
                    public void query(MemberCB subCB) {
                        subCB.query().setBirthdate_GreaterEqual(new Date());
                    }
                });
            }
        });
        cb.query().addOrderBy_DisplayOrder_Asc().addOrderBy_MemberStatusCode_Desc();
        log(ln() + cb.toDisplaySql());
    }
}
