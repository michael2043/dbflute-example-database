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
package com.example.dbflute.mysql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.mysql.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of (会員住所情報)MEMBER_ADDRESS as TABLE. <br />
 * 会員の住所に関する情報。<br />
 * 同時に有効期間ごとに履歴管理されている。
 * <pre>
 * [primary-key]
 *     MEMBER_ADDRESS_ID
 * 
 * [column]
 *     MEMBER_ADDRESS_ID, MEMBER_ID, VALID_BEGIN_DATE, VALID_END_DATE, ADDRESS, REGION_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_ADDRESS_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     member, region
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, region
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberAddressId = entity.getMemberAddressId();
 * Integer memberId = entity.getMemberId();
 * java.util.Date validBeginDate = entity.getValidBeginDate();
 * java.util.Date validEndDate = entity.getValidEndDate();
 * String address = entity.getAddress();
 * Integer regionId = entity.getRegionId();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberAddressId(memberAddressId);
 * entity.setMemberId(memberId);
 * entity.setValidBeginDate(validBeginDate);
 * entity.setValidEndDate(validEndDate);
 * entity.setAddress(address);
 * entity.setRegionId(regionId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberAddress extends AbstractEntity implements EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _memberAddressId;

    /** (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member} */
    protected Integer _memberId;

    /** (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} */
    protected java.util.Date _validBeginDate;

    /** (有効終了日)VALID_END_DATE: {NotNull, DATE(10)} */
    protected java.util.Date _validEndDate;

    /** (住所)ADDRESS: {NotNull, VARCHAR(200)} */
    protected String _address;

    /** (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region} */
    protected Integer _regionId;

    /** REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _updateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** Is common column auto set up effective? */
    protected boolean __canCommonColumnAutoSetup = true;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "member_address";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "memberAddress";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getMemberAddressId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ+, NotNull, INT(10), FK to member. (NotNull)
     * @param validBeginDate (有効開始日): +UQ, NotNull, DATE(10). (NotNull)
     */
    public void uniqueBy(Integer memberId, java.util.Date validBeginDate) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("validBeginDate");
        setMemberId(memberId);setValidBeginDate(validBeginDate);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of regionId as the classification of Region. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region} <br />
     * mainly region of member address
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Region getRegionIdAsRegion() {
        return CDef.Region.codeOf(getRegionId());
    }

    /**
     * Set the value of regionId as the classification of Region. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region} <br />
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setRegionIdAsRegion(CDef.Region cdef) {
        setRegionId(cdef != null ? toNumber(cdef.code(), Integer.class) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of regionId as アメリカ (1). <br />
     * アメリカ
     */
    public void setRegionId_アメリカ() {
        setRegionIdAsRegion(CDef.Region.アメリカ);
    }

    /**
     * Set the value of regionId as カナダ (2). <br />
     * カナダ
     */
    public void setRegionId_カナダ() {
        setRegionIdAsRegion(CDef.Region.カナダ);
    }

    /**
     * Set the value of regionId as 中国 (3). <br />
     * 中国
     */
    public void setRegionId_中国() {
        setRegionIdAsRegion(CDef.Region.中国);
    }

    /**
     * Set the value of regionId as 千葉 (4). <br />
     * 千葉
     */
    public void setRegionId_千葉() {
        setRegionIdAsRegion(CDef.Region.千葉);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of regionId アメリカ? <br />
     * アメリカ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdアメリカ() {
        CDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(CDef.Region.アメリカ) : false;
    }

    /**
     * Is the value of regionId カナダ? <br />
     * カナダ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdカナダ() {
        CDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(CDef.Region.カナダ) : false;
    }

    /**
     * Is the value of regionId 中国? <br />
     * 中国
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionId中国() {
        CDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(CDef.Region.中国) : false;
    }

    /**
     * Is the value of regionId 千葉? <br />
     * 千葉
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionId千葉() {
        CDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(CDef.Region.千葉) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)member by my MEMBER_ID, named 'member'. */
    protected Member _member;

    /**
     * [get] (会員)member by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMember() {
        return _member;
    }

    /**
     * [set] (会員)member by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(Member member) {
        _member = member;
    }

    /** (地域)region by my REGION_ID, named 'region'. */
    protected Region _region;

    /**
     * [get] (地域)region by my REGION_ID, named 'region'.
     * @return The entity of foreign property 'region'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Region getRegion() {
        return _region;
    }

    /**
     * [set] (地域)region by my REGION_ID, named 'region'.
     * @param region The entity of foreign property 'region'. (NullAllowed)
     */
    public void setRegion(Region region) {
        _region = region;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                       Common Column
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void enableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = true;
    }

    /**
     * {@inheritDoc}
     */
    public void disableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean canCommonColumnAutoSetup() {
        return __canCommonColumnAutoSetup;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMemberAddress) {
            BsMemberAddress other = (BsMemberAddress)obj;
            if (!xSV(_memberAddressId, other._memberAddressId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _memberAddressId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null)
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_region != null)
        { sb.append(li).append(xbRDS(_region, "region")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberAddressId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfUD(_validBeginDate));
        sb.append(dm).append(xfUD(_validEndDate));
        sb.append(dm).append(xfND(_address));
        sb.append(dm).append(xfND(_regionId));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null) { sb.append(dm).append("member"); }
        if (_region != null) { sb.append(dm).append("region"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberAddress clone() {
        return (MemberAddress)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)} <br />
     * 会員住所を識別するID。<br />
     * 履歴分も含むテーブルなので、これ自体はFKではない。
     * @return The value of the column 'MEMBER_ADDRESS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberAddressId() {
        checkSpecifiedProperty("memberAddressId");
        return _memberAddressId;
    }

    /**
     * [set] (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)} <br />
     * 会員住所を識別するID。<br />
     * 履歴分も含むテーブルなので、これ自体はFKではない。
     * @param memberAddressId The value of the column 'MEMBER_ADDRESS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberAddressId(Integer memberAddressId) {
        __modifiedProperties.addPropertyName("memberAddressId");
        _memberAddressId = memberAddressId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member} <br />
     * 会員を参照するID。<br />
     * 履歴分を含むため、これだけではユニークにはならない。
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member} <br />
     * 会員を参照するID。<br />
     * 履歴分を含むため、これだけではユニークにはならない。
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} <br />
     * 一つの有効期間の開始を示す日付。<br />
     * 前の有効終了日の次の日の値が格納される。
     * @return The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getValidBeginDate() {
        checkSpecifiedProperty("validBeginDate");
        return _validBeginDate;
    }

    /**
     * [set] (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} <br />
     * 一つの有効期間の開始を示す日付。<br />
     * 前の有効終了日の次の日の値が格納される。
     * @param validBeginDate The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setValidBeginDate(java.util.Date validBeginDate) {
        __modifiedProperties.addPropertyName("validBeginDate");
        _validBeginDate = validBeginDate;
    }

    /**
     * [get] (有効終了日)VALID_END_DATE: {NotNull, DATE(10)} <br />
     * 有効期間の終了日。<br />
     * 次の有効開始日の一日前の値が格納される。<br />
     * ただし、次の有効期間がない場合は 9999/12/31 となる。
     * @return The value of the column 'VALID_END_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getValidEndDate() {
        checkSpecifiedProperty("validEndDate");
        return _validEndDate;
    }

    /**
     * [set] (有効終了日)VALID_END_DATE: {NotNull, DATE(10)} <br />
     * 有効期間の終了日。<br />
     * 次の有効開始日の一日前の値が格納される。<br />
     * ただし、次の有効期間がない場合は 9999/12/31 となる。
     * @param validEndDate The value of the column 'VALID_END_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setValidEndDate(java.util.Date validEndDate) {
        __modifiedProperties.addPropertyName("validEndDate");
        _validEndDate = validEndDate;
    }

    /**
     * [get] (住所)ADDRESS: {NotNull, VARCHAR(200)} <br />
     * まるごと住所
     * @return The value of the column 'ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getAddress() {
        checkSpecifiedProperty("address");
        return _address;
    }

    /**
     * [set] (住所)ADDRESS: {NotNull, VARCHAR(200)} <br />
     * まるごと住所
     * @param address The value of the column 'ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setAddress(String address) {
        __modifiedProperties.addPropertyName("address");
        _address = address;
    }

    /**
     * [get] (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region} <br />
     * 地域を参照するID。<br />
     * ここでは特に住所の内容と連動しているわけではない。
     * @return The value of the column 'REGION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRegionId() {
        checkSpecifiedProperty("regionId");
        return _regionId;
    }

    /**
     * [set] (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region} <br />
     * 地域を参照するID。<br />
     * ここでは特に住所の内容と連動しているわけではない。
     * @param regionId The value of the column 'REGION_ID'. (basically NotNull if update: for the constraint)
     */
    protected void setRegionId(Integer regionId) {
        __modifiedProperties.addPropertyName("regionId");
        _regionId = regionId;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        __modifiedProperties.addPropertyName("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.addPropertyName("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, DATETIME(19)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, DATETIME(19)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        __modifiedProperties.addPropertyName("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.addPropertyName("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.addPropertyName("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param regionId The value of the column 'REGION_ID'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingRegionId(Integer regionId) {
        setRegionId(regionId);
    }
}
