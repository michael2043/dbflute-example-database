package com.example.dbflute.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (退会理由)withdrawal_reason as TABLE. <br />
 * <pre>
 * [primary key]
 *     withdrawal_reason_code
 *
 * [column]
 *     withdrawal_reason_code, withdrawal_reason_text, display_order
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
 *     member_withdrawal
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWithdrawalReason {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WithdrawalReason> _selectedList;
    protected BehaviorSelector _selector;
    protected WithdrawalReasonBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWithdrawalReason ready(List<WithdrawalReason> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WithdrawalReasonBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WithdrawalReasonBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MemberWithdrawal> _referrerMemberWithdrawalList;
    public NestedReferrerLoaderGateway<LoaderOfMemberWithdrawal> loadMemberWithdrawalList(ConditionBeanSetupper<MemberWithdrawalCB> setupper) {
        myBhv().loadMemberWithdrawalList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MemberWithdrawal>() {
            public void handle(List<MemberWithdrawal> referrerList) { _referrerMemberWithdrawalList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfMemberWithdrawal>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfMemberWithdrawal> handler) {
                handler.handle(new LoaderOfMemberWithdrawal().ready(_referrerMemberWithdrawalList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WithdrawalReason> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
