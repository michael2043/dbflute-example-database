package com.example.dbflute.oracle.dbflute.cbean.cq;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import com.example.dbflute.oracle.dbflute.cbean.cq.bs.BsWhiteUqFkRefCQ;

/**
 * The condition-query of WHITE_UQ_FK_REF.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author oracleman
 */
public class WhiteUqFkRefCQ extends BsWhiteUqFkRefCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
	// You should NOT touch with this constructor.
    /**
     * Constructor.
     * @param referrerQuery The instance of referrer query. (NullAllowed: If null, this is base query)
     * @param sqlClause The instance of SQL clause. (NotNull)
     * @param aliasName The alias name for this query. (NotNull)
     * @param nestLevel The nest level of this query. (If zero, this is base query)
     */
    public WhiteUqFkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                       Arrange Query
    //                                                                       =============
    // You can make your arranged query methods here.
    //public void arrangeXxx() {
    //    ...
    //}
}
