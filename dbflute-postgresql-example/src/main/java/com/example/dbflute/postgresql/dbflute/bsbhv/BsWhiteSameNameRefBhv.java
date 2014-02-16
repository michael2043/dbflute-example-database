package com.example.dbflute.postgresql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The behavior of white_same_name_ref as TABLE. <br />
 * <pre>
 * [primary key]
 *     same_name_ref_id
 *
 * [column]
 *     same_name_ref_id, same_name_id, next_same_name_id
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
 *     white_same_name
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSameName
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSameNameRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_same_name_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSameNameRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSameNameRefDbm getMyDBMeta() { return WhiteSameNameRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSameNameRef newMyEntity() { return new WhiteSameNameRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSameNameRefCB newMyConditionBean() { return new WhiteSameNameRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSameNameRefCB cb = new WhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteSameNameRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSameNameRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSameNameRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSameNameRefCB cb) { // called by selectPage(cb)
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
     * WhiteSameNameRefCB cb = new WhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * WhiteSameNameRef whiteSameNameRef = whiteSameNameRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteSameNameRef != null) {
     *     ... = whiteSameNameRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameNameRef selectEntity(WhiteSameNameRefCB cb) {
        return doSelectEntity(cb, WhiteSameNameRef.class);
    }

    protected <ENTITY extends WhiteSameNameRef> ENTITY doSelectEntity(final WhiteSameNameRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSameNameRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteSameNameRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteSameNameRefCB cb = new WhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * WhiteSameNameRef whiteSameNameRef = whiteSameNameRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSameNameRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameNameRef selectEntityWithDeletedCheck(WhiteSameNameRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSameNameRef.class);
    }

    protected <ENTITY extends WhiteSameNameRef> ENTITY doSelectEntityWithDeletedCheck(final WhiteSameNameRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSameNameRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteSameNameRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param sameNameRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameNameRef selectByPKValue(Integer sameNameRefId) {
        return doSelectByPKValue(sameNameRefId, WhiteSameNameRef.class);
    }

    protected <ENTITY extends WhiteSameNameRef> ENTITY doSelectByPKValue(Integer sameNameRefId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(sameNameRefId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param sameNameRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameNameRef selectByPKValueWithDeletedCheck(Integer sameNameRefId) {
        return doSelectByPKValueWithDeletedCheck(sameNameRefId, WhiteSameNameRef.class);
    }

    protected <ENTITY extends WhiteSameNameRef> ENTITY doSelectByPKValueWithDeletedCheck(Integer sameNameRefId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(sameNameRefId), entityType);
    }

    private WhiteSameNameRefCB buildPKCB(Integer sameNameRefId) {
        assertObjectNotNull("sameNameRefId", sameNameRefId);
        WhiteSameNameRefCB cb = newMyConditionBean();
        cb.query().setSameNameRefId_Equal(sameNameRefId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSameNameRefCB cb = new WhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSameNameRef&gt; whiteSameNameRefList = whiteSameNameRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteSameNameRef whiteSameNameRef : whiteSameNameRefList) {
     *     ... = whiteSameNameRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSameNameRef> selectList(WhiteSameNameRefCB cb) {
        return doSelectList(cb, WhiteSameNameRef.class);
    }

    protected <ENTITY extends WhiteSameNameRef> ListResultBean<ENTITY> doSelectList(WhiteSameNameRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSameNameRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteSameNameRefCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * WhiteSameNameRefCB cb = new WhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSameNameRef&gt; page = whiteSameNameRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSameNameRef whiteSameNameRef : page) {
     *     ... = whiteSameNameRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSameNameRef> selectPage(WhiteSameNameRefCB cb) {
        return doSelectPage(cb, WhiteSameNameRef.class);
    }

    protected <ENTITY extends WhiteSameNameRef> PagingResultBean<ENTITY> doSelectPage(WhiteSameNameRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSameNameRefCB>() {
            public int callbackSelectCount(WhiteSameNameRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSameNameRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteSameNameRefCB cb = new WhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * whiteSameNameRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSameNameRef&gt;() {
     *     public void handle(WhiteSameNameRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSameNameRef. (NotNull)
     */
    public void selectCursor(WhiteSameNameRefCB cb, EntityRowHandler<WhiteSameNameRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSameNameRef.class);
    }

    protected <ENTITY extends WhiteSameNameRef> void doSelectCursor(WhiteSameNameRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSameNameRefCB>() {
            public void callbackSelectCursor(WhiteSameNameRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSameNameRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSameNameRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSameNameRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSameNameRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSameNameRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSameNameRefCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'WhiteSameName'.
     * @param whiteSameNameRefList The list of whiteSameNameRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSameName> pulloutWhiteSameName(List<WhiteSameNameRef> whiteSameNameRefList) {
        return helpPulloutInternally(whiteSameNameRefList, new InternalPulloutCallback<WhiteSameNameRef, WhiteSameName>() {
            public WhiteSameName getFr(WhiteSameNameRef et) { return et.getWhiteSameName(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSameName et, List<WhiteSameNameRef> ls)
            { et.setWhiteSameNameRefList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key sameNameRefId.
     * @param whiteSameNameRefList The list of whiteSameNameRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractSameNameRefIdList(List<WhiteSameNameRef> whiteSameNameRefList) {
        return helpExtractListInternally(whiteSameNameRefList, new InternalExtractCallback<WhiteSameNameRef, Integer>() {
            public Integer getCV(WhiteSameNameRef et) { return et.getSameNameRefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSameNameRef whiteSameNameRef = new WhiteSameNameRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameNameRef.setFoo...(value);
     * whiteSameNameRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.set...;</span>
     * whiteSameNameRefBhv.<span style="color: #FD4747">insert</span>(whiteSameNameRef);
     * ... = whiteSameNameRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSameNameRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSameNameRef whiteSameNameRef) {
        doInsert(whiteSameNameRef, null);
    }

    protected void doInsert(WhiteSameNameRef whiteSameNameRef, InsertOption<WhiteSameNameRefCB> op) {
        assertObjectNotNull("whiteSameNameRef", whiteSameNameRef);
        prepareInsertOption(op);
        delegateInsert(whiteSameNameRef, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSameNameRefCB> op) {
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
     * WhiteSameNameRef whiteSameNameRef = new WhiteSameNameRef();
     * whiteSameNameRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameNameRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameNameRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameRefBhv.<span style="color: #FD4747">update</span>(whiteSameNameRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameNameRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSameNameRef whiteSameNameRef) {
        doUpdate(whiteSameNameRef, null);
    }

    protected void doUpdate(WhiteSameNameRef whiteSameNameRef, final UpdateOption<WhiteSameNameRefCB> op) {
        assertObjectNotNull("whiteSameNameRef", whiteSameNameRef);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSameNameRef, new InternalUpdateCallback<WhiteSameNameRef>() {
            public int callbackDelegateUpdate(WhiteSameNameRef et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSameNameRefCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSameNameRefCB createCBForVaryingUpdate() {
        WhiteSameNameRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSameNameRefCB createCBForSpecifiedUpdate() {
        WhiteSameNameRefCB cb = newMyConditionBean();
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
     * @param whiteSameNameRef The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSameNameRef whiteSameNameRef) {
        doInesrtOrUpdate(whiteSameNameRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSameNameRef whiteSameNameRef, final InsertOption<WhiteSameNameRefCB> iop, final UpdateOption<WhiteSameNameRefCB> uop) {
        helpInsertOrUpdateInternally(whiteSameNameRef, new InternalInsertOrUpdateCallback<WhiteSameNameRef, WhiteSameNameRefCB>() {
            public void callbackInsert(WhiteSameNameRef et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSameNameRef et) { doUpdate(et, uop); }
            public WhiteSameNameRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSameNameRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSameNameRefCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSameNameRefCB>();
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
     * WhiteSameNameRef whiteSameNameRef = new WhiteSameNameRef();
     * whiteSameNameRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameNameRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameRefBhv.<span style="color: #FD4747">delete</span>(whiteSameNameRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameNameRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSameNameRef whiteSameNameRef) {
        doDelete(whiteSameNameRef, null);
    }

    protected void doDelete(WhiteSameNameRef whiteSameNameRef, final DeleteOption<WhiteSameNameRefCB> op) {
        assertObjectNotNull("whiteSameNameRef", whiteSameNameRef);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSameNameRef, new InternalDeleteCallback<WhiteSameNameRef>() {
            public int callbackDelegateDelete(WhiteSameNameRef et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSameNameRefCB> op) {
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
     *     WhiteSameNameRef whiteSameNameRef = new WhiteSameNameRef();
     *     whiteSameNameRef.setFooName("foo");
     *     if (...) {
     *         whiteSameNameRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSameNameRefList.add(whiteSameNameRef);
     * }
     * whiteSameNameRefBhv.<span style="color: #FD4747">batchInsert</span>(whiteSameNameRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSameNameRef> whiteSameNameRefList) {
        InsertOption<WhiteSameNameRefCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSameNameRefList, op);
    }

    protected int[] doBatchInsert(List<WhiteSameNameRef> whiteSameNameRefList, InsertOption<WhiteSameNameRefCB> op) {
        assertObjectNotNull("whiteSameNameRefList", whiteSameNameRefList);
        prepareBatchInsertOption(whiteSameNameRefList, op);
        return delegateBatchInsert(whiteSameNameRefList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSameNameRef> whiteSameNameRefList, InsertOption<WhiteSameNameRefCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSameNameRefList);
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
     *     WhiteSameNameRef whiteSameNameRef = new WhiteSameNameRef();
     *     whiteSameNameRef.setFooName("foo");
     *     if (...) {
     *         whiteSameNameRef.setFooPrice(123);
     *     } else {
     *         whiteSameNameRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSameNameRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSameNameRefList.add(whiteSameNameRef);
     * }
     * whiteSameNameRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameRefList);
     * </pre>
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSameNameRef> whiteSameNameRefList) {
        UpdateOption<WhiteSameNameRefCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSameNameRefList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSameNameRef> whiteSameNameRefList, UpdateOption<WhiteSameNameRefCB> op) {
        assertObjectNotNull("whiteSameNameRefList", whiteSameNameRefList);
        prepareBatchUpdateOption(whiteSameNameRefList, op);
        return delegateBatchUpdate(whiteSameNameRefList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSameNameRef> whiteSameNameRefList, UpdateOption<WhiteSameNameRefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSameNameRefList);
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
     * whiteSameNameRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameRefList, new SpecifyQuery<WhiteSameNameRefCB>() {
     *     public void specify(WhiteSameNameRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSameNameRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameRefList, new SpecifyQuery<WhiteSameNameRefCB>() {
     *     public void specify(WhiteSameNameRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSameNameRef> whiteSameNameRefList, SpecifyQuery<WhiteSameNameRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteSameNameRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSameNameRef> whiteSameNameRefList) {
        return doBatchDelete(whiteSameNameRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteSameNameRef> whiteSameNameRefList, DeleteOption<WhiteSameNameRefCB> op) {
        assertObjectNotNull("whiteSameNameRefList", whiteSameNameRefList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSameNameRefList, op);
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
     * whiteSameNameRefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSameNameRef, WhiteSameNameRefCB&gt;() {
     *     public ConditionBean setup(whiteSameNameRef entity, WhiteSameNameRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSameNameRef, WhiteSameNameRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSameNameRef, WhiteSameNameRefCB> sp, InsertOption<WhiteSameNameRefCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSameNameRef e = new WhiteSameNameRef();
        WhiteSameNameRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSameNameRefCB createCBForQueryInsert() {
        WhiteSameNameRefCB cb = newMyConditionBean();
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
     * WhiteSameNameRef whiteSameNameRef = new WhiteSameNameRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setPK...(value);</span>
     * whiteSameNameRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setVersionNo(value);</span>
     * WhiteSameNameRefCB cb = new WhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * whiteSameNameRefBhv.<span style="color: #FD4747">queryUpdate</span>(whiteSameNameRef, cb);
     * </pre>
     * @param whiteSameNameRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSameNameRef. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSameNameRef whiteSameNameRef, WhiteSameNameRefCB cb) {
        return doQueryUpdate(whiteSameNameRef, cb, null);
    }

    protected int doQueryUpdate(WhiteSameNameRef whiteSameNameRef, WhiteSameNameRefCB cb, UpdateOption<WhiteSameNameRefCB> op) {
        assertObjectNotNull("whiteSameNameRef", whiteSameNameRef); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSameNameRef, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSameNameRefCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSameNameRefCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSameNameRefCB cb = new WhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * whiteSameNameRefBhv.<span style="color: #FD4747">queryDelete</span>(whiteSameNameRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRef. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSameNameRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSameNameRefCB cb, DeleteOption<WhiteSameNameRefCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSameNameRefCB)cb); }
        else { return varyingQueryDelete((WhiteSameNameRefCB)cb, downcast(op)); }
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
     * WhiteSameNameRef whiteSameNameRef = new WhiteSameNameRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameNameRef.setFoo...(value);
     * whiteSameNameRef.setBar...(value);
     * InsertOption<WhiteSameNameRefCB> option = new InsertOption<WhiteSameNameRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSameNameRefBhv.<span style="color: #FD4747">varyingInsert</span>(whiteSameNameRef, option);
     * ... = whiteSameNameRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSameNameRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSameNameRef whiteSameNameRef, InsertOption<WhiteSameNameRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSameNameRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSameNameRef whiteSameNameRef = new WhiteSameNameRef();
     * whiteSameNameRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameNameRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameNameRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSameNameRefCB&gt; option = new UpdateOption&lt;WhiteSameNameRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSameNameRefCB&gt;() {
     *         public void specify(WhiteSameNameRefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSameNameRefBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteSameNameRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameNameRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSameNameRef whiteSameNameRef, UpdateOption<WhiteSameNameRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSameNameRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSameNameRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSameNameRef whiteSameNameRef, InsertOption<WhiteSameNameRefCB> insertOption, UpdateOption<WhiteSameNameRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSameNameRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSameNameRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSameNameRef whiteSameNameRef, DeleteOption<WhiteSameNameRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSameNameRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSameNameRef> whiteSameNameRefList, InsertOption<WhiteSameNameRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSameNameRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSameNameRef> whiteSameNameRefList, UpdateOption<WhiteSameNameRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSameNameRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSameNameRef> whiteSameNameRefList, DeleteOption<WhiteSameNameRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSameNameRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSameNameRef, WhiteSameNameRefCB> setupper, InsertOption<WhiteSameNameRefCB> option) {
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
     * WhiteSameNameRef whiteSameNameRef = new WhiteSameNameRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setPK...(value);</span>
     * whiteSameNameRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setVersionNo(value);</span>
     * WhiteSameNameRefCB cb = new WhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSameNameRefCB&gt; option = new UpdateOption&lt;WhiteSameNameRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void specify(WhiteSameNameRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSameNameRefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteSameNameRef, cb, option);
     * </pre>
     * @param whiteSameNameRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSameNameRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSameNameRef whiteSameNameRef, WhiteSameNameRefCB cb, UpdateOption<WhiteSameNameRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSameNameRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSameNameRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSameNameRefCB cb, DeleteOption<WhiteSameNameRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSameNameRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSameNameRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSameNameRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSameNameRef> void delegateSelectCursor(WhiteSameNameRefCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSameNameRef> List<ENTITY> delegateSelectList(WhiteSameNameRefCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSameNameRef et, InsertOption<WhiteSameNameRefCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSameNameRef et, UpdateOption<WhiteSameNameRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSameNameRef et, UpdateOption<WhiteSameNameRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSameNameRef et, DeleteOption<WhiteSameNameRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSameNameRef et, DeleteOption<WhiteSameNameRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSameNameRef> ls, InsertOption<WhiteSameNameRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSameNameRef> ls, UpdateOption<WhiteSameNameRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSameNameRef> ls, UpdateOption<WhiteSameNameRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSameNameRef> ls, DeleteOption<WhiteSameNameRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSameNameRef> ls, DeleteOption<WhiteSameNameRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSameNameRef et, WhiteSameNameRefCB inCB, ConditionBean resCB, InsertOption<WhiteSameNameRefCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSameNameRef et, WhiteSameNameRefCB cb, UpdateOption<WhiteSameNameRefCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSameNameRefCB cb, DeleteOption<WhiteSameNameRefCB> op)
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
    protected WhiteSameNameRef downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSameNameRef.class);
    }

    protected WhiteSameNameRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSameNameRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSameNameRef> downcast(List<? extends Entity> ls) {
        return (List<WhiteSameNameRef>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSameNameRefCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSameNameRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSameNameRefCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSameNameRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSameNameRefCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSameNameRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSameNameRef, WhiteSameNameRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSameNameRef, WhiteSameNameRefCB>)sp;
    }
}
