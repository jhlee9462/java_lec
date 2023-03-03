※ select 
select [distinct] [컬럼1,컬럼2,.....][as 별명][ || 연산자][*]  --- 6
from 테이블명     --- 1
[where 조건절]    --- 2
[group by컬럼명]  --- 3
[having 조건절]   --- 4
[order by 컬럼명 asc|desc ]  --- 5

group by : 그룹함수(max,min,sum,avg,count..)와 같이 사용
having : 묶어놓은 그룹의 조건절
==================================================================================
--ex1) 사원테이블에서 급여의 평균을 구하시오
--     조건)소수이하는 절삭,세자리마다 콤마(,)
--     사원급여평균
--     ------------
--            6,461
SELECT
	to_char(TRUNC(avg(salary)), '999,999') AS 사원급여평균
FROM
	EMPLOYEES;
--ex2) 부서별로 급여평균을 구해서 부서ID, 급여평균을 출력하시오
SELECT
	department_id AS 부서평균,
	to_char(TRUNC(avg(salary)), '999,999') AS 부서급여평균
FROM
	EMPLOYEES
GROUP BY department_id
ORDER BY 2; 
--ex3) 업무ID별 급여의 합계를 구해서 업무ID, 급여합계를 출력하시오
SELECT
	job_id AS 업무ID,
	sum(salary) AS 급여합계
FROM
	EMPLOYEES
GROUP BY job_id;
--ex4) 부서별 급여평균을 구해서 사원명,부서별 급여평균을 출력하시오 (X)
SELECT
	last_name AS 사원명,
	TRUNC(avg(salary) OVER(PARTITION BY department_id)) AS "부서별 급여평균"
FROM
	EMPLOYEES;
--ex5) group by / having절
-- 부서별 급여평균을 구해서 평균급여가  6000이상인 부서만 출력  (8 레코드)
-- (평균급여는 소수점 이하 절삭)
--      부서ID   평균급여
--     -----------------------
--        100       8600
SELECT
	department_id AS 부서ID,
	TRUNC(avg(salary)) AS 평균급여
FROM
	EMPLOYEES
GROUP BY department_id
HAVING TRUNC(avg(salary)) >= 6000;
--ex6)부서별 급여평균을 구하시오
--    조건1) 소수이하는 반올림
--    조건2) 세자리마다콤마, 화페단위 ￦를 표시
--    조건3)  부서코드        평균급여
--           ---------------------------
--             10              ￦8,600
--    조건4) 부서별로 오름차순정렬하시오 
--    조건5) 평균급여가 5000이상인 부서만 표시하시오
SELECT department_id AS 부서코드,
	   TO_CHAR(TRUNC(avg(salary)), 'L9,999,999') AS 평균급여
FROM EMPLOYEES
GROUP BY department_id
HAVING TRUNC(avg(salary)) >= 5000
ORDER BY department_id ASC;
--ex7) 비효율적인 having절
--10과 20 부서에서 최대급여를 받는사람의 급여를 구하시오, 부서별로 오름차순 정렬하시오
--department_id     max_salary
-----------------------------
-- 10                    4400
-- 20                    13000 
-- 비효율적인 방법
SELECT department_id,
	   max(salary) AS max_salary
FROM EMPLOYEES
GROUP BY department_id
HAVING department_id = 10 OR department_id = 20
ORDER BY department_id;
--효율적인 방법
SELECT department_id,
	   max(salary) AS max_salary
FROM EMPLOYEES
WHERE department_id = 10 OR department_id = 20
GROUP BY department_id
ORDER BY department_id;
--ex8) having절 (where + group by + having)
--10과 20 부서에서 최대급여를 받는사람의 급여를 구하시오.  --1건
--[조건1] 부서별로 오름차순 정렬하시오
--[조건2] 최대급여가 5000이상인 부서만 출력하시오
--         department_id     max_salary
--         -----------------------------------
--           20                    13000 
SELECT 
	department_id,
	max(salary) AS max_salary
FROM
	EMPLOYEES
WHERE department_id = 10 OR department_id = 20
GROUP BY department_id
HAVING max(salary) >= 5000
ORDER BY 1;

--ex9) 20~80번 부서별로  급여를 가장 적게 받는 사원의 급여를 출력하시오 --7건
--      부서별 오름차순으로 할것
--      [출력]    department_id     min_salary
-- 코드 레벨의 튜닝
SELECT
	department_id,
	min(salary) AS min_salary
FROM
	EMPLOYEES
WHERE department_id IN (20, 30, 40, 50, 60, 70, 80)
GROUP BY department_id
ORDER BY 1;
 
SELECT
	department_id,
	min(salary) AS min_salary
FROM
	EMPLOYEES
GROUP BY department_id
HAVING department_id IN (20, 30, 40, 50, 60, 70, 80)
ORDER BY 1;
=======================================================================================
[조인(join)]

(employees)           (departments)                (join)
사       부                부        부              사     부    부
원       서    +          서        서     =       원     서    서
이       번                번        이              이     번    이
름       호                호        름              름     호    름

※종류
0. natural join(자연조인) : 같은컬럼이 여러개 있을때 같은 컬럼 모두를 and연산해서 연결
1. Inner join(내부조인) : 같은것 끼리만 연결
2. Outer join(외부조인) : 한쪽을 기준(모두포함)해서 연결
                                   left  join : 왼쪽컬럼 모두포함
                                   right join : 오른쪽컬럼 모두포함
3. full join : 왼쪽,오른쪽 모두 포함
4. self join : 자기자신 테이블과 연결
5. cross join : 모든 경우의 수로 연결
6. non equijoin : 범위에 속하는지 여부를 확인
7. n개 테이블 조인 : 여러개의 테이블 조인

※방법
1. 오라클 전용구문
2. Ansi표준구문

select * from employees;    --107 (부서없는 사원 1명)
select * from departments;  --27

--ex1) inner join : 같은것끼리만 조인
--사원테이블과 부서테이블에서 부서가 같을경우 사원번호,부서번호,부서이름을 출력하시오  -- 106건
--오라클 구문
SELECT
	EMPLOYEES.employee_id,
	EMPLOYEES.department_id,
	DEPARTMENTS.department_name
FROM
	EMPLOYEES,
	DEPARTMENTS
WHERE EMPLOYEES.department_id = DEPARTMENTS.department_id;

SELECT
	e.employee_id,
	e.department_id,
	d.department_name
FROM
	EMPLOYEES e,
	DEPARTMENTS d
WHERE e.department_id = d.department_id;
--ANSI 표준
SELECT
	t1.employee_id AS 사원번호,
	t1.department_id AS 부서번호,
	t2.department_name AS 부서이름
FROM
	EMPLOYEES t1
INNER JOIN DEPARTMENTS t2
ON t1.department_id = t2.department_id; 

SELECT
	e.employee_id AS 사원번호,
	department_id AS 부서번호,
	d.department_name AS 부서이름
FROM
	EMPLOYEES e
INNER JOIN DEPARTMENTS d USING(department_id);

--ex2)부서테이블과 위치테이블을 연결하여 부서가 위치한 도시를 알아내시오(inner join)
--     (departments, locations)
--  department_id     city
----------------------------------
--  10                   Seattle
--ANSI 표준
SELECT
	t1.department_id,
	t2.city
FROM
	DEPARTMENTS t1
INNER JOIN LOCATIONS t2
ON t1.location_id = t2.location_id;

SELECT
	department_id,
	city
FROM
	DEPARTMENTS
INNER JOIN LOCATIONS USING(location_id);

--오라클 방식
SELECT
	department_id,
	city
FROM
	DEPARTMENTS D,
	LOCATIONS L
WHERE
	D.location_id = L.location_id;
--ex3) outer join(left) : 왼쪽 테이블은 모두 포함하여 조인
--사원테이블과 부서테이블에서 부서번호가 같은 사원을 조인하시오 ==> 107레코드
--조건 1) 사원이름, 부서ID, 부서이름을 출력하시오
--조건 2) 사원테이블의 모든 사원을 포함하시오
--ANSI 표준
SELECT
	t1.last_name AS 사원이름,
	t1.department_id AS 부서ID,
	t2.department_name AS 부서이름
FROM
	EMPLOYEES t1
LEFT JOIN DEPARTMENTS t2
ON t1.department_id = t2.department_id;

SELECT
	last_name,
	department_id,
	department_name
FROM
	EMPLOYEES E
LEFT JOIN DEPARTMENTS D USING (department_id);

--오라클 구문
SELECT
	E.last_name,
	E.department_id,
	D.department_name
FROM
	EMPLOYEES E,
	DEPARTMENTS D
WHERE
	E.department_id = D.department_id(+);
--ex4) outer join(right) : 오른쪽 테이블은 모두포함하여 조인
--사원테이블과 부서테이블에서 부서번호가 같은 사원을 조인하시오 ===> 122레코드
--조건 1) 사원이름, 부서ID, 부서이름을 출력하시오
--조건 2) 부서테이블의 모든 부서를 포함하시오
--ANSI 표준
SELECT
	t1.last_name AS 사원이름,
	t1.department_id AS 부서ID,
	t2.department_name AS 부서이름
FROM
	EMPLOYEES t1
RIGHT JOIN DEPARTMENTS t2
ON t1.department_id = t2.department_id;

SELECT
	last_name,
	department_id,
	department_name
FROM
	EMPLOYEES
RIGHT JOIN DEPARTMENTS USING (department_id);
--오라클 구문
SELECT
	E.last_name,
	E.department_id,
	D.department_name
FROM
	EMPLOYEES E,
	DEPARTMENTS D
WHERE E.department_id (+) = D.department_id;
--ex5) full join : 왼쪽,오른쪽 테이블을 모두포함하여 조인
--사원테이블과 부서테이블에서 부서번호가 같은 사원을 조인하시오 ===> 123레코드
--조건 1) 사원이름, 부서ID, 부서이름을 출력하시오
--조건 2) 사원데이블의 모든사원과 부서테이블의 모든 부서를 포함하시오
--ANSI 방식밖에 없음
SELECT
	t1.last_name AS 사원이름,
	t1.department_id AS 부서ID,
	t2.department_name AS 부서이름
FROM
	EMPLOYEES t1
FULL JOIN DEPARTMENTS t2
ON t1.department_id = t2.department_id;

SELECT
	last_name,
	department_id,
	department_name
FROM
	EMPLOYEES
FULL JOIN DEPARTMENTS USING(department_id);
--ex6) departments 와  locations 자연조인의 비교(같은컬럼 : location_id)  ==> 27레코드
--        두개의 테이블을 연결해서 
--        부서위치(location_id), 도시(city), 부서이름(department_name)을 출력하시오
--INNER JOIN
SELECT
	location_id AS 부서위치,
	city AS 도시,
	department_name AS 부서이름
FROM
	DEPARTMENTS
INNER JOIN LOCATIONS USING(location_id);

SELECT
	D.location_id,
	L.city,
	D.department_name
FROM
	DEPARTMENTS D,
	LOCATIONS L
WHERE D.location_id = L.location_id;

--NATURAL JOIN
SELECT
	location_id AS 부서위치,
	city AS 도시,
	department_name AS 부서이름
FROM
	DEPARTMENTS
NATURAL JOIN LOCATIONS;

--ex7) inner join,  natural join : 두개의 컬럼이 일치하는경우
--        부서ID와 매니저ID가  같은 사원을 연결하시오
--       (관련테이블 : departments, employees)  : 32 레코드

--        last_name     department_id   manager_id
--        ------------------------------------------
--INNER JOIN
--오라클 구문
SELECT
	E.last_name,
	D.department_id,
	D.manager_id
FROM
	DEPARTMENTS D,
	EMPLOYEES E
WHERE D.department_id = E.department_id
AND D.manager_id = E.manager_id;
--ANSI 표준
SELECT
	last_name,
	department_id,
	manager_id
FROM
	EMPLOYEES
JOIN DEPARTMENTS USING(department_id, manager_id);

SELECT
	last_name,
	E.department_id,
	E.manager_id
FROM
	EMPLOYEES E
JOIN DEPARTMENTS D
ON E.department_id = D.department_id
AND E.manager_id = D.manager_id;
--자연조인
SELECT
	last_name,
	department_id,
	manager_id
FROM
	EMPLOYEES
NATURAL JOIN DEPARTMENTS;

SELECT
	last_name,
	department_id,
	manager_id
FROM
	EMPLOYEES
NATURAL JOIN DEPARTMENTS;
--ex8) 내용은 같은데 컬럼명이 다른경우에 조인으로 연결하기
--       departments(location_id) , locations2(loc_id)
        
--      부서ID    부서명             도시
--      -----------------------------------------------------
--      60	      IT	             Southlake
--      50	     Shipping	South San Francisco
--      10	     Administration	Seattle
CREATE TABLE locations2
AS
SELECT
	*
FROM
	LOCATIONS; -- 테이블 복사, 데이터도 복사

SELECT
	*
FROM
	LOCATIONS2;

ALTER TABLE locations2
RENAME COLUMN location_id TO loc_id; -- 컬럼 이름 변경

--오라클 구문
SELECT
	D.department_id AS 부서ID,
	D.department_name AS 부서명,
	L.city AS 도시
FROM
	DEPARTMENTS D,
	LOCATIONS2 L
WHERE D.location_id = L.loc_id;
--ANSI 표준
SELECT
	department_id AS 부서ID,
	department_name AS 부서명,
	city AS 도시
FROM
	DEPARTMENTS 
JOIN LOCATIONS2 
ON location_id = loc_id;

--ex9) self 조인 : 자기자신의 테이블과 조인하는경우
--        사원과 관리자를 연결하시오, 모든 사원을 표시하시오

--        사원번호   사원이름      관리자
--        ----------------------------------
--        101           Kochhar      King   
--오라클 구문
SELECT
	E.employee_id AS 사원번호,
	E.last_name AS 사원이름,
	M.last_name AS 관리자
FROM
	EMPLOYEES E,
	EMPLOYEES M
WHERE E.manager_id = M.employee_id(+); 
--ANSI 표준
SELECT
	E.employee_id AS 사원번호,
	E.last_name AS 사원이름,
	M.last_name AS 관리자
FROM
	EMPLOYEES E
LEFT JOIN EMPLOYEES M 
ON E.manager_id = M.employee_id;

--ex10) cross join:모든행에 대해 가능한 모든조합을 생성하는 조인
SELECT
	count(*)
FROM
	COUNTRIES; -- 25
	
SELECT
	count(*)
FROM
	LOCATIONS; -- 23
--오라클 구문
SELECT
	*
FROM
	COUNTRIES,
	LOCATIONS;
--ANSI 표준
SELECT
	*
FROM
	COUNTRIES
CROSS JOIN LOCATIONS;
--ex11) Non Equijoin (넌 이큐조인) 
--        : 컬럼값이 같은경우가 아닌 범위에 속하는지 여부를 확인할때
--        [형식]  on ( 컬럼명 between 컬럼명1 and 컬럼명2)

create table salgrade(
salvel varchar2(2),
lowst number,
highst number);

insert into salgrade values('A',20000,29999);
insert into salgrade values('B',10000,19999);
insert into salgrade values('C',0,9999);
commit

select * from salgrade;
select * from tab;

--ex12) 자신이 받는 급여가 어느등급인지를 확인하시오
--    조건1) 타이틀은 사원이름, 급여, 급여등급
--    조건2) 급여별 내림차순으로 정렬하시오
--           사원이름       급여      급여등급
--           ------------------------------------
--            King	          24000	       A
--            De Haan      17000	       B
SELECT
	last_name AS 사원이름,
	salary AS 급여,
	salvel AS 급여등급
FROM
	EMPLOYEES
LEFT JOIN SALGRADE
ON salary BETWEEN lowst AND highst;
--ex13) n(여러)개의 테이블을 조인
--업무ID같은 사원들의 사원이름,업무내용,부서이름을 출력하시오
--(employees, jobs,departments테이블을 조인)

--[분석]
--employees           jobs            departments
----------------------------------------------------
--department_id                      department_id
--job_id			 job_id

--[조건]
--1. 부서이름 정렬후 같은 부서이름인 경우 업무명으로 오름차순 정렬하시오
--2. 사원이름, 부서이름, 업무명의 이름으로 출력하시오

--[출력]
--사원이름      부서이름                 업무명    ===> employees   departments   jobs
----------------------------------------------------
--Higgins	  Accounting        Accounting Manager	 
--Gietz	  	  Accounting        Public Accountant
--오라클 구문	
SELECT
	last_name AS 사원이름,
	department_name AS 부서이름,
	job_title AS 업무명
FROM
	EMPLOYEES E,
	DEPARTMENTS D,
	JOBS J
WHERE E.department_id = D.department_id (+)
AND E.job_id = J.job_id
ORDER BY 2, 3;
--ANSI 표준
SELECT
	last_name AS 사원이름,
	department_name AS 부서이름,
	job_title AS 업무명
FROM
	EMPLOYEES
LEFT JOIN DEPARTMENTS USING(department_id)
JOIN JOBS USING(job_id)
ORDER BY 2, 3;
------------------------------------------------------------------------------------
--[문제1] manager_id가 같은 사원을 조인하여 
--        이름(last_name), 부서이름, 메니저ID를 출력하시오  --4건
--        (관련테이블 : employees, departments)

--  조건1)부서이름이 IT인 사원만 출력하시오
--  조건2)이름별로 오름차순 출력하시오
--  조건3)Ansi표준을 이용하여 join하시오

--  이름   부서이름   메니저ID
--  ----------------------------
SELECT
	last_name AS 이름,
	department_name AS 부서이름,
	manager_id AS 매니저ID
FROM
	EMPLOYEES
LEFT JOIN DEPARTMENTS USING(manager_id)
WHERE department_name = 'IT'
ORDER BY 1;
------------------------------------------------------------------------------------
--[문제2] 부서위치를 조인하여 도시를 알아내시오  --21건
--        (관련테이블 : departments, locations)

--조건1) 도시가 'Seattle'만 출력하시오
--조건2) 부서ID별 내림차순 정렬하시오

-- department_id      city
-- -----------------------------
-- 10                      Seattle
SELECT
	department_id,
	city
FROM
	DEPARTMENTS
JOIN LOCATIONS USING(location_id)
WHERE city = 'Seattle'
ORDER BY 1 DESC;


------------------------------------------------------------------------------------
--[문제3] 부서번호가 같은 사원을 Ansi표준으로 조인하시오 --9건
--        (관련테이블 : departments, employees)
--  조건1) 타이틀은  사원이름(last_name), 부서ID, 부서이름으로 출력하시오
--  조건2) 부서번호가 30번 또는 90번인 사원들만 출력하시오
--  조건3) 사원이름별 오름차순 정렬하시오
SELECT
	last_name AS 사원이름,
	department_id AS 부서ID,
	department_name AS 부서이름
FROM
	EMPLOYEES
JOIN DEPARTMENTS USING(department_id)
WHERE department_id IN (30, 90)
ORDER BY 1;


------------------------------------------------------------------------------------
--[문제4] 위치ID를 연결해서 사원이름,도시,부서이름을 출력하시오  ==> 52레코드
--        (관련테이블 : employees, locations2, departments)

--	조건1 : 사원이름 ,도시,부서이름로 제목을 표시하시오	
--	조건2 : Seattle 또는 Oxford 에서 근무하는 사원
--	조건3 : 도시순으로 오름차순정렬하시오 
--	조건4 : 모든 사원을 포함한다

--  사원이름      도    시     부서이름
-- -------------------------------------
--   Hall        Oxford       Sales

--[분석]
--employees                departments            locations2
-- -----------------------------------------------------------
--department_id            department_id
--                         location_id              loc_id            

SELECT
	last_name AS 사원이름,
	city AS "도    시",
	department_name AS 부서이름
FROM
	EMPLOYEES E
LEFT JOIN DEPARTMENTS D ON D.department_id = E.department_id
LEFT JOIN LOCATIONS2 L ON D.location_id = L.loc_id
WHERE city IN ('Seattle', 'Oxford')
ORDER BY 2;
--위와 동일
SELECT
	last_name AS 사원이름,
	city AS "도    시",
	department_name AS 부서이름
FROM
	DEPARTMENTS D
RIGHT JOIN EMPLOYEES E ON D.department_id = E.department_id
LEFT JOIN LOCATIONS2 L ON D.location_id = L.loc_id
WHERE city IN ('Seattle', 'Oxford')
ORDER BY 2;

------------------------------------------------------------------------------------
--[문제5] 부서ID,나라ID,부서위치를 연결해서 다음과 같이 완성하시오   -- 1 레코드
--        (관련테이블 : employees,locations2, departments,countries)
--      조건1 : 사원번호,사원이름,부서이름,도시,도시주소(street_address),나라명로 제목을 표시하시오
--      조건2 : 도시주소에  Vi 또는 St가 포함되어 있는 데이터만 표시하시오
--      조건3 : 나라명, 도시별로 오름차순정렬하시오
--      조건4 : 모든사원을 포함한다

-- employees                 locations2          departments         countries
-- -------------------------------------------------------------------------------
--  department_id                                  department_id 
--                                loc_id                location_id  
--                                country_id                                     country_id                                                

SELECT
	employee_id AS 사원번호,
	last_name AS 사원이름,
	department_name AS 부서이름,
	city AS 도시,
	street_address AS 도시주소,
	country_name AS 나라명
FROM
	EMPLOYEES E
LEFT JOIN DEPARTMENTS D ON E.department_id = D.department_id
LEFT JOIN LOCATIONS2 L ON D.location_id = L.loc_id
LEFT JOIN COUNTRIES C ON L.country_id = C.country_id
WHERE street_address LIKE '%St%'
	OR street_address LIKE '%Vi%'
ORDER BY 6, 4;

SELECT
	employee_id AS 사원번호,
	last_name AS 사원이름,
	department_name AS 부서이름,
	city AS 도시,
	street_address AS 도시주소,
	country_name AS 나라명
FROM
	EMPLOYEES 
LEFT JOIN DEPARTMENTS USING(department_id)
LEFT JOIN LOCATIONS2 ON location_id = loc_id
LEFT JOIN COUNTRIES USING(country_id)
WHERE street_address LIKE '%St%'
	OR street_address LIKE '%Vi%'
ORDER BY 6, 4;




















