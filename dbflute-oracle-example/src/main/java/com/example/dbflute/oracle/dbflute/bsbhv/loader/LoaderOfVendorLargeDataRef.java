package com.example.dbflute.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The referrer loader of VENDOR_LARGE_DATA_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     LARGE_DATA_REF_ID
 *
 * [column]
 *     LARGE_DATA_REF_ID, LARGE_DATA_ID, DATE_INDEX, DATE_NO_INDEX, TIMESTAMP_INDEX, TIMESTAMP_NO_INDEX, NULLABLE_DECIMAL_INDEX, NULLABLE_DECIMAL_NO_INDEX, SELF_PARENT_ID
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
 *     VENDOR_LARGE_DATA, VENDOR_LARGE_DATA_REF
 *
 * [referrer table]
 *     VENDOR_LARGE_DATA_REF
 *
 * [foreign property]
 *     vendorLargeData, vendorLargeDataRefSelf
 *
 * [referrer property]
 *     vendorLargeDataRefSelfList
 * </pre>
 * @author oracleman
 */
public class LoaderOfVendorLargeDataRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorLargeDataRef> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorLargeDataRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorLargeDataRef ready(List<VendorLargeDataRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorLargeDataRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorLargeDataRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorLargeDataRef> _referrerVendorLargeDataRefSelfList;
    public NestedReferrerLoaderGateway<LoaderOfVendorLargeDataRef> loadVendorLargeDataRefSelfList(ConditionBeanSetupper<VendorLargeDataRefCB> setupper) {
        myBhv().loadVendorLargeDataRefSelfList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<VendorLargeDataRef>() {
            public void handle(List<VendorLargeDataRef> referrerList) { _referrerVendorLargeDataRefSelfList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfVendorLargeDataRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfVendorLargeDataRef> handler) {
                handler.handle(new LoaderOfVendorLargeDataRef().ready(_referrerVendorLargeDataRefSelfList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfVendorLargeData _foreignVendorLargeDataLoader;
    public LoaderOfVendorLargeData pulloutVendorLargeData() {
        if (_foreignVendorLargeDataLoader != null) { return _foreignVendorLargeDataLoader; }
        List<VendorLargeData> pulledList = myBhv().pulloutVendorLargeData(_selectedList);
        _foreignVendorLargeDataLoader = new LoaderOfVendorLargeData().ready(pulledList, _selector);
        return _foreignVendorLargeDataLoader;
    }

    protected LoaderOfVendorLargeDataRef _foreignVendorLargeDataRefSelfLoader;
    public LoaderOfVendorLargeDataRef pulloutVendorLargeDataRefSelf() {
        if (_foreignVendorLargeDataRefSelfLoader != null) { return _foreignVendorLargeDataRefSelfLoader; }
        List<VendorLargeDataRef> pulledList = myBhv().pulloutVendorLargeDataRefSelf(_selectedList);
        _foreignVendorLargeDataRefSelfLoader = new LoaderOfVendorLargeDataRef().ready(pulledList, _selector);
        return _foreignVendorLargeDataRefSelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorLargeDataRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
