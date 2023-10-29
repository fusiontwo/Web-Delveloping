USE EMPLOYEES;

# 1) 사원번호 , 부서번호 , 근무 부서 이름을 가져오기. (DEPT_EMP , DEPARTMENTS)

SELECT
		DE.EMP_NO   	AS EMP_NO,              
		D.DEPT_NO   	AS DEPT_NO,  
		D.DEPT_NAME 	AS DEPT_NAME
FROM 
	   DEPARTMENTS D
	    INNER JOIN DEPT_EMP DE              
				ON D.DEPT_NO = DE.DEPT_NO;



# 2) 사원번호 , 이름(first,last) , 직함을 조회하기. (EMPLOYEES , TITLES)

SELECT 
		E.EMP_NO 		AS EMP_NO,
	    E.FIRST_NAME 	AS FIRST_NAME,
	    E.LAST_NAME 	AS LAST_NAME,
	    T.TITLE  		AS TITLE
FROM 
		EMPLOYEES E
	   INNER JOIN TITLES T 
			   ON T.EMP_NO = E.EMP_NO;
    
    
    
# 3) 사원번호 , 이름(first_name,last_name) , 부서번호 , 부서이름을 조회하기. (EMPLOYEES , DEPT_EMP , DEPARTMENTS)

SELECT 
		E.EMP_NO		AS ENO_NO,
	    E.FIRST_NAME	AS FIRST_NAME,
	    E.LAST_NAME		AS LAST_NAME,
	    D.DEPT_NO		AS DEPT_NO,
		D.DEPT_NAME 	AS DEPT_NAME
FROM 
		EMPLOYEES E
	   INNER JOIN DEPT_EMP DE 
			   ON E.EMP_NO = DE.EMP_NO
	   INNER JOIN DEPARTMENTS D
			   ON DE.DEPT_NO = D.DEPT_NO;

			   

# 4) 사원번호 , 이름(first,last) , 부서 번호를 조회하기. (EMPLOYEES , DEPT_EMP)

SELECT 
		E.EMP_NO 		AS EMP_NO, 
		E.FIRST_NAME 	AS FIRST_NAME, 
	    E.LAST_NAME		AS LAST_NAME,
		DE.DEPT_NO	    AS DEPT_NO
FROM 
		EMPLOYEES E 
	   INNER JOIN DEPT_EMP DE
			   ON E.EMP_NO = DE.EMP_NO;



# 5) 사원번호 , 이름(first,last) , 부서 이름을 조회하기. (EMPLOYEES , DEPT_EMP , DEPARTMENTS)

SELECT 
		E.EMP_NO     AS EMP_NO, 
		E.FIRST_NAME AS FIRST_NAME, 
		E.LAST_NAME  AS LAST_NAME, 
		D.DEPT_NAME  AS DEPT_NAME
FROM 
		DEPARTMENTS D 
		 INNER JOIN DEPT_EMP DE
				 ON D.DEPT_NO = DE.DEPT_NO
		 INNER JOIN EMPLOYEES E
				 ON DE.EMP_NO = E.EMP_NO;
        
      
      
# 6) 부서별로 그룹화하여 부서이름 , 부서번호 , 부서별 직원수를 조회하고 직원수가 많은 곳부터 조회하기. (DEPT_EMP , DEPARTMENTS)

SELECT 
		D.DEPT_NAME AS DEPT_NAME, 
	    D.DEPT_NO	AS DEPT_NO,
	    COUNT(*)	AS EMP_COUNT
FROM 
		DEPT_EMP DE
	  INNER JOIN DEPARTMENTS D 
			  ON D.DEPT_NO = DE.DEPT_NO
GROUP BY 
		D.DEPT_NO
ORDER BY
		EMP_COUNT DESC;


		
# 7) 부서별로 그룹화하고 성별로 그룹화하여 부서이름 , 성별 , 직원 수를 조회하기. (DEPT_EMP , DEPARTMENTS , EMPLOYEES)

SELECT 
		D.DEPT_NAME AS DEPT_NAME, 
		E.GENDER	AS GENDER, 
		COUNT(*)	AS COUNT
FROM 
		DEPT_EMP DE
	  INNER JOIN DEPARTMENTS D 
			  ON D.DEPT_NO = DE.DEPT_NO
	  INNER JOIN EMPLOYEES E 
			  ON E.EMP_NO = DE.EMP_NO
 GROUP BY 
		D.DEPT_NO, 
		E.GENDER;
     
		
		
# 8) 부서이름 별로 급여의 평균을 구하기 (EMPLOYEES , DEPARTMENTS , DEPT_EMP , SALARIES)

SELECT
		D.DEPT_NO	 AS DEPT_NO,
		D.DEPT_NAME  AS DEPT_NAME,
        AVG(SALARY)	 AS AVG_SALARY
FROM
		EMPLOYEES E
			 JOIN DEPT_EMP DE
			   ON DE.EMP_NO = E.EMP_NO
			 JOIN DEPARTMENTS D
			   ON D.DEPT_NO = DE.DEPT_NO
			 JOIN SALARIES S
			   ON E.EMP_NO = S.EMP_NO
GROUP BY
		DE.DEPT_NO;
        
		
		
# 9) 직함별로 급여의 평균을 구하기 (TITLES , SALARIES)

SELECT
		T.TITLE			AS TITLE,
        AVG(SALARY)		AS AVG_SALARY
FROM
		TITLES T
		  JOIN SALARIES S
		    ON T.EMP_NO = S.EMP_NO
GROUP BY
		T.TITLE;

		
		
# 10) 관리자의 부서번호 , 사원번호 , 이름 조회하기 (DEPT_MANAGER ,  EMPLOYEES) 

SELECT
		DM.DEPT_NO									AS DEPT_NO,
        E.EMP_NO									AS EMP_NO,
		CONCAT (E.FIRST_NAME , ' ' , E.LAST_NAME)	AS EMP_NAME
FROM
		DEPT_MANAGER DM
	  			JOIN EMPLOYEES E
				  ON DM.EMP_NO = E.EMP_NO;

		
				  
# 11) 관리자의 부서번호 , 부서이름 , 사원번호 , 이름 조회하기 (부서이름을a~z로 정렬) (DEPT_MANAGER , EMPLOYEES , DEPARTMENTS)

SELECT
		DM.DEPT_NO									AS DEPT_NO,
        D.DEPT_NAME									AS DEPT_NAME,
        E.EMP_NO									AS EMP_NO,
		CONCAT (E.FIRST_NAME , ' ' , E.LAST_NAME)	AS EMP_NAME
FROM
		DEPT_MANAGER DM
	  			JOIN EMPLOYEES E
				  ON DM.EMP_NO = E.EMP_NO
	  			JOIN DEPARTMENTS D
				  ON DM.DEPT_NO = D.DEPT_NO
ORDER BY
		DEPT_NAME;
          
		
		              
# 12) 부서관리자별로 급여의 평균을 구하기 (DEPT_MANAGER , SALARIES)

SELECT
		DM.DEPT_NO		AS DEPT_NO,
        AVG(SALARY)		AS AVG_SALARY
FROM
		DEPT_MANAGER DM
			 	JOIN SALARIES S
			   	  ON DM.EMP_NO = S.EMP_NO
GROUP BY
		DM.DEPT_NO;

		
		

# 13) 부서별로 그룹화하고 직책별로 그룹화하여 부서이름과 직원수를 조회하기 (TITLES , EMPLOYEES , DEPT_EMP , DEPARTMENTS)

SELECT
		D.DEPT_NAME			AS DEPT_NAME,
        T.TITLE				AS TITLE,
    	COUNT(*)  			AS CNT 
	
FROM
		TITLES T
  		  JOIN EMPLOYEES E
			ON T.EMP_NO = E.EMP_NO
		  JOIN DEPT_EMP DE
			ON DE.EMP_NO = E.EMP_NO
  		  JOIN DEPARTMENTS D
			ON DE.DEPT_NO = D.DEPT_NO
GROUP BY
		D.DEPT_NAME,
		T.TITLE

		
		
# 14) 직책별로 그룹화하고 부서별로 그룹화하여 부서이름과 직원수를 조회하기 (TITLES , EMPLOYEES , DEPT_EMP , DEPARTMENTS)

SELECT
		T.TITLE			AS TITLE,
		D.DEPT_NAME		AS DEPT_NAME,
    	COUNT(*)   		AS CNT
	
FROM
		  TITLES T
  			JOIN EMPLOYEES E
			  ON T.EMP_NO = E.EMP_NO
			JOIN DEPT_EMP DE
			  ON DE.EMP_NO = E.EMP_NO
  			JOIN DEPARTMENTS D
			  ON DE.DEPT_NO = D.DEPT_NO
GROUP BY
		T.TITLE,
		D.DEPT_NAME
		
