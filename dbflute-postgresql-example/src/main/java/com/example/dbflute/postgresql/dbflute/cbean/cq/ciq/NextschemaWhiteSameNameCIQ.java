package com.example.dbflute.postgresql.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.bs.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of nextschema.white_same_name.
 * @author DBFlute(AutoGenerator)
 */
public class NextschemaWhiteSameNameCIQ extends AbstractBsNextschemaWhiteSameNameCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsNextschemaWhiteSameNameCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public NextschemaWhiteSameNameCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsNextschemaWhiteSameNameCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueSameNameId() { return _myCQ.getSameNameId(); }
    public String keepSameNameId_ExistsReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSameNameId_InScopeRelation_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq)
    { return _myCQ.keepSameNameId_InScopeRelation_WhiteSameNameRefList(sq); }
    public String keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq)
    { return _myCQ.keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(sq); }
    public String keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueSameNameName() { return _myCQ.getSameNameName(); }
    protected ConditionValue getCValueSameNameLong() { return _myCQ.getSameNameLong(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(NextschemaWhiteSameNameCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(NextschemaWhiteSameNameCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(NextschemaWhiteSameNameCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(NextschemaWhiteSameNameCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(NextschemaWhiteSameNameCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return NextschemaWhiteSameNameCB.class.getName(); }
    protected String xinCQ() { return NextschemaWhiteSameNameCQ.class.getName(); }
}
