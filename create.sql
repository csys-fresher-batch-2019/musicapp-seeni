create table adminlogin(
email_id varchar2(40),
constraints admi_pk primary key(email_id),
password varchar2(40) not null
);




create table userlogin(
user_id number not null,
constraints uid_uk unique(user_id),
username varchar2(30) not null,
email_id varchar2(50) not null unique,
password varchar2(30) not null,
--constraint pwd_ck check(length(password)>=8),
constraints uname_pwd_uq unique(username,password),
constraints ename_pwd_uq unique(email_id,password),
mobile_no number not null,
constraint mno_ck check(mobile_no between 1000000000 and 9999999999)
);



create sequence song_seq start with 1 increment by 1;

create table song_list(
song_number number unique,
song_name varchar2(100) not null,
music_director varchar2(50) not null,
lyricist varchar2(20) not null,
singers varchar2(30) not null,
movie_name varchar2(40),
constraints mname_sname_uq unique(song_name,movie_name),
song_link varchar2(70) not null
);




create table userchoice(
user_id number not null,
constraints uid_fk foreign key(user_id) references userlogin(user_id),
song_sequence varchar2(30) default 'SEQUENCE',
constraints sseq_ck check(song_sequence in ('SHUFFLE ALL','SEQUENCE','REPEAT MODE')),
song_rating number not null,
constraints srating_ck check(song_rating between 0 and 5),
button varchar2(10) not null,
constraints button_ck check (button in ('PAUSE','PLAY')),
song_wants_to_play number not null,
--constraints wtp_fk foreign key(song_wants_to_play) references song_list(song_number),
add_to_favourites char(1),
constraints atf_ck check(add_to_favourites in('Y','N')),
premium_amount number default 400
);




CREATE TABLE ACCOUNT_INFO(
WANTS_TO_PREMIUM CHAR(1),
CONSTRAINTS WT_CK CHECK(WANTS_TO_PREMIUM IN('Y','N')),
ACCOUNT_NO VARCHAR(16) NOT NULL UNIQUE,
DEBIT_CARD NUMBER,
CVV NUMBER,
CONSTRAINTS CVV_DC_UK UNIQUE(DEBIT_CARD,CVV),
EXPIRY_MONTH NUMBER,
EXPIRY_YEAR NUMBER,
--CONSTRAINTS AC_NO_CK CHECK(LENGTH(ACCOUNT_NO)==16),
USER_ID NUMBER NOT NULL,
CONSTRAINTS UI_FK FOREIGN KEY(USER_ID) REFERENCES USERLOGIN(USER_ID),
BALANCE NUMBER NOT NULL,
CONSTRAINTS BAL_CK CHECK(BALANCE>=0),
RECHARGED_DATE DATE,
UPTO_DATE DATE,
SONG_DOWNLOAD VARCHAR(3),
CONSTRAINTS SD_CK CHECK(SONG_DOWNLOAD IN('YES','NO')),
PREMIUM CHAR(1),
CONSTRAINTS PR_CK CHECK(PREMIUM IN('Y','N')),
REMAINING_BAL NUMBER
);