[ VIEW ]
  : 다른 테이블이나 뷰에 포함된 맞춤표현(virtual table)
    join하는 테이블의 수가 늘어나거나 질의문이 길고 복잡해지면 작성이 어려워지고 유지보수가 
    어려울수 있다. 
    이럴때 스크립트를 만들어두거나 stored query를 사용해서
    데이터베이스 서버에 저장해두면 필요할때 마다 호출해서 사용할수 있다

   - 자체적으로 데이터를 포함하지 않는다
   - 베이스테이블(Base table) : 뷰를 통해 보여지는 실제테이블
   - 선택적인 정보만 제공 가능

[형식]
create [or  replace] [force | noforce ] view  뷰이름 [(alias [,alias,.....)]
as 서브쿼리
[with check option [constraint 제약조건이름]]
[with read only [constraint 제약조건이름]]

  - create or replace : 지정한 이름의 뷰가 없으면 새로생성,동일이름이 있으면 수정
  - force | noforce
          force   : 베이스테이블이 존재하는 경우에만 뷰생성가능
          noforce : 베이스테이블이 존재하지 않아도 뷰생성가능
  - alias  
        뷰에서 생성할 표현식 이름(테이블의 컬럼이름 의미)
        생략하면 서브쿼리의 이름적용
        alias의 갯수는 서브쿼리의 갯수와 동일해야함
  - 서브쿼리 : 뷰에서 표현하는 데이터를 생성하는 select구문
  - 제약조건 
        with check option : 뷰를 통해 접근가능한 데이터에 대해서만 DML작업가능
        with read only : 뷰를 통해 DML작업안됨
        제약조건으로 간주되므로 별도의 이름지정가능


[뷰 - 인라인(inline)개념]  
  : 별칭을 사용하는 서브쿼리 (일반적으로 from절에서 사용)

[뷰 - Top N분석]
  Top N분석 : 조건에 맞는 최상위(최하위) 레코드를 N개 식별해야 하는 경우에 사용
   예) 최상위 소득자3명
        최근 6개월동안 가장 많이 팔린 제품3가지
       실적이 가장 좋은 영업사원 5명
   
   오라클에서 Top N분석원리
      - 원하는 순서대로 정렬
      - rownum 이라는 가상의컬럼을 이용하여 순서대로 순번부여
      - 부여된 순번을 이용하여 필요한수 만큼 식별
      - rownum값으로 특정행을 선택할수 없음
        (단, Result Set  1st  행(rownum=1)은 선택가능)
===============================================================================
-- HR 계정으로 로그인
--ex1) 사원테이블에서 부서가 90인 사원들을 v_view1으로 뷰테이블을 만드시오
     (사원ID,사원이름,급여,부서ID만 추가)
CREATE OR REPLACE VIEW V_VIEW1
AS SELECT employee_id, last_name, salary, department_id FROM EMPLOYEES WHERE department_id = 90
;
SELECT
	*
FROM
	V_VIEW1
;
--ex2) 사원테이블에서 급여가  5000이상 10000이하인 사원들만 v_view2으로 뷰를 만드시오
--    (사원ID , 사원이름, 급여, 부서ID)
CREATE OR REPLACE VIEW V_VIEW2
AS SELECT employee_id, last_name, salary, department_id FROM EMPLOYEES WHERE salary >= 5000 AND salary <= 10000
;
SELECT
	*
FROM
	V_VIEW2
;
--ex3) v_view2 테이블에서  103사원의 급여를 9000.00에서 12000.00으로 수정하시오
UPDATE V_VIEW2 SET 
	salary = 12000.00
WHERE
	employee_id = 103
;
SELECT
	*
FROM
	V_VIEW2
;	--	VIEW 에서 103 번 사원이 사라짐

UPDATE EMPLOYEES SET
	salary = 9000
WHERE
	employee_id = 103
;

SELECT
	*
FROM
	EMPLOYEES
WHERE
	employee_id = 103
;	--	기존 테이블의 값도 수정
--ex4)사원테이블과 부서테이블에서 사원번호,사원명,부서명을 v_view3로 뷰테이블을만드시오
--     조건1) 부서가 10,90인 사원만 표시하시오
--     조건2) 타이틀은  사원번호, 이름, 부서이름으로 출력하시오
--     조건3) 사원번호로 오름차순정렬하시오
CREATE OR REPLACE VIEW V_VIEW3
AS SELECT employee_id AS 사원번호, last_name AS 이름, department_name AS 부서명 
	FROM EMPLOYEES JOIN DEPARTMENTS USING(department_id) WHERE department_id IN (10, 90)
	ORDER BY 1
;
SELECT
	*
FROM
	V_VIEW3
;
--ex5) 부서ID가 10,90번 부서인 사원들의 부서 위치를 표시하시오
--     조건1) v_view4로 뷰테이블을 만드시오
--     조건2) 타이틀을  사원번호,사원명,급여,입사일,부서명,부서위치(city)로 표시하시오
--     조건3) 사원번호순으로 오름차순정렬하시오
--     조건4) 급여는 천단위절삭하고,세자리마다 콤마와 '달러'을 표시하시오
--     조건5) 입사일은  '2004년 10월 02일' 형식으로 표시하시오  
CREATE OR REPLACE VIEW V_VIEW4
AS
	SELECT employee_id AS 사원번호, last_name AS 사원명, TO_CHAR(TRUNC(salary, -3), '999,999,999') || '달러' AS 급여, 
		TO_CHAR(hire_date, 'YYYY"년" MM"월" DD"일"') AS 입사일, department_name AS 부서명, city AS 부서위치
	FROM EMPLOYEES JOIN DEPARTMENTS USING(department_id) JOIN LOCATIONS USING(location_id)
	WHERE department_id IN (10, 90) ORDER BY 1
;
SELECT
	*
FROM
	V_VIEW4
;
DROP VIEW V_VIEW4
;
--ex6) 뷰에 제약조건달기
--사원테이블에서 업무ID가 'IT_PROG'인 사원들의  사원번호,이름,업무ID만 v_view5 뷰테이블을 작성하시오, 
--단 수정불가의 제약조건을 추가하시오
CREATE OR REPLACE VIEW V_VIEW5
AS
	SELECT employee_id, last_name, job_id FROM EMPLOYEES WHERE job_id = 'IT_PROG'
WITH READ ONLY
;
SELECT
	*
FROM
	USER_CONSTRAINTS
WHERE
	table_name = 'V_VIEW5'
;
DELETE FROM V_VIEW5
WHERE employee_id = 103
;	-- DML 작업이 안된다.
--ex7) 뷰에 제약조건달기
--사원테이블에서 업무ID가 'IT_PROG'인 사원들의 사원번호,이름,이메일,입사일,업무ID만 
--v_view6 뷰테이블을 작성하시오 
--단 업무ID가 'IT_PROG'인 사원들만 추가,수정할수 있는 제약조건을 추가하시오
CREATE OR REPLACE VIEW V_VIEW6(사원번호, 이름, 이메일, 입사일, 업무ID)
AS
	SELECT employee_id, last_name, email, hire_date, job_id FROM EMPLOYEES WHERE job_id = 'IT_PROG'
WITH CHECK OPTION
;
INSERT INTO V_VIEW6(사원번호, 이름, 이메일, 입사일, 업무ID)
VALUES (500, 'kim', 'abcd', '2023-01-25', 'SA_REP')
;	--	'SA_REP'의 job_id 를 가진 행은 추가할 수 없다.
UPDATE V_VIEW6 SET 
	업무ID = 'SA_REP' 
WHERE
	사원번호 = 103
;	--	UPDATE 도 불가능
SELECT
	*
FROM
	USER_CONSTRAINTS
WHERE
	table_name = 'V_VIEW6'
;
SELECT
	*
FROM
	V_VIEW6
;
--==========================================================================================================================
--[문제]  계정  edu로 바꾸시오
--테이블명 : bookshop
--isbn         varchar2(10)       기본키 (제약조건명:PISBN)            ISBN
--title         varchar2(50)        널값허용X (제약조건명:CTIT)          책제목
--author     varchar2(50)                                                    저자 
--price        number                                                           금액
--company    varchar2(30)                                                 출판사
CREATE TABLE BOOKSHOP(
	isbn	VARCHAR2(10)	CONSTRAINT PISBN	PRIMARY KEY,
	title 	VARCHAR2(50)	CONSTRAINT CTIT		NOT NULL,
	author	VARCHAR2(50),
	price	NUMBER,
	company	VARCHAR2(30)
);
--is001     자바3일완성                    김자바     25000   야메루출판사
--pa002     JSP달인되기                   이달인     28000   공갈닷컴
--or003     오라클무작정따라하기       박따라     23500   야메루출판사
INSERT INTO BOOKSHOP
VALUES ('is001', '자바3일완성', '김자바', 25000, '야메루출판사')
;
INSERT INTO BOOKSHOP
VALUES ('pa002', 'JSP달인되기', '이달인', 28000, '공갈닷컴')
;
INSERT INTO BOOKSHOP
VALUES ('or003', '오라클무작정따라하기', '박따라', 23500, '야메루출판사')
;
COMMIT
-------------------------------------------------------------------------------
--테이블명 : bookorder

--idx        number                     primary key          일련번호 (주문번호)        
--isbn      varchar2(10)                                         외래키(제약조건명 : FKISBN)      bookshop의 isbn의 자식키
--qty        number                                              수량
---------------------------------------------------------------------------------
--시퀀스명 : idx_seq   증가값: 1  시작값 1

--1          is001     2
--2          or003     3
--3          pa002     5
--4          is001     3
--5          or003    10
CREATE SEQUENCE idx_seq
START WITH 1 INCREMENT BY 1 NOCYCLE NOCACHE
;

CREATE TABLE BOOKORDER(
	idx		NUMBER			PRIMARY KEY,
	isbn	VARCHAR2(10)	CONSTRAINT FKISBN REFERENCES BOOKSHOP,
	qty		NUMBER
);
INSERT INTO BOOKORDER
VALUES (idx_seq.NEXTVAL, 'is001', 2);
INSERT INTO BOOKORDER
VALUES (idx_seq.NEXTVAL, 'or003', 3);
INSERT INTO BOOKORDER
VALUES (idx_seq.NEXTVAL, 'pa002', 5);
INSERT INTO BOOKORDER
VALUES (idx_seq.NEXTVAL, 'is001', 3);
INSERT INTO BOOKORDER
VALUES (idx_seq.NEXTVAL, 'or003', 10);
COMMIT
--뷰 명 : bs_view

--책제목        저자      총판매금액 
-----------------------------------------                           
--조건1)  총판매금액은  qty * price로 하시오       
--조건2) 수정불가의 제약조건을 추가하시오
CREATE OR REPLACE VIEW BS_VIEW(책제목, 저자, 총판매금액)
AS
	SELECT title, author, SUM(qty * price) FROM BOOKSHOP JOIN BOOKORDER USING(isbn) GROUP BY title, author
WITH READ ONLY
;
SELECT
	*
FROM
	BS_VIEW
;
--=====================================================================================================
--HR계정으로 변경
--ex8) 
--사원테이블을 가지고 부서별 평균급여를 뷰(v_view7)로 작성하시오
--조건1) 반올림해서 1000단위까지 구하시오
--조건2) 타이틀은  부서ID,부서평균
--조건3) 부서별로 오름차순정렬하시오
--조건4) 부서ID가 없는 경우 5000으로 표시하시오
CREATE OR REPLACE VIEW V_VIEW7(부서ID, 부서평균)
AS
	SELECT NVL(department_id, 5000), ROUND(AVG(salary), -3) FROM EMPLOYEES GROUP BY department_id ORDER BY 1 
;
SELECT
	*
FROM
	V_VIEW7
;
--ex9)인라인 뷰 - FROM 절에 테이블이름이 아닌 서브쿼리가 등장
--부서별 최대급여를 받는 사원의 부서명,최대급여를 출력하시오
SELECT
	department_name,
	MAX(salary)
FROM
	(SELECT department_id, department_name FROM DEPARTMENTS)
JOIN EMPLOYEES USING(department_id)
GROUP BY department_name
;
--ex10) Top N분석
--급여를 가장많이 받는 사원3명의 이름,급여를 표시하시오
--SELECT rownum FROM EMPLOYEES;
SELECT
	rownum,
	last_name,
	salary
FROM
	(SELECT last_name, salary FROM EMPLOYEES ORDER BY 2 DESC)
WHERE
	rownum <= 3
;
--ex11) 최고급여를 받는 사원1명을 구하시오
SELECT
	rownum,
	last_name,
	salary
FROM
	(SELECT last_name, salary FROM EMPLOYEES ORDER BY 2 DESC)
WHERE
	rownum = 1
;
WITH EXAMPLE AS
	(SELECT 
		rownum AS 등수,
		last_name,
		salary
	FROM
		(SELECT last_name, salary FROM EMPLOYEES ORDER BY 2 DESC)
	WHERE
		rownum <= 3
)
SELECT
	last_name,
	salary
FROM EXAMPLE
WHERE
	등수 = 2
;
--rownum 은 쿼리 결과를 하나씩 출력하면서 번호(rownum)를 부여
--ex12) 급여의 순위를 내림차순정렬했을때, 3개씩 묶어서 2번째 그룹을 출력하시오
--      (4,5,6 순위의 사원출력  ==> 페이징처리기법) 
SELECT
	employee_id,
	last_name,
	salary,
	page
FROM
	(SELECT tt.*, ceil(rownum / 3) AS page FROM 
		(SELECT * FROM EMPLOYEES ORDER BY salary DESC) tt)
WHERE
	page = 2
;
--ex13) 사원들의 연봉을 구한후 최하위 연봉자 5명을 추출하시오
--      조건1) 연봉 = 급여*12+(급여*12*커미션)
--      조건2) 타이틀은  사원이름 , 부서명, 연봉
--      조건3) 연봉은  $25,000  형식으로 하시오

-- 사원이름     부서명     연봉
-- -------------------------------
--Olson	        Shipping     $25,200
--Markle        Shipping     $26,400
--Philtanker    Shipping     $26,400
--Gee           Shipping     $28,800
--Landry        Shipping     $28,800
SELECT
	last_name AS 사원이름,
	department_name AS 부서명,
	TO_CHAR(연봉, '$99,999') AS 연봉
FROM
	(SELECT last_name, department_name, salary * 12 + (salary * 12 * NVL(commission_pct, 0)) AS 연봉
	FROM EMPLOYEES LEFT JOIN DEPARTMENTS USING(department_id) ORDER BY 3)
WHERE
	rownum <= 5
; -- 이 쿼리가 조인을 한 뒤에 필터링과 정렬을 하였기 때문에 좀 더 효율적인 코드다. by Chat GPT
SELECT
	last_name AS 사원이름,
	department_name AS 부서명,
	TO_CHAR(연봉, '$99,999') AS 연봉
FROM
	(SELECT last_name, department_id, salary * 12 + (salary * 12 * NVL(commission_pct, 0)) AS 연봉
	FROM EMPLOYEES ORDER BY 3)
LEFT JOIN DEPARTMENTS USING(department_id) 
WHERE
	rownum <= 5
;





































