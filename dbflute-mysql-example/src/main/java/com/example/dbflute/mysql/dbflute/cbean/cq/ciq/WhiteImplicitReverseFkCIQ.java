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
package com.example.dbflute.mysql.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.bs.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of white_implicit_reverse_fk.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteImplicitReverseFkCIQ extends AbstractBsWhiteImplicitReverseFkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteImplicitReverseFkCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteImplicitReverseFkCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteImplicitReverseFkCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq) {
        String msg = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueWhiteImplicitReverseFkId() { return _myCQ.getWhiteImplicitReverseFkId(); }
    public String keepWhiteImplicitReverseFkId_ExistsReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepWhiteImplicitReverseFkId_NotExistsReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq)
    { return _myCQ.keepWhiteImplicitReverseFkId_InScopeRelation_WhiteImplicitReverseFkRefList(sq); }
    public String keepWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq)
    { return _myCQ.keepWhiteImplicitReverseFkId_NotInScopeRelation_WhiteImplicitReverseFkRefList(sq); }
    public String keepWhiteImplicitReverseFkId_SpecifyDerivedReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefList(WhiteImplicitReverseFkRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepWhiteImplicitReverseFkId_QueryDerivedReferrer_WhiteImplicitReverseFkRefListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueWhiteImplicitReverseFkName() { return _myCQ.getWhiteImplicitReverseFkName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteImplicitReverseFkCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteImplicitReverseFkCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteImplicitReverseFkCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteImplicitReverseFkCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(WhiteImplicitReverseFkCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteImplicitReverseFkCB.class.getName(); }
    protected String xinCQ() { return WhiteImplicitReverseFkCQ.class.getName(); }
}
