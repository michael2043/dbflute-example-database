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
 * The behavior of WHITE_DB_COMMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     DB_COMMENT_CODE
 *
 * [column]
 *     DB_COMMENT_CODE, DB_COMMENT_NAME
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
public abstract class BsWhiteDbCommentBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_db_comment"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteDbCommentDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteDbCommentDbm getMyDBMeta() { return WhiteDbCommentDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteDbComment newMyEntity() { return new WhiteDbComment(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteDbCommentCB newMyConditionBean() { return new WhiteDbCommentCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteDbCommentCB cb = new WhiteDbCommentCB();
     * cb.query().setFoo...(value);
     * int count = whiteDbCommentBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteDbComment. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteDbCommentCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteDbCommentCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteDbCommentCB cb) { // called by selectPage(cb)
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
     * WhiteDbCommentCB cb = new WhiteDbCommentCB();
     * cb.query().setFoo...(value);
     * WhiteDbComment whiteDbComment = whiteDbCommentBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteDbComment != null) {
     *     ... = whiteDbComment.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDbComment. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDbComment selectEntity(WhiteDbCommentCB cb) {
        return doSelectEntity(cb, WhiteDbComment.class);
    }

    protected <ENTITY extends WhiteDbComment> ENTITY doSelectEntity(WhiteDbCommentCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteDbCommentCB>() {
            public List<ENTITY> callbackSelectList(WhiteDbCommentCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteDbCommentCB cb = new WhiteDbCommentCB();
     * cb.query().setFoo...(value);
     * WhiteDbComment whiteDbComment = whiteDbCommentBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteDbComment.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteDbComment. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDbComment selectEntityWithDeletedCheck(WhiteDbCommentCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteDbComment.class);
    }

    protected <ENTITY extends WhiteDbComment> ENTITY doSelectEntityWithDeletedCheck(WhiteDbCommentCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteDbCommentCB>() {
            public List<ENTITY> callbackSelectList(WhiteDbCommentCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param dbCommentCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDbComment selectByPKValue(String dbCommentCode) {
        return doSelectByPKValue(dbCommentCode, WhiteDbComment.class);
    }

    protected <ENTITY extends WhiteDbComment> ENTITY doSelectByPKValue(String dbCommentCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(dbCommentCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param dbCommentCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDbComment selectByPKValueWithDeletedCheck(String dbCommentCode) {
        return doSelectByPKValueWithDeletedCheck(dbCommentCode, WhiteDbComment.class);
    }

    protected <ENTITY extends WhiteDbComment> ENTITY doSelectByPKValueWithDeletedCheck(String dbCommentCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(dbCommentCode), entityType);
    }

    private WhiteDbCommentCB buildPKCB(String dbCommentCode) {
        assertObjectNotNull("dbCommentCode", dbCommentCode);
        WhiteDbCommentCB cb = newMyConditionBean();
        cb.query().setDbCommentCode_Equal(dbCommentCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteDbCommentCB cb = new WhiteDbCommentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteDbComment&gt; whiteDbCommentList = whiteDbCommentBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteDbComment whiteDbComment : whiteDbCommentList) {
     *     ... = whiteDbComment.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDbComment. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteDbComment> selectList(WhiteDbCommentCB cb) {
        return doSelectList(cb, WhiteDbComment.class);
    }

    protected <ENTITY extends WhiteDbComment> ListResultBean<ENTITY> doSelectList(WhiteDbCommentCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteDbCommentCB>() {
            public List<ENTITY> callbackSelectList(WhiteDbCommentCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteDbCommentCB cb = new WhiteDbCommentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteDbComment&gt; page = whiteDbCommentBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteDbComment whiteDbComment : page) {
     *     ... = whiteDbComment.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDbComment. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteDbComment> selectPage(WhiteDbCommentCB cb) {
        return doSelectPage(cb, WhiteDbComment.class);
    }

    protected <ENTITY extends WhiteDbComment> PagingResultBean<ENTITY> doSelectPage(WhiteDbCommentCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteDbCommentCB>() {
            public int callbackSelectCount(WhiteDbCommentCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteDbCommentCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteDbCommentCB cb = new WhiteDbCommentCB();
     * cb.query().setFoo...(value);
     * whiteDbCommentBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteDbComment&gt;() {
     *     public void handle(WhiteDbComment entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteDbComment. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteDbComment. (NotNull)
     */
    public void selectCursor(WhiteDbCommentCB cb, EntityRowHandler<WhiteDbComment> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteDbComment.class);
    }

    protected <ENTITY extends WhiteDbComment> void doSelectCursor(WhiteDbCommentCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteDbCommentCB>() {
            public void callbackSelectCursor(WhiteDbCommentCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteDbCommentCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteDbCommentBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteDbCommentCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteDbCommentCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteDbCommentCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteDbCommentCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key dbCommentCode.
     * @param whiteDbCommentList The list of whiteDbComment. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractDbCommentCodeList(List<WhiteDbComment> whiteDbCommentList) {
        return helpExtractListInternally(whiteDbCommentList, new InternalExtractCallback<WhiteDbComment, String>() {
            public String getCV(WhiteDbComment et) { return et.getDbCommentCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteDbComment whiteDbComment = new WhiteDbComment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDbComment.setFoo...(value);
     * whiteDbComment.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDbComment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDbComment.set...;</span>
     * whiteDbCommentBhv.<span style="color: #FD4747">insert</span>(whiteDbComment);
     * ... = whiteDbComment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteDbComment The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteDbComment whiteDbComment) {
        doInsert(whiteDbComment, null);
    }

    protected void doInsert(WhiteDbComment whiteDbComment, InsertOption<WhiteDbCommentCB> op) {
        assertObjectNotNull("whiteDbComment", whiteDbComment);
        prepareInsertOption(op);
        delegateInsert(whiteDbComment, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteDbCommentCB> op) {
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
     * WhiteDbComment whiteDbComment = new WhiteDbComment();
     * whiteDbComment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDbComment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDbComment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDbComment.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDbComment.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteDbCommentBhv.<span style="color: #FD4747">update</span>(whiteDbComment);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDbComment The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteDbComment whiteDbComment) {
        doUpdate(whiteDbComment, null);
    }

    protected void doUpdate(WhiteDbComment whiteDbComment, final UpdateOption<WhiteDbCommentCB> op) {
        assertObjectNotNull("whiteDbComment", whiteDbComment);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteDbComment, new InternalUpdateCallback<WhiteDbComment>() {
            public int callbackDelegateUpdate(WhiteDbComment et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteDbCommentCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteDbCommentCB createCBForVaryingUpdate() {
        WhiteDbCommentCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteDbCommentCB createCBForSpecifiedUpdate() {
        WhiteDbCommentCB cb = newMyConditionBean();
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
     * @param whiteDbComment The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteDbComment whiteDbComment) {
        doInesrtOrUpdate(whiteDbComment, null, null);
    }

    protected void doInesrtOrUpdate(WhiteDbComment whiteDbComment, final InsertOption<WhiteDbCommentCB> iop, final UpdateOption<WhiteDbCommentCB> uop) {
        helpInsertOrUpdateInternally(whiteDbComment, new InternalInsertOrUpdateCallback<WhiteDbComment, WhiteDbCommentCB>() {
            public void callbackInsert(WhiteDbComment et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteDbComment et) { doUpdate(et, uop); }
            public WhiteDbCommentCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteDbCommentCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteDbCommentCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteDbCommentCB>();
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
     * WhiteDbComment whiteDbComment = new WhiteDbComment();
     * whiteDbComment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDbComment.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteDbCommentBhv.<span style="color: #FD4747">delete</span>(whiteDbComment);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDbComment The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteDbComment whiteDbComment) {
        doDelete(whiteDbComment, null);
    }

    protected void doDelete(WhiteDbComment whiteDbComment, final DeleteOption<WhiteDbCommentCB> op) {
        assertObjectNotNull("whiteDbComment", whiteDbComment);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteDbComment, new InternalDeleteCallback<WhiteDbComment>() {
            public int callbackDelegateDelete(WhiteDbComment et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteDbCommentCB> op) {
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
     *     WhiteDbComment whiteDbComment = new WhiteDbComment();
     *     whiteDbComment.setFooName("foo");
     *     if (...) {
     *         whiteDbComment.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteDbCommentList.add(whiteDbComment);
     * }
     * whiteDbCommentBhv.<span style="color: #FD4747">batchInsert</span>(whiteDbCommentList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteDbCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteDbComment> whiteDbCommentList) {
        InsertOption<WhiteDbCommentCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteDbCommentList, op);
    }

    protected int[] doBatchInsert(List<WhiteDbComment> whiteDbCommentList, InsertOption<WhiteDbCommentCB> op) {
        assertObjectNotNull("whiteDbCommentList", whiteDbCommentList);
        prepareBatchInsertOption(whiteDbCommentList, op);
        return delegateBatchInsert(whiteDbCommentList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteDbComment> whiteDbCommentList, InsertOption<WhiteDbCommentCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteDbCommentList);
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
     *     WhiteDbComment whiteDbComment = new WhiteDbComment();
     *     whiteDbComment.setFooName("foo");
     *     if (...) {
     *         whiteDbComment.setFooPrice(123);
     *     } else {
     *         whiteDbComment.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteDbComment.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteDbCommentList.add(whiteDbComment);
     * }
     * whiteDbCommentBhv.<span style="color: #FD4747">batchUpdate</span>(whiteDbCommentList);
     * </pre>
     * @param whiteDbCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDbComment> whiteDbCommentList) {
        UpdateOption<WhiteDbCommentCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteDbCommentList, op);
    }

    protected int[] doBatchUpdate(List<WhiteDbComment> whiteDbCommentList, UpdateOption<WhiteDbCommentCB> op) {
        assertObjectNotNull("whiteDbCommentList", whiteDbCommentList);
        prepareBatchUpdateOption(whiteDbCommentList, op);
        return delegateBatchUpdate(whiteDbCommentList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteDbComment> whiteDbCommentList, UpdateOption<WhiteDbCommentCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteDbCommentList);
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
     * whiteDbCommentBhv.<span style="color: #FD4747">batchUpdate</span>(whiteDbCommentList, new SpecifyQuery<WhiteDbCommentCB>() {
     *     public void specify(WhiteDbCommentCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteDbCommentBhv.<span style="color: #FD4747">batchUpdate</span>(whiteDbCommentList, new SpecifyQuery<WhiteDbCommentCB>() {
     *     public void specify(WhiteDbCommentCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteDbCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDbComment> whiteDbCommentList, SpecifyQuery<WhiteDbCommentCB> updateColumnSpec) {
        return doBatchUpdate(whiteDbCommentList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteDbCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteDbComment> whiteDbCommentList) {
        return doBatchDelete(whiteDbCommentList, null);
    }

    protected int[] doBatchDelete(List<WhiteDbComment> whiteDbCommentList, DeleteOption<WhiteDbCommentCB> op) {
        assertObjectNotNull("whiteDbCommentList", whiteDbCommentList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteDbCommentList, op);
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
     * whiteDbCommentBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteDbComment, WhiteDbCommentCB&gt;() {
     *     public ConditionBean setup(whiteDbComment entity, WhiteDbCommentCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteDbComment, WhiteDbCommentCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteDbComment, WhiteDbCommentCB> sp, InsertOption<WhiteDbCommentCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteDbComment e = new WhiteDbComment();
        WhiteDbCommentCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteDbCommentCB createCBForQueryInsert() {
        WhiteDbCommentCB cb = newMyConditionBean();
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
     * WhiteDbComment whiteDbComment = new WhiteDbComment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDbComment.setPK...(value);</span>
     * whiteDbComment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDbComment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDbComment.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDbComment.setVersionNo(value);</span>
     * WhiteDbCommentCB cb = new WhiteDbCommentCB();
     * cb.query().setFoo...(value);
     * whiteDbCommentBhv.<span style="color: #FD4747">queryUpdate</span>(whiteDbComment, cb);
     * </pre>
     * @param whiteDbComment The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteDbComment. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteDbComment whiteDbComment, WhiteDbCommentCB cb) {
        return doQueryUpdate(whiteDbComment, cb, null);
    }

    protected int doQueryUpdate(WhiteDbComment whiteDbComment, WhiteDbCommentCB cb, UpdateOption<WhiteDbCommentCB> op) {
        assertObjectNotNull("whiteDbComment", whiteDbComment); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteDbComment, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteDbCommentCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteDbCommentCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteDbCommentCB cb = new WhiteDbCommentCB();
     * cb.query().setFoo...(value);
     * whiteDbCommentBhv.<span style="color: #FD4747">queryDelete</span>(whiteDbComment, cb);
     * </pre>
     * @param cb The condition-bean of WhiteDbComment. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteDbCommentCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteDbCommentCB cb, DeleteOption<WhiteDbCommentCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteDbCommentCB)cb); }
        else { return varyingQueryDelete((WhiteDbCommentCB)cb, downcast(op)); }
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
     * WhiteDbComment whiteDbComment = new WhiteDbComment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDbComment.setFoo...(value);
     * whiteDbComment.setBar...(value);
     * InsertOption<WhiteDbCommentCB> option = new InsertOption<WhiteDbCommentCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteDbCommentBhv.<span style="color: #FD4747">varyingInsert</span>(whiteDbComment, option);
     * ... = whiteDbComment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteDbComment The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteDbComment whiteDbComment, InsertOption<WhiteDbCommentCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteDbComment, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteDbComment whiteDbComment = new WhiteDbComment();
     * whiteDbComment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDbComment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDbComment.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteDbCommentCB&gt; option = new UpdateOption&lt;WhiteDbCommentCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteDbCommentCB&gt;() {
     *         public void specify(WhiteDbCommentCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteDbCommentBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteDbComment, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDbComment The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteDbComment whiteDbComment, UpdateOption<WhiteDbCommentCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteDbComment, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteDbComment The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteDbComment whiteDbComment, InsertOption<WhiteDbCommentCB> insertOption, UpdateOption<WhiteDbCommentCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteDbComment, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteDbComment The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteDbComment whiteDbComment, DeleteOption<WhiteDbCommentCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteDbComment, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteDbCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteDbComment> whiteDbCommentList, InsertOption<WhiteDbCommentCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteDbCommentList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteDbCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteDbComment> whiteDbCommentList, UpdateOption<WhiteDbCommentCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteDbCommentList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteDbCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteDbComment> whiteDbCommentList, DeleteOption<WhiteDbCommentCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteDbCommentList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteDbComment, WhiteDbCommentCB> setupper, InsertOption<WhiteDbCommentCB> option) {
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
     * WhiteDbComment whiteDbComment = new WhiteDbComment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDbComment.setPK...(value);</span>
     * whiteDbComment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDbComment.setVersionNo(value);</span>
     * WhiteDbCommentCB cb = new WhiteDbCommentCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteDbCommentCB&gt; option = new UpdateOption&lt;WhiteDbCommentCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteDbCommentCB&gt;() {
     *     public void specify(WhiteDbCommentCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteDbCommentBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteDbComment, cb, option);
     * </pre>
     * @param whiteDbComment The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteDbComment. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteDbComment whiteDbComment, WhiteDbCommentCB cb, UpdateOption<WhiteDbCommentCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteDbComment, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteDbComment. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteDbCommentCB cb, DeleteOption<WhiteDbCommentCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteDbCommentBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteDbCommentCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteDbCommentCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteDbComment> void delegateSelectCursor(WhiteDbCommentCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteDbComment> List<ENTITY> delegateSelectList(WhiteDbCommentCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteDbComment et, InsertOption<WhiteDbCommentCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteDbComment et, UpdateOption<WhiteDbCommentCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteDbComment et, UpdateOption<WhiteDbCommentCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteDbComment et, DeleteOption<WhiteDbCommentCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteDbComment et, DeleteOption<WhiteDbCommentCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteDbComment> ls, InsertOption<WhiteDbCommentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteDbComment> ls, UpdateOption<WhiteDbCommentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteDbComment> ls, UpdateOption<WhiteDbCommentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteDbComment> ls, DeleteOption<WhiteDbCommentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteDbComment> ls, DeleteOption<WhiteDbCommentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteDbComment et, WhiteDbCommentCB inCB, ConditionBean resCB, InsertOption<WhiteDbCommentCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteDbComment et, WhiteDbCommentCB cb, UpdateOption<WhiteDbCommentCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteDbCommentCB cb, DeleteOption<WhiteDbCommentCB> op)
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
    protected WhiteDbComment downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteDbComment.class);
    }

    protected WhiteDbCommentCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteDbCommentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteDbComment> downcast(List<? extends Entity> ls) {
        return (List<WhiteDbComment>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteDbCommentCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteDbCommentCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteDbCommentCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteDbCommentCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteDbCommentCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteDbCommentCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteDbComment, WhiteDbCommentCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteDbComment, WhiteDbCommentCB>)sp;
    }
}
