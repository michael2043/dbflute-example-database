package com.example.dbflute.postgresql.dbflute.allcommon;

import java.util.*;

import org.seasar.dbflute.jdbc.Classification;
import org.seasar.dbflute.jdbc.ClassificationCodeType;
import org.seasar.dbflute.jdbc.ClassificationMeta;
import org.seasar.dbflute.jdbc.ClassificationUndefinedHandlingType;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
public interface CDef extends Classification {

    /** The empty array for no sisters. */
    String[] EMPTY_SISTERS = new String[]{};

    /** The empty map for no sub-items. */
    @SuppressWarnings("unchecked")
    Map<String, Object> EMPTY_SUB_ITEM_MAP = (Map<String, Object>)Collections.EMPTY_MAP;

    /**
     * general boolean classification for every flg-column
     */
    public enum Flg implements CDef {
        /** Yes: means valid */
        True("1", "Yes", EMPTY_SISTERS)
        ,
        /** No: means invalid */
        False("0", "No", EMPTY_SISTERS)
        ;
        private static final Map<String, Flg> _codeValueMap = new HashMap<String, Flg>();
        static {
            for (Flg value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private Flg(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.Flg; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Flg codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof Flg) { return (Flg)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static Flg nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<Flg> listAll() {
            return new ArrayList<Flg>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<Flg> groupOf(String groupName) {
            return new ArrayList<Flg>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * status of member from entry to withdrawal
     */
    public enum MemberStatus implements CDef {
        /** FORMALIZED: as formal member, allowed to use all service */
        Formalized("FML", "FORMALIZED", EMPTY_SISTERS)
        ,
        /** WITHDRAWAL: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "WITHDRAWAL", EMPTY_SISTERS)
        ,
        /** PROVISIONAL: first status after entry, allowed to use only part of service */
        Provisional("PRV", "PROVISIONAL", EMPTY_SISTERS)
        ;
        private static final Map<String, MemberStatus> _codeValueMap = new HashMap<String, MemberStatus>();
        static {
            for (MemberStatus value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private MemberStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.MemberStatus; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof MemberStatus) { return (MemberStatus)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<MemberStatus> listAll() {
            return new ArrayList<MemberStatus>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<MemberStatus> groupOf(String groupName) {
            return new ArrayList<MemberStatus>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * method of payment for purchase
     */
    public enum PaymentMethod implements CDef {
        /** by hand: payment by hand, face-to-face */
        ByHand("HAN", "by hand", EMPTY_SISTERS)
        ,
        /** bank transfer: bank transfer payment */
        BankTransfer("BAK", "bank transfer", EMPTY_SISTERS)
        ,
        /** credit card: credit card payment */
        CreditCard("CRC", "credit card", EMPTY_SISTERS)
        ;
        private static final Map<String, PaymentMethod> _codeValueMap = new HashMap<String, PaymentMethod>();
        static {
            for (PaymentMethod value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private PaymentMethod(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.PaymentMethod; }

        /**
         * Is the classification in the group? <br />
         * the most recommended method <br />
         * The group elements:[ByHand]
         * @return The determination, true or false.
         */
        public boolean isRecommended() {
            return ByHand.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("recommended".equals(groupName)) { return isRecommended(); }
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static PaymentMethod codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof PaymentMethod) { return (PaymentMethod)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static PaymentMethod nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<PaymentMethod> listAll() {
            return new ArrayList<PaymentMethod>(Arrays.asList(values()));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br />
         * the most recommended method <br />
         * The group elements:[ByHand]
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<PaymentMethod> listOfRecommended() {
            return new ArrayList<PaymentMethod>(Arrays.asList(ByHand));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<PaymentMethod> groupOf(String groupName) {
            if ("recommended".equals(groupName)) { return listOfRecommended(); }
            return new ArrayList<PaymentMethod>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * boolean type classification
     */
    public enum TrueFalse implements CDef {
        /** Yes: means valid */
        True("true", "Yes", EMPTY_SISTERS)
        ,
        /** No: means invalid */
        False("false", "No", EMPTY_SISTERS)
        ;
        private static final Map<String, TrueFalse> _codeValueMap = new HashMap<String, TrueFalse>();
        static {
            for (TrueFalse value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private TrueFalse(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return CDef.DefMeta.TrueFalse; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static TrueFalse codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof TrueFalse) { return (TrueFalse)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static TrueFalse nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<TrueFalse> listAll() {
            return new ArrayList<TrueFalse>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<TrueFalse> groupOf(String groupName) {
            return new ArrayList<TrueFalse>(4);
        }

        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** general boolean classification for every flg-column */
        Flg
        ,
        /** status of member from entry to withdrawal */
        MemberStatus
        ,
        /** method of payment for purchase */
        PaymentMethod
        ,
        /** boolean type classification */
        TrueFalse
        ;
        public String classificationName() {
            return name(); // same as definition name
        }

        public Classification codeOf(Object code) {
            if ("Flg".equals(name())) { return CDef.Flg.codeOf(code); }
            if ("MemberStatus".equals(name())) { return CDef.MemberStatus.codeOf(code); }
            if ("PaymentMethod".equals(name())) { return CDef.PaymentMethod.codeOf(code); }
            if ("TrueFalse".equals(name())) { return CDef.TrueFalse.codeOf(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public Classification nameOf(String name) {
            if ("Flg".equals(name())) { return CDef.Flg.valueOf(name); }
            if ("MemberStatus".equals(name())) { return CDef.MemberStatus.valueOf(name); }
            if ("PaymentMethod".equals(name())) { return CDef.PaymentMethod.valueOf(name); }
            if ("TrueFalse".equals(name())) { return CDef.TrueFalse.valueOf(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> listAll() {
            if ("Flg".equals(name())) { return toClassificationList(CDef.Flg.listAll()); }
            if ("MemberStatus".equals(name())) { return toClassificationList(CDef.MemberStatus.listAll()); }
            if ("PaymentMethod".equals(name())) { return toClassificationList(CDef.PaymentMethod.listAll()); }
            if ("TrueFalse".equals(name())) { return toClassificationList(CDef.TrueFalse.listAll()); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> groupOf(String groupName) {
            if ("Flg".equals(name())) { return toClassificationList(CDef.Flg.groupOf(groupName)); }
            if ("MemberStatus".equals(name())) { return toClassificationList(CDef.MemberStatus.groupOf(groupName)); }
            if ("PaymentMethod".equals(name())) { return toClassificationList(CDef.PaymentMethod.groupOf(groupName)); }
            if ("TrueFalse".equals(name())) { return toClassificationList(CDef.TrueFalse.groupOf(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        @SuppressWarnings("unchecked")
        private List<Classification> toClassificationList(List<?> clsList) {
            return (List<Classification>)clsList;
        }

        public ClassificationCodeType codeType() {
            if ("Flg".equals(name())) { return ClassificationCodeType.Number; }
            if ("MemberStatus".equals(name())) { return ClassificationCodeType.String; }
            if ("PaymentMethod".equals(name())) { return ClassificationCodeType.String; }
            if ("TrueFalse".equals(name())) { return ClassificationCodeType.Boolean; }
            return ClassificationCodeType.String; // as default
        }

        public ClassificationUndefinedHandlingType undefinedHandlingType() {
            if ("Flg".equals(name())) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            if ("MemberStatus".equals(name())) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            if ("PaymentMethod".equals(name())) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            if ("TrueFalse".equals(name())) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            return ClassificationUndefinedHandlingType.LOGGING; // as default
        }
    }
}
