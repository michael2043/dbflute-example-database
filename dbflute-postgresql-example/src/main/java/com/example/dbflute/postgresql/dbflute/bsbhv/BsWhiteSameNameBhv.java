package com.example.dbflute.postgresql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.bsbhv.loader.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The behavior of white_same_name as TABLE. <br />
 * <pre>
 * [primary key]
 *     same_name_id
 *
 * [column]
 *     same_name_id, same_name_name, same_name_integer, next_schema_product_id
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
 *     NEXT_SCHEMA_PRODUCT
 *
 * [referrer table]
 *     white_same_name_ref
 *
 * [foreign property]
 *     nextSchemaProduct
 *
 * [referrer property]
 *     whiteSameNameRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSameNameBhv extends AbstractBehaviorWritable<WhiteSameName, WhiteSameNameCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteSameNameDbm getDBMeta() { return WhiteSameNameDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSameNameDbm getMyDBMeta() { return WhiteSameNameDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteSameNameCB newConditionBean() { return new WhiteSameNameCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSameName newMyEntity() { return new WhiteSameName(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSameNameCB newMyConditionBean() { return new WhiteSameNameCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * int count = whiteSameNameBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSameNameCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * WhiteSameName whiteSameName = whiteSameNameBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSameName != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSameName.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameName selectEntity(WhiteSameNameCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteSameName facadeSelectEntity(WhiteSameNameCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSameName> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSameNameCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * WhiteSameName whiteSameName = whiteSameNameBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSameName.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameName selectEntityWithDeletedCheck(WhiteSameNameCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param sameNameId : PK, NotNull, int8(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameName selectByPKValue(Long sameNameId) {
        return facadeSelectByPKValue(sameNameId);
    }

    protected WhiteSameName facadeSelectByPKValue(Long sameNameId) {
        return doSelectByPK(sameNameId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSameName> ENTITY doSelectByPK(Long sameNameId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(sameNameId), tp);
    }

    protected <ENTITY extends WhiteSameName> OptionalEntity<ENTITY> doSelectOptionalByPK(Long sameNameId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(sameNameId, tp), sameNameId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param sameNameId : PK, NotNull, int8(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameName selectByPKValueWithDeletedCheck(Long sameNameId) {
        return doSelectByPKWithDeletedCheck(sameNameId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSameName> ENTITY doSelectByPKWithDeletedCheck(Long sameNameId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(sameNameId), tp);
    }

    protected WhiteSameNameCB xprepareCBAsPK(Long sameNameId) {
        assertObjectNotNull("sameNameId", sameNameId);
        return newConditionBean().acceptPK(sameNameId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSameName&gt; whiteSameNameList = whiteSameNameBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSameName whiteSameName : whiteSameNameList) {
     *     ... = whiteSameName.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSameName> selectList(WhiteSameNameCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSameName&gt; page = whiteSameNameBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSameName whiteSameName : page) {
     *     ... = whiteSameName.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSameName> selectPage(WhiteSameNameCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * whiteSameNameBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSameName&gt;() {
     *     public void handle(WhiteSameName entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSameName. (NotNull)
     */
    public void selectCursor(WhiteSameNameCB cb, EntityRowHandler<WhiteSameName> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSameNameBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSameNameCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteSameNameCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
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
     * Load referrer by the the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteSameNameList The entity list of whiteSameName. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteSameName> whiteSameNameList, ReferrerLoaderHandler<LoaderOfWhiteSameName> handler) {
        xassLRArg(whiteSameNameList, handler);
        handler.handle(new LoaderOfWhiteSameName().ready(whiteSameNameList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteSameName The entity of whiteSameName. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteSameName whiteSameName, ReferrerLoaderHandler<LoaderOfWhiteSameName> handler) {
        xassLRArg(whiteSameName, handler);
        handler.handle(new LoaderOfWhiteSameName().ready(xnewLRAryLs(whiteSameName), _behaviorSelector));
    }

    /**
     * Load referrer of whiteSameNameRefList by the set-upper of referrer. <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * <pre>
     * whiteSameNameBhv.<span style="color: #DD4747">loadWhiteSameNameRefList</span>(whiteSameNameList, new ConditionBeanSetupper&lt;WhiteSameNameRefCB&gt;() {
     *     public void setup(WhiteSameNameRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteSameName whiteSameName : whiteSameNameList) {
     *     ... = whiteSameName.<span style="color: #DD4747">getWhiteSameNameRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSameNameId_InScope(pkList);
     * cb.query().addOrderBy_SameNameId_Asc();
     * </pre>
     * @param whiteSameNameList The entity list of whiteSameName. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSameNameRef> loadWhiteSameNameRefList(List<WhiteSameName> whiteSameNameList, ConditionBeanSetupper<WhiteSameNameRefCB> setupper) {
        xassLRArg(whiteSameNameList, setupper);
        return doLoadWhiteSameNameRefList(whiteSameNameList, new LoadReferrerOption<WhiteSameNameRefCB, WhiteSameNameRef>().xinit(setupper));
    }

    /**
     * Load referrer of whiteSameNameRefList by the set-upper of referrer. <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * <pre>
     * whiteSameNameBhv.<span style="color: #DD4747">loadWhiteSameNameRefList</span>(whiteSameNameList, new ConditionBeanSetupper&lt;WhiteSameNameRefCB&gt;() {
     *     public void setup(WhiteSameNameRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteSameName.<span style="color: #DD4747">getWhiteSameNameRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSameNameId_InScope(pkList);
     * cb.query().addOrderBy_SameNameId_Asc();
     * </pre>
     * @param whiteSameName The entity of whiteSameName. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSameNameRef> loadWhiteSameNameRefList(WhiteSameName whiteSameName, ConditionBeanSetupper<WhiteSameNameRefCB> setupper) {
        xassLRArg(whiteSameName, setupper);
        return doLoadWhiteSameNameRefList(xnewLRLs(whiteSameName), new LoadReferrerOption<WhiteSameNameRefCB, WhiteSameNameRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSameName The entity of whiteSameName. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSameNameRef> loadWhiteSameNameRefList(WhiteSameName whiteSameName, LoadReferrerOption<WhiteSameNameRefCB, WhiteSameNameRef> loadReferrerOption) {
        xassLRArg(whiteSameName, loadReferrerOption);
        return loadWhiteSameNameRefList(xnewLRLs(whiteSameName), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteSameNameList The entity list of whiteSameName. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteSameNameRef> loadWhiteSameNameRefList(List<WhiteSameName> whiteSameNameList, LoadReferrerOption<WhiteSameNameRefCB, WhiteSameNameRef> loadReferrerOption) {
        xassLRArg(whiteSameNameList, loadReferrerOption);
        if (whiteSameNameList.isEmpty()) { return (NestedReferrerListGateway<WhiteSameNameRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteSameNameRefList(whiteSameNameList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteSameNameRef> doLoadWhiteSameNameRefList(List<WhiteSameName> whiteSameNameList, LoadReferrerOption<WhiteSameNameRefCB, WhiteSameNameRef> option) {
        return helpLoadReferrerInternally(whiteSameNameList, option, "whiteSameNameRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'NextSchemaProduct'.
     * @param whiteSameNameList The list of whiteSameName. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<NextSchemaProduct> pulloutNextSchemaProduct(List<WhiteSameName> whiteSameNameList)
    { return helpPulloutInternally(whiteSameNameList, "nextSchemaProduct"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key sameNameId.
     * @param whiteSameNameList The list of whiteSameName. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSameNameIdList(List<WhiteSameName> whiteSameNameList)
    { return helpExtractListInternally(whiteSameNameList, "sameNameId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSameName whiteSameName = new WhiteSameName();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameName.setFoo...(value);
     * whiteSameName.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * whiteSameNameBhv.<span style="color: #DD4747">insert</span>(whiteSameName);
     * ... = whiteSameName.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSameName The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSameName whiteSameName) {
        doInsert(whiteSameName, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSameName whiteSameName = new WhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameName.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSameName.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameBhv.<span style="color: #DD4747">update</span>(whiteSameName);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteSameName whiteSameName) {
        doUpdate(whiteSameName, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSameName The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSameName whiteSameName) {
        doInsertOrUpdate(whiteSameName, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSameName whiteSameName = new WhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSameName.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameBhv.<span style="color: #DD4747">delete</span>(whiteSameName);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSameName whiteSameName) {
        doDelete(whiteSameName, null);
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
     *     WhiteSameName whiteSameName = new WhiteSameName();
     *     whiteSameName.setFooName("foo");
     *     if (...) {
     *         whiteSameName.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSameNameList.add(whiteSameName);
     * }
     * whiteSameNameBhv.<span style="color: #DD4747">batchInsert</span>(whiteSameNameList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSameName> whiteSameNameList) {
        return doBatchInsert(whiteSameNameList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSameName whiteSameName = new WhiteSameName();
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
     * whiteSameNameBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSameNameList);
     * </pre>
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSameName> whiteSameNameList) {
        return doBatchUpdate(whiteSameNameList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteSameNameBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSameNameList, new SpecifyQuery<WhiteSameNameCB>() {
     *     public void specify(WhiteSameNameCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSameNameBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSameNameList, new SpecifyQuery<WhiteSameNameCB>() {
     *     public void specify(WhiteSameNameCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSameName> whiteSameNameList, SpecifyQuery<WhiteSameNameCB> updateColumnSpec) {
        return doBatchUpdate(whiteSameNameList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSameName> whiteSameNameList) {
        return doBatchDelete(whiteSameNameList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteSameNameBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSameName, WhiteSameNameCB&gt;() {
     *     public ConditionBean setup(WhiteSameName entity, WhiteSameNameCB intoCB) {
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
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The set-upper of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WhiteSameName, WhiteSameNameCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSameName whiteSameName = new WhiteSameName();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameName.setPK...(value);</span>
     * whiteSameName.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameName.setVersionNo(value);</span>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * whiteSameNameBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSameName, cb);
     * </pre>
     * @param whiteSameName The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSameName whiteSameName, WhiteSameNameCB cb) {
        return doQueryUpdate(whiteSameName, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * whiteSameNameBhv.<span style="color: #DD4747">queryDelete</span>(whiteSameName, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSameNameCB cb) {
        return doQueryDelete(cb, null);
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
     * WhiteSameName whiteSameName = new WhiteSameName();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameName.setFoo...(value);
     * whiteSameName.setBar...(value);
     * InsertOption<WhiteSameNameCB> option = new InsertOption<WhiteSameNameCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSameNameBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSameName, option);
     * ... = whiteSameName.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSameName The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSameName whiteSameName, InsertOption<WhiteSameNameCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSameName, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSameName whiteSameName = new WhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameName.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSameName.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSameNameCB&gt; option = new UpdateOption&lt;WhiteSameNameCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSameNameCB&gt;() {
     *         public void specify(WhiteSameNameCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSameNameBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSameName, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSameName whiteSameName, UpdateOption<WhiteSameNameCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSameName, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSameName The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSameName whiteSameName, InsertOption<WhiteSameNameCB> insertOption, UpdateOption<WhiteSameNameCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteSameName, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSameName The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSameName whiteSameName, DeleteOption<WhiteSameNameCB> option) {
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
    public int[] varyingBatchInsert(List<WhiteSameName> whiteSameNameList, InsertOption<WhiteSameNameCB> option) {
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
    public int[] varyingBatchUpdate(List<WhiteSameName> whiteSameNameList, UpdateOption<WhiteSameNameCB> option) {
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
    public int[] varyingBatchDelete(List<WhiteSameName> whiteSameNameList, DeleteOption<WhiteSameNameCB> option) {
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
     * @param setupper The set-upper of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSameName, WhiteSameNameCB> setupper, InsertOption<WhiteSameNameCB> option) {
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
     * WhiteSameName whiteSameName = new WhiteSameName();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameName.setPK...(value);</span>
     * whiteSameName.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameName.setVersionNo(value);</span>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSameNameCB&gt; option = new UpdateOption&lt;WhiteSameNameCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSameNameCB&gt;() {
     *     public void specify(WhiteSameNameCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSameNameBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSameName, cb, option);
     * </pre>
     * @param whiteSameName The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSameName whiteSameName, WhiteSameNameCB cb, UpdateOption<WhiteSameNameCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSameName, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSameNameCB cb, DeleteOption<WhiteSameNameCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSameNameBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteSameNameBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends WhiteSameName> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.postgresql.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends WhiteSameName> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.postgresql.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteSameName> typeOfSelectedEntity() { return WhiteSameName.class; }
    protected Class<WhiteSameName> typeOfHandlingEntity() { return WhiteSameName.class; }
    protected Class<WhiteSameNameCB> typeOfHandlingConditionBean() { return WhiteSameNameCB.class; }
}
