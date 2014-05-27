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
 * The DB meta of white_additional. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteAdditionalDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteAdditionalDbm _instance = new WhiteAdditionalDbm();
    private WhiteAdditionalDbm() {}
    public static WhiteAdditionalDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgFooId(), "fooId");
        setupEpg(_epgMap, new EpgFooName(), "fooName");
        setupEpg(_epgMap, new EpgFooDate(), "fooDate");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
    }
    public static class EpgFooId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteAdditional)et).getFooId(); }
        public void write(Entity et, Object vl) { ((WhiteAdditional)et).setFooId(cti(vl)); }
    }
    public static class EpgFooName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteAdditional)et).getFooName(); }
        public void write(Entity et, Object vl) { ((WhiteAdditional)et).setFooName((String)vl); }
    }
    public static class EpgFooDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteAdditional)et).getFooDate(); }
        public void write(Entity et, Object vl) { ((WhiteAdditional)et).setFooDate((java.util.Date)vl); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteAdditional)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((WhiteAdditional)et).setRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_additional";
    protected final String _tablePropertyName = "whiteAdditional";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ADDITIONAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "WXADD";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "test table for additionalTable";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFooId = cci("foo_id", "foo_id", null, null, Integer.class, "fooId", null, true, true, true, "INTEGER", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFooName = cci("foo_name", "foo_name", null, "Mr.FOO's name", String.class, "fooName", null, false, false, true, "UnknownType", 123, 0, null, false, null, "It's joke!", null, null, null);
    protected final ColumnInfo _columnFooDate = cci("foo_date", "foo_date", null, null, java.util.Date.class, "fooDate", null, false, false, false, "UnknownType", null, null, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.sql.Timestamp.class, "registerDatetime", null, false, false, false, "DATETIME", null, null, "CURRENT_TIMESTAMP", false, null, null, null, null, null);

    /**
     * foo_id: {PK, ID, NotNull, INTEGER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooId() { return _columnFooId; }
    /**
     * (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooName() { return _columnFooName; }
    /**
     * foo_date: {UnknownType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooDate() { return _columnFooDate; }
    /**
     * register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFooId());
        ls.add(columnFooName());
        ls.add(columnFooDate());
        ls.add(columnRegisterDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnFooId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // canonot cache because it uses related DB meta instance while booting
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
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteAdditional"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteAdditionalCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteAdditionalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteAdditional> getEntityType() { return WhiteAdditional.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteAdditional newMyEntity() { return new WhiteAdditional(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteAdditional)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteAdditional)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
