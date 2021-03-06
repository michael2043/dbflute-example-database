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
 * The DB meta of white_stiletto_alias_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteStilettoAliasRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteStilettoAliasRefDbm _instance = new WhiteStilettoAliasRefDbm();
    private WhiteStilettoAliasRefDbm() {}
    public static WhiteStilettoAliasRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgRefId(), "refId");
        setupEpg(_epgMap, new EpgFoo0(), "foo0");
        setupEpg(_epgMap, new EpgFoo1(), "foo1");
        setupEpg(_epgMap, new EpgFoo2(), "foo2");
        setupEpg(_epgMap, new EpgFoo3(), "foo3");
        setupEpg(_epgMap, new EpgFoo4(), "foo4");
        setupEpg(_epgMap, new EpgBar0(), "bar0");
        setupEpg(_epgMap, new EpgQux0(), "qux0");
        setupEpg(_epgMap, new EpgC21(), "c21");
        setupEpg(_epgMap, new EpgC22(), "c22");
        setupEpg(_epgMap, new EpgC23(), "c23");
        setupEpg(_epgMap, new EpgStilettoAliasId(), "stilettoAliasId");
    }
    public static class EpgRefId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getRefId(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setRefId(cti(vl)); }
    }
    public static class EpgFoo0 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getFoo0(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setFoo0((String)vl); }
    }
    public static class EpgFoo1 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getFoo1(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setFoo1((String)vl); }
    }
    public static class EpgFoo2 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getFoo2(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setFoo2((String)vl); }
    }
    public static class EpgFoo3 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getFoo3(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setFoo3((String)vl); }
    }
    public static class EpgFoo4 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getFoo4(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setFoo4((String)vl); }
    }
    public static class EpgBar0 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getBar0(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setBar0((String)vl); }
    }
    public static class EpgQux0 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getQux0(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setQux0((String)vl); }
    }
    public static class EpgC21 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getC21(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setC21((String)vl); }
    }
    public static class EpgC22 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getC22(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setC22((String)vl); }
    }
    public static class EpgC23 implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getC23(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setC23((String)vl); }
    }
    public static class EpgStilettoAliasId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getStilettoAliasId(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setStilettoAliasId(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteStilettoAlias(), "whiteStilettoAlias");
    }
    public class EfpgWhiteStilettoAlias implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteStilettoAliasRef)et).getWhiteStilettoAlias(); }
        public void write(Entity et, Object vl) { ((WhiteStilettoAliasRef)et).setWhiteStilettoAlias((WhiteStilettoAlias)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_stiletto_alias_ref";
    protected final String _tablePropertyName = "whiteStilettoAliasRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_STILETTO_ALIAS_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefId = cci("REF_ID", "REF_ID", null, null, Integer.class, "refId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFoo0 = cci("FOO0", "FOO0", null, null, String.class, "foo0", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFoo1 = cci("FOO_1", "FOO_1", null, null, String.class, "foo1", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFoo2 = cci("FOO2", "FOO2", null, null, String.class, "foo2", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFoo3 = cci("FOO3", "FOO3", null, null, String.class, "foo3", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFoo4 = cci("FOO_4", "FOO_4", null, null, String.class, "foo4", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBar0 = cci("BAR_0", "BAR_0", null, null, String.class, "bar0", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnQux0 = cci("QUX_0", "QUX_0", null, null, String.class, "qux0", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnC21 = cci("c21", "c21", null, null, String.class, "c21", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnC22 = cci("c22", "c22", null, null, String.class, "c22", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnC23 = cci("c23", "c23", null, null, String.class, "c23", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStilettoAliasId = cci("STILETTO_ALIAS_ID", "STILETTO_ALIAS_ID", null, null, Integer.class, "stilettoAliasId", null, false, false, false, "INT", 10, 0, null, false, null, null, "whiteStilettoAlias", null, null);

    /**
     * REF_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefId() { return _columnRefId; }
    /**
     * FOO0: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo0() { return _columnFoo0; }
    /**
     * FOO_1: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo1() { return _columnFoo1; }
    /**
     * FOO2: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo2() { return _columnFoo2; }
    /**
     * FOO3: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo3() { return _columnFoo3; }
    /**
     * FOO_4: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoo4() { return _columnFoo4; }
    /**
     * BAR_0: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBar0() { return _columnBar0; }
    /**
     * QUX_0: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQux0() { return _columnQux0; }
    /**
     * c21: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnC21() { return _columnC21; }
    /**
     * c22: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnC22() { return _columnC22; }
    /**
     * c23: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnC23() { return _columnC23; }
    /**
     * STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStilettoAliasId() { return _columnStilettoAliasId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefId());
        ls.add(columnFoo0());
        ls.add(columnFoo1());
        ls.add(columnFoo2());
        ls.add(columnFoo3());
        ls.add(columnFoo4());
        ls.add(columnBar0());
        ls.add(columnQux0());
        ls.add(columnC21());
        ls.add(columnC22());
        ls.add(columnC23());
        ls.add(columnStilettoAliasId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefId()); }
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
     * white_stiletto_alias by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteStilettoAlias() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStilettoAliasId(), WhiteStilettoAliasDbm.getInstance().columnStilettoAliasId());
        return cfi("FK_WHITE_STILETTO_ALIAS_REF", "whiteStilettoAlias", this, WhiteStilettoAliasDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteStilettoAliasRefList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteStilettoAliasRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteStilettoAliasRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteStilettoAliasRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteStilettoAliasRef> getEntityType() { return WhiteStilettoAliasRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteStilettoAliasRef newEntity() { return new WhiteStilettoAliasRef(); }
    public WhiteStilettoAliasRef newMyEntity() { return new WhiteStilettoAliasRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteStilettoAliasRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteStilettoAliasRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
