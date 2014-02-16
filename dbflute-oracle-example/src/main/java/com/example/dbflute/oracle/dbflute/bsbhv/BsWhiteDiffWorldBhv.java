package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of WHITE_DIFF_WORLD as TABLE. <br />
 * <pre>
 * [primary key]
 *     DIFF_WORLD_ID
 *
 * [column]
 *     DIFF_WORLD_ID, DIFF_WORLD_NAME
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
 * @author oracleman
 */
public abstract class BsWhiteDiffWorldBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "WHITE_DIFF_WORLD"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteDiffWorldDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteDiffWorldDbm getMyDBMeta() { return WhiteDiffWorldDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteDiffWorld newMyEntity() { return new WhiteDiffWorld(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteDiffWorldCB newMyConditionBean() { return new WhiteDiffWorldCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteDiffWorldCB cb = new WhiteDiffWorldCB();
     * cb.query().setFoo...(value);
     * int count = whiteDiffWorldBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteDiffWorld. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteDiffWorldCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteDiffWorldCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteDiffWorldCB cb) { // called by selectPage(cb)
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
     * WhiteDiffWorldCB cb = new WhiteDiffWorldCB();
     * cb.query().setFoo...(value);
     * WhiteDiffWorld whiteDiffWorld = whiteDiffWorldBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteDiffWorld != null) {
     *     ... = whiteDiffWorld.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDiffWorld. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDiffWorld selectEntity(WhiteDiffWorldCB cb) {
        return doSelectEntity(cb, WhiteDiffWorld.class);
    }

    protected <ENTITY extends WhiteDiffWorld> ENTITY doSelectEntity(final WhiteDiffWorldCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteDiffWorldCB>() {
            public List<ENTITY> callbackSelectList(WhiteDiffWorldCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteDiffWorldCB cb = new WhiteDiffWorldCB();
     * cb.query().setFoo...(value);
     * WhiteDiffWorld whiteDiffWorld = whiteDiffWorldBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteDiffWorld.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteDiffWorld. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDiffWorld selectEntityWithDeletedCheck(WhiteDiffWorldCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteDiffWorld.class);
    }

    protected <ENTITY extends WhiteDiffWorld> ENTITY doSelectEntityWithDeletedCheck(final WhiteDiffWorldCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteDiffWorldCB>() {
            public List<ENTITY> callbackSelectList(WhiteDiffWorldCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param diffWorldId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDiffWorld selectByPKValue(Long diffWorldId) {
        return doSelectByPKValue(diffWorldId, WhiteDiffWorld.class);
    }

    protected <ENTITY extends WhiteDiffWorld> ENTITY doSelectByPKValue(Long diffWorldId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(diffWorldId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param diffWorldId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDiffWorld selectByPKValueWithDeletedCheck(Long diffWorldId) {
        return doSelectByPKValueWithDeletedCheck(diffWorldId, WhiteDiffWorld.class);
    }

    protected <ENTITY extends WhiteDiffWorld> ENTITY doSelectByPKValueWithDeletedCheck(Long diffWorldId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(diffWorldId), entityType);
    }

    private WhiteDiffWorldCB buildPKCB(Long diffWorldId) {
        assertObjectNotNull("diffWorldId", diffWorldId);
        WhiteDiffWorldCB cb = newMyConditionBean();
        cb.query().setDiffWorldId_Equal(diffWorldId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteDiffWorldCB cb = new WhiteDiffWorldCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteDiffWorld&gt; whiteDiffWorldList = whiteDiffWorldBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteDiffWorld whiteDiffWorld : whiteDiffWorldList) {
     *     ... = whiteDiffWorld.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDiffWorld. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteDiffWorld> selectList(WhiteDiffWorldCB cb) {
        return doSelectList(cb, WhiteDiffWorld.class);
    }

    protected <ENTITY extends WhiteDiffWorld> ListResultBean<ENTITY> doSelectList(WhiteDiffWorldCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteDiffWorldCB>() {
            public List<ENTITY> callbackSelectList(WhiteDiffWorldCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * WhiteDiffWorldCB cb = new WhiteDiffWorldCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteDiffWorld&gt; page = whiteDiffWorldBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteDiffWorld whiteDiffWorld : page) {
     *     ... = whiteDiffWorld.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDiffWorld. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteDiffWorld> selectPage(WhiteDiffWorldCB cb) {
        return doSelectPage(cb, WhiteDiffWorld.class);
    }

    protected <ENTITY extends WhiteDiffWorld> PagingResultBean<ENTITY> doSelectPage(WhiteDiffWorldCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteDiffWorldCB>() {
            public int callbackSelectCount(WhiteDiffWorldCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteDiffWorldCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteDiffWorldCB cb = new WhiteDiffWorldCB();
     * cb.query().setFoo...(value);
     * whiteDiffWorldBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteDiffWorld&gt;() {
     *     public void handle(WhiteDiffWorld entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteDiffWorld. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteDiffWorld. (NotNull)
     */
    public void selectCursor(WhiteDiffWorldCB cb, EntityRowHandler<WhiteDiffWorld> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteDiffWorld.class);
    }

    protected <ENTITY extends WhiteDiffWorld> void doSelectCursor(WhiteDiffWorldCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteDiffWorldCB>() {
            public void callbackSelectCursor(WhiteDiffWorldCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteDiffWorldCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteDiffWorldBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteDiffWorldCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteDiffWorldCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteDiffWorldCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteDiffWorldCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key diffWorldId.
     * @param whiteDiffWorldList The list of whiteDiffWorld. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractDiffWorldIdList(List<WhiteDiffWorld> whiteDiffWorldList) {
        return helpExtractListInternally(whiteDiffWorldList, new InternalExtractCallback<WhiteDiffWorld, Long>() {
            public Long getCV(WhiteDiffWorld et) { return et.getDiffWorldId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteDiffWorld whiteDiffWorld = new WhiteDiffWorld();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDiffWorld.setFoo...(value);
     * whiteDiffWorld.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDiffWorld.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDiffWorld.set...;</span>
     * whiteDiffWorldBhv.<span style="color: #FD4747">insert</span>(whiteDiffWorld);
     * ... = whiteDiffWorld.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteDiffWorld The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteDiffWorld whiteDiffWorld) {
        doInsert(whiteDiffWorld, null);
    }

    protected void doInsert(WhiteDiffWorld whiteDiffWorld, InsertOption<WhiteDiffWorldCB> op) {
        assertObjectNotNull("whiteDiffWorld", whiteDiffWorld);
        prepareInsertOption(op);
        delegateInsert(whiteDiffWorld, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteDiffWorldCB> op) {
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
     * WhiteDiffWorld whiteDiffWorld = new WhiteDiffWorld();
     * whiteDiffWorld.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDiffWorld.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDiffWorld.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDiffWorld.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDiffWorld.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteDiffWorldBhv.<span style="color: #FD4747">update</span>(whiteDiffWorld);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDiffWorld The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteDiffWorld whiteDiffWorld) {
        doUpdate(whiteDiffWorld, null);
    }

    protected void doUpdate(WhiteDiffWorld whiteDiffWorld, final UpdateOption<WhiteDiffWorldCB> op) {
        assertObjectNotNull("whiteDiffWorld", whiteDiffWorld);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteDiffWorld, new InternalUpdateCallback<WhiteDiffWorld>() {
            public int callbackDelegateUpdate(WhiteDiffWorld et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteDiffWorldCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteDiffWorldCB createCBForVaryingUpdate() {
        WhiteDiffWorldCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteDiffWorldCB createCBForSpecifiedUpdate() {
        WhiteDiffWorldCB cb = newMyConditionBean();
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
     * @param whiteDiffWorld The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteDiffWorld whiteDiffWorld) {
        doInesrtOrUpdate(whiteDiffWorld, null, null);
    }

    protected void doInesrtOrUpdate(WhiteDiffWorld whiteDiffWorld, final InsertOption<WhiteDiffWorldCB> iop, final UpdateOption<WhiteDiffWorldCB> uop) {
        helpInsertOrUpdateInternally(whiteDiffWorld, new InternalInsertOrUpdateCallback<WhiteDiffWorld, WhiteDiffWorldCB>() {
            public void callbackInsert(WhiteDiffWorld et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteDiffWorld et) { doUpdate(et, uop); }
            public WhiteDiffWorldCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteDiffWorldCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteDiffWorldCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteDiffWorldCB>();
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
     * WhiteDiffWorld whiteDiffWorld = new WhiteDiffWorld();
     * whiteDiffWorld.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDiffWorld.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteDiffWorldBhv.<span style="color: #FD4747">delete</span>(whiteDiffWorld);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDiffWorld The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteDiffWorld whiteDiffWorld) {
        doDelete(whiteDiffWorld, null);
    }

    protected void doDelete(WhiteDiffWorld whiteDiffWorld, final DeleteOption<WhiteDiffWorldCB> op) {
        assertObjectNotNull("whiteDiffWorld", whiteDiffWorld);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteDiffWorld, new InternalDeleteCallback<WhiteDiffWorld>() {
            public int callbackDelegateDelete(WhiteDiffWorld et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteDiffWorldCB> op) {
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
     *     WhiteDiffWorld whiteDiffWorld = new WhiteDiffWorld();
     *     whiteDiffWorld.setFooName("foo");
     *     if (...) {
     *         whiteDiffWorld.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteDiffWorldList.add(whiteDiffWorld);
     * }
     * whiteDiffWorldBhv.<span style="color: #FD4747">batchInsert</span>(whiteDiffWorldList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteDiffWorldList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteDiffWorld> whiteDiffWorldList) {
        InsertOption<WhiteDiffWorldCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteDiffWorldList, op);
    }

    protected int[] doBatchInsert(List<WhiteDiffWorld> whiteDiffWorldList, InsertOption<WhiteDiffWorldCB> op) {
        assertObjectNotNull("whiteDiffWorldList", whiteDiffWorldList);
        prepareBatchInsertOption(whiteDiffWorldList, op);
        return delegateBatchInsert(whiteDiffWorldList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteDiffWorld> whiteDiffWorldList, InsertOption<WhiteDiffWorldCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteDiffWorldList);
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
     *     WhiteDiffWorld whiteDiffWorld = new WhiteDiffWorld();
     *     whiteDiffWorld.setFooName("foo");
     *     if (...) {
     *         whiteDiffWorld.setFooPrice(123);
     *     } else {
     *         whiteDiffWorld.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteDiffWorld.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteDiffWorldList.add(whiteDiffWorld);
     * }
     * whiteDiffWorldBhv.<span style="color: #FD4747">batchUpdate</span>(whiteDiffWorldList);
     * </pre>
     * @param whiteDiffWorldList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDiffWorld> whiteDiffWorldList) {
        UpdateOption<WhiteDiffWorldCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteDiffWorldList, op);
    }

    protected int[] doBatchUpdate(List<WhiteDiffWorld> whiteDiffWorldList, UpdateOption<WhiteDiffWorldCB> op) {
        assertObjectNotNull("whiteDiffWorldList", whiteDiffWorldList);
        prepareBatchUpdateOption(whiteDiffWorldList, op);
        return delegateBatchUpdate(whiteDiffWorldList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteDiffWorld> whiteDiffWorldList, UpdateOption<WhiteDiffWorldCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteDiffWorldList);
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
     * whiteDiffWorldBhv.<span style="color: #FD4747">batchUpdate</span>(whiteDiffWorldList, new SpecifyQuery<WhiteDiffWorldCB>() {
     *     public void specify(WhiteDiffWorldCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteDiffWorldBhv.<span style="color: #FD4747">batchUpdate</span>(whiteDiffWorldList, new SpecifyQuery<WhiteDiffWorldCB>() {
     *     public void specify(WhiteDiffWorldCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteDiffWorldList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDiffWorld> whiteDiffWorldList, SpecifyQuery<WhiteDiffWorldCB> updateColumnSpec) {
        return doBatchUpdate(whiteDiffWorldList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteDiffWorldList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteDiffWorld> whiteDiffWorldList) {
        return doBatchDelete(whiteDiffWorldList, null);
    }

    protected int[] doBatchDelete(List<WhiteDiffWorld> whiteDiffWorldList, DeleteOption<WhiteDiffWorldCB> op) {
        assertObjectNotNull("whiteDiffWorldList", whiteDiffWorldList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteDiffWorldList, op);
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
     * whiteDiffWorldBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteDiffWorld, WhiteDiffWorldCB&gt;() {
     *     public ConditionBean setup(whiteDiffWorld entity, WhiteDiffWorldCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteDiffWorld, WhiteDiffWorldCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteDiffWorld, WhiteDiffWorldCB> sp, InsertOption<WhiteDiffWorldCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteDiffWorld e = new WhiteDiffWorld();
        WhiteDiffWorldCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteDiffWorldCB createCBForQueryInsert() {
        WhiteDiffWorldCB cb = newMyConditionBean();
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
     * WhiteDiffWorld whiteDiffWorld = new WhiteDiffWorld();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDiffWorld.setPK...(value);</span>
     * whiteDiffWorld.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDiffWorld.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDiffWorld.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDiffWorld.setVersionNo(value);</span>
     * WhiteDiffWorldCB cb = new WhiteDiffWorldCB();
     * cb.query().setFoo...(value);
     * whiteDiffWorldBhv.<span style="color: #FD4747">queryUpdate</span>(whiteDiffWorld, cb);
     * </pre>
     * @param whiteDiffWorld The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteDiffWorld. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteDiffWorld whiteDiffWorld, WhiteDiffWorldCB cb) {
        return doQueryUpdate(whiteDiffWorld, cb, null);
    }

    protected int doQueryUpdate(WhiteDiffWorld whiteDiffWorld, WhiteDiffWorldCB cb, UpdateOption<WhiteDiffWorldCB> op) {
        assertObjectNotNull("whiteDiffWorld", whiteDiffWorld); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteDiffWorld, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteDiffWorldCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteDiffWorldCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteDiffWorldCB cb = new WhiteDiffWorldCB();
     * cb.query().setFoo...(value);
     * whiteDiffWorldBhv.<span style="color: #FD4747">queryDelete</span>(whiteDiffWorld, cb);
     * </pre>
     * @param cb The condition-bean of WhiteDiffWorld. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteDiffWorldCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteDiffWorldCB cb, DeleteOption<WhiteDiffWorldCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteDiffWorldCB)cb); }
        else { return varyingQueryDelete((WhiteDiffWorldCB)cb, downcast(op)); }
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
     * WhiteDiffWorld whiteDiffWorld = new WhiteDiffWorld();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDiffWorld.setFoo...(value);
     * whiteDiffWorld.setBar...(value);
     * InsertOption<WhiteDiffWorldCB> option = new InsertOption<WhiteDiffWorldCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteDiffWorldBhv.<span style="color: #FD4747">varyingInsert</span>(whiteDiffWorld, option);
     * ... = whiteDiffWorld.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteDiffWorld The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteDiffWorld whiteDiffWorld, InsertOption<WhiteDiffWorldCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteDiffWorld, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteDiffWorld whiteDiffWorld = new WhiteDiffWorld();
     * whiteDiffWorld.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDiffWorld.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDiffWorld.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteDiffWorldCB&gt; option = new UpdateOption&lt;WhiteDiffWorldCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteDiffWorldCB&gt;() {
     *         public void specify(WhiteDiffWorldCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteDiffWorldBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteDiffWorld, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDiffWorld The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteDiffWorld whiteDiffWorld, UpdateOption<WhiteDiffWorldCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteDiffWorld, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteDiffWorld The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteDiffWorld whiteDiffWorld, InsertOption<WhiteDiffWorldCB> insertOption, UpdateOption<WhiteDiffWorldCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteDiffWorld, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteDiffWorld The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteDiffWorld whiteDiffWorld, DeleteOption<WhiteDiffWorldCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteDiffWorld, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteDiffWorldList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteDiffWorld> whiteDiffWorldList, InsertOption<WhiteDiffWorldCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteDiffWorldList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteDiffWorldList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteDiffWorld> whiteDiffWorldList, UpdateOption<WhiteDiffWorldCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteDiffWorldList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteDiffWorldList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteDiffWorld> whiteDiffWorldList, DeleteOption<WhiteDiffWorldCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteDiffWorldList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteDiffWorld, WhiteDiffWorldCB> setupper, InsertOption<WhiteDiffWorldCB> option) {
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
     * WhiteDiffWorld whiteDiffWorld = new WhiteDiffWorld();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDiffWorld.setPK...(value);</span>
     * whiteDiffWorld.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDiffWorld.setVersionNo(value);</span>
     * WhiteDiffWorldCB cb = new WhiteDiffWorldCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteDiffWorldCB&gt; option = new UpdateOption&lt;WhiteDiffWorldCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteDiffWorldCB&gt;() {
     *     public void specify(WhiteDiffWorldCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteDiffWorldBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteDiffWorld, cb, option);
     * </pre>
     * @param whiteDiffWorld The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteDiffWorld. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteDiffWorld whiteDiffWorld, WhiteDiffWorldCB cb, UpdateOption<WhiteDiffWorldCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteDiffWorld, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteDiffWorld. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteDiffWorldCB cb, DeleteOption<WhiteDiffWorldCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteDiffWorldBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteDiffWorldCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteDiffWorldCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteDiffWorld> void delegateSelectCursor(WhiteDiffWorldCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteDiffWorld> List<ENTITY> delegateSelectList(WhiteDiffWorldCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteDiffWorld et, InsertOption<WhiteDiffWorldCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteDiffWorld et, UpdateOption<WhiteDiffWorldCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteDiffWorld et, UpdateOption<WhiteDiffWorldCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteDiffWorld et, DeleteOption<WhiteDiffWorldCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteDiffWorld et, DeleteOption<WhiteDiffWorldCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteDiffWorld> ls, InsertOption<WhiteDiffWorldCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteDiffWorld> ls, UpdateOption<WhiteDiffWorldCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteDiffWorld> ls, UpdateOption<WhiteDiffWorldCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteDiffWorld> ls, DeleteOption<WhiteDiffWorldCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteDiffWorld> ls, DeleteOption<WhiteDiffWorldCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteDiffWorld et, WhiteDiffWorldCB inCB, ConditionBean resCB, InsertOption<WhiteDiffWorldCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteDiffWorld et, WhiteDiffWorldCB cb, UpdateOption<WhiteDiffWorldCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteDiffWorldCB cb, DeleteOption<WhiteDiffWorldCB> op)
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
    protected WhiteDiffWorld downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteDiffWorld.class);
    }

    protected WhiteDiffWorldCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteDiffWorldCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteDiffWorld> downcast(List<? extends Entity> ls) {
        return (List<WhiteDiffWorld>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteDiffWorldCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteDiffWorldCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteDiffWorldCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteDiffWorldCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteDiffWorldCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteDiffWorldCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteDiffWorld, WhiteDiffWorldCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteDiffWorld, WhiteDiffWorldCB>)sp;
    }
}
