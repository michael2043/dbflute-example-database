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
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_LOAD_DATA as TABLE. <br />
 * <pre>
 * [primary key]
 *     LOAD_DATA_ID
 *
 * [column]
 *     LOAD_DATA_ID, LOAD_DATA_NAME
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
public abstract class BsWhiteLoadDataBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_load_data"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteLoadDataDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteLoadDataDbm getMyDBMeta() { return WhiteLoadDataDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteLoadData newMyEntity() { return new WhiteLoadData(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteLoadDataCB newMyConditionBean() { return new WhiteLoadDataCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteLoadDataCB cb = new WhiteLoadDataCB();
     * cb.query().setFoo...(value);
     * int count = whiteLoadDataBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteLoadData. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteLoadDataCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteLoadDataCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteLoadDataCB cb) { // called by selectPage(cb)
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
     * Select the entity by the condition-bean.
     * <pre>
     * WhiteLoadDataCB cb = new WhiteLoadDataCB();
     * cb.query().setFoo...(value);
     * WhiteLoadData whiteLoadData = whiteLoadDataBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteLoadData != null) {
     *     ... = whiteLoadData.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteLoadData. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteLoadData selectEntity(WhiteLoadDataCB cb) {
        return doSelectEntity(cb, WhiteLoadData.class);
    }

    protected <ENTITY extends WhiteLoadData> ENTITY doSelectEntity(WhiteLoadDataCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteLoadDataCB>() {
            public List<ENTITY> callbackSelectList(WhiteLoadDataCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteLoadDataCB cb = new WhiteLoadDataCB();
     * cb.query().setFoo...(value);
     * WhiteLoadData whiteLoadData = whiteLoadDataBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteLoadData.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteLoadData. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteLoadData selectEntityWithDeletedCheck(WhiteLoadDataCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteLoadData.class);
    }

    protected <ENTITY extends WhiteLoadData> ENTITY doSelectEntityWithDeletedCheck(WhiteLoadDataCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteLoadDataCB>() {
            public List<ENTITY> callbackSelectList(WhiteLoadDataCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param loadDataId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteLoadData selectByPKValue(Long loadDataId) {
        return doSelectByPKValue(loadDataId, WhiteLoadData.class);
    }

    protected <ENTITY extends WhiteLoadData> ENTITY doSelectByPKValue(Long loadDataId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(loadDataId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param loadDataId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteLoadData selectByPKValueWithDeletedCheck(Long loadDataId) {
        return doSelectByPKValueWithDeletedCheck(loadDataId, WhiteLoadData.class);
    }

    protected <ENTITY extends WhiteLoadData> ENTITY doSelectByPKValueWithDeletedCheck(Long loadDataId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(loadDataId), entityType);
    }

    private WhiteLoadDataCB buildPKCB(Long loadDataId) {
        assertObjectNotNull("loadDataId", loadDataId);
        WhiteLoadDataCB cb = newMyConditionBean();
        cb.query().setLoadDataId_Equal(loadDataId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteLoadDataCB cb = new WhiteLoadDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteLoadData&gt; whiteLoadDataList = whiteLoadDataBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteLoadData whiteLoadData : whiteLoadDataList) {
     *     ... = whiteLoadData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteLoadData. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteLoadData> selectList(WhiteLoadDataCB cb) {
        return doSelectList(cb, WhiteLoadData.class);
    }

    protected <ENTITY extends WhiteLoadData> ListResultBean<ENTITY> doSelectList(WhiteLoadDataCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteLoadDataCB>() {
            public List<ENTITY> callbackSelectList(WhiteLoadDataCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteLoadDataCB cb = new WhiteLoadDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteLoadData&gt; page = whiteLoadDataBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteLoadData whiteLoadData : page) {
     *     ... = whiteLoadData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteLoadData. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteLoadData> selectPage(WhiteLoadDataCB cb) {
        return doSelectPage(cb, WhiteLoadData.class);
    }

    protected <ENTITY extends WhiteLoadData> PagingResultBean<ENTITY> doSelectPage(WhiteLoadDataCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteLoadDataCB>() {
            public int callbackSelectCount(WhiteLoadDataCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteLoadDataCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteLoadDataCB cb = new WhiteLoadDataCB();
     * cb.query().setFoo...(value);
     * whiteLoadDataBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteLoadData&gt;() {
     *     public void handle(WhiteLoadData entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteLoadData. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteLoadData. (NotNull)
     */
    public void selectCursor(WhiteLoadDataCB cb, EntityRowHandler<WhiteLoadData> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteLoadData.class);
    }

    protected <ENTITY extends WhiteLoadData> void doSelectCursor(WhiteLoadDataCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteLoadDataCB>() {
            public void callbackSelectCursor(WhiteLoadDataCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteLoadDataCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteLoadDataBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteLoadDataCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteLoadDataCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteLoadDataCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteLoadDataCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
    /**
     * Extract the value list of (single) primary key loadDataId.
     * @param whiteLoadDataList The list of whiteLoadData. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractLoadDataIdList(List<WhiteLoadData> whiteLoadDataList) {
        return helpExtractListInternally(whiteLoadDataList, new InternalExtractCallback<WhiteLoadData, Long>() {
            public Long getCV(WhiteLoadData et) { return et.getLoadDataId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteLoadData whiteLoadData = new WhiteLoadData();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteLoadData.setFoo...(value);
     * whiteLoadData.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteLoadData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteLoadData.set...;</span>
     * whiteLoadDataBhv.<span style="color: #FD4747">insert</span>(whiteLoadData);
     * ... = whiteLoadData.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteLoadData The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteLoadData whiteLoadData) {
        doInsert(whiteLoadData, null);
    }

    protected void doInsert(WhiteLoadData whiteLoadData, InsertOption<WhiteLoadDataCB> op) {
        assertObjectNotNull("whiteLoadData", whiteLoadData);
        prepareInsertOption(op);
        delegateInsert(whiteLoadData, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteLoadDataCB> op) {
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
     * WhiteLoadData whiteLoadData = new WhiteLoadData();
     * whiteLoadData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteLoadData.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteLoadData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteLoadData.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteLoadData.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteLoadDataBhv.<span style="color: #FD4747">update</span>(whiteLoadData);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteLoadData The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteLoadData whiteLoadData) {
        doUpdate(whiteLoadData, null);
    }

    protected void doUpdate(WhiteLoadData whiteLoadData, final UpdateOption<WhiteLoadDataCB> op) {
        assertObjectNotNull("whiteLoadData", whiteLoadData);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteLoadData, new InternalUpdateCallback<WhiteLoadData>() {
            public int callbackDelegateUpdate(WhiteLoadData et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteLoadDataCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteLoadDataCB createCBForVaryingUpdate() {
        WhiteLoadDataCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteLoadDataCB createCBForSpecifiedUpdate() {
        WhiteLoadDataCB cb = newMyConditionBean();
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
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteLoadData The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteLoadData whiteLoadData) {
        doInesrtOrUpdate(whiteLoadData, null, null);
    }

    protected void doInesrtOrUpdate(WhiteLoadData whiteLoadData, final InsertOption<WhiteLoadDataCB> iop, final UpdateOption<WhiteLoadDataCB> uop) {
        helpInsertOrUpdateInternally(whiteLoadData, new InternalInsertOrUpdateCallback<WhiteLoadData, WhiteLoadDataCB>() {
            public void callbackInsert(WhiteLoadData et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteLoadData et) { doUpdate(et, uop); }
            public WhiteLoadDataCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteLoadDataCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteLoadDataCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteLoadDataCB>();
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
     * WhiteLoadData whiteLoadData = new WhiteLoadData();
     * whiteLoadData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteLoadData.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteLoadDataBhv.<span style="color: #FD4747">delete</span>(whiteLoadData);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteLoadData The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteLoadData whiteLoadData) {
        doDelete(whiteLoadData, null);
    }

    protected void doDelete(WhiteLoadData whiteLoadData, final DeleteOption<WhiteLoadDataCB> op) {
        assertObjectNotNull("whiteLoadData", whiteLoadData);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteLoadData, new InternalDeleteCallback<WhiteLoadData>() {
            public int callbackDelegateDelete(WhiteLoadData et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteLoadDataCB> op) {
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
     * <p><span style="color: #FD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteLoadData whiteLoadData = new WhiteLoadData();
     *     whiteLoadData.setFooName("foo");
     *     if (...) {
     *         whiteLoadData.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteLoadDataList.add(whiteLoadData);
     * }
     * whiteLoadDataBhv.<span style="color: #FD4747">batchInsert</span>(whiteLoadDataList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteLoadDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteLoadData> whiteLoadDataList) {
        InsertOption<WhiteLoadDataCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteLoadDataList, op);
    }

    protected int[] doBatchInsert(List<WhiteLoadData> whiteLoadDataList, InsertOption<WhiteLoadDataCB> op) {
        assertObjectNotNull("whiteLoadDataList", whiteLoadDataList);
        prepareBatchInsertOption(whiteLoadDataList, op);
        return delegateBatchInsert(whiteLoadDataList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteLoadData> whiteLoadDataList, InsertOption<WhiteLoadDataCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteLoadDataList);
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
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteLoadData whiteLoadData = new WhiteLoadData();
     *     whiteLoadData.setFooName("foo");
     *     if (...) {
     *         whiteLoadData.setFooPrice(123);
     *     } else {
     *         whiteLoadData.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteLoadData.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteLoadDataList.add(whiteLoadData);
     * }
     * whiteLoadDataBhv.<span style="color: #FD4747">batchUpdate</span>(whiteLoadDataList);
     * </pre>
     * @param whiteLoadDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteLoadData> whiteLoadDataList) {
        UpdateOption<WhiteLoadDataCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteLoadDataList, op);
    }

    protected int[] doBatchUpdate(List<WhiteLoadData> whiteLoadDataList, UpdateOption<WhiteLoadDataCB> op) {
        assertObjectNotNull("whiteLoadDataList", whiteLoadDataList);
        prepareBatchUpdateOption(whiteLoadDataList, op);
        return delegateBatchUpdate(whiteLoadDataList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteLoadData> whiteLoadDataList, UpdateOption<WhiteLoadDataCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteLoadDataList);
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
     * whiteLoadDataBhv.<span style="color: #FD4747">batchUpdate</span>(whiteLoadDataList, new SpecifyQuery<WhiteLoadDataCB>() {
     *     public void specify(WhiteLoadDataCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteLoadDataBhv.<span style="color: #FD4747">batchUpdate</span>(whiteLoadDataList, new SpecifyQuery<WhiteLoadDataCB>() {
     *     public void specify(WhiteLoadDataCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteLoadDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteLoadData> whiteLoadDataList, SpecifyQuery<WhiteLoadDataCB> updateColumnSpec) {
        return doBatchUpdate(whiteLoadDataList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteLoadDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteLoadData> whiteLoadDataList) {
        return doBatchDelete(whiteLoadDataList, null);
    }

    protected int[] doBatchDelete(List<WhiteLoadData> whiteLoadDataList, DeleteOption<WhiteLoadDataCB> op) {
        assertObjectNotNull("whiteLoadDataList", whiteLoadDataList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteLoadDataList, op);
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
     * whiteLoadDataBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteLoadData, WhiteLoadDataCB&gt;() {
     *     public ConditionBean setup(whiteLoadData entity, WhiteLoadDataCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteLoadData, WhiteLoadDataCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteLoadData, WhiteLoadDataCB> sp, InsertOption<WhiteLoadDataCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteLoadData e = new WhiteLoadData();
        WhiteLoadDataCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteLoadDataCB createCBForQueryInsert() {
        WhiteLoadDataCB cb = newMyConditionBean();
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
     * WhiteLoadData whiteLoadData = new WhiteLoadData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteLoadData.setPK...(value);</span>
     * whiteLoadData.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteLoadData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteLoadData.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteLoadData.setVersionNo(value);</span>
     * WhiteLoadDataCB cb = new WhiteLoadDataCB();
     * cb.query().setFoo...(value);
     * whiteLoadDataBhv.<span style="color: #FD4747">queryUpdate</span>(whiteLoadData, cb);
     * </pre>
     * @param whiteLoadData The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteLoadData. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteLoadData whiteLoadData, WhiteLoadDataCB cb) {
        return doQueryUpdate(whiteLoadData, cb, null);
    }

    protected int doQueryUpdate(WhiteLoadData whiteLoadData, WhiteLoadDataCB cb, UpdateOption<WhiteLoadDataCB> op) {
        assertObjectNotNull("whiteLoadData", whiteLoadData); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteLoadData, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteLoadDataCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteLoadDataCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteLoadDataCB cb = new WhiteLoadDataCB();
     * cb.query().setFoo...(value);
     * whiteLoadDataBhv.<span style="color: #FD4747">queryDelete</span>(whiteLoadData, cb);
     * </pre>
     * @param cb The condition-bean of WhiteLoadData. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteLoadDataCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteLoadDataCB cb, DeleteOption<WhiteLoadDataCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteLoadDataCB)cb); }
        else { return varyingQueryDelete((WhiteLoadDataCB)cb, downcast(op)); }
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
     * WhiteLoadData whiteLoadData = new WhiteLoadData();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteLoadData.setFoo...(value);
     * whiteLoadData.setBar...(value);
     * InsertOption<WhiteLoadDataCB> option = new InsertOption<WhiteLoadDataCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteLoadDataBhv.<span style="color: #FD4747">varyingInsert</span>(whiteLoadData, option);
     * ... = whiteLoadData.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteLoadData The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteLoadData whiteLoadData, InsertOption<WhiteLoadDataCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteLoadData, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteLoadData whiteLoadData = new WhiteLoadData();
     * whiteLoadData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteLoadData.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteLoadData.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteLoadDataCB&gt; option = new UpdateOption&lt;WhiteLoadDataCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteLoadDataCB&gt;() {
     *         public void specify(WhiteLoadDataCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteLoadDataBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteLoadData, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteLoadData The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteLoadData whiteLoadData, UpdateOption<WhiteLoadDataCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteLoadData, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteLoadData The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteLoadData whiteLoadData, InsertOption<WhiteLoadDataCB> insertOption, UpdateOption<WhiteLoadDataCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteLoadData, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteLoadData The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteLoadData whiteLoadData, DeleteOption<WhiteLoadDataCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteLoadData, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteLoadDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteLoadData> whiteLoadDataList, InsertOption<WhiteLoadDataCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteLoadDataList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteLoadDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteLoadData> whiteLoadDataList, UpdateOption<WhiteLoadDataCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteLoadDataList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteLoadDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteLoadData> whiteLoadDataList, DeleteOption<WhiteLoadDataCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteLoadDataList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteLoadData, WhiteLoadDataCB> setupper, InsertOption<WhiteLoadDataCB> option) {
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
     * WhiteLoadData whiteLoadData = new WhiteLoadData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteLoadData.setPK...(value);</span>
     * whiteLoadData.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteLoadData.setVersionNo(value);</span>
     * WhiteLoadDataCB cb = new WhiteLoadDataCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteLoadDataCB&gt; option = new UpdateOption&lt;WhiteLoadDataCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteLoadDataCB&gt;() {
     *     public void specify(WhiteLoadDataCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteLoadDataBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteLoadData, cb, option);
     * </pre>
     * @param whiteLoadData The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteLoadData. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteLoadData whiteLoadData, WhiteLoadDataCB cb, UpdateOption<WhiteLoadDataCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteLoadData, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteLoadData. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteLoadDataCB cb, DeleteOption<WhiteLoadDataCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteLoadDataBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteLoadDataCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteLoadDataCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteLoadData> void delegateSelectCursor(WhiteLoadDataCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteLoadData> List<ENTITY> delegateSelectList(WhiteLoadDataCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteLoadData et, InsertOption<WhiteLoadDataCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteLoadData et, UpdateOption<WhiteLoadDataCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteLoadData et, UpdateOption<WhiteLoadDataCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteLoadData et, DeleteOption<WhiteLoadDataCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteLoadData et, DeleteOption<WhiteLoadDataCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteLoadData> ls, InsertOption<WhiteLoadDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteLoadData> ls, UpdateOption<WhiteLoadDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteLoadData> ls, UpdateOption<WhiteLoadDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteLoadData> ls, DeleteOption<WhiteLoadDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteLoadData> ls, DeleteOption<WhiteLoadDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteLoadData et, WhiteLoadDataCB inCB, ConditionBean resCB, InsertOption<WhiteLoadDataCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteLoadData et, WhiteLoadDataCB cb, UpdateOption<WhiteLoadDataCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteLoadDataCB cb, DeleteOption<WhiteLoadDataCB> op)
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
    protected WhiteLoadData downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteLoadData.class);
    }

    protected WhiteLoadDataCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteLoadDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteLoadData> downcast(List<? extends Entity> ls) {
        return (List<WhiteLoadData>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteLoadDataCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteLoadDataCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteLoadDataCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteLoadDataCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteLoadDataCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteLoadDataCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteLoadData, WhiteLoadDataCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteLoadData, WhiteLoadDataCB>)sp;
    }
}
