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
 * The behavior of WHITE_TABLE_EXCEPT_GEN_HEAD as TABLE. <br />
 * <pre>
 * [primary key]
 *     GEN_HEAD_ID
 *
 * [column]
 *     GEN_HEAD_ID, GEN_HEAD_NAME, NOMETA_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteTableExceptGenHeadBhv extends AbstractBehaviorWritable<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteTableExceptGenHeadDbm getDBMeta() { return WhiteTableExceptGenHeadDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteTableExceptGenHeadDbm getMyDBMeta() { return WhiteTableExceptGenHeadDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteTableExceptGenHeadCB newConditionBean() { return new WhiteTableExceptGenHeadCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteTableExceptGenHead newMyEntity() { return new WhiteTableExceptGenHead(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteTableExceptGenHeadCB newMyConditionBean() { return new WhiteTableExceptGenHeadCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * int count = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteTableExceptGenHeadCB cb) {
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
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * WhiteTableExceptGenHead whiteTableExceptGenHead = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteTableExceptGenHead != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteTableExceptGenHead.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenHead selectEntity(WhiteTableExceptGenHeadCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteTableExceptGenHead facadeSelectEntity(WhiteTableExceptGenHeadCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteTableExceptGenHead> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteTableExceptGenHeadCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * WhiteTableExceptGenHead whiteTableExceptGenHead = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteTableExceptGenHead.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenHead selectEntityWithDeletedCheck(WhiteTableExceptGenHeadCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param genHeadId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenHead selectByPKValue(Long genHeadId) {
        return facadeSelectByPKValue(genHeadId);
    }

    protected WhiteTableExceptGenHead facadeSelectByPKValue(Long genHeadId) {
        return doSelectByPK(genHeadId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteTableExceptGenHead> ENTITY doSelectByPK(Long genHeadId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(genHeadId), tp);
    }

    protected <ENTITY extends WhiteTableExceptGenHead> OptionalEntity<ENTITY> doSelectOptionalByPK(Long genHeadId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(genHeadId, tp), genHeadId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param genHeadId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenHead selectByPKValueWithDeletedCheck(Long genHeadId) {
        return doSelectByPKWithDeletedCheck(genHeadId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteTableExceptGenHead> ENTITY doSelectByPKWithDeletedCheck(Long genHeadId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(genHeadId), tp);
    }

    protected WhiteTableExceptGenHeadCB xprepareCBAsPK(Long genHeadId) {
        assertObjectNotNull("genHeadId", genHeadId);
        return newConditionBean().acceptPK(genHeadId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteTableExceptGenHead&gt; whiteTableExceptGenHeadList = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteTableExceptGenHead whiteTableExceptGenHead : whiteTableExceptGenHeadList) {
     *     ... = whiteTableExceptGenHead.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteTableExceptGenHead> selectList(WhiteTableExceptGenHeadCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteTableExceptGenHead&gt; page = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteTableExceptGenHead whiteTableExceptGenHead : page) {
     *     ... = whiteTableExceptGenHead.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteTableExceptGenHead> selectPage(WhiteTableExceptGenHeadCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteTableExceptGenHead&gt;() {
     *     public void handle(WhiteTableExceptGenHead entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteTableExceptGenHead. (NotNull)
     */
    public void selectCursor(WhiteTableExceptGenHeadCB cb, EntityRowHandler<WhiteTableExceptGenHead> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteTableExceptGenHeadCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteTableExceptGenHeadCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteTableExceptGenHeadList The entity list of whiteTableExceptGenHead. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, ReferrerLoaderHandler<LoaderOfWhiteTableExceptGenHead> handler) {
        xassLRArg(whiteTableExceptGenHeadList, handler);
        handler.handle(new LoaderOfWhiteTableExceptGenHead().ready(whiteTableExceptGenHeadList, _behaviorSelector));
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
     * @param whiteTableExceptGenHead The entity of whiteTableExceptGenHead. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteTableExceptGenHead whiteTableExceptGenHead, ReferrerLoaderHandler<LoaderOfWhiteTableExceptGenHead> handler) {
        xassLRArg(whiteTableExceptGenHead, handler);
        handler.handle(new LoaderOfWhiteTableExceptGenHead().ready(xnewLRAryLs(whiteTableExceptGenHead), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key genHeadId.
     * @param whiteTableExceptGenHeadList The list of whiteTableExceptGenHead. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractGenHeadIdList(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList)
    { return helpExtractListInternally(whiteTableExceptGenHeadList, "genHeadId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteTableExceptGenHead.setFoo...(value);
     * whiteTableExceptGenHead.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.set...;</span>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">insert</span>(whiteTableExceptGenHead);
     * ... = whiteTableExceptGenHead.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteTableExceptGenHead The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doInsert(whiteTableExceptGenHead, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * whiteTableExceptGenHead.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteTableExceptGenHead.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteTableExceptGenHead.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteTableExceptGenHeadBhv.<span style="color: #DD4747">update</span>(whiteTableExceptGenHead);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenHead The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doUpdate(whiteTableExceptGenHead, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteTableExceptGenHead The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doInsertOrUpdate(whiteTableExceptGenHead, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * whiteTableExceptGenHead.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteTableExceptGenHead.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteTableExceptGenHeadBhv.<span style="color: #DD4747">delete</span>(whiteTableExceptGenHead);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenHead The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doDelete(whiteTableExceptGenHead, null);
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
     *     WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     *     whiteTableExceptGenHead.setFooName("foo");
     *     if (...) {
     *         whiteTableExceptGenHead.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteTableExceptGenHeadList.add(whiteTableExceptGenHead);
     * }
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">batchInsert</span>(whiteTableExceptGenHeadList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList) {
        return doBatchInsert(whiteTableExceptGenHeadList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     *     whiteTableExceptGenHead.setFooName("foo");
     *     if (...) {
     *         whiteTableExceptGenHead.setFooPrice(123);
     *     } else {
     *         whiteTableExceptGenHead.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteTableExceptGenHead.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteTableExceptGenHeadList.add(whiteTableExceptGenHead);
     * }
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">batchUpdate</span>(whiteTableExceptGenHeadList);
     * </pre>
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList) {
        return doBatchUpdate(whiteTableExceptGenHeadList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">batchUpdate</span>(whiteTableExceptGenHeadList, new SpecifyQuery<WhiteTableExceptGenHeadCB>() {
     *     public void specify(WhiteTableExceptGenHeadCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">batchUpdate</span>(whiteTableExceptGenHeadList, new SpecifyQuery<WhiteTableExceptGenHeadCB>() {
     *     public void specify(WhiteTableExceptGenHeadCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, SpecifyQuery<WhiteTableExceptGenHeadCB> updateColumnSpec) {
        return doBatchUpdate(whiteTableExceptGenHeadList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList) {
        return doBatchDelete(whiteTableExceptGenHeadList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB&gt;() {
     *     public ConditionBean setup(WhiteTableExceptGenHead entity, WhiteTableExceptGenHeadCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setPK...(value);</span>
     * whiteTableExceptGenHead.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setVersionNo(value);</span>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">queryUpdate</span>(whiteTableExceptGenHead, cb);
     * </pre>
     * @param whiteTableExceptGenHead The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, WhiteTableExceptGenHeadCB cb) {
        return doQueryUpdate(whiteTableExceptGenHead, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">queryDelete</span>(whiteTableExceptGenHead, cb);
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteTableExceptGenHeadCB cb) {
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
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteTableExceptGenHead.setFoo...(value);
     * whiteTableExceptGenHead.setBar...(value);
     * InsertOption<WhiteTableExceptGenHeadCB> option = new InsertOption<WhiteTableExceptGenHeadCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">varyingInsert</span>(whiteTableExceptGenHead, option);
     * ... = whiteTableExceptGenHead.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteTableExceptGenHead The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteTableExceptGenHead whiteTableExceptGenHead, InsertOption<WhiteTableExceptGenHeadCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteTableExceptGenHead, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * whiteTableExceptGenHead.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteTableExceptGenHead.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteTableExceptGenHead.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteTableExceptGenHeadCB&gt; option = new UpdateOption&lt;WhiteTableExceptGenHeadCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *         public void specify(WhiteTableExceptGenHeadCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteTableExceptGenHeadBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteTableExceptGenHead, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenHead The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, UpdateOption<WhiteTableExceptGenHeadCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteTableExceptGenHead, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteTableExceptGenHead The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, InsertOption<WhiteTableExceptGenHeadCB> insertOption, UpdateOption<WhiteTableExceptGenHeadCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteTableExceptGenHead, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteTableExceptGenHead The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteTableExceptGenHead whiteTableExceptGenHead, DeleteOption<WhiteTableExceptGenHeadCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteTableExceptGenHead, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, InsertOption<WhiteTableExceptGenHeadCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteTableExceptGenHeadList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, UpdateOption<WhiteTableExceptGenHeadCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteTableExceptGenHeadList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, DeleteOption<WhiteTableExceptGenHeadCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteTableExceptGenHeadList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB> setupper, InsertOption<WhiteTableExceptGenHeadCB> option) {
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
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setPK...(value);</span>
     * whiteTableExceptGenHead.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setVersionNo(value);</span>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteTableExceptGenHeadCB&gt; option = new UpdateOption&lt;WhiteTableExceptGenHeadCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *     public void specify(WhiteTableExceptGenHeadCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteTableExceptGenHead, cb, option);
     * </pre>
     * @param whiteTableExceptGenHead The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, WhiteTableExceptGenHeadCB cb, UpdateOption<WhiteTableExceptGenHeadCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteTableExceptGenHead, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteTableExceptGenHeadCB cb, DeleteOption<WhiteTableExceptGenHeadCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteTableExceptGenHeadBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteTableExceptGenHeadBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteTableExceptGenHead> typeOfSelectedEntity() { return WhiteTableExceptGenHead.class; }
    protected Class<WhiteTableExceptGenHead> typeOfHandlingEntity() { return WhiteTableExceptGenHead.class; }
    protected Class<WhiteTableExceptGenHeadCB> typeOfHandlingConditionBean() { return WhiteTableExceptGenHeadCB.class; }
}
