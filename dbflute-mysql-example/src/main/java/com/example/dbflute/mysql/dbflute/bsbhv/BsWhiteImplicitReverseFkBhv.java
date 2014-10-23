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
package com.example.dbflute.mysql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.bsbhv.loader.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_IMPLICIT_REVERSE_FK as TABLE. <br />
 * <pre>
 * [primary key]
 *     WHITE_IMPLICIT_REVERSE_FK_ID
 *
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_ID, WHITE_IMPLICIT_REVERSE_FK_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     WHITE_IMPLICIT_REVERSE_FK_REF(WithImplicitReverseFK), WHITE_IMPLICIT_REVERSE_FK_SUPPRESS(SuppressImplicitReverseFK)
 *
 * [referrer table]
 *     white_implicit_reverse_fk_ref
 *
 * [foreign property]
 *     whiteImplicitReverseFkRefWithImplicitReverseFK, whiteImplicitReverseFkSuppressSuppressImplicitReverseFK
 *
 * [referrer property]
 *     whiteImplicitReverseFkRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitReverseFkBhv extends AbstractBehaviorWritable<WhiteImplicitReverseFk, WhiteImplicitReverseFkCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteImplicitReverseFkDbm getDBMeta() { return WhiteImplicitReverseFkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteImplicitReverseFkDbm getMyDBMeta() { return WhiteImplicitReverseFkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteImplicitReverseFkCB newConditionBean() { return new WhiteImplicitReverseFkCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteImplicitReverseFk newMyEntity() { return new WhiteImplicitReverseFk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteImplicitReverseFkCB newMyConditionBean() { return new WhiteImplicitReverseFkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * int count = whiteImplicitReverseFkBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitReverseFkCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFk whiteImplicitReverseFk = whiteImplicitReverseFkBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteImplicitReverseFk != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteImplicitReverseFk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFk selectEntity(WhiteImplicitReverseFkCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteImplicitReverseFk facadeSelectEntity(WhiteImplicitReverseFkCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitReverseFk> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteImplicitReverseFkCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFk whiteImplicitReverseFk = whiteImplicitReverseFkBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitReverseFk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFk selectEntityWithDeletedCheck(WhiteImplicitReverseFkCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param whiteImplicitReverseFkId : PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFk selectByPKValue(Integer whiteImplicitReverseFkId) {
        return facadeSelectByPKValue(whiteImplicitReverseFkId);
    }

    protected WhiteImplicitReverseFk facadeSelectByPKValue(Integer whiteImplicitReverseFkId) {
        return doSelectByPK(whiteImplicitReverseFkId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitReverseFk> ENTITY doSelectByPK(Integer whiteImplicitReverseFkId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(whiteImplicitReverseFkId), tp);
    }

    protected <ENTITY extends WhiteImplicitReverseFk> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer whiteImplicitReverseFkId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(whiteImplicitReverseFkId, tp), whiteImplicitReverseFkId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param whiteImplicitReverseFkId : PK, ID, NotNull, INT(10), FK to WHITE_IMPLICIT_REVERSE_FK_REF. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFk selectByPKValueWithDeletedCheck(Integer whiteImplicitReverseFkId) {
        return doSelectByPKWithDeletedCheck(whiteImplicitReverseFkId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitReverseFk> ENTITY doSelectByPKWithDeletedCheck(Integer whiteImplicitReverseFkId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(whiteImplicitReverseFkId), tp);
    }

    protected WhiteImplicitReverseFkCB xprepareCBAsPK(Integer whiteImplicitReverseFkId) {
        assertObjectNotNull("whiteImplicitReverseFkId", whiteImplicitReverseFkId);
        return newConditionBean().acceptPK(whiteImplicitReverseFkId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteImplicitReverseFk&gt; whiteImplicitReverseFkList = whiteImplicitReverseFkBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteImplicitReverseFk whiteImplicitReverseFk : whiteImplicitReverseFkList) {
     *     ... = whiteImplicitReverseFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitReverseFk> selectList(WhiteImplicitReverseFkCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitReverseFk&gt; page = whiteImplicitReverseFkBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteImplicitReverseFk whiteImplicitReverseFk : page) {
     *     ... = whiteImplicitReverseFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitReverseFk> selectPage(WhiteImplicitReverseFkCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteImplicitReverseFk&gt;() {
     *     public void handle(WhiteImplicitReverseFk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitReverseFk. (NotNull)
     */
    public void selectCursor(WhiteImplicitReverseFkCB cb, EntityRowHandler<WhiteImplicitReverseFk> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteImplicitReverseFkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteImplicitReverseFkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer by the the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteImplicitReverseFkList The entity list of whiteImplicitReverseFk. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, ReferrerLoaderHandler<LoaderOfWhiteImplicitReverseFk> handler) {
        xassLRArg(whiteImplicitReverseFkList, handler);
        handler.handle(new LoaderOfWhiteImplicitReverseFk().ready(whiteImplicitReverseFkList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteImplicitReverseFk The entity of whiteImplicitReverseFk. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteImplicitReverseFk whiteImplicitReverseFk, ReferrerLoaderHandler<LoaderOfWhiteImplicitReverseFk> handler) {
        xassLRArg(whiteImplicitReverseFk, handler);
        handler.handle(new LoaderOfWhiteImplicitReverseFk().ready(xnewLRAryLs(whiteImplicitReverseFk), _behaviorSelector));
    }

    /**
     * Load referrer of whiteImplicitReverseFkRefList by the set-upper of referrer. <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefList'. <br />
     * Implicit Reverse FK to FK_WHITE_IMPLICIT_REVERSE_FK_REF_WITH
     * <pre>
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">loadWhiteImplicitReverseFkRefList</span>(whiteImplicitReverseFkList, new ConditionBeanSetupper&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void setup(WhiteImplicitReverseFkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteImplicitReverseFk whiteImplicitReverseFk : whiteImplicitReverseFkList) {
     *     ... = whiteImplicitReverseFk.<span style="color: #DD4747">getWhiteImplicitReverseFkRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWhiteImplicitReverseFkId_InScope(pkList);
     * cb.query().addOrderBy_WhiteImplicitReverseFkId_Asc();
     * </pre>
     * @param whiteImplicitReverseFkList The entity list of whiteImplicitReverseFk. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitReverseFkRef> loadWhiteImplicitReverseFkRefList(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, ConditionBeanSetupper<WhiteImplicitReverseFkRefCB> setupper) {
        xassLRArg(whiteImplicitReverseFkList, setupper);
        return doLoadWhiteImplicitReverseFkRefList(whiteImplicitReverseFkList, new LoadReferrerOption<WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkRef>().xinit(setupper));
    }

    /**
     * Load referrer of whiteImplicitReverseFkRefList by the set-upper of referrer. <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefList'. <br />
     * Implicit Reverse FK to FK_WHITE_IMPLICIT_REVERSE_FK_REF_WITH
     * <pre>
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">loadWhiteImplicitReverseFkRefList</span>(whiteImplicitReverseFkList, new ConditionBeanSetupper&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void setup(WhiteImplicitReverseFkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteImplicitReverseFk.<span style="color: #DD4747">getWhiteImplicitReverseFkRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWhiteImplicitReverseFkId_InScope(pkList);
     * cb.query().addOrderBy_WhiteImplicitReverseFkId_Asc();
     * </pre>
     * @param whiteImplicitReverseFk The entity of whiteImplicitReverseFk. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitReverseFkRef> loadWhiteImplicitReverseFkRefList(WhiteImplicitReverseFk whiteImplicitReverseFk, ConditionBeanSetupper<WhiteImplicitReverseFkRefCB> setupper) {
        xassLRArg(whiteImplicitReverseFk, setupper);
        return doLoadWhiteImplicitReverseFkRefList(xnewLRLs(whiteImplicitReverseFk), new LoadReferrerOption<WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteImplicitReverseFk The entity of whiteImplicitReverseFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitReverseFkRef> loadWhiteImplicitReverseFkRefList(WhiteImplicitReverseFk whiteImplicitReverseFk, LoadReferrerOption<WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkRef> loadReferrerOption) {
        xassLRArg(whiteImplicitReverseFk, loadReferrerOption);
        return loadWhiteImplicitReverseFkRefList(xnewLRLs(whiteImplicitReverseFk), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteImplicitReverseFkList The entity list of whiteImplicitReverseFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteImplicitReverseFkRef> loadWhiteImplicitReverseFkRefList(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, LoadReferrerOption<WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkRef> loadReferrerOption) {
        xassLRArg(whiteImplicitReverseFkList, loadReferrerOption);
        if (whiteImplicitReverseFkList.isEmpty()) { return (NestedReferrerListGateway<WhiteImplicitReverseFkRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteImplicitReverseFkRefList(whiteImplicitReverseFkList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteImplicitReverseFkRef> doLoadWhiteImplicitReverseFkRefList(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, LoadReferrerOption<WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkRef> option) {
        return helpLoadReferrerInternally(whiteImplicitReverseFkList, option, "whiteImplicitReverseFkRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteImplicitReverseFkRef'.
     * @param whiteImplicitReverseFkList The list of whiteImplicitReverseFk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitReverseFkRef> pulloutWhiteImplicitReverseFkRefWithImplicitReverseFK(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList)
    { return helpPulloutInternally(whiteImplicitReverseFkList, "whiteImplicitReverseFkRefWithImplicitReverseFK"); }

    /**
     * Pull out the list of foreign table 'WhiteImplicitReverseFkSuppress'.
     * @param whiteImplicitReverseFkList The list of whiteImplicitReverseFk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitReverseFkSuppress> pulloutWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList)
    { return helpPulloutInternally(whiteImplicitReverseFkList, "whiteImplicitReverseFkSuppressSuppressImplicitReverseFK"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key whiteImplicitReverseFkId.
     * @param whiteImplicitReverseFkList The list of whiteImplicitReverseFk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractWhiteImplicitReverseFkIdList(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList)
    { return helpExtractListInternally(whiteImplicitReverseFkList, "whiteImplicitReverseFkId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFk.setFoo...(value);
     * whiteImplicitReverseFk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.set...;</span>
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">insert</span>(whiteImplicitReverseFk);
     * ... = whiteImplicitReverseFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitReverseFk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitReverseFk whiteImplicitReverseFk) {
        doInsert(whiteImplicitReverseFk, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * whiteImplicitReverseFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitReverseFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitReverseFkBhv.<span style="color: #DD4747">update</span>(whiteImplicitReverseFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteImplicitReverseFk whiteImplicitReverseFk) {
        doUpdate(whiteImplicitReverseFk, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteImplicitReverseFk The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk) {
        doInsertOrUpdate(whiteImplicitReverseFk, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * whiteImplicitReverseFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitReverseFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitReverseFkBhv.<span style="color: #DD4747">delete</span>(whiteImplicitReverseFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFk The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitReverseFk whiteImplicitReverseFk) {
        doDelete(whiteImplicitReverseFk, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     *     whiteImplicitReverseFk.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitReverseFkList.add(whiteImplicitReverseFk);
     * }
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">batchInsert</span>(whiteImplicitReverseFkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList) {
        return doBatchInsert(whiteImplicitReverseFkList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     *     whiteImplicitReverseFk.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFk.setFooPrice(123);
     *     } else {
     *         whiteImplicitReverseFk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitReverseFk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitReverseFkList.add(whiteImplicitReverseFk);
     * }
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitReverseFkList);
     * </pre>
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList) {
        return doBatchUpdate(whiteImplicitReverseFkList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitReverseFkList, new SpecifyQuery<WhiteImplicitReverseFkCB>() {
     *     public void specify(WhiteImplicitReverseFkCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitReverseFkList, new SpecifyQuery<WhiteImplicitReverseFkCB>() {
     *     public void specify(WhiteImplicitReverseFkCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, SpecifyQuery<WhiteImplicitReverseFkCB> updateColumnSpec) {
        return doBatchUpdate(whiteImplicitReverseFkList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList) {
        return doBatchDelete(whiteImplicitReverseFkList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitReverseFk, WhiteImplicitReverseFkCB&gt;() {
     *     public ConditionBean setup(WhiteImplicitReverseFk entity, WhiteImplicitReverseFkCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The set-upper of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WhiteImplicitReverseFk, WhiteImplicitReverseFkCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setPK...(value);</span>
     * whiteImplicitReverseFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setVersionNo(value);</span>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">queryUpdate</span>(whiteImplicitReverseFk, cb);
     * </pre>
     * @param whiteImplicitReverseFk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk, WhiteImplicitReverseFkCB cb) {
        return doQueryUpdate(whiteImplicitReverseFk, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">queryDelete</span>(whiteImplicitReverseFk, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitReverseFkCB cb) {
        return doQueryDelete(cb, null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFk.setFoo...(value);
     * whiteImplicitReverseFk.setBar...(value);
     * InsertOption<WhiteImplicitReverseFkCB> option = new InsertOption<WhiteImplicitReverseFkCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">varyingInsert</span>(whiteImplicitReverseFk, option);
     * ... = whiteImplicitReverseFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitReverseFk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitReverseFk whiteImplicitReverseFk, InsertOption<WhiteImplicitReverseFkCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteImplicitReverseFk, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * whiteImplicitReverseFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitReverseFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteImplicitReverseFkCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *         public void specify(WhiteImplicitReverseFkCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteImplicitReverseFkBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteImplicitReverseFk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk, UpdateOption<WhiteImplicitReverseFkCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteImplicitReverseFk, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitReverseFk The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk, InsertOption<WhiteImplicitReverseFkCB> insertOption, UpdateOption<WhiteImplicitReverseFkCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteImplicitReverseFk, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteImplicitReverseFk The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitReverseFk whiteImplicitReverseFk, DeleteOption<WhiteImplicitReverseFkCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteImplicitReverseFk, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, InsertOption<WhiteImplicitReverseFkCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteImplicitReverseFkList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, UpdateOption<WhiteImplicitReverseFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteImplicitReverseFkList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, DeleteOption<WhiteImplicitReverseFkCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteImplicitReverseFkList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The set-upper of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitReverseFk, WhiteImplicitReverseFkCB> setupper, InsertOption<WhiteImplicitReverseFkCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setPK...(value);</span>
     * whiteImplicitReverseFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setVersionNo(value);</span>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitReverseFkCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void specify(WhiteImplicitReverseFkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteImplicitReverseFkBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteImplicitReverseFk, cb, option);
     * </pre>
     * @param whiteImplicitReverseFk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk, WhiteImplicitReverseFkCB cb, UpdateOption<WhiteImplicitReverseFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteImplicitReverseFk, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitReverseFkCB cb, DeleteOption<WhiteImplicitReverseFkCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     *
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     *
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     *
     * {Cursor}
     *   o cursorHandling().selectCursor()
     *
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhiteImplicitReverseFkBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteImplicitReverseFkBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteImplicitReverseFk> typeOfSelectedEntity() { return WhiteImplicitReverseFk.class; }
    protected Class<WhiteImplicitReverseFk> typeOfHandlingEntity() { return WhiteImplicitReverseFk.class; }
    protected Class<WhiteImplicitReverseFkCB> typeOfHandlingConditionBean() { return WhiteImplicitReverseFkCB.class; }
}
