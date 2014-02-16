package com.example.dbflute.oracle.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The DB meta of WHITE_TARGET. (Singleton)
 * @author oracleman
 */
public class WhiteTargetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteTargetDbm _instance = new WhiteTargetDbm();
    private WhiteTargetDbm() {}
    public static WhiteTargetDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgTargetId(), "targetId");
        setupEpg(_epgMap, new EpgTargetName(), "targetName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgTargetId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteTarget)et).getTargetId(); }
        public void write(Entity et, Object vl) { ((WhiteTarget)et).setTargetId(ctl(vl)); }
    }
    public static class EpgTargetName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteTarget)et).getTargetName(); }
        public void write(Entity et, Object vl) { ((WhiteTarget)et).setTargetName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_TARGET";
    protected final String _tablePropertyName = "whiteTarget";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_TARGET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTargetId = cci("TARGET_ID", "TARGET_ID", null, null, true, "targetId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, "whiteRefTargetList", null);
    protected final ColumnInfo _columnTargetName = cci("TARGET_NAME", "TARGET_NAME", null, null, false, "targetName", String.class, false, false, "VARCHAR2", 256, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnTargetId() { return _columnTargetId; }
    public ColumnInfo columnTargetName() { return _columnTargetName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTargetId());
        ls.add(columnTargetName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTargetId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerWhiteRefTargetList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTargetId(), WhiteRefTargetDbm.getInstance().columnTargetId());
        return cri("FK_WHITE_REF_TARGET", "whiteRefTargetList", this, WhiteRefTargetDbm.getInstance(), mp, false, "whiteTarget");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.WhiteTarget"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.WhiteTargetCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.WhiteTargetBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteTarget> getEntityType() { return WhiteTarget.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteTarget newMyEntity() { return new WhiteTarget(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteTarget)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteTarget)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
