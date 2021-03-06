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
package com.example.dbflute.mysql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.customize.*;

/**
 * The DB meta of UnpaidSummaryMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UnpaidSummaryMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UnpaidSummaryMemberDbm _instance = new UnpaidSummaryMemberDbm();
    private UnpaidSummaryMemberDbm() {}
    public static UnpaidSummaryMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgUnpaidManId(), "unpaidManId");
        setupEpg(_epgMap, new EpgUnpaidManName(), "unpaidManName");
        setupEpg(_epgMap, new EpgUnpaidPriceSummary(), "unpaidPriceSummary");
        setupEpg(_epgMap, new EpgStatusName(), "statusName");
    }
    public static class EpgUnpaidManId implements PropertyGateway {
        public Object read(Entity et) { return ((UnpaidSummaryMember)et).getUnpaidManId(); }
        public void write(Entity et, Object vl) { ((UnpaidSummaryMember)et).setUnpaidManId(cti(vl)); }
    }
    public static class EpgUnpaidManName implements PropertyGateway {
        public Object read(Entity et) { return ((UnpaidSummaryMember)et).getUnpaidManName(); }
        public void write(Entity et, Object vl) { ((UnpaidSummaryMember)et).setUnpaidManName((String)vl); }
    }
    public static class EpgUnpaidPriceSummary implements PropertyGateway {
        public Object read(Entity et) { return ((UnpaidSummaryMember)et).getUnpaidPriceSummary(); }
        public void write(Entity et, Object vl) { ((UnpaidSummaryMember)et).setUnpaidPriceSummary(ctb(vl)); }
    }
    public static class EpgStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((UnpaidSummaryMember)et).getStatusName(); }
        public void write(Entity et, Object vl) { ((UnpaidSummaryMember)et).setStatusName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "UnpaidSummaryMember";
    protected final String _tablePropertyName = "unpaidSummaryMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("UnpaidSummaryMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUnpaidManId = cci("UNPAID_MAN_ID", "UNPAID_MAN_ID", null, "会員ID", Integer.class, "unpaidManId", null, true, false, false, "INT", 11, 0, null, false, null, "会員を識別するID。連番として基本的に自動採番される。\n（会員IDだけに限らず）採番方法はDBMSによって変わる。", null, null, null);
    protected final ColumnInfo _columnUnpaidManName = cci("UNPAID_MAN_NAME", "UNPAID_MAN_NAME", null, "会員名称", String.class, "unpaidManName", null, false, false, false, "VARCHAR", 180, 0, null, false, null, "会員のフルネームの名称。", null, null, null);
    protected final ColumnInfo _columnUnpaidPriceSummary = cci("UNPAID_PRICE_SUMMARY", "UNPAID_PRICE_SUMMARY", null, null, java.math.BigDecimal.class, "unpaidPriceSummary", null, false, false, false, "DECIMAL", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStatusName = cci("STATUS_NAME", "STATUS_NAME", null, "会員ステータス名称", String.class, "statusName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    /**
     * (会員ID)UNPAID_MAN_ID: {PK, INT(11), refers to member.MEMBER_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnpaidManId() { return _columnUnpaidManId; }
    /**
     * (会員名称)UNPAID_MAN_NAME: {VARCHAR(180), refers to member.MEMBER_NAME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnpaidManName() { return _columnUnpaidManName; }
    /**
     * UNPAID_PRICE_SUMMARY: {DECIMAL(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnpaidPriceSummary() { return _columnUnpaidPriceSummary; }
    /**
     * (会員ステータス名称)STATUS_NAME: {VARCHAR(50), refers to member_status.MEMBER_STATUS_NAME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatusName() { return _columnStatusName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUnpaidManId());
        ls.add(columnUnpaidManName());
        ls.add(columnUnpaidPriceSummary());
        ls.add(columnStatusName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUnpaidManId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.customize.UnpaidSummaryMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UnpaidSummaryMember> getEntityType() { return UnpaidSummaryMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UnpaidSummaryMember newEntity() { return new UnpaidSummaryMember(); }
    public UnpaidSummaryMember newMyEntity() { return new UnpaidSummaryMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UnpaidSummaryMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UnpaidSummaryMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
