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
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_ESCAPED_JAVA_DOC as TABLE. <br />
 * <pre>
 * [primary key]
 *     ESCAPED_JAVA_DOC_CODE
 *
 * [column]
 *     ESCAPED_JAVA_DOC_CODE, ESCAPED_JAVA_DOC_NAME
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
public abstract class BsWhiteEscapedJavaDocBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_escaped_java_doc"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteEscapedJavaDocDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteEscapedJavaDocDbm getMyDBMeta() { return WhiteEscapedJavaDocDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteEscapedJavaDoc newMyEntity() { return new WhiteEscapedJavaDoc(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteEscapedJavaDocCB newMyConditionBean() { return new WhiteEscapedJavaDocCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB();
     * cb.query().setFoo...(value);
     * int count = whiteEscapedJavaDocBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteEscapedJavaDoc. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteEscapedJavaDocCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteEscapedJavaDocCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteEscapedJavaDocCB cb) { // called by selectPage(cb)
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
     * WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB();
     * cb.query().setFoo...(value);
     * WhiteEscapedJavaDoc whiteEscapedJavaDoc = whiteEscapedJavaDocBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteEscapedJavaDoc != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteEscapedJavaDoc.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteEscapedJavaDoc. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteEscapedJavaDoc selectEntity(WhiteEscapedJavaDocCB cb) {
        return doSelectEntity(cb, WhiteEscapedJavaDoc.class);
    }

    protected <ENTITY extends WhiteEscapedJavaDoc> ENTITY doSelectEntity(WhiteEscapedJavaDocCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteEscapedJavaDocCB>() {
            public List<ENTITY> callbackSelectList(WhiteEscapedJavaDocCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteEscapedJavaDoc> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteEscapedJavaDocCB cb, Class<ENTITY> tp) {
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
     * WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB();
     * cb.query().setFoo...(value);
     * WhiteEscapedJavaDoc whiteEscapedJavaDoc = whiteEscapedJavaDocBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteEscapedJavaDoc.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteEscapedJavaDoc. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteEscapedJavaDoc selectEntityWithDeletedCheck(WhiteEscapedJavaDocCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteEscapedJavaDoc.class);
    }

    protected <ENTITY extends WhiteEscapedJavaDoc> ENTITY doSelectEntityWithDeletedCheck(WhiteEscapedJavaDocCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteEscapedJavaDocCB>() {
            public List<ENTITY> callbackSelectList(WhiteEscapedJavaDocCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param escapedJavaDocCode : PK, NotNull, CHAR(3), classification=EscapedJavaDocCls. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteEscapedJavaDoc selectByPKValue(CDef.EscapedJavaDocCls escapedJavaDocCode) {
        return doSelectByPK(escapedJavaDocCode, WhiteEscapedJavaDoc.class);
    }

    protected <ENTITY extends WhiteEscapedJavaDoc> ENTITY doSelectByPK(CDef.EscapedJavaDocCls escapedJavaDocCode, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(escapedJavaDocCode), entityType);
    }

    protected <ENTITY extends WhiteEscapedJavaDoc> OptionalEntity<ENTITY> doSelectOptionalByPK(CDef.EscapedJavaDocCls escapedJavaDocCode, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(escapedJavaDocCode, entityType), escapedJavaDocCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param escapedJavaDocCode : PK, NotNull, CHAR(3), classification=EscapedJavaDocCls. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteEscapedJavaDoc selectByPKValueWithDeletedCheck(CDef.EscapedJavaDocCls escapedJavaDocCode) {
        return doSelectByPKWithDeletedCheck(escapedJavaDocCode, WhiteEscapedJavaDoc.class);
    }

    protected <ENTITY extends WhiteEscapedJavaDoc> ENTITY doSelectByPKWithDeletedCheck(CDef.EscapedJavaDocCls escapedJavaDocCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(escapedJavaDocCode), entityType);
    }

    protected WhiteEscapedJavaDocCB xprepareCBAsPK(CDef.EscapedJavaDocCls escapedJavaDocCode) {
        assertObjectNotNull("escapedJavaDocCode", escapedJavaDocCode);
        WhiteEscapedJavaDocCB cb = newMyConditionBean(); cb.acceptPrimaryKey(escapedJavaDocCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteEscapedJavaDoc&gt; whiteEscapedJavaDocList = whiteEscapedJavaDocBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteEscapedJavaDoc whiteEscapedJavaDoc : whiteEscapedJavaDocList) {
     *     ... = whiteEscapedJavaDoc.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteEscapedJavaDoc. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteEscapedJavaDoc> selectList(WhiteEscapedJavaDocCB cb) {
        return doSelectList(cb, WhiteEscapedJavaDoc.class);
    }

    protected <ENTITY extends WhiteEscapedJavaDoc> ListResultBean<ENTITY> doSelectList(WhiteEscapedJavaDocCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteEscapedJavaDocCB>() {
            public List<ENTITY> callbackSelectList(WhiteEscapedJavaDocCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteEscapedJavaDoc&gt; page = whiteEscapedJavaDocBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteEscapedJavaDoc whiteEscapedJavaDoc : page) {
     *     ... = whiteEscapedJavaDoc.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteEscapedJavaDoc. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteEscapedJavaDoc> selectPage(WhiteEscapedJavaDocCB cb) {
        return doSelectPage(cb, WhiteEscapedJavaDoc.class);
    }

    protected <ENTITY extends WhiteEscapedJavaDoc> PagingResultBean<ENTITY> doSelectPage(WhiteEscapedJavaDocCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteEscapedJavaDocCB>() {
            public int callbackSelectCount(WhiteEscapedJavaDocCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteEscapedJavaDocCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB();
     * cb.query().setFoo...(value);
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteEscapedJavaDoc&gt;() {
     *     public void handle(WhiteEscapedJavaDoc entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteEscapedJavaDoc. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteEscapedJavaDoc. (NotNull)
     */
    public void selectCursor(WhiteEscapedJavaDocCB cb, EntityRowHandler<WhiteEscapedJavaDoc> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteEscapedJavaDoc.class);
    }

    protected <ENTITY extends WhiteEscapedJavaDoc> void doSelectCursor(WhiteEscapedJavaDocCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteEscapedJavaDocCB>() {
            public void callbackSelectCursor(WhiteEscapedJavaDocCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteEscapedJavaDocCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteEscapedJavaDocCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteEscapedJavaDocCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteEscapedJavaDocCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteEscapedJavaDocCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key escapedJavaDocCode.
     * @param whiteEscapedJavaDocList The list of whiteEscapedJavaDoc. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractEscapedJavaDocCodeList(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList) {
        return helpExtractListInternally(whiteEscapedJavaDocList, new InternalExtractCallback<WhiteEscapedJavaDoc, String>() {
            public String getCV(WhiteEscapedJavaDoc et) { return et.getEscapedJavaDocCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteEscapedJavaDoc whiteEscapedJavaDoc = new WhiteEscapedJavaDoc();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteEscapedJavaDoc.setFoo...(value);
     * whiteEscapedJavaDoc.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteEscapedJavaDoc.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteEscapedJavaDoc.set...;</span>
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">insert</span>(whiteEscapedJavaDoc);
     * ... = whiteEscapedJavaDoc.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteEscapedJavaDoc The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteEscapedJavaDoc whiteEscapedJavaDoc) {
        doInsert(whiteEscapedJavaDoc, null);
    }

    protected void doInsert(WhiteEscapedJavaDoc whiteEscapedJavaDoc, InsertOption<WhiteEscapedJavaDocCB> op) {
        assertObjectNotNull("whiteEscapedJavaDoc", whiteEscapedJavaDoc);
        prepareInsertOption(op);
        delegateInsert(whiteEscapedJavaDoc, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteEscapedJavaDocCB> op) {
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
     * WhiteEscapedJavaDoc whiteEscapedJavaDoc = new WhiteEscapedJavaDoc();
     * whiteEscapedJavaDoc.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteEscapedJavaDoc.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteEscapedJavaDoc.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteEscapedJavaDoc.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteEscapedJavaDoc.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteEscapedJavaDocBhv.<span style="color: #DD4747">update</span>(whiteEscapedJavaDoc);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteEscapedJavaDoc The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteEscapedJavaDoc whiteEscapedJavaDoc) {
        doUpdate(whiteEscapedJavaDoc, null);
    }

    protected void doUpdate(WhiteEscapedJavaDoc whiteEscapedJavaDoc, final UpdateOption<WhiteEscapedJavaDocCB> op) {
        assertObjectNotNull("whiteEscapedJavaDoc", whiteEscapedJavaDoc);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteEscapedJavaDoc, new InternalUpdateCallback<WhiteEscapedJavaDoc>() {
            public int callbackDelegateUpdate(WhiteEscapedJavaDoc et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteEscapedJavaDocCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteEscapedJavaDocCB createCBForVaryingUpdate() {
        WhiteEscapedJavaDocCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteEscapedJavaDocCB createCBForSpecifiedUpdate() {
        WhiteEscapedJavaDocCB cb = newMyConditionBean();
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
     * @param whiteEscapedJavaDoc The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteEscapedJavaDoc whiteEscapedJavaDoc) {
        doInesrtOrUpdate(whiteEscapedJavaDoc, null, null);
    }

    protected void doInesrtOrUpdate(WhiteEscapedJavaDoc whiteEscapedJavaDoc, final InsertOption<WhiteEscapedJavaDocCB> iop, final UpdateOption<WhiteEscapedJavaDocCB> uop) {
        helpInsertOrUpdateInternally(whiteEscapedJavaDoc, new InternalInsertOrUpdateCallback<WhiteEscapedJavaDoc, WhiteEscapedJavaDocCB>() {
            public void callbackInsert(WhiteEscapedJavaDoc et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteEscapedJavaDoc et) { doUpdate(et, uop); }
            public WhiteEscapedJavaDocCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteEscapedJavaDocCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteEscapedJavaDocCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteEscapedJavaDocCB>();
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
     * WhiteEscapedJavaDoc whiteEscapedJavaDoc = new WhiteEscapedJavaDoc();
     * whiteEscapedJavaDoc.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteEscapedJavaDoc.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteEscapedJavaDocBhv.<span style="color: #DD4747">delete</span>(whiteEscapedJavaDoc);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteEscapedJavaDoc The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteEscapedJavaDoc whiteEscapedJavaDoc) {
        doDelete(whiteEscapedJavaDoc, null);
    }

    protected void doDelete(WhiteEscapedJavaDoc whiteEscapedJavaDoc, final DeleteOption<WhiteEscapedJavaDocCB> op) {
        assertObjectNotNull("whiteEscapedJavaDoc", whiteEscapedJavaDoc);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteEscapedJavaDoc, new InternalDeleteCallback<WhiteEscapedJavaDoc>() {
            public int callbackDelegateDelete(WhiteEscapedJavaDoc et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteEscapedJavaDocCB> op) {
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
     *     WhiteEscapedJavaDoc whiteEscapedJavaDoc = new WhiteEscapedJavaDoc();
     *     whiteEscapedJavaDoc.setFooName("foo");
     *     if (...) {
     *         whiteEscapedJavaDoc.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteEscapedJavaDocList.add(whiteEscapedJavaDoc);
     * }
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">batchInsert</span>(whiteEscapedJavaDocList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteEscapedJavaDocList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList) {
        InsertOption<WhiteEscapedJavaDocCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteEscapedJavaDocList, op);
    }

    protected int[] doBatchInsert(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList, InsertOption<WhiteEscapedJavaDocCB> op) {
        assertObjectNotNull("whiteEscapedJavaDocList", whiteEscapedJavaDocList);
        prepareBatchInsertOption(whiteEscapedJavaDocList, op);
        return delegateBatchInsert(whiteEscapedJavaDocList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList, InsertOption<WhiteEscapedJavaDocCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteEscapedJavaDocList);
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
     *     WhiteEscapedJavaDoc whiteEscapedJavaDoc = new WhiteEscapedJavaDoc();
     *     whiteEscapedJavaDoc.setFooName("foo");
     *     if (...) {
     *         whiteEscapedJavaDoc.setFooPrice(123);
     *     } else {
     *         whiteEscapedJavaDoc.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteEscapedJavaDoc.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteEscapedJavaDocList.add(whiteEscapedJavaDoc);
     * }
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">batchUpdate</span>(whiteEscapedJavaDocList);
     * </pre>
     * @param whiteEscapedJavaDocList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList) {
        UpdateOption<WhiteEscapedJavaDocCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteEscapedJavaDocList, op);
    }

    protected int[] doBatchUpdate(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList, UpdateOption<WhiteEscapedJavaDocCB> op) {
        assertObjectNotNull("whiteEscapedJavaDocList", whiteEscapedJavaDocList);
        prepareBatchUpdateOption(whiteEscapedJavaDocList, op);
        return delegateBatchUpdate(whiteEscapedJavaDocList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList, UpdateOption<WhiteEscapedJavaDocCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteEscapedJavaDocList);
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
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">batchUpdate</span>(whiteEscapedJavaDocList, new SpecifyQuery<WhiteEscapedJavaDocCB>() {
     *     public void specify(WhiteEscapedJavaDocCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">batchUpdate</span>(whiteEscapedJavaDocList, new SpecifyQuery<WhiteEscapedJavaDocCB>() {
     *     public void specify(WhiteEscapedJavaDocCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteEscapedJavaDocList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList, SpecifyQuery<WhiteEscapedJavaDocCB> updateColumnSpec) {
        return doBatchUpdate(whiteEscapedJavaDocList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteEscapedJavaDocList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList) {
        return doBatchDelete(whiteEscapedJavaDocList, null);
    }

    protected int[] doBatchDelete(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList, DeleteOption<WhiteEscapedJavaDocCB> op) {
        assertObjectNotNull("whiteEscapedJavaDocList", whiteEscapedJavaDocList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteEscapedJavaDocList, op);
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
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteEscapedJavaDoc, WhiteEscapedJavaDocCB&gt;() {
     *     public ConditionBean setup(whiteEscapedJavaDoc entity, WhiteEscapedJavaDocCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteEscapedJavaDoc, WhiteEscapedJavaDocCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteEscapedJavaDoc, WhiteEscapedJavaDocCB> sp, InsertOption<WhiteEscapedJavaDocCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteEscapedJavaDoc e = new WhiteEscapedJavaDoc();
        WhiteEscapedJavaDocCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteEscapedJavaDocCB createCBForQueryInsert() {
        WhiteEscapedJavaDocCB cb = newMyConditionBean();
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
     * WhiteEscapedJavaDoc whiteEscapedJavaDoc = new WhiteEscapedJavaDoc();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteEscapedJavaDoc.setPK...(value);</span>
     * whiteEscapedJavaDoc.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteEscapedJavaDoc.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteEscapedJavaDoc.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteEscapedJavaDoc.setVersionNo(value);</span>
     * WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB();
     * cb.query().setFoo...(value);
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">queryUpdate</span>(whiteEscapedJavaDoc, cb);
     * </pre>
     * @param whiteEscapedJavaDoc The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteEscapedJavaDoc. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteEscapedJavaDoc whiteEscapedJavaDoc, WhiteEscapedJavaDocCB cb) {
        return doQueryUpdate(whiteEscapedJavaDoc, cb, null);
    }

    protected int doQueryUpdate(WhiteEscapedJavaDoc whiteEscapedJavaDoc, WhiteEscapedJavaDocCB cb, UpdateOption<WhiteEscapedJavaDocCB> op) {
        assertObjectNotNull("whiteEscapedJavaDoc", whiteEscapedJavaDoc); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteEscapedJavaDoc, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteEscapedJavaDocCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteEscapedJavaDocCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB();
     * cb.query().setFoo...(value);
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">queryDelete</span>(whiteEscapedJavaDoc, cb);
     * </pre>
     * @param cb The condition-bean of WhiteEscapedJavaDoc. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteEscapedJavaDocCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteEscapedJavaDocCB cb, DeleteOption<WhiteEscapedJavaDocCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteEscapedJavaDocCB)cb); }
        else { return varyingQueryDelete((WhiteEscapedJavaDocCB)cb, downcast(op)); }
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
     * WhiteEscapedJavaDoc whiteEscapedJavaDoc = new WhiteEscapedJavaDoc();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteEscapedJavaDoc.setFoo...(value);
     * whiteEscapedJavaDoc.setBar...(value);
     * InsertOption<WhiteEscapedJavaDocCB> option = new InsertOption<WhiteEscapedJavaDocCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">varyingInsert</span>(whiteEscapedJavaDoc, option);
     * ... = whiteEscapedJavaDoc.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteEscapedJavaDoc The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteEscapedJavaDoc whiteEscapedJavaDoc, InsertOption<WhiteEscapedJavaDocCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteEscapedJavaDoc, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteEscapedJavaDoc whiteEscapedJavaDoc = new WhiteEscapedJavaDoc();
     * whiteEscapedJavaDoc.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteEscapedJavaDoc.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteEscapedJavaDoc.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteEscapedJavaDocCB&gt; option = new UpdateOption&lt;WhiteEscapedJavaDocCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteEscapedJavaDocCB&gt;() {
     *         public void specify(WhiteEscapedJavaDocCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteEscapedJavaDocBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteEscapedJavaDoc, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteEscapedJavaDoc The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteEscapedJavaDoc whiteEscapedJavaDoc, UpdateOption<WhiteEscapedJavaDocCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteEscapedJavaDoc, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteEscapedJavaDoc The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteEscapedJavaDoc whiteEscapedJavaDoc, InsertOption<WhiteEscapedJavaDocCB> insertOption, UpdateOption<WhiteEscapedJavaDocCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteEscapedJavaDoc, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteEscapedJavaDoc The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteEscapedJavaDoc whiteEscapedJavaDoc, DeleteOption<WhiteEscapedJavaDocCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteEscapedJavaDoc, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteEscapedJavaDocList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList, InsertOption<WhiteEscapedJavaDocCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteEscapedJavaDocList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteEscapedJavaDocList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList, UpdateOption<WhiteEscapedJavaDocCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteEscapedJavaDocList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteEscapedJavaDocList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteEscapedJavaDoc> whiteEscapedJavaDocList, DeleteOption<WhiteEscapedJavaDocCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteEscapedJavaDocList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteEscapedJavaDoc, WhiteEscapedJavaDocCB> setupper, InsertOption<WhiteEscapedJavaDocCB> option) {
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
     * WhiteEscapedJavaDoc whiteEscapedJavaDoc = new WhiteEscapedJavaDoc();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteEscapedJavaDoc.setPK...(value);</span>
     * whiteEscapedJavaDoc.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteEscapedJavaDoc.setVersionNo(value);</span>
     * WhiteEscapedJavaDocCB cb = new WhiteEscapedJavaDocCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteEscapedJavaDocCB&gt; option = new UpdateOption&lt;WhiteEscapedJavaDocCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteEscapedJavaDocCB&gt;() {
     *     public void specify(WhiteEscapedJavaDocCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteEscapedJavaDocBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteEscapedJavaDoc, cb, option);
     * </pre>
     * @param whiteEscapedJavaDoc The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteEscapedJavaDoc. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteEscapedJavaDoc whiteEscapedJavaDoc, WhiteEscapedJavaDocCB cb, UpdateOption<WhiteEscapedJavaDocCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteEscapedJavaDoc, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteEscapedJavaDoc. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteEscapedJavaDocCB cb, DeleteOption<WhiteEscapedJavaDocCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteEscapedJavaDocBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteEscapedJavaDocCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteEscapedJavaDocCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteEscapedJavaDoc> void delegateSelectCursor(WhiteEscapedJavaDocCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteEscapedJavaDoc> List<ENTITY> delegateSelectList(WhiteEscapedJavaDocCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteEscapedJavaDoc et, InsertOption<WhiteEscapedJavaDocCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteEscapedJavaDoc et, UpdateOption<WhiteEscapedJavaDocCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteEscapedJavaDoc et, UpdateOption<WhiteEscapedJavaDocCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteEscapedJavaDoc et, DeleteOption<WhiteEscapedJavaDocCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteEscapedJavaDoc et, DeleteOption<WhiteEscapedJavaDocCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteEscapedJavaDoc> ls, InsertOption<WhiteEscapedJavaDocCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteEscapedJavaDoc> ls, UpdateOption<WhiteEscapedJavaDocCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteEscapedJavaDoc> ls, UpdateOption<WhiteEscapedJavaDocCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteEscapedJavaDoc> ls, DeleteOption<WhiteEscapedJavaDocCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteEscapedJavaDoc> ls, DeleteOption<WhiteEscapedJavaDocCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteEscapedJavaDoc et, WhiteEscapedJavaDocCB inCB, ConditionBean resCB, InsertOption<WhiteEscapedJavaDocCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteEscapedJavaDoc et, WhiteEscapedJavaDocCB cb, UpdateOption<WhiteEscapedJavaDocCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteEscapedJavaDocCB cb, DeleteOption<WhiteEscapedJavaDocCB> op)
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
    protected WhiteEscapedJavaDoc downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteEscapedJavaDoc.class);
    }

    protected WhiteEscapedJavaDocCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteEscapedJavaDocCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteEscapedJavaDoc> downcast(List<? extends Entity> ls) {
        return (List<WhiteEscapedJavaDoc>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteEscapedJavaDocCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteEscapedJavaDocCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteEscapedJavaDocCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteEscapedJavaDocCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteEscapedJavaDocCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteEscapedJavaDocCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteEscapedJavaDoc, WhiteEscapedJavaDocCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteEscapedJavaDoc, WhiteEscapedJavaDocCB>)sp;
    }
}
