package com.example.dbflute.db2.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.db2.dbflute.allcommon.*;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The DB meta of WHITE_REF_TARGET. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteRefTargetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteRefTargetDbm _instance = new WhiteRefTargetDbm();
    private WhiteRefTargetDbm() {}
    public static WhiteRefTargetDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgRefTargetId(), "refTargetId");
        setupEpg(_epgMap, new EpgTargetId(), "targetId");
    }
    public static class EpgRefTargetId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteRefTarget)et).getRefTargetId(); }
        public void write(Entity et, Object vl) { ((WhiteRefTarget)et).setRefTargetId(ctl(vl)); }
    }
    public static class EpgTargetId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteRefTarget)et).getTargetId(); }
        public void write(Entity et, Object vl) { ((WhiteRefTarget)et).setTargetId(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteTarget(), "whiteTarget");
    }
    public class EfpgWhiteTarget implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteRefTarget)et).getWhiteTarget(); }
        public void write(Entity et, Object vl) { ((WhiteRefTarget)et).setWhiteTarget((WhiteTarget)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_REF_TARGET";
    protected final String _tablePropertyName = "whiteRefTarget";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_REF_TARGET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefTargetId = cci("REF_TARGET_ID", "REF_TARGET_ID", null, null, Long.class, "refTargetId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTargetId = cci("TARGET_ID", "TARGET_ID", null, null, Long.class, "targetId", null, false, false, true, "DECIMAL", 16, 0, null, false, null, null, "whiteTarget", null, null);

    /**
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefTargetId() { return _columnRefTargetId; }
    /**
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTargetId() { return _columnTargetId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefTargetId());
        ls.add(columnTargetId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefTargetId()); }
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
     * WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteTarget() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTargetId(), WhiteTargetDbm.getInstance().columnTargetId());
        return cfi("FK_WHITE_REF_TARGET", "whiteTarget", this, WhiteTargetDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteRefTargetList");
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
    public String getEntityTypeName() { return "com.example.dbflute.db2.dbflute.exentity.WhiteRefTarget"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.db2.dbflute.cbean.WhiteRefTargetCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.db2.dbflute.exbhv.WhiteRefTargetBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteRefTarget> getEntityType() { return WhiteRefTarget.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteRefTarget newEntity() { return new WhiteRefTarget(); }
    public WhiteRefTarget newMyEntity() { return new WhiteRefTarget(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteRefTarget)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteRefTarget)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
