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
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_SPLIT_MULTIPLE_FK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     FIRST_ID, SECOND_CODE
 *
 * [column]
 *     FIRST_ID, SECOND_CODE, REF_NAME
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
public abstract class BsWhiteSplitMultipleFkRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_split_multiple_fk_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSplitMultipleFkRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSplitMultipleFkRefDbm getMyDBMeta() { return WhiteSplitMultipleFkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSplitMultipleFkRef newMyEntity() { return new WhiteSplitMultipleFkRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSplitMultipleFkRefCB newMyConditionBean() { return new WhiteSplitMultipleFkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSplitMultipleFkRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSplitMultipleFkRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSplitMultipleFkRefCB cb) { // called by selectPage(cb)
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
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSplitMultipleFkRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSplitMultipleFkRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkRef selectEntity(WhiteSplitMultipleFkRefCB cb) {
        return doSelectEntity(cb, WhiteSplitMultipleFkRef.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> ENTITY doSelectEntity(WhiteSplitMultipleFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSplitMultipleFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSplitMultipleFkRefCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSplitMultipleFkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkRef selectEntityWithDeletedCheck(WhiteSplitMultipleFkRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSplitMultipleFkRef.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> ENTITY doSelectEntityWithDeletedCheck(WhiteSplitMultipleFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSplitMultipleFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param firstId : PK, NotNull, INT(10). (NotNull)
     * @param secondCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkRef selectByPKValue(Integer firstId, String secondCode) {
        return doSelectByPK(firstId, secondCode, WhiteSplitMultipleFkRef.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> ENTITY doSelectByPK(Integer firstId, String secondCode, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(firstId, secondCode), entityType);
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer firstId, String secondCode, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(firstId, secondCode, entityType), firstId, secondCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param firstId : PK, NotNull, INT(10). (NotNull)
     * @param secondCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkRef selectByPKValueWithDeletedCheck(Integer firstId, String secondCode) {
        return doSelectByPKWithDeletedCheck(firstId, secondCode, WhiteSplitMultipleFkRef.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> ENTITY doSelectByPKWithDeletedCheck(Integer firstId, String secondCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(firstId, secondCode), entityType);
    }

    protected WhiteSplitMultipleFkRefCB xprepareCBAsPK(Integer firstId, String secondCode) {
        assertObjectNotNull("firstId", firstId);assertObjectNotNull("secondCode", secondCode);
        WhiteSplitMultipleFkRefCB cb = newMyConditionBean(); cb.acceptPrimaryKey(firstId, secondCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSplitMultipleFkRef&gt; whiteSplitMultipleFkRefList = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSplitMultipleFkRef whiteSplitMultipleFkRef : whiteSplitMultipleFkRefList) {
     *     ... = whiteSplitMultipleFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSplitMultipleFkRef> selectList(WhiteSplitMultipleFkRefCB cb) {
        return doSelectList(cb, WhiteSplitMultipleFkRef.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> ListResultBean<ENTITY> doSelectList(WhiteSplitMultipleFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSplitMultipleFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkRefCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSplitMultipleFkRef&gt; page = whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSplitMultipleFkRef whiteSplitMultipleFkRef : page) {
     *     ... = whiteSplitMultipleFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSplitMultipleFkRef> selectPage(WhiteSplitMultipleFkRefCB cb) {
        return doSelectPage(cb, WhiteSplitMultipleFkRef.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> PagingResultBean<ENTITY> doSelectPage(WhiteSplitMultipleFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSplitMultipleFkRefCB>() {
            public int callbackSelectCount(WhiteSplitMultipleFkRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSplitMultipleFkRef&gt;() {
     *     public void handle(WhiteSplitMultipleFkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSplitMultipleFkRef. (NotNull)
     */
    public void selectCursor(WhiteSplitMultipleFkRefCB cb, EntityRowHandler<WhiteSplitMultipleFkRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSplitMultipleFkRef.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkRef> void doSelectCursor(WhiteSplitMultipleFkRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSplitMultipleFkRefCB>() {
            public void callbackSelectCursor(WhiteSplitMultipleFkRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSplitMultipleFkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSplitMultipleFkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSplitMultipleFkRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSplitMultipleFkRefCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkRef.setFoo...(value);
     * whiteSplitMultipleFkRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.set...;</span>
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">insert</span>(whiteSplitMultipleFkRef);
     * ... = whiteSplitMultipleFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSplitMultipleFkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef) {
        doInsert(whiteSplitMultipleFkRef, null);
    }

    protected void doInsert(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, InsertOption<WhiteSplitMultipleFkRefCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkRef", whiteSplitMultipleFkRef);
        prepareInsertOption(op);
        delegateInsert(whiteSplitMultipleFkRef, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSplitMultipleFkRefCB> op) {
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
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * whiteSplitMultipleFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">update</span>(whiteSplitMultipleFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSplitMultipleFkRef whiteSplitMultipleFkRef) {
        doUpdate(whiteSplitMultipleFkRef, null);
    }

    protected void doUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, final UpdateOption<WhiteSplitMultipleFkRefCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkRef", whiteSplitMultipleFkRef);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSplitMultipleFkRef, new InternalUpdateCallback<WhiteSplitMultipleFkRef>() {
            public int callbackDelegateUpdate(WhiteSplitMultipleFkRef et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSplitMultipleFkRefCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSplitMultipleFkRefCB createCBForVaryingUpdate() {
        WhiteSplitMultipleFkRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSplitMultipleFkRefCB createCBForSpecifiedUpdate() {
        WhiteSplitMultipleFkRefCB cb = newMyConditionBean();
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
     * @param whiteSplitMultipleFkRef The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef) {
        doInesrtOrUpdate(whiteSplitMultipleFkRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, final InsertOption<WhiteSplitMultipleFkRefCB> iop, final UpdateOption<WhiteSplitMultipleFkRefCB> uop) {
        helpInsertOrUpdateInternally(whiteSplitMultipleFkRef, new InternalInsertOrUpdateCallback<WhiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB>() {
            public void callbackInsert(WhiteSplitMultipleFkRef et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSplitMultipleFkRef et) { doUpdate(et, uop); }
            public WhiteSplitMultipleFkRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSplitMultipleFkRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSplitMultipleFkRefCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSplitMultipleFkRefCB>();
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
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * whiteSplitMultipleFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">delete</span>(whiteSplitMultipleFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef) {
        doDelete(whiteSplitMultipleFkRef, null);
    }

    protected void doDelete(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, final DeleteOption<WhiteSplitMultipleFkRefCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkRef", whiteSplitMultipleFkRef);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSplitMultipleFkRef, new InternalDeleteCallback<WhiteSplitMultipleFkRef>() {
            public int callbackDelegateDelete(WhiteSplitMultipleFkRef et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSplitMultipleFkRefCB> op) {
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
     *     WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     *     whiteSplitMultipleFkRef.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSplitMultipleFkRefList.add(whiteSplitMultipleFkRef);
     * }
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">batchInsert</span>(whiteSplitMultipleFkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList) {
        InsertOption<WhiteSplitMultipleFkRefCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSplitMultipleFkRefList, op);
    }

    protected int[] doBatchInsert(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, InsertOption<WhiteSplitMultipleFkRefCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkRefList", whiteSplitMultipleFkRefList);
        prepareBatchInsertOption(whiteSplitMultipleFkRefList, op);
        return delegateBatchInsert(whiteSplitMultipleFkRefList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, InsertOption<WhiteSplitMultipleFkRefCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSplitMultipleFkRefList);
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
     *     WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     *     whiteSplitMultipleFkRef.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkRef.setFooPrice(123);
     *     } else {
     *         whiteSplitMultipleFkRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSplitMultipleFkRefList.add(whiteSplitMultipleFkRef);
     * }
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkRefList);
     * </pre>
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList) {
        UpdateOption<WhiteSplitMultipleFkRefCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSplitMultipleFkRefList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, UpdateOption<WhiteSplitMultipleFkRefCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkRefList", whiteSplitMultipleFkRefList);
        prepareBatchUpdateOption(whiteSplitMultipleFkRefList, op);
        return delegateBatchUpdate(whiteSplitMultipleFkRefList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, UpdateOption<WhiteSplitMultipleFkRefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSplitMultipleFkRefList);
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
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkRefList, new SpecifyQuery<WhiteSplitMultipleFkRefCB>() {
     *     public void specify(WhiteSplitMultipleFkRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkRefList, new SpecifyQuery<WhiteSplitMultipleFkRefCB>() {
     *     public void specify(WhiteSplitMultipleFkRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, SpecifyQuery<WhiteSplitMultipleFkRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteSplitMultipleFkRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList) {
        return doBatchDelete(whiteSplitMultipleFkRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, DeleteOption<WhiteSplitMultipleFkRefCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkRefList", whiteSplitMultipleFkRefList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSplitMultipleFkRefList, op);
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
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB&gt;() {
     *     public ConditionBean setup(whiteSplitMultipleFkRef entity, WhiteSplitMultipleFkRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB> sp, InsertOption<WhiteSplitMultipleFkRefCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSplitMultipleFkRef e = new WhiteSplitMultipleFkRef();
        WhiteSplitMultipleFkRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSplitMultipleFkRefCB createCBForQueryInsert() {
        WhiteSplitMultipleFkRefCB cb = newMyConditionBean();
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
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setPK...(value);</span>
     * whiteSplitMultipleFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setVersionNo(value);</span>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSplitMultipleFkRef, cb);
     * </pre>
     * @param whiteSplitMultipleFkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB cb) {
        return doQueryUpdate(whiteSplitMultipleFkRef, cb, null);
    }

    protected int doQueryUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB cb, UpdateOption<WhiteSplitMultipleFkRefCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkRef", whiteSplitMultipleFkRef); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSplitMultipleFkRef, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSplitMultipleFkRefCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSplitMultipleFkRefCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">queryDelete</span>(whiteSplitMultipleFkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSplitMultipleFkRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSplitMultipleFkRefCB cb, DeleteOption<WhiteSplitMultipleFkRefCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSplitMultipleFkRefCB)cb); }
        else { return varyingQueryDelete((WhiteSplitMultipleFkRefCB)cb, downcast(op)); }
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
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkRef.setFoo...(value);
     * whiteSplitMultipleFkRef.setBar...(value);
     * InsertOption<WhiteSplitMultipleFkRefCB> option = new InsertOption<WhiteSplitMultipleFkRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSplitMultipleFkRef, option);
     * ... = whiteSplitMultipleFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSplitMultipleFkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, InsertOption<WhiteSplitMultipleFkRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSplitMultipleFkRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * whiteSplitMultipleFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSplitMultipleFkRefCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *         public void specify(WhiteSplitMultipleFkRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSplitMultipleFkRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, UpdateOption<WhiteSplitMultipleFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSplitMultipleFkRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSplitMultipleFkRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, InsertOption<WhiteSplitMultipleFkRefCB> insertOption, UpdateOption<WhiteSplitMultipleFkRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSplitMultipleFkRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSplitMultipleFkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, DeleteOption<WhiteSplitMultipleFkRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSplitMultipleFkRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, InsertOption<WhiteSplitMultipleFkRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSplitMultipleFkRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, UpdateOption<WhiteSplitMultipleFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSplitMultipleFkRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSplitMultipleFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSplitMultipleFkRef> whiteSplitMultipleFkRefList, DeleteOption<WhiteSplitMultipleFkRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSplitMultipleFkRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB> setupper, InsertOption<WhiteSplitMultipleFkRefCB> option) {
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
     * WhiteSplitMultipleFkRef whiteSplitMultipleFkRef = new WhiteSplitMultipleFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setPK...(value);</span>
     * whiteSplitMultipleFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkRef.setVersionNo(value);</span>
     * WhiteSplitMultipleFkRefCB cb = new WhiteSplitMultipleFkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSplitMultipleFkRefCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkRefCB&gt;() {
     *     public void specify(WhiteSplitMultipleFkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSplitMultipleFkRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSplitMultipleFkRef, cb, option);
     * </pre>
     * @param whiteSplitMultipleFkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSplitMultipleFkRef whiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB cb, UpdateOption<WhiteSplitMultipleFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSplitMultipleFkRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSplitMultipleFkRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSplitMultipleFkRefCB cb, DeleteOption<WhiteSplitMultipleFkRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSplitMultipleFkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSplitMultipleFkRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSplitMultipleFkRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSplitMultipleFkRef> void delegateSelectCursor(WhiteSplitMultipleFkRefCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSplitMultipleFkRef> List<ENTITY> delegateSelectList(WhiteSplitMultipleFkRefCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSplitMultipleFkRef et, InsertOption<WhiteSplitMultipleFkRefCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSplitMultipleFkRef et, UpdateOption<WhiteSplitMultipleFkRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSplitMultipleFkRef et, UpdateOption<WhiteSplitMultipleFkRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSplitMultipleFkRef et, DeleteOption<WhiteSplitMultipleFkRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSplitMultipleFkRef et, DeleteOption<WhiteSplitMultipleFkRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSplitMultipleFkRef> ls, InsertOption<WhiteSplitMultipleFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSplitMultipleFkRef> ls, UpdateOption<WhiteSplitMultipleFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSplitMultipleFkRef> ls, UpdateOption<WhiteSplitMultipleFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSplitMultipleFkRef> ls, DeleteOption<WhiteSplitMultipleFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSplitMultipleFkRef> ls, DeleteOption<WhiteSplitMultipleFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSplitMultipleFkRef et, WhiteSplitMultipleFkRefCB inCB, ConditionBean resCB, InsertOption<WhiteSplitMultipleFkRefCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSplitMultipleFkRef et, WhiteSplitMultipleFkRefCB cb, UpdateOption<WhiteSplitMultipleFkRefCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSplitMultipleFkRefCB cb, DeleteOption<WhiteSplitMultipleFkRefCB> op)
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
    protected WhiteSplitMultipleFkRef downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSplitMultipleFkRef.class);
    }

    protected WhiteSplitMultipleFkRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSplitMultipleFkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSplitMultipleFkRef> downcast(List<? extends Entity> ls) {
        return (List<WhiteSplitMultipleFkRef>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSplitMultipleFkRefCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSplitMultipleFkRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSplitMultipleFkRefCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSplitMultipleFkRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSplitMultipleFkRefCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSplitMultipleFkRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSplitMultipleFkRef, WhiteSplitMultipleFkRefCB>)sp;
    }
}
