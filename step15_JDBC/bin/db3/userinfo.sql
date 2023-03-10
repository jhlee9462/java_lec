SELECT * FROM TAB
;

CREATE TABLE USERINFO (
	num			NUMBER(5)		PRIMARY KEY,
	id			VARCHAR2(10) 	UNIQUE,
	passwd		VARCHAR2(10)	NOT NULL,
	name		VARCHAR2(10)	NOT NULL,
	score		NUMBER(7, 2)	CHECK(score >= 0 AND score <= 100)
);

CREATE SEQUENCE stu_seq START WITH 1 INCREMENT BY 1 NOCYCLE NOCACHE
;

INSERT INTO USERINFO 
VALUES (stu_seq.NEXTVAL, 'aa', '1111', 'kim', 75.4)
;
INSERT INTO USERINFO 
VALUES (stu_seq.NEXTVAL, 'bb', '2222', 'lee', 90.5)
;

SELECT * FROM USERINFO
;

SELECT * FROM USERINFO WHERE name = 'bb';