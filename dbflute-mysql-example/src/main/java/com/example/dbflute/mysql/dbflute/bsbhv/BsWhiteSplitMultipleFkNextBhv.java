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
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_SPLIT_MULTIPLE_FK_NEXT as TABLE. <br />
 * <pre>
 * [primary key]
 *     NEXT_ID
 *
 * [column]
 *     NEXT_ID, SECOND_CODE
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
 *     white_split_multiple_fk_base
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSplitMultipleFkBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkNextBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_split_multiple_fk_next"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSplitMultipleFkNextDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSplitMultipleFkNextDbm getMyDBMeta() { return WhiteSplitMultipleFkNextDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSplitMultipleFkNext newMyEntity() { return new WhiteSplitMultipleFkNext(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSplitMultipleFkNextCB newMyConditionBean() { return new WhiteSplitMultipleFkNextCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * int count = whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSplitMultipleFkNextCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSplitMultipleFkNextCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSplitMultipleFkNextCB cb) { // called by selectPage(cb)
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
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSplitMultipleFkNext != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSplitMultipleFkNext.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkNext selectEntity(WhiteSplitMultipleFkNextCB cb) {
        return doSelectEntity(cb, WhiteSplitMultipleFkNext.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> ENTITY doSelectEntity(WhiteSplitMultipleFkNextCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSplitMultipleFkNextCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkNextCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSplitMultipleFkNextCB cb, Class<ENTITY> tp) {
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
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSplitMultipleFkNext.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkNext selectEntityWithDeletedCheck(WhiteSplitMultipleFkNextCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSplitMultipleFkNext.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> ENTITY doSelectEntityWithDeletedCheck(WhiteSplitMultipleFkNextCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSplitMultipleFkNextCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkNextCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param nextId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkNext selectByPKValue(Long nextId) {
        return doSelectByPK(nextId, WhiteSplitMultipleFkNext.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> ENTITY doSelectByPK(Long nextId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(nextId), entityType);
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> OptionalEntity<ENTITY> doSelectOptionalByPK(Long nextId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(nextId, entityType), nextId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param nextId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkNext selectByPKValueWithDeletedCheck(Long nextId) {
        return doSelectByPKWithDeletedCheck(nextId, WhiteSplitMultipleFkNext.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> ENTITY doSelectByPKWithDeletedCheck(Long nextId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(nextId), entityType);
    }

    protected WhiteSplitMultipleFkNextCB xprepareCBAsPK(Long nextId) {
        assertObjectNotNull("nextId", nextId);
        WhiteSplitMultipleFkNextCB cb = newMyConditionBean(); cb.acceptPrimaryKey(nextId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSplitMultipleFkNext&gt; whiteSplitMultipleFkNextList = whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSplitMultipleFkNext whiteSplitMultipleFkNext : whiteSplitMultipleFkNextList) {
     *     ... = whiteSplitMultipleFkNext.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSplitMultipleFkNext> selectList(WhiteSplitMultipleFkNextCB cb) {
        return doSelectList(cb, WhiteSplitMultipleFkNext.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> ListResultBean<ENTITY> doSelectList(WhiteSplitMultipleFkNextCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSplitMultipleFkNextCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkNextCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSplitMultipleFkNext&gt; page = whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSplitMultipleFkNext whiteSplitMultipleFkNext : page) {
     *     ... = whiteSplitMultipleFkNext.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSplitMultipleFkNext> selectPage(WhiteSplitMultipleFkNextCB cb) {
        return doSelectPage(cb, WhiteSplitMultipleFkNext.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> PagingResultBean<ENTITY> doSelectPage(WhiteSplitMultipleFkNextCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSplitMultipleFkNextCB>() {
            public int callbackSelectCount(WhiteSplitMultipleFkNextCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkNextCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSplitMultipleFkNext&gt;() {
     *     public void handle(WhiteSplitMultipleFkNext entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSplitMultipleFkNext. (NotNull)
     */
    public void selectCursor(WhiteSplitMultipleFkNextCB cb, EntityRowHandler<WhiteSplitMultipleFkNext> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSplitMultipleFkNext.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkNext> void doSelectCursor(WhiteSplitMultipleFkNextCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSplitMultipleFkNextCB>() {
            public void callbackSelectCursor(WhiteSplitMultipleFkNextCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkNextCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSplitMultipleFkNextCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSplitMultipleFkNextCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSplitMultipleFkNextCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSplitMultipleFkNextCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of whiteSplitMultipleFkBaseList by the set-upper of referrer. <br />
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseList'.
     * <pre>
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">loadWhiteSplitMultipleFkBaseList</span>(whiteSplitMultipleFkNextList, new ConditionBeanSetupper&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void setup(WhiteSplitMultipleFkBaseCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteSplitMultipleFkNext whiteSplitMultipleFkNext : whiteSplitMultipleFkNextList) {
     *     ... = whiteSplitMultipleFkNext.<span style="color: #DD4747">getWhiteSplitMultipleFkBaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextId_InScope(pkList);
     * cb.query().addOrderBy_NextId_Asc();
     * </pre>
     * @param whiteSplitMultipleFkNextList The entity list of whiteSplitMultipleFkNext. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSplitMultipleFkBase> loadWhiteSplitMultipleFkBaseList(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, ConditionBeanSetupper<WhiteSplitMultipleFkBaseCB> setupper) {
        xassLRArg(whiteSplitMultipleFkNextList, setupper);
        return doLoadWhiteSplitMultipleFkBaseList(whiteSplitMultipleFkNextList, new LoadReferrerOption<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBase>().xinit(setupper));
    }

    /**
     * Load referrer of whiteSplitMultipleFkBaseList by the set-upper of referrer. <br />
     * white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseList'.
     * <pre>
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">loadWhiteSplitMultipleFkBaseList</span>(whiteSplitMultipleFkNextList, new ConditionBeanSetupper&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void setup(WhiteSplitMultipleFkBaseCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteSplitMultipleFkNext.<span style="color: #DD4747">getWhiteSplitMultipleFkBaseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextId_InScope(pkList);
     * cb.query().addOrderBy_NextId_Asc();
     * </pre>
     * @param whiteSplitMultipleFkNext The entity of whiteSplitMultipleFkNext. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSplitMultipleFkBase> loadWhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, ConditionBeanSetupper<WhiteSplitMultipleFkBaseCB> setupper) {
        xassLRArg(whiteSplitMultipleFkNext, setupper);
        return doLoadWhiteSplitMultipleFkBaseList(xnewLRLs(whiteSplitMultipleFkNext), new LoadReferrerOption<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBase>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSplitMultipleFkNext The entity of whiteSplitMultipleFkNext. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSplitMultipleFkBase> loadWhiteSplitMultipleFkBaseList(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, LoadReferrerOption<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBase> loadReferrerOption) {
        xassLRArg(whiteSplitMultipleFkNext, loadReferrerOption);
        return loadWhiteSplitMultipleFkBaseList(xnewLRLs(whiteSplitMultipleFkNext), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param whiteSplitMultipleFkNextList The entity list of whiteSplitMultipleFkNext. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<WhiteSplitMultipleFkBase> loadWhiteSplitMultipleFkBaseList(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, LoadReferrerOption<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBase> loadReferrerOption) {
        xassLRArg(whiteSplitMultipleFkNextList, loadReferrerOption);
        if (whiteSplitMultipleFkNextList.isEmpty()) { return (NestedReferrerLoader<WhiteSplitMultipleFkBase>)EMPTY_LOADER; }
        return doLoadWhiteSplitMultipleFkBaseList(whiteSplitMultipleFkNextList, loadReferrerOption);
    }

    protected NestedReferrerLoader<WhiteSplitMultipleFkBase> doLoadWhiteSplitMultipleFkBaseList(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, LoadReferrerOption<WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBase> option) {
        final WhiteSplitMultipleFkBaseBhv referrerBhv = xgetBSFLR().select(WhiteSplitMultipleFkBaseBhv.class);
        return helpLoadReferrerInternally(whiteSplitMultipleFkNextList, option, new InternalLoadReferrerCallback<WhiteSplitMultipleFkNext, Long, WhiteSplitMultipleFkBaseCB, WhiteSplitMultipleFkBase>() {
            public Long getPKVal(WhiteSplitMultipleFkNext et)
            { return et.getNextId(); }
            public void setRfLs(WhiteSplitMultipleFkNext et, List<WhiteSplitMultipleFkBase> ls)
            { et.setWhiteSplitMultipleFkBaseList(ls); }
            public WhiteSplitMultipleFkBaseCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteSplitMultipleFkBaseCB cb, List<Long> ls)
            { cb.query().setNextId_InScope(ls); }
            public void qyOdFKAsc(WhiteSplitMultipleFkBaseCB cb) { cb.query().addOrderBy_NextId_Asc(); }
            public void spFKCol(WhiteSplitMultipleFkBaseCB cb) { cb.specify().columnNextId(); }
            public List<WhiteSplitMultipleFkBase> selRfLs(WhiteSplitMultipleFkBaseCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(WhiteSplitMultipleFkBase re) { return re.getNextId(); }
            public void setlcEt(WhiteSplitMultipleFkBase re, WhiteSplitMultipleFkNext le)
            { re.setWhiteSplitMultipleFkNext(le); }
            public String getRfPrNm() { return "whiteSplitMultipleFkBaseList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key nextId.
     * @param whiteSplitMultipleFkNextList The list of whiteSplitMultipleFkNext. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractNextIdList(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList) {
        return helpExtractListInternally(whiteSplitMultipleFkNextList, new InternalExtractCallback<WhiteSplitMultipleFkNext, Long>() {
            public Long getCV(WhiteSplitMultipleFkNext et) { return et.getNextId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkNext.setFoo...(value);
     * whiteSplitMultipleFkNext.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.set...;</span>
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">insert</span>(whiteSplitMultipleFkNext);
     * ... = whiteSplitMultipleFkNext.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSplitMultipleFkNext The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext) {
        doInsert(whiteSplitMultipleFkNext, null);
    }

    protected void doInsert(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, InsertOption<WhiteSplitMultipleFkNextCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkNext", whiteSplitMultipleFkNext);
        prepareInsertOption(op);
        delegateInsert(whiteSplitMultipleFkNext, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSplitMultipleFkNextCB> op) {
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
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * whiteSplitMultipleFkNext.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkNext.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkNext.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">update</span>(whiteSplitMultipleFkNext);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkNext The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSplitMultipleFkNext whiteSplitMultipleFkNext) {
        doUpdate(whiteSplitMultipleFkNext, null);
    }

    protected void doUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, final UpdateOption<WhiteSplitMultipleFkNextCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkNext", whiteSplitMultipleFkNext);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSplitMultipleFkNext, new InternalUpdateCallback<WhiteSplitMultipleFkNext>() {
            public int callbackDelegateUpdate(WhiteSplitMultipleFkNext et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSplitMultipleFkNextCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSplitMultipleFkNextCB createCBForVaryingUpdate() {
        WhiteSplitMultipleFkNextCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSplitMultipleFkNextCB createCBForSpecifiedUpdate() {
        WhiteSplitMultipleFkNextCB cb = newMyConditionBean();
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
     * @param whiteSplitMultipleFkNext The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext) {
        doInesrtOrUpdate(whiteSplitMultipleFkNext, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, final InsertOption<WhiteSplitMultipleFkNextCB> iop, final UpdateOption<WhiteSplitMultipleFkNextCB> uop) {
        helpInsertOrUpdateInternally(whiteSplitMultipleFkNext, new InternalInsertOrUpdateCallback<WhiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB>() {
            public void callbackInsert(WhiteSplitMultipleFkNext et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSplitMultipleFkNext et) { doUpdate(et, uop); }
            public WhiteSplitMultipleFkNextCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSplitMultipleFkNextCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSplitMultipleFkNextCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSplitMultipleFkNextCB>();
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
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * whiteSplitMultipleFkNext.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkNext.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">delete</span>(whiteSplitMultipleFkNext);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkNext The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext) {
        doDelete(whiteSplitMultipleFkNext, null);
    }

    protected void doDelete(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, final DeleteOption<WhiteSplitMultipleFkNextCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkNext", whiteSplitMultipleFkNext);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSplitMultipleFkNext, new InternalDeleteCallback<WhiteSplitMultipleFkNext>() {
            public int callbackDelegateDelete(WhiteSplitMultipleFkNext et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSplitMultipleFkNextCB> op) {
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
     *     WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     *     whiteSplitMultipleFkNext.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkNext.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSplitMultipleFkNextList.add(whiteSplitMultipleFkNext);
     * }
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">batchInsert</span>(whiteSplitMultipleFkNextList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList) {
        InsertOption<WhiteSplitMultipleFkNextCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSplitMultipleFkNextList, op);
    }

    protected int[] doBatchInsert(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, InsertOption<WhiteSplitMultipleFkNextCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkNextList", whiteSplitMultipleFkNextList);
        prepareBatchInsertOption(whiteSplitMultipleFkNextList, op);
        return delegateBatchInsert(whiteSplitMultipleFkNextList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, InsertOption<WhiteSplitMultipleFkNextCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSplitMultipleFkNextList);
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
     *     WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     *     whiteSplitMultipleFkNext.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkNext.setFooPrice(123);
     *     } else {
     *         whiteSplitMultipleFkNext.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSplitMultipleFkNextList.add(whiteSplitMultipleFkNext);
     * }
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkNextList);
     * </pre>
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList) {
        UpdateOption<WhiteSplitMultipleFkNextCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSplitMultipleFkNextList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, UpdateOption<WhiteSplitMultipleFkNextCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkNextList", whiteSplitMultipleFkNextList);
        prepareBatchUpdateOption(whiteSplitMultipleFkNextList, op);
        return delegateBatchUpdate(whiteSplitMultipleFkNextList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, UpdateOption<WhiteSplitMultipleFkNextCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSplitMultipleFkNextList);
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
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkNextList, new SpecifyQuery<WhiteSplitMultipleFkNextCB>() {
     *     public void specify(WhiteSplitMultipleFkNextCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkNextList, new SpecifyQuery<WhiteSplitMultipleFkNextCB>() {
     *     public void specify(WhiteSplitMultipleFkNextCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, SpecifyQuery<WhiteSplitMultipleFkNextCB> updateColumnSpec) {
        return doBatchUpdate(whiteSplitMultipleFkNextList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList) {
        return doBatchDelete(whiteSplitMultipleFkNextList, null);
    }

    protected int[] doBatchDelete(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, DeleteOption<WhiteSplitMultipleFkNextCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkNextList", whiteSplitMultipleFkNextList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSplitMultipleFkNextList, op);
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
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB&gt;() {
     *     public ConditionBean setup(whiteSplitMultipleFkNext entity, WhiteSplitMultipleFkNextCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB> sp, InsertOption<WhiteSplitMultipleFkNextCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSplitMultipleFkNext e = new WhiteSplitMultipleFkNext();
        WhiteSplitMultipleFkNextCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSplitMultipleFkNextCB createCBForQueryInsert() {
        WhiteSplitMultipleFkNextCB cb = newMyConditionBean();
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
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setPK...(value);</span>
     * whiteSplitMultipleFkNext.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setVersionNo(value);</span>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSplitMultipleFkNext, cb);
     * </pre>
     * @param whiteSplitMultipleFkNext The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB cb) {
        return doQueryUpdate(whiteSplitMultipleFkNext, cb, null);
    }

    protected int doQueryUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB cb, UpdateOption<WhiteSplitMultipleFkNextCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkNext", whiteSplitMultipleFkNext); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSplitMultipleFkNext, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSplitMultipleFkNextCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSplitMultipleFkNextCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">queryDelete</span>(whiteSplitMultipleFkNext, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSplitMultipleFkNextCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSplitMultipleFkNextCB cb, DeleteOption<WhiteSplitMultipleFkNextCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSplitMultipleFkNextCB)cb); }
        else { return varyingQueryDelete((WhiteSplitMultipleFkNextCB)cb, downcast(op)); }
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
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkNext.setFoo...(value);
     * whiteSplitMultipleFkNext.setBar...(value);
     * InsertOption<WhiteSplitMultipleFkNextCB> option = new InsertOption<WhiteSplitMultipleFkNextCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSplitMultipleFkNext, option);
     * ... = whiteSplitMultipleFkNext.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSplitMultipleFkNext The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, InsertOption<WhiteSplitMultipleFkNextCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSplitMultipleFkNext, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * whiteSplitMultipleFkNext.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkNext.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkNext.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSplitMultipleFkNextCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkNextCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *         public void specify(WhiteSplitMultipleFkNextCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSplitMultipleFkNext, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkNext The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, UpdateOption<WhiteSplitMultipleFkNextCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSplitMultipleFkNext, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSplitMultipleFkNext The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, InsertOption<WhiteSplitMultipleFkNextCB> insertOption, UpdateOption<WhiteSplitMultipleFkNextCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSplitMultipleFkNext, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSplitMultipleFkNext The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, DeleteOption<WhiteSplitMultipleFkNextCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSplitMultipleFkNext, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, InsertOption<WhiteSplitMultipleFkNextCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSplitMultipleFkNextList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, UpdateOption<WhiteSplitMultipleFkNextCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSplitMultipleFkNextList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSplitMultipleFkNextList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSplitMultipleFkNext> whiteSplitMultipleFkNextList, DeleteOption<WhiteSplitMultipleFkNextCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSplitMultipleFkNextList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB> setupper, InsertOption<WhiteSplitMultipleFkNextCB> option) {
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
     * WhiteSplitMultipleFkNext whiteSplitMultipleFkNext = new WhiteSplitMultipleFkNext();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setPK...(value);</span>
     * whiteSplitMultipleFkNext.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkNext.setVersionNo(value);</span>
     * WhiteSplitMultipleFkNextCB cb = new WhiteSplitMultipleFkNextCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSplitMultipleFkNextCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkNextCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkNextCB&gt;() {
     *     public void specify(WhiteSplitMultipleFkNextCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSplitMultipleFkNextBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSplitMultipleFkNext, cb, option);
     * </pre>
     * @param whiteSplitMultipleFkNext The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB cb, UpdateOption<WhiteSplitMultipleFkNextCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSplitMultipleFkNext, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSplitMultipleFkNext. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSplitMultipleFkNextCB cb, DeleteOption<WhiteSplitMultipleFkNextCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSplitMultipleFkNextBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSplitMultipleFkNextCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSplitMultipleFkNextCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSplitMultipleFkNext> void delegateSelectCursor(WhiteSplitMultipleFkNextCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSplitMultipleFkNext> List<ENTITY> delegateSelectList(WhiteSplitMultipleFkNextCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSplitMultipleFkNext et, InsertOption<WhiteSplitMultipleFkNextCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSplitMultipleFkNext et, UpdateOption<WhiteSplitMultipleFkNextCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSplitMultipleFkNext et, UpdateOption<WhiteSplitMultipleFkNextCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSplitMultipleFkNext et, DeleteOption<WhiteSplitMultipleFkNextCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSplitMultipleFkNext et, DeleteOption<WhiteSplitMultipleFkNextCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSplitMultipleFkNext> ls, InsertOption<WhiteSplitMultipleFkNextCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSplitMultipleFkNext> ls, UpdateOption<WhiteSplitMultipleFkNextCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSplitMultipleFkNext> ls, UpdateOption<WhiteSplitMultipleFkNextCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSplitMultipleFkNext> ls, DeleteOption<WhiteSplitMultipleFkNextCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSplitMultipleFkNext> ls, DeleteOption<WhiteSplitMultipleFkNextCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSplitMultipleFkNext et, WhiteSplitMultipleFkNextCB inCB, ConditionBean resCB, InsertOption<WhiteSplitMultipleFkNextCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSplitMultipleFkNext et, WhiteSplitMultipleFkNextCB cb, UpdateOption<WhiteSplitMultipleFkNextCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSplitMultipleFkNextCB cb, DeleteOption<WhiteSplitMultipleFkNextCB> op)
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
    protected WhiteSplitMultipleFkNext downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSplitMultipleFkNext.class);
    }

    protected WhiteSplitMultipleFkNextCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSplitMultipleFkNextCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSplitMultipleFkNext> downcast(List<? extends Entity> ls) {
        return (List<WhiteSplitMultipleFkNext>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSplitMultipleFkNextCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSplitMultipleFkNextCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSplitMultipleFkNextCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSplitMultipleFkNextCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSplitMultipleFkNextCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSplitMultipleFkNextCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSplitMultipleFkNext, WhiteSplitMultipleFkNextCB>)sp;
    }
}
