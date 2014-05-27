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
 * The behavior of WHITE_IMPLICIT_REVERSE_FK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID
 *
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID, WHITE_IMPLICIT_REVERSE_FK_ID, VALID_BEGIN_DATE, VALID_END_DATE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     white_implicit_reverse_fk
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteImplicitReverseFk
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitReverseFkRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_implicit_reverse_fk_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteImplicitReverseFkRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteImplicitReverseFkRefDbm getMyDBMeta() { return WhiteImplicitReverseFkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteImplicitReverseFkRef newMyEntity() { return new WhiteImplicitReverseFkRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteImplicitReverseFkRefCB newMyConditionBean() { return new WhiteImplicitReverseFkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitReverseFkRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteImplicitReverseFkRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteImplicitReverseFkRefCB cb) { // called by selectPage(cb)
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
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteImplicitReverseFkRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteImplicitReverseFkRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkRef selectEntity(WhiteImplicitReverseFkRefCB cb) {
        return doSelectEntity(cb, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> ENTITY doSelectEntity(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteImplicitReverseFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> tp) {
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
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitReverseFkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkRef selectEntityWithDeletedCheck(WhiteImplicitReverseFkRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> ENTITY doSelectEntityWithDeletedCheck(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteImplicitReverseFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param whiteImplicitReverseFkRefId : PK, ID, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkRef selectByPKValue(Integer whiteImplicitReverseFkRefId) {
        return doSelectByPK(whiteImplicitReverseFkRefId, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> ENTITY doSelectByPK(Integer whiteImplicitReverseFkRefId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(whiteImplicitReverseFkRefId), entityType);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer whiteImplicitReverseFkRefId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(whiteImplicitReverseFkRefId, entityType), whiteImplicitReverseFkRefId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param whiteImplicitReverseFkRefId : PK, ID, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkRef selectByPKValueWithDeletedCheck(Integer whiteImplicitReverseFkRefId) {
        return doSelectByPKWithDeletedCheck(whiteImplicitReverseFkRefId, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> ENTITY doSelectByPKWithDeletedCheck(Integer whiteImplicitReverseFkRefId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(whiteImplicitReverseFkRefId), entityType);
    }

    protected WhiteImplicitReverseFkRefCB xprepareCBAsPK(Integer whiteImplicitReverseFkRefId) {
        assertObjectNotNull("whiteImplicitReverseFkRefId", whiteImplicitReverseFkRefId);
        WhiteImplicitReverseFkRefCB cb = newMyConditionBean(); cb.acceptPrimaryKey(whiteImplicitReverseFkRefId);
        return cb;
    }

    /**
     * Select the entity by the unique-key value.
     * @param whiteImplicitReverseFkId : UQ+, NotNull, INT(10), FK to white_implicit_reverse_fk. (NotNull)
     * @param validBeginDate : +UQ, NotNull, DATE(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteImplicitReverseFkRef> selectByUniqueOf(Integer whiteImplicitReverseFkId, java.util.Date validBeginDate) {
        return doSelectByUniqueOf(whiteImplicitReverseFkId, validBeginDate, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer whiteImplicitReverseFkId, java.util.Date validBeginDate, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(whiteImplicitReverseFkId, validBeginDate), entityType), whiteImplicitReverseFkId, validBeginDate);
    }

    protected WhiteImplicitReverseFkRefCB xprepareCBAsUniqueOf(Integer whiteImplicitReverseFkId, java.util.Date validBeginDate) {
        assertObjectNotNull("whiteImplicitReverseFkId", whiteImplicitReverseFkId);assertObjectNotNull("validBeginDate", validBeginDate);
        WhiteImplicitReverseFkRefCB cb = newMyConditionBean(); cb.acceptUniqueOf(whiteImplicitReverseFkId, validBeginDate);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteImplicitReverseFkRef&gt; whiteImplicitReverseFkRefList = whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteImplicitReverseFkRef whiteImplicitReverseFkRef : whiteImplicitReverseFkRefList) {
     *     ... = whiteImplicitReverseFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitReverseFkRef> selectList(WhiteImplicitReverseFkRefCB cb) {
        return doSelectList(cb, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> ListResultBean<ENTITY> doSelectList(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteImplicitReverseFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkRefCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitReverseFkRef&gt; page = whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteImplicitReverseFkRef whiteImplicitReverseFkRef : page) {
     *     ... = whiteImplicitReverseFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitReverseFkRef> selectPage(WhiteImplicitReverseFkRefCB cb) {
        return doSelectPage(cb, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> PagingResultBean<ENTITY> doSelectPage(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteImplicitReverseFkRefCB>() {
            public int callbackSelectCount(WhiteImplicitReverseFkRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteImplicitReverseFkRef&gt;() {
     *     public void handle(WhiteImplicitReverseFkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitReverseFkRef. (NotNull)
     */
    public void selectCursor(WhiteImplicitReverseFkRefCB cb, EntityRowHandler<WhiteImplicitReverseFkRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> void doSelectCursor(WhiteImplicitReverseFkRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteImplicitReverseFkRefCB>() {
            public void callbackSelectCursor(WhiteImplicitReverseFkRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteImplicitReverseFkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteImplicitReverseFkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteImplicitReverseFkRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteImplicitReverseFkRefCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'WhiteImplicitReverseFk'.
     * @param whiteImplicitReverseFkRefList The list of whiteImplicitReverseFkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitReverseFk> pulloutWhiteImplicitReverseFk(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        return helpPulloutInternally(whiteImplicitReverseFkRefList, new InternalPulloutCallback<WhiteImplicitReverseFkRef, WhiteImplicitReverseFk>() {
            public WhiteImplicitReverseFk getFr(WhiteImplicitReverseFkRef et)
            { return et.getWhiteImplicitReverseFk(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteImplicitReverseFk et, List<WhiteImplicitReverseFkRef> ls)
            { et.setWhiteImplicitReverseFkRefList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key whiteImplicitReverseFkRefId.
     * @param whiteImplicitReverseFkRefList The list of whiteImplicitReverseFkRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractWhiteImplicitReverseFkRefIdList(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        return helpExtractListInternally(whiteImplicitReverseFkRefList, new InternalExtractCallback<WhiteImplicitReverseFkRef, Integer>() {
            public Integer getCV(WhiteImplicitReverseFkRef et) { return et.getWhiteImplicitReverseFkRefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFkRef.setFoo...(value);
     * whiteImplicitReverseFkRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.set...;</span>
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">insert</span>(whiteImplicitReverseFkRef);
     * ... = whiteImplicitReverseFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitReverseFkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doInsert(whiteImplicitReverseFkRef, null);
    }

    protected void doInsert(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, InsertOption<WhiteImplicitReverseFkRefCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkRef", whiteImplicitReverseFkRef);
        prepareInsertOption(op);
        delegateInsert(whiteImplicitReverseFkRef, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteImplicitReverseFkRefCB> op) {
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
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * whiteImplicitReverseFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">update</span>(whiteImplicitReverseFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doUpdate(whiteImplicitReverseFkRef, null);
    }

    protected void doUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, final UpdateOption<WhiteImplicitReverseFkRefCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkRef", whiteImplicitReverseFkRef);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteImplicitReverseFkRef, new InternalUpdateCallback<WhiteImplicitReverseFkRef>() {
            public int callbackDelegateUpdate(WhiteImplicitReverseFkRef et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteImplicitReverseFkRefCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteImplicitReverseFkRefCB createCBForVaryingUpdate() {
        WhiteImplicitReverseFkRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteImplicitReverseFkRefCB createCBForSpecifiedUpdate() {
        WhiteImplicitReverseFkRefCB cb = newMyConditionBean();
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
     * @param whiteImplicitReverseFkRef The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doInesrtOrUpdate(whiteImplicitReverseFkRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, final InsertOption<WhiteImplicitReverseFkRefCB> iop, final UpdateOption<WhiteImplicitReverseFkRefCB> uop) {
        helpInsertOrUpdateInternally(whiteImplicitReverseFkRef, new InternalInsertOrUpdateCallback<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB>() {
            public void callbackInsert(WhiteImplicitReverseFkRef et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteImplicitReverseFkRef et) { doUpdate(et, uop); }
            public WhiteImplicitReverseFkRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteImplicitReverseFkRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteImplicitReverseFkRefCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteImplicitReverseFkRefCB>();
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
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * whiteImplicitReverseFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">delete</span>(whiteImplicitReverseFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doDelete(whiteImplicitReverseFkRef, null);
    }

    protected void doDelete(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, final DeleteOption<WhiteImplicitReverseFkRefCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkRef", whiteImplicitReverseFkRef);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteImplicitReverseFkRef, new InternalDeleteCallback<WhiteImplicitReverseFkRef>() {
            public int callbackDelegateDelete(WhiteImplicitReverseFkRef et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteImplicitReverseFkRefCB> op) {
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
     *     WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     *     whiteImplicitReverseFkRef.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFkRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitReverseFkRefList.add(whiteImplicitReverseFkRef);
     * }
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">batchInsert</span>(whiteImplicitReverseFkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        InsertOption<WhiteImplicitReverseFkRefCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteImplicitReverseFkRefList, op);
    }

    protected int[] doBatchInsert(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, InsertOption<WhiteImplicitReverseFkRefCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkRefList", whiteImplicitReverseFkRefList);
        prepareBatchInsertOption(whiteImplicitReverseFkRefList, op);
        return delegateBatchInsert(whiteImplicitReverseFkRefList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, InsertOption<WhiteImplicitReverseFkRefCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteImplicitReverseFkRefList);
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
     *     WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     *     whiteImplicitReverseFkRef.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFkRef.setFooPrice(123);
     *     } else {
     *         whiteImplicitReverseFkRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitReverseFkRefList.add(whiteImplicitReverseFkRef);
     * }
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitReverseFkRefList);
     * </pre>
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        UpdateOption<WhiteImplicitReverseFkRefCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteImplicitReverseFkRefList, op);
    }

    protected int[] doBatchUpdate(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, UpdateOption<WhiteImplicitReverseFkRefCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkRefList", whiteImplicitReverseFkRefList);
        prepareBatchUpdateOption(whiteImplicitReverseFkRefList, op);
        return delegateBatchUpdate(whiteImplicitReverseFkRefList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, UpdateOption<WhiteImplicitReverseFkRefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteImplicitReverseFkRefList);
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
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitReverseFkRefList, new SpecifyQuery<WhiteImplicitReverseFkRefCB>() {
     *     public void specify(WhiteImplicitReverseFkRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitReverseFkRefList, new SpecifyQuery<WhiteImplicitReverseFkRefCB>() {
     *     public void specify(WhiteImplicitReverseFkRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, SpecifyQuery<WhiteImplicitReverseFkRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteImplicitReverseFkRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        return doBatchDelete(whiteImplicitReverseFkRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, DeleteOption<WhiteImplicitReverseFkRefCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkRefList", whiteImplicitReverseFkRefList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteImplicitReverseFkRefList, op);
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
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB&gt;() {
     *     public ConditionBean setup(whiteImplicitReverseFkRef entity, WhiteImplicitReverseFkRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB> sp, InsertOption<WhiteImplicitReverseFkRefCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteImplicitReverseFkRef e = new WhiteImplicitReverseFkRef();
        WhiteImplicitReverseFkRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteImplicitReverseFkRefCB createCBForQueryInsert() {
        WhiteImplicitReverseFkRefCB cb = newMyConditionBean();
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
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setPK...(value);</span>
     * whiteImplicitReverseFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setVersionNo(value);</span>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">queryUpdate</span>(whiteImplicitReverseFkRef, cb);
     * </pre>
     * @param whiteImplicitReverseFkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB cb) {
        return doQueryUpdate(whiteImplicitReverseFkRef, cb, null);
    }

    protected int doQueryUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB cb, UpdateOption<WhiteImplicitReverseFkRefCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkRef", whiteImplicitReverseFkRef); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteImplicitReverseFkRef, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteImplicitReverseFkRefCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteImplicitReverseFkRefCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">queryDelete</span>(whiteImplicitReverseFkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitReverseFkRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteImplicitReverseFkRefCB cb, DeleteOption<WhiteImplicitReverseFkRefCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteImplicitReverseFkRefCB)cb); }
        else { return varyingQueryDelete((WhiteImplicitReverseFkRefCB)cb, downcast(op)); }
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
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFkRef.setFoo...(value);
     * whiteImplicitReverseFkRef.setBar...(value);
     * InsertOption<WhiteImplicitReverseFkRefCB> option = new InsertOption<WhiteImplicitReverseFkRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">varyingInsert</span>(whiteImplicitReverseFkRef, option);
     * ... = whiteImplicitReverseFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, InsertOption<WhiteImplicitReverseFkRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteImplicitReverseFkRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * whiteImplicitReverseFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *         public void specify(WhiteImplicitReverseFkRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteImplicitReverseFkRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, UpdateOption<WhiteImplicitReverseFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteImplicitReverseFkRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitReverseFkRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, InsertOption<WhiteImplicitReverseFkRefCB> insertOption, UpdateOption<WhiteImplicitReverseFkRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteImplicitReverseFkRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteImplicitReverseFkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, DeleteOption<WhiteImplicitReverseFkRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteImplicitReverseFkRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, InsertOption<WhiteImplicitReverseFkRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteImplicitReverseFkRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, UpdateOption<WhiteImplicitReverseFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteImplicitReverseFkRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, DeleteOption<WhiteImplicitReverseFkRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteImplicitReverseFkRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB> setupper, InsertOption<WhiteImplicitReverseFkRefCB> option) {
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
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setPK...(value);</span>
     * whiteImplicitReverseFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setVersionNo(value);</span>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void specify(WhiteImplicitReverseFkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteImplicitReverseFkRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteImplicitReverseFkRef, cb, option);
     * </pre>
     * @param whiteImplicitReverseFkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB cb, UpdateOption<WhiteImplicitReverseFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteImplicitReverseFkRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitReverseFkRefCB cb, DeleteOption<WhiteImplicitReverseFkRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteImplicitReverseFkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteImplicitReverseFkRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteImplicitReverseFkRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteImplicitReverseFkRef> void delegateSelectCursor(WhiteImplicitReverseFkRefCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteImplicitReverseFkRef> List<ENTITY> delegateSelectList(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteImplicitReverseFkRef et, InsertOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteImplicitReverseFkRef et, UpdateOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteImplicitReverseFkRef et, UpdateOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteImplicitReverseFkRef et, DeleteOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteImplicitReverseFkRef et, DeleteOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteImplicitReverseFkRef> ls, InsertOption<WhiteImplicitReverseFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteImplicitReverseFkRef> ls, UpdateOption<WhiteImplicitReverseFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteImplicitReverseFkRef> ls, UpdateOption<WhiteImplicitReverseFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteImplicitReverseFkRef> ls, DeleteOption<WhiteImplicitReverseFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteImplicitReverseFkRef> ls, DeleteOption<WhiteImplicitReverseFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteImplicitReverseFkRef et, WhiteImplicitReverseFkRefCB inCB, ConditionBean resCB, InsertOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteImplicitReverseFkRef et, WhiteImplicitReverseFkRefCB cb, UpdateOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteImplicitReverseFkRefCB cb, DeleteOption<WhiteImplicitReverseFkRefCB> op)
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
    protected WhiteImplicitReverseFkRef downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteImplicitReverseFkRef.class);
    }

    protected WhiteImplicitReverseFkRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteImplicitReverseFkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteImplicitReverseFkRef> downcast(List<? extends Entity> ls) {
        return (List<WhiteImplicitReverseFkRef>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteImplicitReverseFkRefCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteImplicitReverseFkRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteImplicitReverseFkRefCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteImplicitReverseFkRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteImplicitReverseFkRefCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteImplicitReverseFkRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB>)sp;
    }
}
