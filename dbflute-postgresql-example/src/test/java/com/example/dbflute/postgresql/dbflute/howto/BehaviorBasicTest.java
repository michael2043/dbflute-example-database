package com.example.dbflute.postgresql.dbflute.howto;

import java.util.List;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;

import com.example.dbflute.postgresql.dbflute.cbean.MemberCB;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.postgresql.dbflute.exentity.Member;
import com.example.dbflute.postgresql.dbflute.exentity.customize.SimpleMember;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

public class BehaviorBasicTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The behavior of Member. (Injection Component) */
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    public void test_selectEntity() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(3);

        // ## Act ##
        Member member = memberBhv.selectEntity(cb);

        // ## Assert ##
        log(member.toString());
        assertEquals((Integer) 3, member.getMemberId());
    }

    public void test_selectEntityWithDeletedCheck() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(99999);

        // ## Act & Assert ##
        try {
            memberBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    public void test_selectList() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_PrefixSearch("S");
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member.toString());
            assertTrue(member.getMemberName().startsWith("S"));
        }
    }

    // ===================================================================================
    //                                                                        Conut Select
    //                                                                        ============
    public void test_selectCount() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_PrefixSearch("S");

        // ## Act ##
        int count = memberBhv.selectCount(cb);

        // ## Assert ##
        assertNotSame(0, count);
        log("count = " + count);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    // -----------------------------------------------------
    //                                                Insert
    //                                                ------
    public void test_insert() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        member.setMemberStatusCode_Formalized();

        // ## Act ##
        memberBhv.insert(member);

        // ## Assert ##
        log(member.getMemberId());
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    /**
     * 排他制御ありの一件更新: update().
     * 会員ID'3'の会員の名称を'testName'に更新
     */
    public void test_update() {
        // ## Arrange ##
        Member beforeMember = memberBhv.selectByPKValueWithDeletedCheck(3);
        Long versionNo = beforeMember.getVersionNo();// 排他制御のためにVersionNoを取得

        Member member = new Member();
        member.setMemberId(3);// 更新したい会員の会員ID
        member.setMemberName("testName");
        member.setVersionNo(versionNo);// 排他制御カラムの設定

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member afterMember = memberBhv.selectByPKValueWithDeletedCheck(3);
        log("onDatabase = " + afterMember.toString());
        log("onMemory   = " + member.toString());
        assertEquals(Long.valueOf(versionNo + 1), member.getVersionNo());
        assertEquals(afterMember.getVersionNo(), member.getVersionNo());

        // 【Description】
        // A. Setterが呼び出された項目(と自動設定項目)だけ更新
        // update MEMBER set MEMBER_NAME = 'testName' where ...
        // 
        // B. 共通カラムは設定不要。
        // member.setRegisterDatetime(registerDatetime); 
        // member.setUpdateUser(updateUser);
        //   ※事前にDBFluteの「共通カラム自動設定」機能の準備すること
        //   --> dbflute_exampledb/dfprop/commonColumnMap.dfprop
        // 
        // C. 排他制御カラム(VERSION_NOなど)が定義されていない場合は、排他制御なし更新になる。
        // D. すれ違いが発生した場合は例外発生。{EntityAlreadyUpdatedException}
        // E. 存在しないPK値を指定された場合はすれ違いが発生した場合と同じ。
        //    --> 排他制御の仕組み上、区別が付かないため
        // 
        // F. 更新後のEntityにはOnMemoryでインクリメントされたVersionNoが格納される。
        // 
        // G. 一意制約違反のときは、EntityAlreadyExistsExceptionが発生。(DBFlute-0.7.7より)
        //   ※JDBCドライバ依存であることに注意
        //   ※UniqueConstraintTest参考
    }

    /**
     * 排他制御なし一件更新: updateNonstrict().
     * 会員ID'3'の会員の名称を'testName'に更新
     */
    public void test_updateNonstrict() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);// 更新したい会員の会員ID
        member.setMemberName("testName");

        // ## Act ##
        memberBhv.updateNonstrict(member);

        // ## Assert ##
        Member afterMember = memberBhv.selectByPKValueWithDeletedCheck(3);
        log("onDatabase = " + afterMember.toString());
        log("onMemory   = " + member.toString());
        assertNull(member.getVersionNo());
        assertNotNull(afterMember.getVersionNo());

        // 【Description】
        // A. Setterが呼び出された項目(と自動設定項目)だけ更新
        // update MEMBER set MEMBER_NAME = 'testName' where ...
        // 
        // B. 共通カラムは設定不要。
        // member.setRegisterDatetime(registerDatetime); 
        // member.setUpdateUser(updateUser);
        //   ※事前にDBFluteの「共通カラム自動設定」機能の準備すること
        //   --> dbflute_exampledb/dfprop/commonColumnMap.dfprop
        // 
        // C. 存在しないPK値を指定された場合は例外発生。{EntityAlreadyDeletedException}
        // 
        // D. バージョンNOは設定不要(OnQueryでインクリメント「VERSION_NO = VERSION + 1」)
        // member.setVersionNo(versionNo);
        // 
        // E. 更新後のEntityのVersionNoは更新前と全く同じ値がそのまま保持される。
        // 
        // F. 一意制約違反のときは、EntityAlreadyExistsExceptionが発生。(DBFlute-0.7.7より)
        //   ※JDBCドライバ依存であることに注意
        //   ※UniqueConstraintTest参考
    }

    // -----------------------------------------------------
    //                                                Delete
    //                                                ------
    /**
     * 排他制御あり一件削除: delete().
     * 会員ID'3'の会員を削除。
     */
    public void test_delete() {
        // ## Arrange ##
        deleteMemberReferrer();// テストのためにReferrerを全部消す

        Member beforeMember = memberBhv.selectByPKValueWithDeletedCheck(3);
        Long versionNo = beforeMember.getVersionNo();// 排他制御のためにVersionNoを取得

        Member member = new Member();
        member.setMemberId(3);// 削除したい会員の会員ID
        member.setVersionNo(versionNo);// 排他制御カラムの設定

        // ## Act ##
        memberBhv.delete(member);

        // ## Assert ##
        try {
            memberBhv.selectByPKValueWithDeletedCheck(3);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }

        // [Description]
        // A. PKとVersionNoのみ評価されるため、他のカラムはnullでもよい。
        // B. すれ違いが発生した場合は例外発生。{EntityAlreadyUpdatedException}
        // C. 存在しないPK値を指定された場合はすれ違いが発生した場合と同じ。
        //    --> 排他制御の仕組み上、区別が付かないため
    }

    /**
     * 排他制御なし一件削除: deleteNonstrict(). 
     * 会員ID'3'の会員を削除。
     */
    public void test_deleteNonstrict() {
        // ## Arrange ##
        deleteMemberReferrer();// テストのためにReferrerを全部消す

        Member member = new Member();
        member.setMemberId(3);// 削除したい会員の会員ID

        // ## Act ##
        memberBhv.deleteNonstrict(member);

        // ## Assert ##
        try {
            memberBhv.selectByPKValueWithDeletedCheck(3);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }

        // [Description]
        // A. PKのみ評価されるため、他のカラムはnullでもよい。
        // B. 存在しないPK値を指定された場合は例外発生。{EntityAlreadyDeletedException}
    }

    /**
     * 既に削除済みであれば素通りする排他制御なし一件削除: deleteNonstrictIgnoreDeleted().
     * 存在しない会員ID'99999'の会員を削除。
     */
    public void test_deleteNonstrictIgnoreDeleted() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(99999);// 存在しない会員の会員ID(既に削除されたと仮定)

        // ## Act ##
        memberBhv.deleteNonstrictIgnoreDeleted(member);// 例外は発生しない

        // ## Assert ##
        try {
            memberBhv.selectByPKValueWithDeletedCheck(99999);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    // -----------------------------------------------------
    //                                                  List
    //                                                  ----
    /**
     * 外だしSQL(OutsideSql)の基本的な検索: outsideSql().selectList().
     * 会員名称が'S'で始まる会員をリスト検索。
     * <pre>
     * 【手順】
     * 1. exbhvパッケージにSQLファイルを作成する。
     * 
     * 　　パッケージ：src/main/resources配下のxxx.exbhvパッケージ
     * 　　ファイル名：[Behaviorクラス名]_[SQLを表現する任意の名称].sql
     *   　　ex) xxx/exbhv/MemberBhv_selectSimpleMember.sql
     * 　　エンコーディング：UTF-8 (デフォルトの設定)
     * 
     * 2. SQLファイルにSQLを2Way-SQLで実装する。
     * 
     * 　　＜意識すること＞
     * 　　o 2WaySQLで実装すること
     * 　　o 必要に応じてSql2Entityのコメントを追記すること
     * 
     *      ex) CustomizeEntity(戻り値)
     * 　　　 -- #Xxx#
     * 
     *      ex) ParameterBean(検索条件)
     * 　　　 -- !XxxPmb!
     * 　　　 -- !!String arg1!!
     * 
     * 　　※戻り値EntityがDomainEntityで事足りるならば、CustomizeEntity(戻り値)を生成する必要はない。
     * 　　※検索条件がない、もしくは、一つであるならば、ParameterBean(検索条件)を生成する必要はない。
     * 
     * 3. Sql2Entityを実行する。
     * 
     * 　　＜生成されるもの＞
     * 　　A. CustomizeEntity(戻り値)のクラス ※任意
     * 　　B. ParameterBean(検索条件)のクラス ※任意
     * 　　C. BehaviorQueryPath(SQLのパス)の定義
     * 
     * 4. BehaviorのoutsideSql()メソッドを利用してSQLを呼び出す。
     * 
     * 　　＜指定するもの＞
     * 　　第一引数(C)：SQLのパス
     * 　　第二引数(B)：検索条件
     * 　　第三引数(A)：戻り値の型
     * 
     * 　　※それぞれSql2Entityにて自動生成されたものを利用して指定する。
     * 　　※検索条件が無い場合は、第二引数にはnullを指定する。
     * 　　※検索条件が一つの場合は、第二引数には直接その値を指定する。
     * 　　　→ パラメータコメントの変数名も「pmb.xxx」ではなく「xxx」でよい。
     * 
     * 【特徴】
     * o SQLファイル名とプログラム上での指定が食い違うことがない。
     * 　- SQLファイル名を変更してSql2Entityを実行すると古いPath指定をコンパイルエラーで検知可能
     * 　- SQLファイル名の[Behaviorクラス名]で存在しないクラスを指定した場合は、Sql2Entityで明示的な例外
     * o SQLのSelect句定義と戻り値クラスの構造が食い違うことが無い。
     * o Sql2EntityでSQLの文法的な実行チェックが行われる。
     * o ParameterBeanでプロパティに空文字「""」が設定されてもそのプロパティの値はnullと同等に扱われる。
     * </pre>
     */
    public void test_outsideSql_selectList_selectSimpleMember() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_selectSimpleMember;

        // 検索条件
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        pmb.setMemberName_PrefixSearch("S");

        // 戻り値Entityの型
        Class<SimpleMember> entityType = SimpleMember.class;

        // ## Act ##
        // SQL実行！
        List<SimpleMember> memberList = memberBhv.outsideSql().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        log("{SimpleMember}");
        for (SimpleMember entity : memberList) {
            Integer memberId = entity.getMemberId();
            String memberName = entity.getMemberName();
            String memberStatusName = entity.getMemberStatusName();
            log("    " + memberId + ", " + memberName + ", " + memberStatusName);
            assertNotNull(memberId);
            assertNotNull(memberName);
            assertNotNull(memberStatusName);
            assertTrue(memberName.startsWith("S"));
        }
    }

    // -----------------------------------------------------
    //                                               Execute
    //                                               -------
    /**
     * 外だしSQL(OutsideSql)の基本的な更新: outsideSql().execute().
     * 会員名称が'S'で始まる会員を強制退会する。
     */
    public void test_outsideSql_execute_updateMemberChangedToWithdrawalForcedly() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_updateMemberChangedToWithdrawalForcedly;

        // 更新条件
        String pmb = "S";

        // ## Act ##
        int updatedCount = memberBhv.outsideSql().execute(path, pmb);

        // ## Assert ##
        log("updatedCount=" + updatedCount);
        assertNotSame(0, updatedCount);

        // [Description]
        // A. 手順は外だしSQLによる検索とほぼ同じである。
        //    --> 更新系には戻り値Entityという概念が存在しない。
        // 
        // B. insertでもupdateでもdeleteでも検索でないものは全てexecute()。
        //    --> その他truncateやmergeなど
        // 
        // C. 引数が一つの場合は、ParameterBeanは不要。
        //    --> 第二引数にベタっと値を指定して良い。
        //    --> パラメータコメントは/*pmb.xxx*/ではなく/*pmb*/とする。
        // 
        // D. 排他制御(VERSION_NOの+1含む)と共通カラムの自動設定は実行されない。
        //    --> 必要な場合は自前で処理する必要がある。
        // 
        // E. 主キー以外の条件での更新は必ず外だしSQLで実装する。
        //    --> 削除はConditionBeanによる削除(queryDelete)が可能である。
    }
}
