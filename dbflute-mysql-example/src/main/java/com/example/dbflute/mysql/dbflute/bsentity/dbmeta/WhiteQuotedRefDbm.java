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
 * The DB meta of white_quoted_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteQuotedRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteQuotedRefDbm _instance = new WhiteQuotedRefDbm();
    private WhiteQuotedRefDbm() {}
    public static WhiteQuotedRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgWhere(), "where");
        setupEpg(_epgMap, new EpgOrder(), "order");
    }
    public static class EpgWhere implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteQuotedRef)et).getWhere(); }
        public void write(Entity et, Object vl) { ((WhiteQuotedRef)et).setWhere(cti(vl)); }
    }
    public static class EpgOrder implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteQuotedRef)et).getOrder(); }
        public void write(Entity et, Object vl) { ((WhiteQuotedRef)et).setOrder(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteQuoted(), "whiteQuoted");
    }
    public class EfpgWhiteQuoted implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteQuotedRef)et).getWhiteQuoted(); }
        public void write(Entity et, Object vl) { ((WhiteQuotedRef)et).setWhiteQuoted((WhiteQuoted)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_quoted_ref";
    protected final String _tablePropertyName = "whiteQuotedRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("`WHITE_QUOTED_REF`", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWhere = cci("WHERE", "`WHERE`", null, null, Integer.class, "where", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnOrder = cci("ORDER", "`ORDER`", null, null, Integer.class, "order", null, false, false, false, "INT", 10, 0, null, false, null, null, "whiteQuoted", null, null);

    /**
     * WHERE: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWhere() { return _columnWhere; }
    /**
     * ORDER: {IX, INT(10), FK to white_quoted}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrder() { return _columnOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnWhere());
        ls.add(columnOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnWhere()); }
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
     * white_quoted by my ORDER, named 'whiteQuoted'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteQuoted() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOrder(), WhiteQuotedDbm.getInstance().columnSelect());
        return cfi("FK_WHITE_QUOTED_REF", "whiteQuoted", this, WhiteQuotedDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteQuotedRefList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteQuotedRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteQuotedRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteQuotedRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteQuotedRef> getEntityType() { return WhiteQuotedRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteQuotedRef newEntity() { return new WhiteQuotedRef(); }
    public WhiteQuotedRef newMyEntity() { return new WhiteQuotedRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteQuotedRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteQuotedRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
