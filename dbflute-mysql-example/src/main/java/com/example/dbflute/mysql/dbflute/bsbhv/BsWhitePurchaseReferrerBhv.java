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
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_PURCHASE_REFERRER as TABLE. <br />
 * <pre>
 * [primary key]
 *     PURCHASE_REFERRER_ID
 *
 * [column]
 *     PURCHASE_REFERRER_ID, PURCHASE_REFERRER_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_REFERRER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     purchase
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     purchase
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePurchaseReferrerBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_purchase_referrer"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhitePurchaseReferrerDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhitePurchaseReferrerDbm getMyDBMeta() { return WhitePurchaseReferrerDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhitePurchaseReferrer newMyEntity() { return new WhitePurchaseReferrer(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhitePurchaseReferrerCB newMyConditionBean() { return new WhitePurchaseReferrerCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * int count = whitePurchaseReferrerBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePurchaseReferrerCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhitePurchaseReferrerCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhitePurchaseReferrerCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * WhitePurchaseReferrer whitePurchaseReferrer = whitePurchaseReferrerBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whitePurchaseReferrer != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whitePurchaseReferrer.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePurchaseReferrer selectEntity(WhitePurchaseReferrerCB cb) {
        return doSelectEntity(cb, WhitePurchaseReferrer.class);
    }

    protected <ENTITY extends WhitePurchaseReferrer> ENTITY doSelectEntity(WhitePurchaseReferrerCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhitePurchaseReferrerCB>() {
            public List<ENTITY> callbackSelectList(WhitePurchaseReferrerCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * WhitePurchaseReferrer whitePurchaseReferrer = whitePurchaseReferrerBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePurchaseReferrer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePurchaseReferrer selectEntityWithDeletedCheck(WhitePurchaseReferrerCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhitePurchaseReferrer.class);
    }

    protected <ENTITY extends WhitePurchaseReferrer> ENTITY doSelectEntityWithDeletedCheck(WhitePurchaseReferrerCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhitePurchaseReferrerCB>() {
            public List<ENTITY> callbackSelectList(WhitePurchaseReferrerCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param purchaseReferrerId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePurchaseReferrer selectByPKValue(Long purchaseReferrerId) {
        return doSelectByPKValue(purchaseReferrerId, WhitePurchaseReferrer.class);
    }

    protected <ENTITY extends WhitePurchaseReferrer> ENTITY doSelectByPKValue(Long purchaseReferrerId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(purchaseReferrerId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param purchaseReferrerId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePurchaseReferrer selectByPKValueWithDeletedCheck(Long purchaseReferrerId) {
        return doSelectByPKValueWithDeletedCheck(purchaseReferrerId, WhitePurchaseReferrer.class);
    }

    protected <ENTITY extends WhitePurchaseReferrer> ENTITY doSelectByPKValueWithDeletedCheck(Long purchaseReferrerId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(purchaseReferrerId), entityType);
    }

    private WhitePurchaseReferrerCB buildPKCB(Long purchaseReferrerId) {
        assertObjectNotNull("purchaseReferrerId", purchaseReferrerId);
        WhitePurchaseReferrerCB cb = newMyConditionBean();
        cb.query().setPurchaseReferrerId_Equal(purchaseReferrerId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePurchaseReferrer&gt; whitePurchaseReferrerList = whitePurchaseReferrerBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePurchaseReferrer whitePurchaseReferrer : whitePurchaseReferrerList) {
     *     ... = whitePurchaseReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePurchaseReferrer> selectList(WhitePurchaseReferrerCB cb) {
        return doSelectList(cb, WhitePurchaseReferrer.class);
    }

    protected <ENTITY extends WhitePurchaseReferrer> ListResultBean<ENTITY> doSelectList(WhitePurchaseReferrerCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhitePurchaseReferrerCB>() {
            public List<ENTITY> callbackSelectList(WhitePurchaseReferrerCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePurchaseReferrer&gt; page = whitePurchaseReferrerBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePurchaseReferrer whitePurchaseReferrer : page) {
     *     ... = whitePurchaseReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePurchaseReferrer> selectPage(WhitePurchaseReferrerCB cb) {
        return doSelectPage(cb, WhitePurchaseReferrer.class);
    }

    protected <ENTITY extends WhitePurchaseReferrer> PagingResultBean<ENTITY> doSelectPage(WhitePurchaseReferrerCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhitePurchaseReferrerCB>() {
            public int callbackSelectCount(WhitePurchaseReferrerCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhitePurchaseReferrerCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePurchaseReferrer&gt;() {
     *     public void handle(WhitePurchaseReferrer entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePurchaseReferrer. (NotNull)
     */
    public void selectCursor(WhitePurchaseReferrerCB cb, EntityRowHandler<WhitePurchaseReferrer> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhitePurchaseReferrer.class);
    }

    protected <ENTITY extends WhitePurchaseReferrer> void doSelectCursor(WhitePurchaseReferrerCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhitePurchaseReferrerCB>() {
            public void callbackSelectCursor(WhitePurchaseReferrerCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhitePurchaseReferrerCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhitePurchaseReferrerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhitePurchaseReferrerCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhitePurchaseReferrerCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhitePurchaseReferrerCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
        return new SLFunction<CB, RESULT>(cb, tp);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return doScalarSelect(tp, newMyConditionBean());
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
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'Purchase'.
     * @param whitePurchaseReferrerList The list of whitePurchaseReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Purchase> pulloutPurchase(List<WhitePurchaseReferrer> whitePurchaseReferrerList) {
        return helpPulloutInternally(whitePurchaseReferrerList, new InternalPulloutCallback<WhitePurchaseReferrer, Purchase>() {
            public Purchase getFr(WhitePurchaseReferrer et) { return et.getPurchase(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Purchase et, List<WhitePurchaseReferrer> ls)
            { if (!ls.isEmpty()) { et.setWhitePurchaseReferrerAsOne(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key purchaseReferrerId.
     * @param whitePurchaseReferrerList The list of whitePurchaseReferrer. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPurchaseReferrerIdList(List<WhitePurchaseReferrer> whitePurchaseReferrerList) {
        return helpExtractListInternally(whitePurchaseReferrerList, new InternalExtractCallback<WhitePurchaseReferrer, Long>() {
            public Long getCV(WhitePurchaseReferrer et) { return et.getPurchaseReferrerId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePurchaseReferrer.setFoo...(value);
     * whitePurchaseReferrer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.set...;</span>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">insert</span>(whitePurchaseReferrer);
     * ... = whitePurchaseReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePurchaseReferrer The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePurchaseReferrer whitePurchaseReferrer) {
        doInsert(whitePurchaseReferrer, null);
    }

    protected void doInsert(WhitePurchaseReferrer whitePurchaseReferrer, InsertOption<WhitePurchaseReferrerCB> op) {
        assertObjectNotNull("whitePurchaseReferrer", whitePurchaseReferrer);
        prepareInsertOption(op);
        delegateInsert(whitePurchaseReferrer, op);
    }

    protected void prepareInsertOption(InsertOption<WhitePurchaseReferrerCB> op) {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) {
        if (op == null) { insert(downcast(et)); }
        else { varyingInsert(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * whitePurchaseReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePurchaseReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whitePurchaseReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePurchaseReferrerBhv.<span style="color: #DD4747">update</span>(whitePurchaseReferrer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePurchaseReferrer The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhitePurchaseReferrer whitePurchaseReferrer) {
        doUpdate(whitePurchaseReferrer, null);
    }

    protected void doUpdate(WhitePurchaseReferrer whitePurchaseReferrer, final UpdateOption<WhitePurchaseReferrerCB> op) {
        assertObjectNotNull("whitePurchaseReferrer", whitePurchaseReferrer);
        prepareUpdateOption(op);
        helpUpdateInternally(whitePurchaseReferrer, new InternalUpdateCallback<WhitePurchaseReferrer>() {
            public int callbackDelegateUpdate(WhitePurchaseReferrer et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhitePurchaseReferrerCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhitePurchaseReferrerCB createCBForVaryingUpdate() {
        WhitePurchaseReferrerCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhitePurchaseReferrerCB createCBForSpecifiedUpdate() {
        WhitePurchaseReferrerCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whitePurchaseReferrer The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePurchaseReferrer whitePurchaseReferrer) {
        doInesrtOrUpdate(whitePurchaseReferrer, null, null);
    }

    protected void doInesrtOrUpdate(WhitePurchaseReferrer whitePurchaseReferrer, final InsertOption<WhitePurchaseReferrerCB> iop, final UpdateOption<WhitePurchaseReferrerCB> uop) {
        helpInsertOrUpdateInternally(whitePurchaseReferrer, new InternalInsertOrUpdateCallback<WhitePurchaseReferrer, WhitePurchaseReferrerCB>() {
            public void callbackInsert(WhitePurchaseReferrer et) { doInsert(et, iop); }
            public void callbackUpdate(WhitePurchaseReferrer et) { doUpdate(et, uop); }
            public WhitePurchaseReferrerCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhitePurchaseReferrerCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhitePurchaseReferrerCB>();
            uop = uop != null ? uop : new UpdateOption<WhitePurchaseReferrerCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * whitePurchaseReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whitePurchaseReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePurchaseReferrerBhv.<span style="color: #DD4747">delete</span>(whitePurchaseReferrer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePurchaseReferrer The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePurchaseReferrer whitePurchaseReferrer) {
        doDelete(whitePurchaseReferrer, null);
    }

    protected void doDelete(WhitePurchaseReferrer whitePurchaseReferrer, final DeleteOption<WhitePurchaseReferrerCB> op) {
        assertObjectNotNull("whitePurchaseReferrer", whitePurchaseReferrer);
        prepareDeleteOption(op);
        helpDeleteInternally(whitePurchaseReferrer, new InternalDeleteCallback<WhitePurchaseReferrer>() {
            public int callbackDelegateDelete(WhitePurchaseReferrer et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhitePurchaseReferrerCB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op) {
        doRemove(et, op);
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
     *     WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     *     whitePurchaseReferrer.setFooName("foo");
     *     if (...) {
     *         whitePurchaseReferrer.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePurchaseReferrerList.add(whitePurchaseReferrer);
     * }
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">batchInsert</span>(whitePurchaseReferrerList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePurchaseReferrer> whitePurchaseReferrerList) {
        InsertOption<WhitePurchaseReferrerCB> op = createInsertUpdateOption();
        return doBatchInsert(whitePurchaseReferrerList, op);
    }

    protected int[] doBatchInsert(List<WhitePurchaseReferrer> whitePurchaseReferrerList, InsertOption<WhitePurchaseReferrerCB> op) {
        assertObjectNotNull("whitePurchaseReferrerList", whitePurchaseReferrerList);
        prepareBatchInsertOption(whitePurchaseReferrerList, op);
        return delegateBatchInsert(whitePurchaseReferrerList, op);
    }

    protected void prepareBatchInsertOption(List<WhitePurchaseReferrer> whitePurchaseReferrerList, InsertOption<WhitePurchaseReferrerCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whitePurchaseReferrerList);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     *     whitePurchaseReferrer.setFooName("foo");
     *     if (...) {
     *         whitePurchaseReferrer.setFooPrice(123);
     *     } else {
     *         whitePurchaseReferrer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePurchaseReferrer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePurchaseReferrerList.add(whitePurchaseReferrer);
     * }
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">batchUpdate</span>(whitePurchaseReferrerList);
     * </pre>
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePurchaseReferrer> whitePurchaseReferrerList) {
        UpdateOption<WhitePurchaseReferrerCB> op = createPlainUpdateOption();
        return doBatchUpdate(whitePurchaseReferrerList, op);
    }

    protected int[] doBatchUpdate(List<WhitePurchaseReferrer> whitePurchaseReferrerList, UpdateOption<WhitePurchaseReferrerCB> op) {
        assertObjectNotNull("whitePurchaseReferrerList", whitePurchaseReferrerList);
        prepareBatchUpdateOption(whitePurchaseReferrerList, op);
        return delegateBatchUpdate(whitePurchaseReferrerList, op);
    }

    protected void prepareBatchUpdateOption(List<WhitePurchaseReferrer> whitePurchaseReferrerList, UpdateOption<WhitePurchaseReferrerCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whitePurchaseReferrerList);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">batchUpdate</span>(whitePurchaseReferrerList, new SpecifyQuery<WhitePurchaseReferrerCB>() {
     *     public void specify(WhitePurchaseReferrerCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">batchUpdate</span>(whitePurchaseReferrerList, new SpecifyQuery<WhitePurchaseReferrerCB>() {
     *     public void specify(WhitePurchaseReferrerCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePurchaseReferrer> whitePurchaseReferrerList, SpecifyQuery<WhitePurchaseReferrerCB> updateColumnSpec) {
        return doBatchUpdate(whitePurchaseReferrerList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePurchaseReferrer> whitePurchaseReferrerList) {
        return doBatchDelete(whitePurchaseReferrerList, null);
    }

    protected int[] doBatchDelete(List<WhitePurchaseReferrer> whitePurchaseReferrerList, DeleteOption<WhitePurchaseReferrerCB> op) {
        assertObjectNotNull("whitePurchaseReferrerList", whitePurchaseReferrerList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whitePurchaseReferrerList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        return doLumpRemove(ls, op);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePurchaseReferrer, WhitePurchaseReferrerCB&gt;() {
     *     public ConditionBean setup(whitePurchaseReferrer entity, WhitePurchaseReferrerCB intoCB) {
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
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WhitePurchaseReferrer, WhitePurchaseReferrerCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhitePurchaseReferrer, WhitePurchaseReferrerCB> sp, InsertOption<WhitePurchaseReferrerCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhitePurchaseReferrer e = new WhitePurchaseReferrer();
        WhitePurchaseReferrerCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhitePurchaseReferrerCB createCBForQueryInsert() {
        WhitePurchaseReferrerCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setPK...(value);</span>
     * whitePurchaseReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setVersionNo(value);</span>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">queryUpdate</span>(whitePurchaseReferrer, cb);
     * </pre>
     * @param whitePurchaseReferrer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePurchaseReferrer whitePurchaseReferrer, WhitePurchaseReferrerCB cb) {
        return doQueryUpdate(whitePurchaseReferrer, cb, null);
    }

    protected int doQueryUpdate(WhitePurchaseReferrer whitePurchaseReferrer, WhitePurchaseReferrerCB cb, UpdateOption<WhitePurchaseReferrerCB> op) {
        assertObjectNotNull("whitePurchaseReferrer", whitePurchaseReferrer); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whitePurchaseReferrer, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhitePurchaseReferrerCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhitePurchaseReferrerCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">queryDelete</span>(whitePurchaseReferrer, cb);
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePurchaseReferrerCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhitePurchaseReferrerCB cb, DeleteOption<WhitePurchaseReferrerCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhitePurchaseReferrerCB)cb); }
        else { return varyingQueryDelete((WhitePurchaseReferrerCB)cb, downcast(op)); }
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
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePurchaseReferrer.setFoo...(value);
     * whitePurchaseReferrer.setBar...(value);
     * InsertOption<WhitePurchaseReferrerCB> option = new InsertOption<WhitePurchaseReferrerCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">varyingInsert</span>(whitePurchaseReferrer, option);
     * ... = whitePurchaseReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePurchaseReferrer The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePurchaseReferrer whitePurchaseReferrer, InsertOption<WhitePurchaseReferrerCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whitePurchaseReferrer, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * whitePurchaseReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePurchaseReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whitePurchaseReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePurchaseReferrerCB&gt; option = new UpdateOption&lt;WhitePurchaseReferrerCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *         public void specify(WhitePurchaseReferrerCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whitePurchaseReferrerBhv.<span style="color: #DD4747">varyingUpdate</span>(whitePurchaseReferrer, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePurchaseReferrer The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePurchaseReferrer whitePurchaseReferrer, UpdateOption<WhitePurchaseReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whitePurchaseReferrer, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePurchaseReferrer The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePurchaseReferrer whitePurchaseReferrer, InsertOption<WhitePurchaseReferrerCB> insertOption, UpdateOption<WhitePurchaseReferrerCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whitePurchaseReferrer, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePurchaseReferrer The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePurchaseReferrer whitePurchaseReferrer, DeleteOption<WhitePurchaseReferrerCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whitePurchaseReferrer, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePurchaseReferrer> whitePurchaseReferrerList, InsertOption<WhitePurchaseReferrerCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whitePurchaseReferrerList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePurchaseReferrer> whitePurchaseReferrerList, UpdateOption<WhitePurchaseReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whitePurchaseReferrerList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePurchaseReferrer> whitePurchaseReferrerList, DeleteOption<WhitePurchaseReferrerCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whitePurchaseReferrerList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhitePurchaseReferrer, WhitePurchaseReferrerCB> setupper, InsertOption<WhitePurchaseReferrerCB> option) {
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
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setPK...(value);</span>
     * whitePurchaseReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setVersionNo(value);</span>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePurchaseReferrerCB&gt; option = new UpdateOption&lt;WhitePurchaseReferrerCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *     public void specify(WhitePurchaseReferrerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePurchaseReferrer, cb, option);
     * </pre>
     * @param whitePurchaseReferrer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePurchaseReferrer whitePurchaseReferrer, WhitePurchaseReferrerCB cb, UpdateOption<WhitePurchaseReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whitePurchaseReferrer, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePurchaseReferrerCB cb, DeleteOption<WhitePurchaseReferrerCB> option) {
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
    public OutsideSqlBasicExecutor<WhitePurchaseReferrerBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhitePurchaseReferrerCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhitePurchaseReferrerCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhitePurchaseReferrer> void delegateSelectCursor(WhitePurchaseReferrerCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhitePurchaseReferrer> List<ENTITY> delegateSelectList(WhitePurchaseReferrerCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhitePurchaseReferrer et, InsertOption<WhitePurchaseReferrerCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhitePurchaseReferrer et, UpdateOption<WhitePurchaseReferrerCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhitePurchaseReferrer et, UpdateOption<WhitePurchaseReferrerCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhitePurchaseReferrer et, DeleteOption<WhitePurchaseReferrerCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhitePurchaseReferrer et, DeleteOption<WhitePurchaseReferrerCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhitePurchaseReferrer> ls, InsertOption<WhitePurchaseReferrerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhitePurchaseReferrer> ls, UpdateOption<WhitePurchaseReferrerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhitePurchaseReferrer> ls, UpdateOption<WhitePurchaseReferrerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhitePurchaseReferrer> ls, DeleteOption<WhitePurchaseReferrerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhitePurchaseReferrer> ls, DeleteOption<WhitePurchaseReferrerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhitePurchaseReferrer et, WhitePurchaseReferrerCB inCB, ConditionBean resCB, InsertOption<WhitePurchaseReferrerCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhitePurchaseReferrer et, WhitePurchaseReferrerCB cb, UpdateOption<WhitePurchaseReferrerCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhitePurchaseReferrerCB cb, DeleteOption<WhitePurchaseReferrerCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity et) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity et) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected WhitePurchaseReferrer downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhitePurchaseReferrer.class);
    }

    protected WhitePurchaseReferrerCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhitePurchaseReferrerCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhitePurchaseReferrer> downcast(List<? extends Entity> ls) {
        return (List<WhitePurchaseReferrer>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhitePurchaseReferrerCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhitePurchaseReferrerCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhitePurchaseReferrerCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhitePurchaseReferrerCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhitePurchaseReferrerCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhitePurchaseReferrerCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhitePurchaseReferrer, WhitePurchaseReferrerCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhitePurchaseReferrer, WhitePurchaseReferrerCB>)sp;
    }
}
