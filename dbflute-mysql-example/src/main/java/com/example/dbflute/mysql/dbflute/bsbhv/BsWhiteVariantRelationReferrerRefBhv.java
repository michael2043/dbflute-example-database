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
 * The behavior of WHITE_VARIANT_RELATION_REFERRER_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_ID
 *
 * [column]
 *     REF_ID, REFERRER_ID
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
 *     white_variant_relation_referrer
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteVariantRelationReferrer
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationReferrerRefBhv extends AbstractBehaviorWritable<WhiteVariantRelationReferrerRef, WhiteVariantRelationReferrerRefCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteVariantRelationReferrerRefDbm getDBMeta() { return WhiteVariantRelationReferrerRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteVariantRelationReferrerRefDbm getMyDBMeta() { return WhiteVariantRelationReferrerRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteVariantRelationReferrerRefCB newConditionBean() { return new WhiteVariantRelationReferrerRefCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteVariantRelationReferrerRef newMyEntity() { return new WhiteVariantRelationReferrerRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteVariantRelationReferrerRefCB newMyConditionBean() { return new WhiteVariantRelationReferrerRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrerRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationReferrerRefCB cb) {
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
     * WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef = whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteVariantRelationReferrerRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteVariantRelationReferrerRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrerRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrerRef selectEntity(WhiteVariantRelationReferrerRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteVariantRelationReferrerRef facadeSelectEntity(WhiteVariantRelationReferrerRefCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationReferrerRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteVariantRelationReferrerRefCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef = whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationReferrerRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrerRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrerRef selectEntityWithDeletedCheck(WhiteVariantRelationReferrerRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param refId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrerRef selectByPKValue(Long refId) {
        return facadeSelectByPKValue(refId);
    }

    protected WhiteVariantRelationReferrerRef facadeSelectByPKValue(Long refId) {
        return doSelectByPK(refId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationReferrerRef> ENTITY doSelectByPK(Long refId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(refId), tp);
    }

    protected <ENTITY extends WhiteVariantRelationReferrerRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Long refId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(refId, tp), refId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrerRef selectByPKValueWithDeletedCheck(Long refId) {
        return doSelectByPKWithDeletedCheck(refId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationReferrerRef> ENTITY doSelectByPKWithDeletedCheck(Long refId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(refId), tp);
    }

    protected WhiteVariantRelationReferrerRefCB xprepareCBAsPK(Long refId) {
        assertObjectNotNull("refId", refId);
        return newConditionBean().acceptPK(refId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationReferrerRef&gt; whiteVariantRelationReferrerRefList = whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef : whiteVariantRelationReferrerRefList) {
     *     ... = whiteVariantRelationReferrerRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrerRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationReferrerRef> selectList(WhiteVariantRelationReferrerRefCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationReferrerRef&gt; page = whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef : page) {
     *     ... = whiteVariantRelationReferrerRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrerRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationReferrerRef> selectPage(WhiteVariantRelationReferrerRefCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationReferrerRef&gt;() {
     *     public void handle(WhiteVariantRelationReferrerRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrerRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationReferrerRef. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationReferrerRefCB cb, EntityRowHandler<WhiteVariantRelationReferrerRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteVariantRelationReferrerRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteVariantRelationReferrerRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteVariantRelationReferrerRefList The entity list of whiteVariantRelationReferrerRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationReferrerRef> handler) {
        xassLRArg(whiteVariantRelationReferrerRefList, handler);
        handler.handle(new LoaderOfWhiteVariantRelationReferrerRef().ready(whiteVariantRelationReferrerRefList, _behaviorSelector));
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
     * @param whiteVariantRelationReferrerRef The entity of whiteVariantRelationReferrerRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationReferrerRef> handler) {
        xassLRArg(whiteVariantRelationReferrerRef, handler);
        handler.handle(new LoaderOfWhiteVariantRelationReferrerRef().ready(xnewLRAryLs(whiteVariantRelationReferrerRef), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteVariantRelationReferrer'.
     * @param whiteVariantRelationReferrerRefList The list of whiteVariantRelationReferrerRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationReferrer> pulloutWhiteVariantRelationReferrer(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList)
    { return helpPulloutInternally(whiteVariantRelationReferrerRefList, "whiteVariantRelationReferrer"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refId.
     * @param whiteVariantRelationReferrerRefList The list of whiteVariantRelationReferrerRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefIdList(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList)
    { return helpExtractListInternally(whiteVariantRelationReferrerRefList, "refId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef = new WhiteVariantRelationReferrerRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationReferrerRef.setFoo...(value);
     * whiteVariantRelationReferrerRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrerRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrerRef.set...;</span>
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">insert</span>(whiteVariantRelationReferrerRef);
     * ... = whiteVariantRelationReferrerRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationReferrerRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef) {
        doInsert(whiteVariantRelationReferrerRef, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef = new WhiteVariantRelationReferrerRef();
     * whiteVariantRelationReferrerRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationReferrerRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrerRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrerRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrerRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">update</span>(whiteVariantRelationReferrerRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrerRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef) {
        doUpdate(whiteVariantRelationReferrerRef, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteVariantRelationReferrerRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef) {
        doInsertOrUpdate(whiteVariantRelationReferrerRef, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef = new WhiteVariantRelationReferrerRef();
     * whiteVariantRelationReferrerRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrerRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">delete</span>(whiteVariantRelationReferrerRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrerRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef) {
        doDelete(whiteVariantRelationReferrerRef, null);
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
     *     WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef = new WhiteVariantRelationReferrerRef();
     *     whiteVariantRelationReferrerRef.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationReferrerRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationReferrerRefList.add(whiteVariantRelationReferrerRef);
     * }
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">batchInsert</span>(whiteVariantRelationReferrerRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationReferrerRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList) {
        return doBatchInsert(whiteVariantRelationReferrerRefList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef = new WhiteVariantRelationReferrerRef();
     *     whiteVariantRelationReferrerRef.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationReferrerRef.setFooPrice(123);
     *     } else {
     *         whiteVariantRelationReferrerRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationReferrerRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationReferrerRefList.add(whiteVariantRelationReferrerRef);
     * }
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationReferrerRefList);
     * </pre>
     * @param whiteVariantRelationReferrerRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList) {
        return doBatchUpdate(whiteVariantRelationReferrerRefList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationReferrerRefList, new SpecifyQuery<WhiteVariantRelationReferrerRefCB>() {
     *     public void specify(WhiteVariantRelationReferrerRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationReferrerRefList, new SpecifyQuery<WhiteVariantRelationReferrerRefCB>() {
     *     public void specify(WhiteVariantRelationReferrerRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteVariantRelationReferrerRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList, SpecifyQuery<WhiteVariantRelationReferrerRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteVariantRelationReferrerRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationReferrerRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList) {
        return doBatchDelete(whiteVariantRelationReferrerRefList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationReferrerRef, WhiteVariantRelationReferrerRefCB&gt;() {
     *     public ConditionBean setup(WhiteVariantRelationReferrerRef entity, WhiteVariantRelationReferrerRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationReferrerRef, WhiteVariantRelationReferrerRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef = new WhiteVariantRelationReferrerRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrerRef.setPK...(value);</span>
     * whiteVariantRelationReferrerRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrerRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrerRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrerRef.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">queryUpdate</span>(whiteVariantRelationReferrerRef, cb);
     * </pre>
     * @param whiteVariantRelationReferrerRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationReferrerRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef, WhiteVariantRelationReferrerRefCB cb) {
        return doQueryUpdate(whiteVariantRelationReferrerRef, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">queryDelete</span>(whiteVariantRelationReferrerRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrerRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationReferrerRefCB cb) {
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
     * WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef = new WhiteVariantRelationReferrerRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationReferrerRef.setFoo...(value);
     * whiteVariantRelationReferrerRef.setBar...(value);
     * InsertOption<WhiteVariantRelationReferrerRefCB> option = new InsertOption<WhiteVariantRelationReferrerRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">varyingInsert</span>(whiteVariantRelationReferrerRef, option);
     * ... = whiteVariantRelationReferrerRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationReferrerRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef, InsertOption<WhiteVariantRelationReferrerRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteVariantRelationReferrerRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef = new WhiteVariantRelationReferrerRef();
     * whiteVariantRelationReferrerRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationReferrerRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrerRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationReferrerRefCB&gt; option = new UpdateOption&lt;WhiteVariantRelationReferrerRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerRefCB&gt;() {
     *         public void specify(WhiteVariantRelationReferrerRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteVariantRelationReferrerRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrerRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef, UpdateOption<WhiteVariantRelationReferrerRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteVariantRelationReferrerRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationReferrerRef The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef, InsertOption<WhiteVariantRelationReferrerRefCB> insertOption, UpdateOption<WhiteVariantRelationReferrerRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteVariantRelationReferrerRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationReferrerRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef, DeleteOption<WhiteVariantRelationReferrerRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteVariantRelationReferrerRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationReferrerRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList, InsertOption<WhiteVariantRelationReferrerRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteVariantRelationReferrerRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationReferrerRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList, UpdateOption<WhiteVariantRelationReferrerRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteVariantRelationReferrerRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationReferrerRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList, DeleteOption<WhiteVariantRelationReferrerRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteVariantRelationReferrerRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationReferrerRef, WhiteVariantRelationReferrerRefCB> setupper, InsertOption<WhiteVariantRelationReferrerRefCB> option) {
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
     * WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef = new WhiteVariantRelationReferrerRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrerRef.setPK...(value);</span>
     * whiteVariantRelationReferrerRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrerRef.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerRefCB cb = new WhiteVariantRelationReferrerRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationReferrerRefCB&gt; option = new UpdateOption&lt;WhiteVariantRelationReferrerRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerRefCB&gt;() {
     *     public void specify(WhiteVariantRelationReferrerRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationReferrerRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteVariantRelationReferrerRef, cb, option);
     * </pre>
     * @param whiteVariantRelationReferrerRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationReferrerRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationReferrerRef whiteVariantRelationReferrerRef, WhiteVariantRelationReferrerRefCB cb, UpdateOption<WhiteVariantRelationReferrerRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteVariantRelationReferrerRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhiteVariantRelationReferrerRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationReferrerRefCB cb, DeleteOption<WhiteVariantRelationReferrerRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteVariantRelationReferrerRefBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteVariantRelationReferrerRefBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteVariantRelationReferrerRef> typeOfSelectedEntity() { return WhiteVariantRelationReferrerRef.class; }
    protected Class<WhiteVariantRelationReferrerRef> typeOfHandlingEntity() { return WhiteVariantRelationReferrerRef.class; }
    protected Class<WhiteVariantRelationReferrerRefCB> typeOfHandlingConditionBean() { return WhiteVariantRelationReferrerRefCB.class; }
}
