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
 * The behavior of nextschema.white_same_name as TABLE. <br />
 * <pre>
 * [primary key]
 *     same_name_id
 *
 * [column]
 *     same_name_id, same_name_name, same_name_long
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
 *     nextschema.white_same_name_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSameNameRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNextschemaWhiteSameNameBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "nextschema.white_same_name"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return NextschemaWhiteSameNameDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public NextschemaWhiteSameNameDbm getMyDBMeta() { return NextschemaWhiteSameNameDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public NextschemaWhiteSameName newMyEntity() { return new NextschemaWhiteSameName(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public NextschemaWhiteSameNameCB newMyConditionBean() { return new NextschemaWhiteSameNameCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * int count = whiteSameNameBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(NextschemaWhiteSameNameCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(NextschemaWhiteSameNameCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(NextschemaWhiteSameNameCB cb) { // called by selectPage(cb)
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
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * NextschemaWhiteSameName whiteSameName = whiteSameNameBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteSameName != null) {
     *     ... = whiteSameName.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameName selectEntity(NextschemaWhiteSameNameCB cb) {
        return doSelectEntity(cb, NextschemaWhiteSameName.class);
    }

    protected <ENTITY extends NextschemaWhiteSameName> ENTITY doSelectEntity(NextschemaWhiteSameNameCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, NextschemaWhiteSameNameCB>() {
            public List<ENTITY> callbackSelectList(NextschemaWhiteSameNameCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * NextschemaWhiteSameName whiteSameName = whiteSameNameBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSameName.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameName selectEntityWithDeletedCheck(NextschemaWhiteSameNameCB cb) {
        return doSelectEntityWithDeletedCheck(cb, NextschemaWhiteSameName.class);
    }

    protected <ENTITY extends NextschemaWhiteSameName> ENTITY doSelectEntityWithDeletedCheck(NextschemaWhiteSameNameCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, NextschemaWhiteSameNameCB>() {
            public List<ENTITY> callbackSelectList(NextschemaWhiteSameNameCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param sameNameId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameName selectByPKValue(Integer sameNameId) {
        return doSelectByPKValue(sameNameId, NextschemaWhiteSameName.class);
    }

    protected <ENTITY extends NextschemaWhiteSameName> ENTITY doSelectByPKValue(Integer sameNameId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(sameNameId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param sameNameId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameName selectByPKValueWithDeletedCheck(Integer sameNameId) {
        return doSelectByPKValueWithDeletedCheck(sameNameId, NextschemaWhiteSameName.class);
    }

    protected <ENTITY extends NextschemaWhiteSameName> ENTITY doSelectByPKValueWithDeletedCheck(Integer sameNameId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(sameNameId), entityType);
    }

    private NextschemaWhiteSameNameCB buildPKCB(Integer sameNameId) {
        assertObjectNotNull("sameNameId", sameNameId);
        NextschemaWhiteSameNameCB cb = newMyConditionBean();
        cb.query().setSameNameId_Equal(sameNameId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;NextschemaWhiteSameName&gt; whiteSameNameList = whiteSameNameBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (NextschemaWhiteSameName whiteSameName : whiteSameNameList) {
     *     ... = whiteSameName.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextschemaWhiteSameName> selectList(NextschemaWhiteSameNameCB cb) {
        return doSelectList(cb, NextschemaWhiteSameName.class);
    }

    protected <ENTITY extends NextschemaWhiteSameName> ListResultBean<ENTITY> doSelectList(NextschemaWhiteSameNameCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, NextschemaWhiteSameNameCB>() {
            public List<ENTITY> callbackSelectList(NextschemaWhiteSameNameCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;NextschemaWhiteSameName&gt; page = whiteSameNameBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (NextschemaWhiteSameName whiteSameName : page) {
     *     ... = whiteSameName.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextschemaWhiteSameName> selectPage(NextschemaWhiteSameNameCB cb) {
        return doSelectPage(cb, NextschemaWhiteSameName.class);
    }

    protected <ENTITY extends NextschemaWhiteSameName> PagingResultBean<ENTITY> doSelectPage(NextschemaWhiteSameNameCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, NextschemaWhiteSameNameCB>() {
            public int callbackSelectCount(NextschemaWhiteSameNameCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(NextschemaWhiteSameNameCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * whiteSameNameBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;NextschemaWhiteSameName&gt;() {
     *     public void handle(NextschemaWhiteSameName entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @param entityRowHandler The handler of entity row of NextschemaWhiteSameName. (NotNull)
     */
    public void selectCursor(NextschemaWhiteSameNameCB cb, EntityRowHandler<NextschemaWhiteSameName> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, NextschemaWhiteSameName.class);
    }

    protected <ENTITY extends NextschemaWhiteSameName> void doSelectCursor(NextschemaWhiteSameNameCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, NextschemaWhiteSameNameCB>() {
            public void callbackSelectCursor(NextschemaWhiteSameNameCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(NextschemaWhiteSameNameCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSameNameBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(NextschemaWhiteSameNameCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<NextschemaWhiteSameNameCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends NextschemaWhiteSameNameCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends NextschemaWhiteSameNameCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteSameName The entity of whiteSameName. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteSameNameRefList(NextschemaWhiteSameName whiteSameName, ConditionBeanSetupper<NextschemaWhiteSameNameRefCB> conditionBeanSetupper) {
        xassLRArg(whiteSameName, conditionBeanSetupper);
        loadWhiteSameNameRefList(xnewLRLs(whiteSameName), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteSameNameRefList with the set-upper for condition-bean of referrer. <br />
     * nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * <pre>
     * whiteSameNameBhv.<span style="color: #FD4747">loadWhiteSameNameRefList</span>(whiteSameNameList, new ConditionBeanSetupper&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void setup(NextschemaWhiteSameNameRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (NextschemaWhiteSameName whiteSameName : whiteSameNameList) {
     *     ... = whiteSameName.<span style="color: #FD4747">getWhiteSameNameRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setSameNameId_InScope(pkList);
     * cb.query().addOrderBy_SameNameId_Asc();
     * </pre>
     * @param whiteSameNameList The entity list of whiteSameName. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteSameNameRefList(List<NextschemaWhiteSameName> whiteSameNameList, ConditionBeanSetupper<NextschemaWhiteSameNameRefCB> conditionBeanSetupper) {
        xassLRArg(whiteSameNameList, conditionBeanSetupper);
        loadWhiteSameNameRefList(whiteSameNameList, new LoadReferrerOption<NextschemaWhiteSameNameRefCB, NextschemaWhiteSameNameRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteSameName The entity of whiteSameName. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteSameNameRefList(NextschemaWhiteSameName whiteSameName, LoadReferrerOption<NextschemaWhiteSameNameRefCB, NextschemaWhiteSameNameRef> loadReferrerOption) {
        xassLRArg(whiteSameName, loadReferrerOption);
        loadWhiteSameNameRefList(xnewLRLs(whiteSameName), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteSameNameList The entity list of whiteSameName. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteSameNameRefList(List<NextschemaWhiteSameName> whiteSameNameList, LoadReferrerOption<NextschemaWhiteSameNameRefCB, NextschemaWhiteSameNameRef> loadReferrerOption) {
        xassLRArg(whiteSameNameList, loadReferrerOption);
        if (whiteSameNameList.isEmpty()) { return; }
        final NextschemaWhiteSameNameRefBhv referrerBhv = xgetBSFLR().select(NextschemaWhiteSameNameRefBhv.class);
        helpLoadReferrerInternally(whiteSameNameList, loadReferrerOption, new InternalLoadReferrerCallback<NextschemaWhiteSameName, Integer, NextschemaWhiteSameNameRefCB, NextschemaWhiteSameNameRef>() {
            public Integer getPKVal(NextschemaWhiteSameName et)
            { return et.getSameNameId(); }
            public void setRfLs(NextschemaWhiteSameName et, List<NextschemaWhiteSameNameRef> ls)
            { et.setWhiteSameNameRefList(ls); }
            public NextschemaWhiteSameNameRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(NextschemaWhiteSameNameRefCB cb, List<Integer> ls)
            { cb.query().setSameNameId_InScope(ls); }
            public void qyOdFKAsc(NextschemaWhiteSameNameRefCB cb) { cb.query().addOrderBy_SameNameId_Asc(); }
            public void spFKCol(NextschemaWhiteSameNameRefCB cb) { cb.specify().columnSameNameId(); }
            public List<NextschemaWhiteSameNameRef> selRfLs(NextschemaWhiteSameNameRefCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(NextschemaWhiteSameNameRef re) { return re.getSameNameId(); }
            public void setlcEt(NextschemaWhiteSameNameRef re, NextschemaWhiteSameName le)
            { re.setWhiteSameName(le); }
            public String getRfPrNm() { return "whiteSameNameRefList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key sameNameId.
     * @param whiteSameNameList The list of whiteSameName. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractSameNameIdList(List<NextschemaWhiteSameName> whiteSameNameList) {
        return helpExtractListInternally(whiteSameNameList, new InternalExtractCallback<NextschemaWhiteSameName, Integer>() {
            public Integer getCV(NextschemaWhiteSameName et) { return et.getSameNameId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameName.setFoo...(value);
     * whiteSameName.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * whiteSameNameBhv.<span style="color: #FD4747">insert</span>(whiteSameName);
     * ... = whiteSameName.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSameName The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(NextschemaWhiteSameName whiteSameName) {
        doInsert(whiteSameName, null);
    }

    protected void doInsert(NextschemaWhiteSameName whiteSameName, InsertOption<NextschemaWhiteSameNameCB> op) {
        assertObjectNotNull("whiteSameName", whiteSameName);
        prepareInsertOption(op);
        delegateInsert(whiteSameName, op);
    }

    protected void prepareInsertOption(InsertOption<NextschemaWhiteSameNameCB> op) {
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
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameName.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameName.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameBhv.<span style="color: #FD4747">update</span>(whiteSameName);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final NextschemaWhiteSameName whiteSameName) {
        doUpdate(whiteSameName, null);
    }

    protected void doUpdate(NextschemaWhiteSameName whiteSameName, final UpdateOption<NextschemaWhiteSameNameCB> op) {
        assertObjectNotNull("whiteSameName", whiteSameName);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSameName, new InternalUpdateCallback<NextschemaWhiteSameName>() {
            public int callbackDelegateUpdate(NextschemaWhiteSameName et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<NextschemaWhiteSameNameCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected NextschemaWhiteSameNameCB createCBForVaryingUpdate() {
        NextschemaWhiteSameNameCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected NextschemaWhiteSameNameCB createCBForSpecifiedUpdate() {
        NextschemaWhiteSameNameCB cb = newMyConditionBean();
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
     * @param whiteSameName The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(NextschemaWhiteSameName whiteSameName) {
        doInesrtOrUpdate(whiteSameName, null, null);
    }

    protected void doInesrtOrUpdate(NextschemaWhiteSameName whiteSameName, final InsertOption<NextschemaWhiteSameNameCB> iop, final UpdateOption<NextschemaWhiteSameNameCB> uop) {
        helpInsertOrUpdateInternally(whiteSameName, new InternalInsertOrUpdateCallback<NextschemaWhiteSameName, NextschemaWhiteSameNameCB>() {
            public void callbackInsert(NextschemaWhiteSameName et) { doInsert(et, iop); }
            public void callbackUpdate(NextschemaWhiteSameName et) { doUpdate(et, uop); }
            public NextschemaWhiteSameNameCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(NextschemaWhiteSameNameCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<NextschemaWhiteSameNameCB>();
            uop = uop != null ? uop : new UpdateOption<NextschemaWhiteSameNameCB>();
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
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameName.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameBhv.<span style="color: #FD4747">delete</span>(whiteSameName);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(NextschemaWhiteSameName whiteSameName) {
        doDelete(whiteSameName, null);
    }

    protected void doDelete(NextschemaWhiteSameName whiteSameName, final DeleteOption<NextschemaWhiteSameNameCB> op) {
        assertObjectNotNull("whiteSameName", whiteSameName);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSameName, new InternalDeleteCallback<NextschemaWhiteSameName>() {
            public int callbackDelegateDelete(NextschemaWhiteSameName et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<NextschemaWhiteSameNameCB> op) {
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
     *     NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     *     whiteSameName.setFooName("foo");
     *     if (...) {
     *         whiteSameName.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSameNameList.add(whiteSameName);
     * }
     * whiteSameNameBhv.<span style="color: #FD4747">batchInsert</span>(whiteSameNameList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<NextschemaWhiteSameName> whiteSameNameList) {
        InsertOption<NextschemaWhiteSameNameCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSameNameList, op);
    }

    protected int[] doBatchInsert(List<NextschemaWhiteSameName> whiteSameNameList, InsertOption<NextschemaWhiteSameNameCB> op) {
        assertObjectNotNull("whiteSameNameList", whiteSameNameList);
        prepareBatchInsertOption(whiteSameNameList, op);
        return delegateBatchInsert(whiteSameNameList, op);
    }

    protected void prepareBatchInsertOption(List<NextschemaWhiteSameName> whiteSameNameList, InsertOption<NextschemaWhiteSameNameCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSameNameList);
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
     *     NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     *     whiteSameName.setFooName("foo");
     *     if (...) {
     *         whiteSameName.setFooPrice(123);
     *     } else {
     *         whiteSameName.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSameName.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSameNameList.add(whiteSameName);
     * }
     * whiteSameNameBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameList);
     * </pre>
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextschemaWhiteSameName> whiteSameNameList) {
        UpdateOption<NextschemaWhiteSameNameCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSameNameList, op);
    }

    protected int[] doBatchUpdate(List<NextschemaWhiteSameName> whiteSameNameList, UpdateOption<NextschemaWhiteSameNameCB> op) {
        assertObjectNotNull("whiteSameNameList", whiteSameNameList);
        prepareBatchUpdateOption(whiteSameNameList, op);
        return delegateBatchUpdate(whiteSameNameList, op);
    }

    protected void prepareBatchUpdateOption(List<NextschemaWhiteSameName> whiteSameNameList, UpdateOption<NextschemaWhiteSameNameCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSameNameList);
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
     * whiteSameNameBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameList, new SpecifyQuery<NextschemaWhiteSameNameCB>() {
     *     public void specify(NextschemaWhiteSameNameCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSameNameBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameList, new SpecifyQuery<NextschemaWhiteSameNameCB>() {
     *     public void specify(NextschemaWhiteSameNameCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextschemaWhiteSameName> whiteSameNameList, SpecifyQuery<NextschemaWhiteSameNameCB> updateColumnSpec) {
        return doBatchUpdate(whiteSameNameList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<NextschemaWhiteSameName> whiteSameNameList) {
        return doBatchDelete(whiteSameNameList, null);
    }

    protected int[] doBatchDelete(List<NextschemaWhiteSameName> whiteSameNameList, DeleteOption<NextschemaWhiteSameNameCB> op) {
        assertObjectNotNull("whiteSameNameList", whiteSameNameList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSameNameList, op);
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
     * whiteSameNameBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;NextschemaWhiteSameName, NextschemaWhiteSameNameCB&gt;() {
     *     public ConditionBean setup(whiteSameName entity, NextschemaWhiteSameNameCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<NextschemaWhiteSameName, NextschemaWhiteSameNameCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<NextschemaWhiteSameName, NextschemaWhiteSameNameCB> sp, InsertOption<NextschemaWhiteSameNameCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        NextschemaWhiteSameName e = new NextschemaWhiteSameName();
        NextschemaWhiteSameNameCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected NextschemaWhiteSameNameCB createCBForQueryInsert() {
        NextschemaWhiteSameNameCB cb = newMyConditionBean();
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
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameName.setPK...(value);</span>
     * whiteSameName.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameName.setVersionNo(value);</span>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * whiteSameNameBhv.<span style="color: #FD4747">queryUpdate</span>(whiteSameName, cb);
     * </pre>
     * @param whiteSameName The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextschemaWhiteSameName whiteSameName, NextschemaWhiteSameNameCB cb) {
        return doQueryUpdate(whiteSameName, cb, null);
    }

    protected int doQueryUpdate(NextschemaWhiteSameName whiteSameName, NextschemaWhiteSameNameCB cb, UpdateOption<NextschemaWhiteSameNameCB> op) {
        assertObjectNotNull("whiteSameName", whiteSameName); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSameName, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (NextschemaWhiteSameNameCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (NextschemaWhiteSameNameCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * whiteSameNameBhv.<span style="color: #FD4747">queryDelete</span>(whiteSameName, cb);
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(NextschemaWhiteSameNameCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(NextschemaWhiteSameNameCB cb, DeleteOption<NextschemaWhiteSameNameCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((NextschemaWhiteSameNameCB)cb); }
        else { return varyingQueryDelete((NextschemaWhiteSameNameCB)cb, downcast(op)); }
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
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameName.setFoo...(value);
     * whiteSameName.setBar...(value);
     * InsertOption<NextschemaWhiteSameNameCB> option = new InsertOption<NextschemaWhiteSameNameCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSameNameBhv.<span style="color: #FD4747">varyingInsert</span>(whiteSameName, option);
     * ... = whiteSameName.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSameName The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(NextschemaWhiteSameName whiteSameName, InsertOption<NextschemaWhiteSameNameCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSameName, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameName.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameName.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;NextschemaWhiteSameNameCB&gt; option = new UpdateOption&lt;NextschemaWhiteSameNameCB&gt;();
     *     option.self(new SpecifyQuery&lt;NextschemaWhiteSameNameCB&gt;() {
     *         public void specify(NextschemaWhiteSameNameCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSameNameBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteSameName, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(NextschemaWhiteSameName whiteSameName, UpdateOption<NextschemaWhiteSameNameCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSameName, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSameName The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(NextschemaWhiteSameName whiteSameName, InsertOption<NextschemaWhiteSameNameCB> insertOption, UpdateOption<NextschemaWhiteSameNameCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSameName, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSameName The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(NextschemaWhiteSameName whiteSameName, DeleteOption<NextschemaWhiteSameNameCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSameName, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<NextschemaWhiteSameName> whiteSameNameList, InsertOption<NextschemaWhiteSameNameCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSameNameList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<NextschemaWhiteSameName> whiteSameNameList, UpdateOption<NextschemaWhiteSameNameCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSameNameList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<NextschemaWhiteSameName> whiteSameNameList, DeleteOption<NextschemaWhiteSameNameCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSameNameList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<NextschemaWhiteSameName, NextschemaWhiteSameNameCB> setupper, InsertOption<NextschemaWhiteSameNameCB> option) {
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
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameName.setPK...(value);</span>
     * whiteSameName.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameName.setVersionNo(value);</span>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;NextschemaWhiteSameNameCB&gt; option = new UpdateOption&lt;NextschemaWhiteSameNameCB&gt;();
     * option.self(new SpecifyQuery&lt;NextschemaWhiteSameNameCB&gt;() {
     *     public void specify(NextschemaWhiteSameNameCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSameNameBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteSameName, cb, option);
     * </pre>
     * @param whiteSameName The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextschemaWhiteSameName whiteSameName, NextschemaWhiteSameNameCB cb, UpdateOption<NextschemaWhiteSameNameCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSameName, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(NextschemaWhiteSameNameCB cb, DeleteOption<NextschemaWhiteSameNameCB> option) {
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
    public OutsideSqlBasicExecutor<NextschemaWhiteSameNameBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(NextschemaWhiteSameNameCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(NextschemaWhiteSameNameCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends NextschemaWhiteSameName> void delegateSelectCursor(NextschemaWhiteSameNameCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends NextschemaWhiteSameName> List<ENTITY> delegateSelectList(NextschemaWhiteSameNameCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(NextschemaWhiteSameName et, InsertOption<NextschemaWhiteSameNameCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(NextschemaWhiteSameName et, UpdateOption<NextschemaWhiteSameNameCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(NextschemaWhiteSameName et, UpdateOption<NextschemaWhiteSameNameCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(NextschemaWhiteSameName et, DeleteOption<NextschemaWhiteSameNameCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(NextschemaWhiteSameName et, DeleteOption<NextschemaWhiteSameNameCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<NextschemaWhiteSameName> ls, InsertOption<NextschemaWhiteSameNameCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<NextschemaWhiteSameName> ls, UpdateOption<NextschemaWhiteSameNameCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<NextschemaWhiteSameName> ls, UpdateOption<NextschemaWhiteSameNameCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<NextschemaWhiteSameName> ls, DeleteOption<NextschemaWhiteSameNameCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<NextschemaWhiteSameName> ls, DeleteOption<NextschemaWhiteSameNameCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(NextschemaWhiteSameName et, NextschemaWhiteSameNameCB inCB, ConditionBean resCB, InsertOption<NextschemaWhiteSameNameCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(NextschemaWhiteSameName et, NextschemaWhiteSameNameCB cb, UpdateOption<NextschemaWhiteSameNameCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(NextschemaWhiteSameNameCB cb, DeleteOption<NextschemaWhiteSameNameCB> op)
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
    protected NextschemaWhiteSameName downcast(Entity et) {
        return helpEntityDowncastInternally(et, NextschemaWhiteSameName.class);
    }

    protected NextschemaWhiteSameNameCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, NextschemaWhiteSameNameCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<NextschemaWhiteSameName> downcast(List<? extends Entity> ls) {
        return (List<NextschemaWhiteSameName>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<NextschemaWhiteSameNameCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<NextschemaWhiteSameNameCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<NextschemaWhiteSameNameCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<NextschemaWhiteSameNameCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<NextschemaWhiteSameNameCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<NextschemaWhiteSameNameCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<NextschemaWhiteSameName, NextschemaWhiteSameNameCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<NextschemaWhiteSameName, NextschemaWhiteSameNameCB>)sp;
    }
}
