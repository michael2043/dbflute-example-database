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
 * The DB meta of white_pg_reserv_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhitePgReservRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhitePgReservRefDbm _instance = new WhitePgReservRefDbm();
    private WhitePgReservRefDbm() {}
    public static WhitePgReservRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgClassSynonym(), "classSynonym");
    }
    public static class EpgRefId implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReservRef)et).getRefId(); }
        public void write(Entity et, Object vl) { ((WhitePgReservRef)et).setRefId(cti(vl)); }
    }
    public static class EpgClassSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReservRef)et).getClassSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReservRef)et).setClassSynonym(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhitePgReserv(), "whitePgReserv");
    }
    public class EfpgWhitePgReserv implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReservRef)et).getWhitePgReserv(); }
        public void write(Entity et, Object vl) { ((WhitePgReservRef)et).setWhitePgReserv((WhitePgReserv)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_pg_reserv_ref";
    protected final String _tablePropertyName = "whitePgReservRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_PG_RESERV_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefId = cci("REF_ID", "REF_ID", null, null, Integer.class, "refId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnClassSynonym = cci("CLASS", "CLASS", "CLASS_SYNONYM", "(using DBFlute synonym)", Integer.class, "classSynonym", null, false, false, false, "INT", 10, 0, null, false, null, null, "whitePgReserv", null, null);

    /**
     * REF_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefId() { return _columnRefId; }
    /**
     * ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassSynonym() { return _columnClassSynonym; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefId());
        ls.add(columnClassSynonym());
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
     * white_pg_reserv by my CLASS, named 'whitePgReserv'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhitePgReserv() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClassSynonym(), WhitePgReservDbm.getInstance().columnClassSynonym());
        return cfi("FK_WHITE_PG_RESERV_REF_CLASS", "whitePgReserv", this, WhitePgReservDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whitePgReservRefList");
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhitePgReservRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhitePgReservRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhitePgReservRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhitePgReservRef> getEntityType() { return WhitePgReservRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhitePgReservRef newEntity() { return new WhitePgReservRef(); }
    public WhitePgReservRef newMyEntity() { return new WhitePgReservRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhitePgReservRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhitePgReservRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
