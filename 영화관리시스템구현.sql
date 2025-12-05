--------------------------------------------------------
--  파일이 생성됨 - 수요일-12월-03-2025   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table 리뷰
--------------------------------------------------------

  CREATE TABLE "C##MOVIE"."리뷰" 
   (	"글번호" VARCHAR2(20 BYTE), 
	"글제목" VARCHAR2(20 BYTE), 
	"글내용" VARCHAR2(200 BYTE), 
	"작성일시" DATE, 
	"평점" NUMBER(*,0), 
	"아이디" VARCHAR2(20 BYTE), 
	"영화번호" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table 상영관
--------------------------------------------------------

  CREATE TABLE "C##MOVIE"."상영관" 
   (	"상영관번호" VARCHAR2(20 BYTE), 
	"총좌석수" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table 상영정보
--------------------------------------------------------

  CREATE TABLE "C##MOVIE"."상영정보" 
   (	"상영번호" VARCHAR2(20 BYTE), 
	"상영일시" DATE, 
	"상영관번호" VARCHAR2(20 BYTE), 
	"영화번호" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table 영화
--------------------------------------------------------

  CREATE TABLE "C##MOVIE"."영화" 
   (	"영화번호" VARCHAR2(20 BYTE), 
	"영화제목" VARCHAR2(50 BYTE), 
	"상영시간" NUMBER(*,0), 
	"장르" VARCHAR2(20 BYTE), 
	"관람등급" VARCHAR2(10 BYTE) DEFAULT '15세'
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table 예매
--------------------------------------------------------

  CREATE TABLE "C##MOVIE"."예매" 
   (	"예매번호" VARCHAR2(20 BYTE), 
	"예매일시" DATE, 
	"결제금액" NUMBER(*,0), 
	"좌석번호" VARCHAR2(10 BYTE), 
	"아이디" VARCHAR2(20 BYTE), 
	"상영번호" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table 좌석
--------------------------------------------------------

  CREATE TABLE "C##MOVIE"."좌석" 
   (	"좌석번호" VARCHAR2(10 BYTE), 
	"상영관번호" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table 회원
--------------------------------------------------------

  CREATE TABLE "C##MOVIE"."회원" 
   (	"아이디" VARCHAR2(20 BYTE), 
	"비밀번호" VARCHAR2(20 BYTE), 
	"이름" VARCHAR2(20 BYTE), 
	"전화번호" VARCHAR2(20 BYTE), 
	"등급" VARCHAR2(10 BYTE) DEFAULT 'basic', 
	"적립금" NUMBER(*,0) DEFAULT 0, 
	"권한" VARCHAR2(10 BYTE) DEFAULT 'user'
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into C##MOVIE."리뷰"
SET DEFINE OFF;
Insert into C##MOVIE."리뷰" ("글번호","글제목","글내용","작성일시","평점","아이디","영화번호") values ('RV001','재밌다','닉이랑 주디 너무 귀엽다',to_date('25/11/26','RR/MM/DD'),5,'hhs01','a001');
Insert into C##MOVIE."리뷰" ("글번호","글제목","글내용","작성일시","평점","아이디","영화번호") values ('RV002','꿀잼','속편 기대돼요',to_date('25/11/26','RR/MM/DD'),5,'hhs01','a003');
REM INSERTING into C##MOVIE."상영관"
SET DEFINE OFF;
Insert into C##MOVIE."상영관" ("상영관번호","총좌석수") values ('T01',100);
Insert into C##MOVIE."상영관" ("상영관번호","총좌석수") values ('T02',130);
REM INSERTING into C##MOVIE."상영정보"
SET DEFINE OFF;
Insert into C##MOVIE."상영정보" ("상영번호","상영일시","상영관번호","영화번호") values ('S001',to_date('25/12/01','RR/MM/DD'),'T01','a001');
Insert into C##MOVIE."상영정보" ("상영번호","상영일시","상영관번호","영화번호") values ('S002',to_date('25/12/02','RR/MM/DD'),'T01','a003');
Insert into C##MOVIE."상영정보" ("상영번호","상영일시","상영관번호","영화번호") values ('S003',to_date('25/12/02','RR/MM/DD'),'T02','a002');
REM INSERTING into C##MOVIE."영화"
SET DEFINE OFF;
Insert into C##MOVIE."영화" ("영화번호","영화제목","상영시간","장르","관람등급") values ('a004','기생충',131,'drama','15세');
Insert into C##MOVIE."영화" ("영화번호","영화제목","상영시간","장르","관람등급") values ('a005','어쩔수가없다',139,'thriller','15세');
Insert into C##MOVIE."영화" ("영화번호","영화제목","상영시간","장르","관람등급") values ('a006','위키드',160,'fantasy','전체');
Insert into C##MOVIE."영화" ("영화번호","영화제목","상영시간","장르","관람등급") values ('a007','안녕',150,'comedy','전체');
Insert into C##MOVIE."영화" ("영화번호","영화제목","상영시간","장르","관람등급") values ('a001','주토피아',108,'animation','전체');
Insert into C##MOVIE."영화" ("영화번호","영화제목","상영시간","장르","관람등급") values ('a002','주토피아2',108,'animation','전체');
Insert into C##MOVIE."영화" ("영화번호","영화제목","상영시간","장르","관람등급") values ('a003','나우유씨미3',112,'action','12세');
REM INSERTING into C##MOVIE."예매"
SET DEFINE OFF;
Insert into C##MOVIE."예매" ("예매번호","예매일시","결제금액","좌석번호","아이디","상영번호") values ('R001',to_date('25/11/26','RR/MM/DD'),12000,'T01-A1','hhs01','S001');
Insert into C##MOVIE."예매" ("예매번호","예매일시","결제금액","좌석번호","아이디","상영번호") values ('R002',to_date('25/11/26','RR/MM/DD'),12000,'T01-A2','kjy01','S001');
Insert into C##MOVIE."예매" ("예매번호","예매일시","결제금액","좌석번호","아이디","상영번호") values ('R003',to_date('25/11/26','RR/MM/DD'),12000,'T02-B2','kjy01','S003');
REM INSERTING into C##MOVIE."좌석"
SET DEFINE OFF;
Insert into C##MOVIE."좌석" ("좌석번호","상영관번호") values ('T01-A1','T01');
Insert into C##MOVIE."좌석" ("좌석번호","상영관번호") values ('T01-A2','T01');
Insert into C##MOVIE."좌석" ("좌석번호","상영관번호") values ('T01-B1','T01');
Insert into C##MOVIE."좌석" ("좌석번호","상영관번호") values ('T01-B2','T01');
Insert into C##MOVIE."좌석" ("좌석번호","상영관번호") values ('T02-A1','T02');
Insert into C##MOVIE."좌석" ("좌석번호","상영관번호") values ('T02-A2','T02');
Insert into C##MOVIE."좌석" ("좌석번호","상영관번호") values ('T02-B1','T02');
Insert into C##MOVIE."좌석" ("좌석번호","상영관번호") values ('T02-B2','T02');
REM INSERTING into C##MOVIE."회원"
SET DEFINE OFF;
Insert into C##MOVIE."회원" ("아이디","비밀번호","이름","전화번호","등급","적립금","권한") values ('abc111','qwer1234','관리자','01012345678','vip',50000,'admin');
Insert into C##MOVIE."회원" ("아이디","비밀번호","이름","전화번호","등급","적립금","권한") values ('hello','hi1234','김인공','01099990000','gold',6000,'user');
Insert into C##MOVIE."회원" ("아이디","비밀번호","이름","전화번호","등급","적립금","권한") values ('hhs01','1234','현혜수','01011112222','basic',0,'user');
Insert into C##MOVIE."회원" ("아이디","비밀번호","이름","전화번호","등급","적립금","권한") values ('kjy01','5678','김재영','01033334444','basic',500,'user');
--------------------------------------------------------
--  DDL for Index SYS_C008507
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##MOVIE"."SYS_C008507" ON "C##MOVIE"."리뷰" ("글번호") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008480
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##MOVIE"."SYS_C008480" ON "C##MOVIE"."상영관" ("상영관번호") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008487
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##MOVIE"."SYS_C008487" ON "C##MOVIE"."상영정보" ("상영번호") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008477
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##MOVIE"."SYS_C008477" ON "C##MOVIE"."영화" ("영화번호") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008496
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##MOVIE"."SYS_C008496" ON "C##MOVIE"."예매" ("예매번호") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008482
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##MOVIE"."SYS_C008482" ON "C##MOVIE"."좌석" ("좌석번호") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008470
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##MOVIE"."SYS_C008470" ON "C##MOVIE"."회원" ("아이디") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table 리뷰
--------------------------------------------------------

  ALTER TABLE "C##MOVIE"."리뷰" MODIFY ("글제목" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."리뷰" MODIFY ("글내용" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."리뷰" MODIFY ("작성일시" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."리뷰" MODIFY ("평점" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."리뷰" MODIFY ("아이디" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."리뷰" MODIFY ("영화번호" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."리뷰" ADD CHECK (평점 BETWEEN 1 AND 5) ENABLE;
  ALTER TABLE "C##MOVIE"."리뷰" ADD PRIMARY KEY ("글번호")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table 상영관
--------------------------------------------------------

  ALTER TABLE "C##MOVIE"."상영관" MODIFY ("총좌석수" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."상영관" ADD CHECK (총좌석수 >= 0) ENABLE;
  ALTER TABLE "C##MOVIE"."상영관" ADD PRIMARY KEY ("상영관번호")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table 상영정보
--------------------------------------------------------

  ALTER TABLE "C##MOVIE"."상영정보" MODIFY ("상영일시" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."상영정보" MODIFY ("상영관번호" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."상영정보" MODIFY ("영화번호" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."상영정보" ADD PRIMARY KEY ("상영번호")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table 영화
--------------------------------------------------------

  ALTER TABLE "C##MOVIE"."영화" MODIFY ("영화제목" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."영화" MODIFY ("상영시간" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."영화" MODIFY ("장르" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."영화" MODIFY ("관람등급" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."영화" ADD CHECK (상영시간 >= 0) ENABLE;
  ALTER TABLE "C##MOVIE"."영화" ADD CHECK (관람등급 IN ('전체','12세','15세','19세')) ENABLE;
  ALTER TABLE "C##MOVIE"."영화" ADD PRIMARY KEY ("영화번호")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table 예매
--------------------------------------------------------

  ALTER TABLE "C##MOVIE"."예매" MODIFY ("예매일시" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."예매" MODIFY ("결제금액" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."예매" MODIFY ("좌석번호" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."예매" MODIFY ("아이디" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."예매" MODIFY ("상영번호" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."예매" ADD CHECK (결제금액 >= 0) ENABLE;
  ALTER TABLE "C##MOVIE"."예매" ADD PRIMARY KEY ("예매번호")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table 좌석
--------------------------------------------------------

  ALTER TABLE "C##MOVIE"."좌석" MODIFY ("상영관번호" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."좌석" ADD PRIMARY KEY ("좌석번호")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table 회원
--------------------------------------------------------

  ALTER TABLE "C##MOVIE"."회원" MODIFY ("비밀번호" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."회원" MODIFY ("이름" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."회원" MODIFY ("전화번호" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."회원" MODIFY ("등급" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."회원" MODIFY ("적립금" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."회원" MODIFY ("권한" NOT NULL ENABLE);
  ALTER TABLE "C##MOVIE"."회원" ADD CHECK (등급 IN ('basic','gold','vip')) ENABLE;
  ALTER TABLE "C##MOVIE"."회원" ADD CHECK (적립금 >= 0) ENABLE;
  ALTER TABLE "C##MOVIE"."회원" ADD CHECK (권한 IN ('user','admin')) ENABLE;
  ALTER TABLE "C##MOVIE"."회원" ADD PRIMARY KEY ("아이디")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table 리뷰
--------------------------------------------------------

  ALTER TABLE "C##MOVIE"."리뷰" ADD FOREIGN KEY ("아이디")
	  REFERENCES "C##MOVIE"."회원" ("아이디") ENABLE;
  ALTER TABLE "C##MOVIE"."리뷰" ADD FOREIGN KEY ("영화번호")
	  REFERENCES "C##MOVIE"."영화" ("영화번호") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table 상영정보
--------------------------------------------------------

  ALTER TABLE "C##MOVIE"."상영정보" ADD FOREIGN KEY ("상영관번호")
	  REFERENCES "C##MOVIE"."상영관" ("상영관번호") ENABLE;
  ALTER TABLE "C##MOVIE"."상영정보" ADD FOREIGN KEY ("영화번호")
	  REFERENCES "C##MOVIE"."영화" ("영화번호") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table 예매
--------------------------------------------------------

  ALTER TABLE "C##MOVIE"."예매" ADD FOREIGN KEY ("좌석번호")
	  REFERENCES "C##MOVIE"."좌석" ("좌석번호") ENABLE;
  ALTER TABLE "C##MOVIE"."예매" ADD FOREIGN KEY ("아이디")
	  REFERENCES "C##MOVIE"."회원" ("아이디") ENABLE;
  ALTER TABLE "C##MOVIE"."예매" ADD FOREIGN KEY ("상영번호")
	  REFERENCES "C##MOVIE"."상영정보" ("상영번호") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table 좌석
--------------------------------------------------------

  ALTER TABLE "C##MOVIE"."좌석" ADD FOREIGN KEY ("상영관번호")
	  REFERENCES "C##MOVIE"."상영관" ("상영관번호") ENABLE;
