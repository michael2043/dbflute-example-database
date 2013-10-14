/*
 [df:title]
 Manual Paging Example for SQLServer
 
 [df:description]
 This SQL uses 'rownum'.
*/
-- #df:entity#

-- !df:pmb extends SPB!
-- !!Integer memberId!!
-- !!List<String> memberNameList:likePrefix!!

/*IF pmb.isPaging()*/
select *
  from (
select plain.*, row_number() over(order by plain.PURCHASE_MAX_PRICE desc, plain.MEMBER_ID asc) as rn
  from (
select member.MEMBER_ID
     , member.MEMBER_NAME
     , (select max(purchase.PURCHASE_PRICE)
          from PURCHASE purchase
         where purchase.MEMBER_ID = member.MEMBER_ID
       ) as PURCHASE_MAX_PRICE
     , memberStatus.MEMBER_STATUS_NAME
-- ELSE select count(*)
/*END*/
  from MEMBER member
    /*IF pmb.isPaging()*/
    left outer join MEMBER_STATUS memberStatus
      on member.MEMBER_STATUS_CODE = memberStatus.MEMBER_STATUS_CODE
    /*END*/
 /*BEGIN*/where
   /*IF pmb.memberId != null*/
   member.MEMBER_ID = /*pmb.memberId*/3
   /*END*/
   /*FOR pmb.memberNameList*//*FIRST*/and (/*END*/
     /*NEXT 'or '*/member.MEMBER_NAME like /*#current*/'S%'
   /*LAST*/)/*END*//*END*/
 /*END*/
 /*IF pmb.isPaging()*/
       ) plain
       ) ext
 where ext.rn > /*pmb.pageStartIndex*/80
   and ext.rn <= /*pmb.pageEndIndex*/100
 order by ext.rn asc
 /*END*/