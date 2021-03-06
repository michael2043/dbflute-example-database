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
package com.example.dbflute.mysql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The DB meta of vendor_constraint_name_auto_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorConstraintNameAutoRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorConstraintNameAutoRefDbm _instance = new VendorConstraintNameAutoRefDbm();
    private VendorConstraintNameAutoRefDbm() {}
    public static VendorConstraintNameAutoRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgConstraintNameAutoRefId(), "constraintNameAutoRefId");
        setupEpg(_epgMap, new EpgConstraintNameAutoFooId(), "constraintNameAutoFooId");
        setupEpg(_epgMap, new EpgConstraintNameAutoBarId(), "constraintNameAutoBarId");
        setupEpg(_epgMap, new EpgConstraintNameAutoQuxId(), "constraintNameAutoQuxId");
        setupEpg(_epgMap, new EpgConstraintNameAutoCorgeId(), "constraintNameAutoCorgeId");
        setupEpg(_epgMap, new EpgConstraintNameAutoUnique(), "constraintNameAutoUnique");
    }
    public static class EpgConstraintNameAutoRefId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoRef)et).getConstraintNameAutoRefId(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoRef)et).setConstraintNameAutoRefId(ctl(vl)); }
    }
    public static class EpgConstraintNameAutoFooId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoRef)et).getConstraintNameAutoFooId(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoRef)et).setConstraintNameAutoFooId(ctl(vl)); }
    }
    public static class EpgConstraintNameAutoBarId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoRef)et).getConstraintNameAutoBarId(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoRef)et).setConstraintNameAutoBarId(ctl(vl)); }
    }
    public static class EpgConstraintNameAutoQuxId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoRef)et).getConstraintNameAutoQuxId(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoRef)et).setConstraintNameAutoQuxId(ctl(vl)); }
    }
    public static class EpgConstraintNameAutoCorgeId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoRef)et).getConstraintNameAutoCorgeId(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoRef)et).setConstraintNameAutoCorgeId(ctl(vl)); }
    }
    public static class EpgConstraintNameAutoUnique implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoRef)et).getConstraintNameAutoUnique(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoRef)et).setConstraintNameAutoUnique((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgVendorConstraintNameAutoFoo(), "vendorConstraintNameAutoFoo");
        setupEfpg(_efpgMap, new EfpgVendorConstraintNameAutoBar(), "vendorConstraintNameAutoBar");
        setupEfpg(_efpgMap, new EfpgVendorConstraintNameAutoQux(), "vendorConstraintNameAutoQux");
    }
    public class EfpgVendorConstraintNameAutoFoo implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoRef)et).getVendorConstraintNameAutoFoo(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoRef)et).setVendorConstraintNameAutoFoo((VendorConstraintNameAutoFoo)vl); }
    }
    public class EfpgVendorConstraintNameAutoBar implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoRef)et).getVendorConstraintNameAutoBar(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoRef)et).setVendorConstraintNameAutoBar((VendorConstraintNameAutoBar)vl); }
    }
    public class EfpgVendorConstraintNameAutoQux implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoRef)et).getVendorConstraintNameAutoQux(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoRef)et).setVendorConstraintNameAutoQux((VendorConstraintNameAutoQux)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_constraint_name_auto_ref";
    protected final String _tablePropertyName = "vendorConstraintNameAutoRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CONSTRAINT_NAME_AUTO_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnConstraintNameAutoRefId = cci("CONSTRAINT_NAME_AUTO_REF_ID", "CONSTRAINT_NAME_AUTO_REF_ID", null, null, Long.class, "constraintNameAutoRefId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnConstraintNameAutoFooId = cci("CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", null, null, Long.class, "constraintNameAutoFooId", null, false, false, true, "DECIMAL", 16, 0, null, false, null, null, "vendorConstraintNameAutoFoo", null, null);
    protected final ColumnInfo _columnConstraintNameAutoBarId = cci("CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", null, null, Long.class, "constraintNameAutoBarId", null, false, false, true, "DECIMAL", 16, 0, null, false, null, null, "vendorConstraintNameAutoBar", null, null);
    protected final ColumnInfo _columnConstraintNameAutoQuxId = cci("CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", null, null, Long.class, "constraintNameAutoQuxId", null, false, false, true, "DECIMAL", 16, 0, null, false, null, null, "vendorConstraintNameAutoQux", null, null);
    protected final ColumnInfo _columnConstraintNameAutoCorgeId = cci("CONSTRAINT_NAME_AUTO_CORGE_ID", "CONSTRAINT_NAME_AUTO_CORGE_ID", null, null, Long.class, "constraintNameAutoCorgeId", null, false, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnConstraintNameAutoUnique = cci("CONSTRAINT_NAME_AUTO_UNIQUE", "CONSTRAINT_NAME_AUTO_UNIQUE", null, null, String.class, "constraintNameAutoUnique", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    /**
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoRefId() { return _columnConstraintNameAutoRefId; }
    /**
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoFooId() { return _columnConstraintNameAutoFooId; }
    /**
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoBarId() { return _columnConstraintNameAutoBarId; }
    /**
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoQuxId() { return _columnConstraintNameAutoQuxId; }
    /**
     * CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoCorgeId() { return _columnConstraintNameAutoCorgeId; }
    /**
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoUnique() { return _columnConstraintNameAutoUnique; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnConstraintNameAutoRefId());
        ls.add(columnConstraintNameAutoFooId());
        ls.add(columnConstraintNameAutoBarId());
        ls.add(columnConstraintNameAutoQuxId());
        ls.add(columnConstraintNameAutoCorgeId());
        ls.add(columnConstraintNameAutoUnique());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnConstraintNameAutoRefId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorConstraintNameAutoFoo() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnConstraintNameAutoFooId(), VendorConstraintNameAutoFooDbm.getInstance().columnConstraintNameAutoFooId());
        return cfi("vendor_constraint_name_auto_ref_ibfk_1", "vendorConstraintNameAutoFoo", this, VendorConstraintNameAutoFooDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "vendorConstraintNameAutoRefList");
    }
    /**
     * vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorConstraintNameAutoBar() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnConstraintNameAutoBarId(), VendorConstraintNameAutoBarDbm.getInstance().columnConstraintNameAutoBarId());
        return cfi("vendor_constraint_name_auto_ref_ibfk_2", "vendorConstraintNameAutoBar", this, VendorConstraintNameAutoBarDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "vendorConstraintNameAutoRefList");
    }
    /**
     * vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorConstraintNameAutoQux() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnConstraintNameAutoQuxId(), VendorConstraintNameAutoQuxDbm.getInstance().columnConstraintNameAutoQuxId());
        return cfi("vendor_constraint_name_auto_ref_ibfk_3", "vendorConstraintNameAutoQux", this, VendorConstraintNameAutoQuxDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "vendorConstraintNameAutoRefList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.VendorConstraintNameAutoRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.VendorConstraintNameAutoRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.VendorConstraintNameAutoRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorConstraintNameAutoRef> getEntityType() { return VendorConstraintNameAutoRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorConstraintNameAutoRef newEntity() { return new VendorConstraintNameAutoRef(); }
    public VendorConstraintNameAutoRef newMyEntity() { return new VendorConstraintNameAutoRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorConstraintNameAutoRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorConstraintNameAutoRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
