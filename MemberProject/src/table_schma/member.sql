CREATE TABLE MEMBER (
	idx		NUMBER			PRIMARY KEY,
	name	VARCHAR2(15)	NOT NULL,
	phone	VARCHAR2(15)
);
CREATE SEQUENCE mp_idx START WITH 1 INCREMENT BY 1 NOCYCLE NOCACHE
;