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
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The DB meta of white_compound_pk. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkDbm _instance = new WhiteCompoundPkDbm();
    private WhiteCompoundPkDbm() {}
    public static WhiteCompoundPkDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgPkFirstId(), "pkFirstId");
        setupEpg(_epgMap, new EpgPkSecondId(), "pkSecondId");
        setupEpg(_epgMap, new EpgPkName(), "pkName");
        setupEpg(_epgMap, new EpgReferredId(), "referredId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgPkFirstId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPk)et).getPkFirstId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPk)et).setPkFirstId(cti(vl)); }
    }
    public static class EpgPkSecondId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPk)et).getPkSecondId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPk)et).setPkSecondId(cti(vl)); }
    }
    public static class EpgPkName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPk)et).getPkName(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPk)et).setPkName((String)vl); }
    }
    public static class EpgReferredId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundPk)et).getReferredId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundPk)et).setReferredId(cti(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_pk";
    protected final String _tablePropertyName = "whiteCompoundPk";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_COMPOUND_PK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPkFirstId = cci("PK_FIRST_ID", "PK_FIRST_ID", null, null, true, "pkFirstId", Integer.class, true, false, "INT", 10, 0, null, false, null, null, "whiteCompoundPkRefManyAsMax,whiteCompoundPkRefManyAsMin", "whiteCompoundPkRefList,whiteCompoundPkRefManyToPKList", null);
    protected final ColumnInfo _columnPkSecondId = cci("PK_SECOND_ID", "PK_SECOND_ID", null, null, true, "pkSecondId", Integer.class, true, false, "INT", 10, 0, null, false, null, null, "whiteCompoundReferredPrimary,whiteCompoundPkRefManyAsMax,whiteCompoundPkRefManyAsMin", "whiteCompoundPkRefList,whiteCompoundPkRefManyToPKList", null);
    protected final ColumnInfo _columnPkName = cci("PK_NAME", "PK_NAME", null, null, true, "pkName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnReferredId = cci("REFERRED_ID", "REFERRED_ID", null, null, true, "referredId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteCompoundReferredNormally", null, null);

    public ColumnInfo columnPkFirstId() { return _columnPkFirstId; }
    public ColumnInfo columnPkSecondId() { return _columnPkSecondId; }
    public ColumnInfo columnPkName() { return _columnPkName; }
    public ColumnInfo columnReferredId() { return _columnReferredId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPkFirstId());
        ls.add(columnPkSecondId());
        ls.add(columnPkName());
        ls.add(columnReferredId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPkFirstId());
        ls.add(columnPkSecondId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteCompoundReferredNormally() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReferredId(), WhiteCompoundReferredNormallyDbm.getInstance().columnReferredId());
        return cfi("FK_WHITE_COMPOUND_PK_REFERRED_NORMALLY_TEST", "whiteCompoundReferredNormally", this, WhiteCompoundReferredNormallyDbm.getInstance(), mp, 0, false, false, false, true, null, null, false, "whiteCompoundPkList");
    }
    public ForeignInfo foreignWhiteCompoundReferredPrimary() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPkSecondId(), WhiteCompoundReferredPrimaryDbm.getInstance().columnReferredId());
        return cfi("FK_WHITE_COMPOUND_PK_REFERRED_PRIMARY_TEST", "whiteCompoundReferredPrimary", this, WhiteCompoundReferredPrimaryDbm.getInstance(), mp, 1, false, false, false, true, null, null, false, "whiteCompoundPkList");
    }
    public ForeignInfo foreignWhiteCompoundPkRefManyAsMax() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnPkFirstId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManyFirstId());
        mp.put(columnPkSecondId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManySecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF_MANY_DERIVED_ONE_MAX_TEST", "whiteCompoundPkRefManyAsMax", this, WhiteCompoundPkRefManyDbm.getInstance(), mp, 2, true, true, false, true, "$$foreignAlias$$.REF_MANY_DATETIME = ($$sqbegin$$\nselect max(many.REF_MANY_DATETIME)\n  from WHITE_COMPOUND_PK_REF_MANY many\n where many.REF_MANY_FIRST_ID = $$foreignAlias$$.REF_MANY_FIRST_ID\n   and many.REF_MANY_SECOND_ID = $$foreignAlias$$.REF_MANY_SECOND_ID\n   and many.REF_MANY_CODE = 'TPK'\n)$$sqend$$", null, false, null);
    }
    public ForeignInfo foreignWhiteCompoundPkRefManyAsMin() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnPkFirstId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManyFirstId());
        mp.put(columnPkSecondId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManySecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF_MANY_DERIVED_ONE_MIN_TEST", "whiteCompoundPkRefManyAsMin", this, WhiteCompoundPkRefManyDbm.getInstance(), mp, 3, true, true, false, true, "$$foreignAlias$$.REF_MANY_DATETIME = ($$sqbegin$$\nselect min(many.REF_MANY_DATETIME)\n  from WHITE_COMPOUND_PK_REF_MANY many\n where many.REF_MANY_FIRST_ID = $$foreignAlias$$.REF_MANY_FIRST_ID\n   and many.REF_MANY_SECOND_ID = $$foreignAlias$$.REF_MANY_SECOND_ID\n   and many.REF_MANY_CODE = 'TPK'\n)$$sqend$$", null, false, null);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerWhiteCompoundPkRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnPkFirstId(), WhiteCompoundPkRefDbm.getInstance().columnRefFirstId());
        mp.put(columnPkSecondId(), WhiteCompoundPkRefDbm.getInstance().columnRefSecondId());
        return cri("FK_WHITE_COMPOUND_PK_REF", "whiteCompoundPkRefList", this, WhiteCompoundPkRefDbm.getInstance(), mp, false, "whiteCompoundPk");
    }
    public ReferrerInfo referrerWhiteCompoundPkRefManyToPKList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnPkFirstId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManyFirstId());
        mp.put(columnPkSecondId(), WhiteCompoundPkRefManyDbm.getInstance().columnRefManySecondId());
        return cri("FK_WHITE_COMPOUND_PK_REF_MANY_TO_ONE_TEST", "whiteCompoundPkRefManyToPKList", this, WhiteCompoundPkRefManyDbm.getInstance(), mp, false, "whiteCompoundPkToPK");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteCompoundPk"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteCompoundPkCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteCompoundPkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPk> getEntityType() { return WhiteCompoundPk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteCompoundPk newMyEntity() { return new WhiteCompoundPk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundPk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundPk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
