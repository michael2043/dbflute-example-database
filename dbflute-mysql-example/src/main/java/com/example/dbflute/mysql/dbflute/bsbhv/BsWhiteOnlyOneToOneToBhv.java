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
import org.seasar.dbflute.cbean.chelper.HpSLSExecutor;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.bsbhv.loader.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_ONLY_ONE_TO_ONE_TO as TABLE. <br />
 * <pre>
 * [primary key]
 *     TO_ID
 *
 * [column]
 *     TO_ID, TO_NAME, FROM_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TO_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     white_only_one_to_one_from
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteOnlyOneToOneFrom
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnlyOneToOneToBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_only_one_to_one_to"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteOnlyOneToOneToDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteOnlyOneToOneToDbm getMyDBMeta() { return WhiteOnlyOneToOneToDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteOnlyOneToOneTo newEntity() { return new WhiteOnlyOneToOneTo(); }

    /** {@inheritDoc} */
    public WhiteOnlyOneToOneToCB newConditionBean() { return new WhiteOnlyOneToOneToCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteOnlyOneToOneTo newMyEntity() { return new WhiteOnlyOneToOneTo(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteOnlyOneToOneToCB newMyConditionBean() { return new WhiteOnlyOneToOneToCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * int count = whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteOnlyOneToOneToCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteOnlyOneToOneToCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteOnlyOneToOneToCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteOnlyOneToOneToCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    protected int doReadCount(ConditionBean cb) { return facadeSelectCount(downcast(cb)); }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteOnlyOneToOneTo != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteOnlyOneToOneTo.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneTo selectEntity(WhiteOnlyOneToOneToCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteOnlyOneToOneTo facadeSelectEntity(WhiteOnlyOneToOneToCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> ENTITY doSelectEntity(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteOnlyOneToOneTo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneTo selectEntityWithDeletedCheck(WhiteOnlyOneToOneToCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteOnlyOneToOneTo facadeSelectEntityWithDeletedCheck(WhiteOnlyOneToOneToCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> ENTITY doSelectEntityWithDeletedCheck(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param toId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneTo selectByPKValue(Long toId) {
        return facadeSelectByPKValue(toId);
    }

    protected WhiteOnlyOneToOneTo facadeSelectByPKValue(Long toId) {
        return doSelectByPK(toId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> ENTITY doSelectByPK(Long toId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(toId), tp);
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> OptionalEntity<ENTITY> doSelectOptionalByPK(Long toId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(toId, tp), toId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param toId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneTo selectByPKValueWithDeletedCheck(Long toId) {
        return doSelectByPKWithDeletedCheck(toId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> ENTITY doSelectByPKWithDeletedCheck(Long toId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(toId), tp);
    }

    protected WhiteOnlyOneToOneToCB xprepareCBAsPK(Long toId) {
        assertObjectNotNull("toId", toId);
        return newConditionBean().acceptPK(toId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param fromId : UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteOnlyOneToOneTo> selectByUniqueOf(Long fromId) {
        return facadeSelectByUniqueOf(fromId);
    }

    protected OptionalEntity<WhiteOnlyOneToOneTo> facadeSelectByUniqueOf(Long fromId) {
        return doSelectByUniqueOf(fromId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> OptionalEntity<ENTITY> doSelectByUniqueOf(Long fromId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(fromId), tp), fromId);
    }

    protected WhiteOnlyOneToOneToCB xprepareCBAsUniqueOf(Long fromId) {
        assertObjectNotNull("fromId", fromId);
        return newConditionBean().acceptUniqueOf(fromId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteOnlyOneToOneTo&gt; whiteOnlyOneToOneToList = whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteOnlyOneToOneTo whiteOnlyOneToOneTo : whiteOnlyOneToOneToList) {
     *     ... = whiteOnlyOneToOneTo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteOnlyOneToOneTo> selectList(WhiteOnlyOneToOneToCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteOnlyOneToOneTo> facadeSelectList(WhiteOnlyOneToOneToCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> ListResultBean<ENTITY> doSelectList(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) {
        return helpSelectListInternally(cb, tp);
    }

    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) { return facadeSelectList(downcast(cb)); }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteOnlyOneToOneTo&gt; page = whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteOnlyOneToOneTo whiteOnlyOneToOneTo : page) {
     *     ... = whiteOnlyOneToOneTo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteOnlyOneToOneTo> selectPage(WhiteOnlyOneToOneToCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteOnlyOneToOneTo> facadeSelectPage(WhiteOnlyOneToOneToCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> PagingResultBean<ENTITY> doSelectPage(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteOnlyOneToOneTo&gt;() {
     *     public void handle(WhiteOnlyOneToOneTo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteOnlyOneToOneTo. (NotNull)
     */
    public void selectCursor(WhiteOnlyOneToOneToCB cb, EntityRowHandler<WhiteOnlyOneToOneTo> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteOnlyOneToOneToCB cb, EntityRowHandler<WhiteOnlyOneToOneTo> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> void doSelectCursor(WhiteOnlyOneToOneToCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteOnlyOneToOneToCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteOnlyOneToOneToCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteOnlyOneToOneToCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteOnlyOneToOneToCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        HpSLSExecutor<CB, RESULT> executor = createHpSLSExecutor(); // variable to resolve generic
        return createSLSFunction(cb, tp, executor);
    }

    protected <RESULT> HpSLSFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) { return facadeScalarSelect(tp); }

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
     * @param whiteOnlyOneToOneToList The entity list of whiteOnlyOneToOneTo. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, ReferrerLoaderHandler<LoaderOfWhiteOnlyOneToOneTo> handler) {
        xassLRArg(whiteOnlyOneToOneToList, handler);
        handler.handle(new LoaderOfWhiteOnlyOneToOneTo().ready(whiteOnlyOneToOneToList, _behaviorSelector));
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
     * @param whiteOnlyOneToOneTo The entity of whiteOnlyOneToOneTo. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, ReferrerLoaderHandler<LoaderOfWhiteOnlyOneToOneTo> handler) {
        xassLRArg(whiteOnlyOneToOneTo, handler);
        handler.handle(new LoaderOfWhiteOnlyOneToOneTo().ready(xnewLRAryLs(whiteOnlyOneToOneTo), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteOnlyOneToOneFrom'.
     * @param whiteOnlyOneToOneToList The list of whiteOnlyOneToOneTo. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteOnlyOneToOneFrom> pulloutWhiteOnlyOneToOneFrom(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList)
    { return helpPulloutInternally(whiteOnlyOneToOneToList, "whiteOnlyOneToOneFrom"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key toId.
     * @param whiteOnlyOneToOneToList The list of whiteOnlyOneToOneTo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractToIdList(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList)
    { return helpExtractListInternally(whiteOnlyOneToOneToList, "toId"); }

    /**
     * Extract the value list of (single) unique key fromId.
     * @param whiteOnlyOneToOneToList The list of whiteOnlyOneToOneTo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractFromIdList(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList)
    { return helpExtractListInternally(whiteOnlyOneToOneToList, "fromId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteOnlyOneToOneTo.setFoo...(value);
     * whiteOnlyOneToOneTo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.set...;</span>
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">insert</span>(whiteOnlyOneToOneTo);
     * ... = whiteOnlyOneToOneTo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteOnlyOneToOneTo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo) {
        doInsert(whiteOnlyOneToOneTo, null);
    }

    protected void doInsert(WhiteOnlyOneToOneTo et, InsertOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneTo", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteOnlyOneToOneToCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * whiteOnlyOneToOneTo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteOnlyOneToOneTo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteOnlyOneToOneTo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteOnlyOneToOneToBhv.<span style="color: #DD4747">update</span>(whiteOnlyOneToOneTo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteOnlyOneToOneTo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo) {
        doUpdate(whiteOnlyOneToOneTo, null);
    }

    protected void doUpdate(WhiteOnlyOneToOneTo et, UpdateOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneTo", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<WhiteOnlyOneToOneToCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhiteOnlyOneToOneToCB createCBForVaryingUpdate()
    { WhiteOnlyOneToOneToCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhiteOnlyOneToOneToCB createCBForSpecifiedUpdate()
    { WhiteOnlyOneToOneToCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteOnlyOneToOneTo The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo) {
        doInsertOrUpdate(whiteOnlyOneToOneTo, null, null);
    }

    protected void doInsertOrUpdate(WhiteOnlyOneToOneTo et, InsertOption<WhiteOnlyOneToOneToCB> iop, UpdateOption<WhiteOnlyOneToOneToCB> uop) {
        assertObjectNotNull("whiteOnlyOneToOneTo", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * whiteOnlyOneToOneTo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteOnlyOneToOneTo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteOnlyOneToOneToBhv.<span style="color: #DD4747">delete</span>(whiteOnlyOneToOneTo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteOnlyOneToOneTo The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo) {
        doDelete(whiteOnlyOneToOneTo, null);
    }

    protected void doDelete(WhiteOnlyOneToOneTo et, final DeleteOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneTo", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<WhiteOnlyOneToOneToCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) { doDelete(downcast(et), downcast(op)); }

    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op)
    { doRemove(et, op); }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     *     whiteOnlyOneToOneTo.setFooName("foo");
     *     if (...) {
     *         whiteOnlyOneToOneTo.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteOnlyOneToOneToList.add(whiteOnlyOneToOneTo);
     * }
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">batchInsert</span>(whiteOnlyOneToOneToList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList) {
        return doBatchInsert(whiteOnlyOneToOneToList, null);
    }

    protected int[] doBatchInsert(List<WhiteOnlyOneToOneTo> ls, InsertOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneToList", ls);
        InsertOption<WhiteOnlyOneToOneToCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhiteOnlyOneToOneTo> ls, InsertOption<WhiteOnlyOneToOneToCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) { return doBatchInsert(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     *     whiteOnlyOneToOneTo.setFooName("foo");
     *     if (...) {
     *         whiteOnlyOneToOneTo.setFooPrice(123);
     *     } else {
     *         whiteOnlyOneToOneTo.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteOnlyOneToOneToList.add(whiteOnlyOneToOneTo);
     * }
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">batchUpdate</span>(whiteOnlyOneToOneToList);
     * </pre>
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList) {
        return doBatchUpdate(whiteOnlyOneToOneToList, null);
    }

    protected int[] doBatchUpdate(List<WhiteOnlyOneToOneTo> ls, UpdateOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneToList", ls);
        UpdateOption<WhiteOnlyOneToOneToCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhiteOnlyOneToOneTo> ls, UpdateOption<WhiteOnlyOneToOneToCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">batchUpdate</span>(whiteOnlyOneToOneToList, new SpecifyQuery<WhiteOnlyOneToOneToCB>() {
     *     public void specify(WhiteOnlyOneToOneToCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">batchUpdate</span>(whiteOnlyOneToOneToList, new SpecifyQuery<WhiteOnlyOneToOneToCB>() {
     *     public void specify(WhiteOnlyOneToOneToCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, SpecifyQuery<WhiteOnlyOneToOneToCB> updateColumnSpec) {
        return doBatchUpdate(whiteOnlyOneToOneToList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList) {
        return doBatchDelete(whiteOnlyOneToOneToList, null);
    }

    protected int[] doBatchDelete(List<WhiteOnlyOneToOneTo> ls, DeleteOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneToList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) { return doBatchDelete(downcast(ls), downcast(op)); }

    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op)
    { return doLumpRemove(ls, op); }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB&gt;() {
     *     public ConditionBean setup(whiteOnlyOneToOneTo entity, WhiteOnlyOneToOneToCB intoCB) {
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
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB> sp, InsertOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        WhiteOnlyOneToOneTo et = newEntity(); WhiteOnlyOneToOneToCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhiteOnlyOneToOneToCB createCBForQueryInsert()
    { WhiteOnlyOneToOneToCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setPK...(value);</span>
     * whiteOnlyOneToOneTo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setVersionNo(value);</span>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">queryUpdate</span>(whiteOnlyOneToOneTo, cb);
     * </pre>
     * @param whiteOnlyOneToOneTo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB cb) {
        return doQueryUpdate(whiteOnlyOneToOneTo, cb, null);
    }

    protected int doQueryUpdate(WhiteOnlyOneToOneTo et, WhiteOnlyOneToOneToCB cb, UpdateOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneTo", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">queryDelete</span>(whiteOnlyOneToOneTo, cb);
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteOnlyOneToOneToCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteOnlyOneToOneToCB cb, DeleteOption<WhiteOnlyOneToOneToCB> op) {
        assertCBStateValid(cb); prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) { return doQueryDelete(downcast(cb), downcast(op)); }

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
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteOnlyOneToOneTo.setFoo...(value);
     * whiteOnlyOneToOneTo.setBar...(value);
     * InsertOption<WhiteOnlyOneToOneToCB> option = new InsertOption<WhiteOnlyOneToOneToCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">varyingInsert</span>(whiteOnlyOneToOneTo, option);
     * ... = whiteOnlyOneToOneTo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteOnlyOneToOneTo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, InsertOption<WhiteOnlyOneToOneToCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteOnlyOneToOneTo, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * whiteOnlyOneToOneTo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteOnlyOneToOneTo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteOnlyOneToOneTo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteOnlyOneToOneToCB&gt; option = new UpdateOption&lt;WhiteOnlyOneToOneToCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *         public void specify(WhiteOnlyOneToOneToCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteOnlyOneToOneToBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteOnlyOneToOneTo, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteOnlyOneToOneTo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, UpdateOption<WhiteOnlyOneToOneToCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteOnlyOneToOneTo, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteOnlyOneToOneTo The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, InsertOption<WhiteOnlyOneToOneToCB> insertOption, UpdateOption<WhiteOnlyOneToOneToCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteOnlyOneToOneTo, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteOnlyOneToOneTo The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, DeleteOption<WhiteOnlyOneToOneToCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteOnlyOneToOneTo, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, InsertOption<WhiteOnlyOneToOneToCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteOnlyOneToOneToList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, UpdateOption<WhiteOnlyOneToOneToCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteOnlyOneToOneToList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, DeleteOption<WhiteOnlyOneToOneToCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteOnlyOneToOneToList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB> setupper, InsertOption<WhiteOnlyOneToOneToCB> option) {
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
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setPK...(value);</span>
     * whiteOnlyOneToOneTo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setVersionNo(value);</span>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteOnlyOneToOneToCB&gt; option = new UpdateOption&lt;WhiteOnlyOneToOneToCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *     public void specify(WhiteOnlyOneToOneToCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteOnlyOneToOneTo, cb, option);
     * </pre>
     * @param whiteOnlyOneToOneTo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB cb, UpdateOption<WhiteOnlyOneToOneToCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteOnlyOneToOneTo, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteOnlyOneToOneToCB cb, DeleteOption<WhiteOnlyOneToOneToCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteOnlyOneToOneToBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteOnlyOneToOneTo> typeOfSelectedEntity() { return WhiteOnlyOneToOneTo.class; }
    protected WhiteOnlyOneToOneTo downcast(Entity et) { return helpEntityDowncastInternally(et, WhiteOnlyOneToOneTo.class); }
    protected WhiteOnlyOneToOneToCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, WhiteOnlyOneToOneToCB.class); }
    @SuppressWarnings("unchecked")
    protected List<WhiteOnlyOneToOneTo> downcast(List<? extends Entity> ls) { return (List<WhiteOnlyOneToOneTo>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteOnlyOneToOneToCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<WhiteOnlyOneToOneToCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteOnlyOneToOneToCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<WhiteOnlyOneToOneToCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteOnlyOneToOneToCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<WhiteOnlyOneToOneToCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB>)sp; }
}