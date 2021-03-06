package com.example.dbflute.postgresql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.util.DfReflectionUtil;

import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.PurchaseDbm;
import com.example.dbflute.postgresql.dbflute.cbean.PurchaseCB;
import com.example.dbflute.postgresql.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.postgresql.dbflute.exentity.Purchase;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.7 (2010/04/01 Thursday)
 */
public class WxForceClassificationSettingTest extends UnitContainerTestCase {

    private PurchaseBhv purchaseBhv;

    public void test_select_correct_classification() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPaymentCompleteFlg_True();
        purchaseBhv.updateNonstrict(purchase);

        // ## Act ##
        Purchase actual = purchaseBhv.selectByPKValueWithDeletedCheck(3L);

        // ## Assert ##
        assertNotNull(actual.getPaymentCompleteFlg());
        assertTrue(actual.isPaymentCompleteFlgTrue());
    }

    public void test_select_correct_classification_relation() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member();
        cb.query().setPurchaseId_Equal(3L);

        // ## Act ##
        Purchase actual = purchaseBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(actual.getPaymentCompleteFlg());
        assertTrue(actual.isPaymentCompleteFlgTrue());
        assertNotNull(actual.getMember().getMemberStatusCode());
        assertNotNull(actual.getMember().getMemberStatusCodeAsMemberStatus());
    }

    public void test_select_illegal_classification() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        ColumnInfo paymentCompleteFlg = PurchaseDbm.getInstance().columnPaymentCompleteFlg();
        DfReflectionUtil.invokeForcedly(paymentCompleteFlg.getWriteMethod(), purchase, new Object[] { 99999 });
        purchaseBhv.updateNonstrict(purchase);

        // ## Act ##
        // no exception because of check is false at dfprop
        Purchase actual = purchaseBhv.selectByPKValueWithDeletedCheck(3L);

        // ## Assert ##
        assertEquals(99999, actual.getPaymentCompleteFlg());
        assertFalse(actual.isPaymentCompleteFlgTrue());
    }
}
