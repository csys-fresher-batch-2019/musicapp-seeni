insert into adminlogin(email_id,password) values('bala@gmail.com','bala1234');
insert into adminlogin(email_id,password) values('ramesh@gmail.com','ramesh123');





insert into userlogin(user_id,username,email_id,password,mobile_no) values(uid_seq.nextval,'SATHISH','s@gmail.com',12345678,9182734579);
insert into userlogin(user_id,username,email_id,password,mobile_no) values(uid_seq.nextval,'RAJU','r@gmail.com',87654321,9127287587);
insert into userlogin(user_id,username,email_id,password,mobile_no) values(uid_seq.nextval,'RAJ','ra@gmail.com',12676831,9387892572);






insert into song_list(song_number,song_name,music_director,lyricist,singers,movie_name,song_link)
values(song_seq.nextval,'KADHAL AASAI','YUVAN SHANKAR RAJA','KABILAN','YUVAN SHANKAR RAJA','ANJAAN','myAudio.mp3');
insert into song_list(song_number,song_name,music_director,lyricist,singers,movie_name,song_link) 
values(song_seq.nextval,'ALAPPORAN TAMILAN','AR RAHMAN','VIVEK','SATHYA PRAKASH','MERSAL','Aalaporaan.mp3');
insert into song_list(song_number,song_name,music_director,lyricist,singers,song_link) 
values(song_seq.nextval,'OH BABY','JUSTIN BIEBER','JUSTIN BIEBER','JUSTIN BIEBER','baby.mp3');
insert into song_list(song_number,song_name,music_director,lyricist,singers,movie_name,song_link)
values(song_seq.nextval,'JAI HO','AR RAHMAN','AR RAHMAN','AR RAHMAN','SLUMDOG MILLIONAIRE','jai ho.mp3');






insert into userchoice(user_id,song_sequence,song_rating,button,song_wants_to_play,add_to_favourites) values(100,'SHUFFLE ALL',4.5,'PLAY',3,'Y');
insert into userchoice(user_id,song_sequence,song_rating,button,song_wants_to_play,add_to_favourites) values(101,'SEQUENCE',2.5,'PAUSE',1,'N');
insert into userchoice(user_id,song_sequence,song_rating,button,song_wants_to_play,add_to_favourites) values(102,'SEQUENCE',3,'PAUSE',1,'Y');






INSERT INTO ACCOUNT_INFO(WANTS_TO_PREMIUM,ACCOUNT_NO,DEBIT_CARD,CVV,EXPIRY_MONTH,EXPIRY_YEAR,USER_ID,BALANCE) VALUES('Y',1234567890123456,6078897645231287,432,04,2024,101,500);
INSERT INTO ACCOUNT_INFO(WANTS_TO_PREMIUM,ACCOUNT_NO,DEBIT_CARD,CVV,EXPIRY_MONTH,EXPIRY_YEAR,USER_ID,BALANCE) VALUES('Y',3948123456789019,3214563245625543,342,10,2020,100,300);
INSERT INTO ACCOUNT_INFO(WANTS_TO_PREMIUM,ACCOUNT_NO,DEBIT_CARD,CVV,EXPIRY_MONTH,EXPIRY_YEAR,USER_ID,BALANCE) VALUES('Y',1981234156273890,2366556674556622,567,11,2022,102,400);
