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
 * The DB meta of white_escaped_dfprop. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteEscapedDfpropDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteEscapedDfpropDbm _instance = new WhiteEscapedDfpropDbm();
    private WhiteEscapedDfpropDbm() {}
    public static WhiteEscapedDfpropDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgEscapedDfpropCode(), "escapedDfpropCode");
        setupEpg(_epgMap, new EpgEscapedDfpropName(), "escapedDfpropName");
    }
    public class EpgEscapedDfpropCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteEscapedDfprop)et).getEscapedDfpropCode(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnEscapedDfpropCode();
            ccls(col, vl);
            CDef.EscapedDfpropCls cls = (CDef.EscapedDfpropCls)gcls(col, vl);
            if (cls != null) {
                ((WhiteEscapedDfprop)et).setEscapedDfpropCodeAsEscapedDfpropCls(cls);
            } else {
                ((WhiteEscapedDfprop)et).mynativeMappingEscapedDfpropCode((String)vl);
            }
        }
    }
    public static class EpgEscapedDfpropName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteEscapedDfprop)et).getEscapedDfpropName(); }
        public void write(Entity et, Object vl) { ((WhiteEscapedDfprop)et).setEscapedDfpropName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_escaped_dfprop";
    protected final String _tablePropertyName = "whiteEscapedDfprop";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ESCAPED_DFPROP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEscapedDfpropCode = cci("ESCAPED_DFPROP_CODE", "ESCAPED_DFPROP_CODE", null, null, String.class, "escapedDfpropCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.EscapedDfpropCls);
    protected final ColumnInfo _columnEscapedDfpropName = cci("ESCAPED_DFPROP_NAME", "ESCAPED_DFPROP_NAME", null, null, String.class, "escapedDfpropName", null, false, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);

    /**
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEscapedDfpropCode() { return _columnEscapedDfpropCode; }
    /**
     * ESCAPED_DFPROP_NAME: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEscapedDfpropName() { return _columnEscapedDfpropName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnEscapedDfpropCode());
        ls.add(columnEscapedDfpropName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnEscapedDfpropCode()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteEscapedDfprop"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteEscapedDfpropCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteEscapedDfpropBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteEscapedDfprop> getEntityType() { return WhiteEscapedDfprop.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteEscapedDfprop newEntity() { return new WhiteEscapedDfprop(); }
    public WhiteEscapedDfprop newMyEntity() { return new WhiteEscapedDfprop(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteEscapedDfprop)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteEscapedDfprop)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
