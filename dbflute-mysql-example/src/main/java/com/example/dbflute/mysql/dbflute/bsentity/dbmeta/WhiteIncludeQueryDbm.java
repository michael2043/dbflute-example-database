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
 * The DB meta of white_include_query. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteIncludeQueryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteIncludeQueryDbm _instance = new WhiteIncludeQueryDbm();
    private WhiteIncludeQueryDbm() {}
    public static WhiteIncludeQueryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgIncludeQueryId(), "includeQueryId");
        setupEpg(_epgMap, new EpgIncludeQueryInteger(), "includeQueryInteger");
        setupEpg(_epgMap, new EpgIncludeQueryVarchar(), "includeQueryVarchar");
        setupEpg(_epgMap, new EpgIncludeQueryDate(), "includeQueryDate");
        setupEpg(_epgMap, new EpgIncludeQueryDatetime(), "includeQueryDatetime");
    }
    public static class EpgIncludeQueryId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteIncludeQuery)et).getIncludeQueryId(); }
        public void write(Entity et, Object vl) { ((WhiteIncludeQuery)et).setIncludeQueryId(ctl(vl)); }
    }
    public static class EpgIncludeQueryInteger implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteIncludeQuery)et).getIncludeQueryInteger(); }
        public void write(Entity et, Object vl) { ((WhiteIncludeQuery)et).setIncludeQueryInteger(cti(vl)); }
    }
    public static class EpgIncludeQueryVarchar implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteIncludeQuery)et).getIncludeQueryVarchar(); }
        public void write(Entity et, Object vl) { ((WhiteIncludeQuery)et).setIncludeQueryVarchar((String)vl); }
    }
    public static class EpgIncludeQueryDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteIncludeQuery)et).getIncludeQueryDate(); }
        public void write(Entity et, Object vl) { ((WhiteIncludeQuery)et).setIncludeQueryDate((java.util.Date)vl); }
    }
    public static class EpgIncludeQueryDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteIncludeQuery)et).getIncludeQueryDatetime(); }
        public void write(Entity et, Object vl) { ((WhiteIncludeQuery)et).setIncludeQueryDatetime((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_include_query";
    protected final String _tablePropertyName = "whiteIncludeQuery";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_INCLUDE_QUERY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnIncludeQueryId = cci("INCLUDE_QUERY_ID", "INCLUDE_QUERY_ID", null, null, Long.class, "includeQueryId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnIncludeQueryInteger = cci("INCLUDE_QUERY_INTEGER", "INCLUDE_QUERY_INTEGER", null, null, Integer.class, "includeQueryInteger", null, false, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnIncludeQueryVarchar = cci("INCLUDE_QUERY_VARCHAR", "INCLUDE_QUERY_VARCHAR", null, null, String.class, "includeQueryVarchar", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnIncludeQueryDate = cci("INCLUDE_QUERY_DATE", "INCLUDE_QUERY_DATE", null, null, java.util.Date.class, "includeQueryDate", null, false, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnIncludeQueryDatetime = cci("INCLUDE_QUERY_DATETIME", "INCLUDE_QUERY_DATETIME", null, null, java.sql.Timestamp.class, "includeQueryDatetime", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);

    /**
     * INCLUDE_QUERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncludeQueryId() { return _columnIncludeQueryId; }
    /**
     * INCLUDE_QUERY_INTEGER: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncludeQueryInteger() { return _columnIncludeQueryInteger; }
    /**
     * INCLUDE_QUERY_VARCHAR: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncludeQueryVarchar() { return _columnIncludeQueryVarchar; }
    /**
     * INCLUDE_QUERY_DATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncludeQueryDate() { return _columnIncludeQueryDate; }
    /**
     * INCLUDE_QUERY_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncludeQueryDatetime() { return _columnIncludeQueryDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnIncludeQueryId());
        ls.add(columnIncludeQueryInteger());
        ls.add(columnIncludeQueryVarchar());
        ls.add(columnIncludeQueryDate());
        ls.add(columnIncludeQueryDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnIncludeQueryId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteIncludeQuery"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteIncludeQueryCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteIncludeQueryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteIncludeQuery> getEntityType() { return WhiteIncludeQuery.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteIncludeQuery newMyEntity() { return new WhiteIncludeQuery(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteIncludeQuery)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteIncludeQuery)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
