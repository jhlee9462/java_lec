[하위질의(SubQuery)]
: 하나의 쿼리에 다른 쿼리가 포함되는 구조,()로처리
1) 단일행 서브쿼리(단일행반환) :  > , < , >=, <= , <>
     Main Query
               
         Sub  Query      ----->   1 개결과 

2) 다중행 서브쿼리(여러행반환) : in, any, all

     Main Query
     
          Sub Query      ----->   여러개의 결과  
      
       < any : 비교대상중 최대값보다 작음
       > any : 비교대상중 최소값보다 큼   
                  (ex. 과장직급의 급여를 받는 사원조회)
       =  any : in연산자와 동일
       <  all   : 비교대상중 최소값보다 작음
       >  all   : 비교대상중 최대값보다 큼 
                  (ex. 모든과장들의 직급보다 급여가 많은 사원조회)

3) 상관쿼리(correlated  subquery)   
  : 메인쿼리 한행을 읽고 해당값을 서브쿼리에서 참조하여 서브쿼리결과에 존재하면 true를 반환
      exists,  not exists : 존재 여부에 따라 true,false을 반환
==============================================================================================
--ex1) Neena사원의 부서명을 알아내시오

SELECT
	department_id
FROM
	EMPLOYEES
WHERE first_name = 'Neena'; -- 90

SELECT
	department_name
FROM
	DEPARTMENTS
WHERE department_id = 90; -- Executive

-- Sub-query
SELECT
	department_name
FROM
	DEPARTMENTS
WHERE department_id = (SELECT
							department_id
						FROM
							EMPLOYEES
						WHERE first_name = 'Neena');
					
--WITH 사용 버전
WITH sample AS (
	SELECT
		department_id
	FROM
		EMPLOYEES
	WHERE
		first_name = 'Neena'
)
SELECT
	department_name
FROM
	DEPARTMENTS
JOIN 
	SAMPLE USING(department_id);


--ex2) Valli Pataballa의  직업명(job_title)을 알아내시오
--[참고] job_id(IT_PROG)

SELECT
	job_title
FROM
	JOBS
WHERE 
	job_id = (SELECT
				job_id
			  FROM
			  	EMPLOYEES
			  WHERE first_name = 'Valli'
			  	AND last_name = 'Pataballa');

------------------------------------------------------------------------------------------------
--ex3) Alexander Hunold의 근무지(city)를 알아내시오
--[참고] department_id(60) -> location_id(1400) -> city(Southlake)

SELECT
	city
FROM
	LOCATIONS
WHERE
	location_id = (
	SELECT
		location_id
	FROM
		DEPARTMENTS
	WHERE
		department_id = (
		SELECT
			department_id
		FROM
			EMPLOYEES
		WHERE first_name = 'Alexander'
			AND last_name = 'Hunold'));


------------------------------------------------------------------------------------------------
--ex4) Steven King가 근무하는 나라(country_name)를 알아내시오
--[참고] 답 : United States of America

SELECT
	country_name
FROM
	COUNTRIES
WHERE
	country_id = (
	SELECT
		country_id
	FROM
		LOCATIONS
	WHERE
		location_id = (
		SELECT
			location_id
		FROM
			DEPARTMENTS
		WHERE
			department_id = (
			SELECT
				department_id
			FROM
				EMPLOYEES
			WHERE
				first_name = 'Steven'
				AND last_name = 'King')));


------------------------------------------------------------------------------------------------
--ex5) Diana Lorentz가 근무하는 지역(region_name)을 알아내시오 --Americas

SELECT
	region_name
FROM
	REGIONS
WHERE
	region_id = (
	SELECT region_id FROM COUNTRIES WHERE country_id = (
		SELECT country_id FROM LOCATIONS WHERE location_id = (
			SELECT location_id FROM DEPARTMENTS WHERE department_id =(
				SELECT department_id FROM EMPLOYEES WHERE first_name = 'Diana' AND last_name = 'Lorentz'))))
;



------------------------------------------------------------------------------------------------
--ex6) Neena사원의 부서에서 Neena사원보다 급여를 많이 받는 사원들을 구하시오  ==> 1레코드
--                             (90)                         (17000)
--first_name    department_id    salary
-- ----------------------------------------
--Steven	     90	           24000
SELECT
	first_name,
	department_id,
	salary
FROM
	EMPLOYEES
WHERE
	department_id = 
	(SELECT department_id FROM EMPLOYEES WHERE first_name = 'Neena')
	AND salary > 
	(SELECT salary FROM EMPLOYEES WHERE first_name = 'Neena')
;


-----------------------------------------------------------------------------------------------
--ex7) oliver와 같은 업무ID이면서 같은 부서가 아닌 사원의 
--       이름(first_name),업무ID,부서ID를 출력하시오  ==> 1레코드 
--                        (SA_REP)  (80)       
--      first_name        job_id        department_id
--      ------------------------------------------------
--      Kimberely	        SA_REP	

SELECT
	first_name,
	job_id,
	department_id
FROM
	EMPLOYEES
WHERE
	job_id = 
	(SELECT job_id FROM EMPLOYEES WHERE lower(first_name) = 'oliver')
	AND nvl(department_id, 0) !=
	(SELECT department_id FROM EMPLOYEES WHERE lower(first_name) = 'oliver')
;


------------------------------------------------------------------------------------------------
--ex8) Austin과 같은부서이면서 같은 급여를 받는사원들의 이름, 부서명, 급여를 구하시오 ==> 2 레코드
--                   (60)                  (4800)
             
--        last_name     department_name   salary
--       -------------------------------------------------  
--       Austin	             IT            4800
--       Pataballa           IT            4800     

SELECT
	last_name,
	department_name,
	salary
FROM
	EMPLOYEES
JOIN
	DEPARTMENTS USING(department_id)
WHERE
	department_id =
	(SELECT department_id FROM EMPLOYEES WHERE last_name = 'Austin')
	AND salary =
	(SELECT salary FROM EMPLOYEES WHERE last_name = 'Austin')
;


------------------------------------------------------------------------------------------------
--ex9) 최저급여를 받는 사원들의 이름과 급여를 구하시오
--       last_name   salary
--       ---------------------
--       Olson         2100  

SELECT
	last_name,
	salary
FROM
	EMPLOYEES
WHERE
	salary = 
	(SELECT MIN(salary) FROM EMPLOYEES)
;

------------------------------------------------------------------------------------------------
--ex10) 평균급여를 받는 사원들의 이름과 급여를 구하시오  ==> 2레코드
--       조건1) 평균급여를 천단위 절삭하시오       
--       사원명        급여
--       ----------------------
--       Ernst          6000
--       Fay            6000

SELECT
	last_name AS 사원명,
	salary AS 급여
FROM
	EMPLOYEES
WHERE
	salary = 
	(SELECT TRUNC(AVG(salary), -3) FROM EMPLOYEES)
;

------------------------------------------------------------------------------------------------
--ex11)부서별 급여합계중  최대급여를 받는 부서의 
--     부서명과  급여합계를 구하시오(단일행 서브쿼리)   ==> 1레코드
--     조건1) 부서별 급여합계를 구하고 최대값을 구한다
--     조건2) 타이틀은 부서명,급여합계로 한다
--              부서명    급여합계
--              -----------------------
--               Sales	    304500
    
SELECT
	department_name AS 부서명,
	SUM(salary) AS 급여합계
FROM
	EMPLOYEES
LEFT JOIN
	DEPARTMENTS USING(department_id)
GROUP BY
	department_name
HAVING
	SUM(salary) =
	(SELECT MAX(SUM(salary)) FROM EMPLOYEES GROUP BY department_id)
;

------------------------------------------------------------------------------------------------
--ex12) 업무ID별 급여평균중 전체평균급여보다 적게 받는 업무ID의  
--      업무명과  급여평균를 구하시오(단일행 서브쿼리)  ==> 6 레코드
--     조건1) 업무별 급여평균을 구한다
--     조건2) 급여평균은 천단위 절삭한다
--     조건3) 타이틀은 업무명,급여합계로 한다
--     조건4) 모든 사원을 포함한다

--               업무명                    급여평균
--              ----------------------------------------
--               Programmer	             5000
--               Purchasing Clerk	     2000
--               Marketing Representative    6000
--               Administration Assistant    4000
--               Stock Clerk	             2000
--               Shipping Clerk	             3000

SELECT
	job_title AS 업무명,
	TRUNC(AVG(salary), -3) AS 급여평균
FROM
	EMPLOYEES
LEFT JOIN
	JOBS USING(job_id)
GROUP BY
	job_title
HAVING
	AVG(salary) <
	(SELECT AVG(salary) FROM EMPLOYEES)
;




--==================================================================================================
-- 다중행 서브쿼리
-- all : 모두 일치할때 결과값 리턴
-- any : 하나라도 일치하면 결과값 리턴

--ex13) 'SA_REP' 직급보다 급여가 많은 'ST_MAN'직급 직원들을 조회하시오    -- 4 레코드
                                           
--[분석]
--ST_MAN 사원의 급여 8000, 8200,7900,6500,5800 중 5800만 제외됨
--SA_REP의 최소급여는 6100이기 때문

--last_name   job_id   salary
-------------------------------
--Weiss       ST_MAN    8000
--Fripp       ST_MAN    8200
--Kaufling    ST_MAN    7900
--Vollman     ST_MAN    6500

SELECT
	last_name,
	job_id,
	salary
FROM
	EMPLOYEES
WHERE
	salary > ANY
		(SELECT salary FROM EMPLOYEES WHERE job_id = 'SA_REP')
	AND job_id = 'ST_MAN'
;



------------------------------------------------------------------------------------------------
--ex14) 'SA_REP' 직급의 최소급여보다 급여가 적은 'ST_MAN'직급 직원들을 조회하시오   -- 1 레코드
--last_name   job_id   salary
-------------------------------
--Mourgos	ST_MAN	5800

SELECT
	last_name,
	job_id,
	salary
FROM
	EMPLOYEES
WHERE
	salary < ALL
		(SELECT salary FROM EMPLOYEES WHERE job_id = 'SA_REP')
	AND job_id = 'ST_MAN'
;



-------------------------------------------------------------------------------------------------
--       (9000,4800,4200,6000)
--ex15) 'IT_PROG' 직급중 가장 많이 받는 사원의 급여보다,더 많은급여를 받는   -- 10 레코드
--      'FI_ACCOUNT' 또는 'SA_REP' 직급 직원들을 조회하시오
--      조건1) 급여순으로 내림차순정렬하시오
--      조건2) 급여는 세자리마다 콤마(,) 찍고 화폐단위 '달러'을 붙이시오
--      조건3) 타이틀은  사원명, 업무ID, 급여로 표시하시오

--      사원명      업무ID          급여
--      ----------------------------------------
--      Ozer         SA_REP        11,500달러
--      Abel         SA_REP        11,000달러
--      Vishney      SA_REP        10,500달러

SELECT
	last_name AS 사원명,
	job_id AS 업무ID,
	to_char(salary, '99,999') || '달러' AS 급여
FROM
	EMPLOYEES
WHERE
	salary > ALL
		(SELECT salary FROM EMPLOYEES WHERE job_id = 'IT_PROG')
	AND job_id IN ('FI_ACCOUNT', 'SA_REP')
ORDER BY 3 DESC
;


------------------------------------------------------------------------------------------------
--ex16) 'IT_PROG'와 같은 급여를 받는 사원들의 이름,업무ID,급여를 전부 구하시오  ==> 10레코드
--이름    업무ID   급여
---------------------------
--McEwen   SA_REP   9000
--Hall     SA_REP   9000

SELECT
	last_name AS 이름,
	job_id AS 업무ID,
	salary AS 급여
FROM
	EMPLOYEES
WHERE
	salary IN
		(SELECT salary FROM EMPLOYEES WHERE job_id = 'IT_PROG')
;


-------------------------------------------------------------------------------------------------
--ex17) 전체직원에 대한 관리자와 직원을 구분하는 표시를 하시오(in, not in이용)
--        조건1) 구분별 오름차순하고 사원번호별 오름차순정렬하시오
-- 사원번호      이름       구분
-------------------------------------
-- 100                King      관리자
--1. IN 연산자, CASE
SELECT
	employee_id AS 사원번호,
	last_name AS 이름,
	CASE WHEN 
		employee_id IN
			(SELECT DISTINCT manager_id FROM EMPLOYEES)
		THEN '관리자'
		ELSE '직원'
		END AS 구분
FROM
	EMPLOYEES
ORDER BY 3, 1
;
--2. UNION, IN, NOT IN
SELECT
	employee_id AS 사원번호,
	last_name AS 이름,
	'관리자' AS 구분
FROM
	EMPLOYEES
WHERE
	employee_id IN 
		(SELECT DISTINCT manager_id FROM EMPLOYEES)
UNION
SELECT
	employee_id,
	last_name,
	'직원'
FROM
	EMPLOYEES
WHERE
	employee_id NOT IN
		(SELECT DISTINCT manager_id FROM EMPLOYEES WHERE manager_id IS NOT NULL)
ORDER BY 3, 1
;
--3. 상관쿼리
--메인쿼리에서 한 행을 읽고 해당 값을 서브쿼리에서 참조하여 true, false 리턴
SELECT
	employee_id AS 사원번호,
	last_name AS 이름,
	'관리자' AS 구분
FROM
	EMPLOYEES e
WHERE
	EXISTS(SELECT NULL FROM EMPLOYEES WHERE e.employee_id = manager_id)
UNION
SELECT
	employee_id AS 사원번호,
	last_name AS 이름,
	'직원' AS 구분
FROM
	EMPLOYEES e
WHERE
	NOT EXISTS(SELECT NULL FROM EMPLOYEES WHERE e.employee_id = manager_id)
ORDER BY 3, 1
;
------------------------------------------------------------------------------------------------
--ex18) 다음과 같은 조건에 맞는 행을 검색하시오   ==> 28레코드
--      조건1) 직급별 평균급여를 구한후 모든 사원중 그 급여를 받는 사원을 조회하시오
--               (단, 100단위 이하 절사)
--      조건2) 출력할 급여는 세자리마다 콤마와 $표시
--      조건3) 사원이름(last_name),직무(job_title) ,급여(salary) 로 표시하시오
--      조건4) 급여순으로 오름차순 정렬하시오

--         사원이름       직무               급여
--         ---------------------------------------
--         Higgins      Accounting Manager   $12,008
--         Errazuriz    Sales Manager	     $12,000
--         Greenberg    Finance Manager	     $12,008

SELECT
	last_name AS 사원이름,
	job_title AS 직무,
	to_char(salary, '$999,999') AS 급여
FROM
	EMPLOYEES e
LEFT JOIN
	JOBS USING(job_id)
WHERE
	TRUNC(salary, -2) IN
		(SELECT TRUNC(AVG(salary), -2) FROM EMPLOYEES GROUP BY job_id)
ORDER BY 3
;


------------------------------------------------------------------------------------------------
--ex19) group by rollup : a,b별 집계
--부서별, 직무ID별 급여평균구하기(동일부서에 대한 직무별 평균급여)
--조건1) 반올림해서 소수 2째자리까지 구하시오
--조건2) 제목은 Job_title, Department_name, Avg_sal로 표시하시오
SELECT
	job_title,
	department_name,
	ROUND(AVG(salary), 2) AS Avg_sal
FROM
	EMPLOYEES
LEFT JOIN
	JOBS USING(job_id)
LEFT JOIN
	DEPARTMENTS USING(department_id)
GROUP BY
	ROLLUP(department_name, job_title)
;
------------------------------------------------------------------------------------------------
--ex20) group by cube :  a별 집계 또는 b별 집계
--부서별, 직무ID별 급여평균구하기(부서를 기준으로 나타내는 평균급여)      
SELECT
	job_title,
	department_name,
	ROUND(AVG(salary), 2) AS Avg_sal
FROM
	EMPLOYEES
LEFT JOIN
	DEPARTMENTS USING(department_id)
LEFT JOIN
	JOBS USING(job_id)
GROUP BY
	CUBE(department_name, job_title)
;
------------------------------------------------------------------------------------------------
--ex21) group by grouping sets -- 소계
--직무별 평균급여와 전체사원의 평균급여를 함께 구하시오                 

SELECT
	job_title,
	ROUND(AVG(salary), 2) AS Avg_sal
FROM
	EMPLOYEES E
LEFT JOIN
	DEPARTMENTS USING(department_id)
LEFT JOIN
	JOBS USING(job_id)
GROUP BY
	GROUPING SETS((job_title), ())
;

















          