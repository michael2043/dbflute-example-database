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
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.mysql.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of (購入支払)PURCHASE_PAYMENT as TABLE. <br />
 * 購入に対する支払。<br />
 * 分割払いもできるのでmanyとなり、会員からの孫テーブルのテストができてうれしい。
 * <pre>
 * [primary-key]
 *     PURCHASE_PAYMENT_ID
 * 
 * [column]
 *     PURCHASE_PAYMENT_ID, PURCHASE_ID, PAYMENT_AMOUNT, PAYMENT_DATETIME, PAYMENT_METHOD_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PURCHASE_PAYMENT_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     purchase
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     purchase
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long purchasePaymentId = entity.getPurchasePaymentId();
 * Long purchaseId = entity.getPurchaseId();
 * java.math.BigDecimal paymentAmount = entity.getPaymentAmount();
 * java.sql.Timestamp paymentDatetime = entity.getPaymentDatetime();
 * String paymentMethodCode = entity.getPaymentMethodCode();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * entity.setPurchasePaymentId(purchasePaymentId);
 * entity.setPurchaseId(purchaseId);
 * entity.setPaymentAmount(paymentAmount);
 * entity.setPaymentDatetime(paymentDatetime);
 * entity.setPaymentMethodCode(paymentMethodCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchasePayment extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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
    /** (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _purchasePaymentId;

    /** (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase} */
    protected Long _purchaseId;

    /** (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} */
    protected java.math.BigDecimal _paymentAmount;

    /** (支払日時)PAYMENT_DATETIME: {IX+, NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _paymentDatetime;

    /** (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} */
    protected String _paymentMethodCode;

    /** REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _updateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

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
        return "purchase_payment";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "purchasePayment";
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
        if (getPurchasePaymentId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of paymentMethodCode as the classification of PaymentMethod. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br />
     * 支払方法
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PaymentMethod getPaymentMethodCodeAsPaymentMethod() {
        return CDef.PaymentMethod.codeOf(getPaymentMethodCode());
    }

    /**
     * Set the value of paymentMethodCode as the classification of PaymentMethod. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br />
     * 支払方法
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPaymentMethodCodeAsPaymentMethod(CDef.PaymentMethod cdef) {
        setPaymentMethodCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of paymentMethodCode as ByHand (HAN). <br />
     * 手渡し: Face-to-Faceの手渡しで商品と交換
     */
    public void setPaymentMethodCode_ByHand() {
        setPaymentMethodCodeAsPaymentMethod(CDef.PaymentMethod.ByHand);
    }

    /**
     * Set the value of paymentMethodCode as BankTransfer (BAK). <br />
     * 銀行振込: 銀行振込で確認してから商品発送
     */
    public void setPaymentMethodCode_BankTransfer() {
        setPaymentMethodCodeAsPaymentMethod(CDef.PaymentMethod.BankTransfer);
    }

    /**
     * Set the value of paymentMethodCode as CreditCard (CRC). <br />
     * クレジットカード: クレジットカードの番号を教えてもらう
     */
    public void setPaymentMethodCode_CreditCard() {
        setPaymentMethodCodeAsPaymentMethod(CDef.PaymentMethod.CreditCard);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of paymentMethodCode ByHand? <br />
     * 手渡し: Face-to-Faceの手渡しで商品と交換
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentMethodCodeByHand() {
        CDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.equals(CDef.PaymentMethod.ByHand) : false;
    }

    /**
     * Is the value of paymentMethodCode BankTransfer? <br />
     * 銀行振込: 銀行振込で確認してから商品発送
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentMethodCodeBankTransfer() {
        CDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.equals(CDef.PaymentMethod.BankTransfer) : false;
    }

    /**
     * Is the value of paymentMethodCode CreditCard? <br />
     * クレジットカード: クレジットカードの番号を教えてもらう
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentMethodCodeCreditCard() {
        CDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.equals(CDef.PaymentMethod.CreditCard) : false;
    }

    /**
     * 最も推奨されている方法 <br />
     * The group elements:[ByHand]
     * @return The determination, true or false.
     */
    public boolean isPaymentMethodCode_Recommended() {
        CDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null && cdef.isRecommended();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'paymentMethodCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPaymentMethodCodeName() {
        CDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'paymentMethodCode' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getPaymentMethodCodeAlias() {
        CDef.PaymentMethod cdef = getPaymentMethodCodeAsPaymentMethod();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (購入)purchase by my PURCHASE_ID, named 'purchase'. */
    protected Purchase _purchase;

    /**
     * [get] (購入)purchase by my PURCHASE_ID, named 'purchase'.
     * @return The entity of foreign property 'purchase'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Purchase getPurchase() {
        return _purchase;
    }

    /**
     * [set] (購入)purchase by my PURCHASE_ID, named 'purchase'.
     * @param purchase The entity of foreign property 'purchase'. (NullAllowed)
     */
    public void setPurchase(Purchase purchase) {
        _purchase = purchase;
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
        if (obj instanceof BsPurchasePayment) {
            BsPurchasePayment other = (BsPurchasePayment)obj;
            if (!xSV(_purchasePaymentId, other._purchasePaymentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _purchasePaymentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_purchase != null)
        { sb.append(li).append(xbRDS(_purchase, "purchase")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_purchasePaymentId));
        sb.append(dm).append(xfND(_purchaseId));
        sb.append(dm).append(xfND(_paymentAmount));
        sb.append(dm).append(xfND(_paymentDatetime));
        sb.append(dm).append(xfND(_paymentMethodCode));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_purchase != null)
        { sb.append(dm).append("purchase"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PurchasePayment clone() {
        return (PurchasePayment)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * 連番
     * @return The value of the column 'PURCHASE_PAYMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchasePaymentId() {
        checkSpecifiedProperty("purchasePaymentId");
        return _purchasePaymentId;
    }

    /**
     * [set] (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * 連番
     * @param purchasePaymentId The value of the column 'PURCHASE_PAYMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchasePaymentId(Long purchasePaymentId) {
        registerModifiedProperty("purchasePaymentId");
        _purchasePaymentId = purchasePaymentId;
    }

    /**
     * [get] (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase} <br />
     * 支払い対象の購入へのID
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchaseId() {
        checkSpecifiedProperty("purchaseId");
        return _purchaseId;
    }

    /**
     * [set] (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase} <br />
     * 支払い対象の購入へのID
     * @param purchaseId The value of the column 'PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseId(Long purchaseId) {
        registerModifiedProperty("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} <br />
     * 支払った金額。さて、小数点なのはなぜでしょう？
     * @return The value of the column 'PAYMENT_AMOUNT'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPaymentAmount() {
        checkSpecifiedProperty("paymentAmount");
        return _paymentAmount;
    }

    /**
     * [set] (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} <br />
     * 支払った金額。さて、小数点なのはなぜでしょう？
     * @param paymentAmount The value of the column 'PAYMENT_AMOUNT'. (basically NotNull if update: for the constraint)
     */
    public void setPaymentAmount(java.math.BigDecimal paymentAmount) {
        registerModifiedProperty("paymentAmount");
        _paymentAmount = paymentAmount;
    }

    /**
     * [get] (支払日時)PAYMENT_DATETIME: {IX+, NotNull, DATETIME(19)} <br />
     * 支払ったときの日時
     * @return The value of the column 'PAYMENT_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getPaymentDatetime() {
        checkSpecifiedProperty("paymentDatetime");
        return _paymentDatetime;
    }

    /**
     * [set] (支払日時)PAYMENT_DATETIME: {IX+, NotNull, DATETIME(19)} <br />
     * 支払ったときの日時
     * @param paymentDatetime The value of the column 'PAYMENT_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPaymentDatetime(java.sql.Timestamp paymentDatetime) {
        registerModifiedProperty("paymentDatetime");
        _paymentDatetime = paymentDatetime;
    }

    /**
     * [get] (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br />
     * 手渡しや銀行振込など
     * @return The value of the column 'PAYMENT_METHOD_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getPaymentMethodCode() {
        checkSpecifiedProperty("paymentMethodCode");
        return _paymentMethodCode;
    }

    /**
     * [set] (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3), classification=PaymentMethod} <br />
     * 手渡しや銀行振込など
     * @param paymentMethodCode The value of the column 'PAYMENT_METHOD_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setPaymentMethodCode(String paymentMethodCode) {
        checkClassificationCode("PAYMENT_METHOD_CODE", CDef.DefMeta.PaymentMethod, paymentMethodCode);
        registerModifiedProperty("paymentMethodCode");
        _paymentMethodCode = paymentMethodCode;
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
        registerModifiedProperty("registerDatetime");
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
        registerModifiedProperty("registerUser");
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
        registerModifiedProperty("updateDatetime");
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
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param paymentMethodCode The value of the column 'PAYMENT_METHOD_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingPaymentMethodCode(String paymentMethodCode) {
        setPaymentMethodCode(paymentMethodCode);
    }
}
