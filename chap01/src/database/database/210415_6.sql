# 스칼라값 (서브쿼리)
SELECT * FROM employees
WHERE gender = (SELECT gender FROM employees	where emp_no = 10066);

SELECT * FROM salaries
ORDER BY salary; # default : ASC (오름차순)

SELECT * FROM salaries
ORDER BY salary DESC; # 내림차순

# emp_no 먼저 정렬, 중복된 emp_no 내에서 salary 정렬
SELECT * FROM salaries
ORDER BY emp_no, salary DESC;

# dept_emp 테이블에서 dept_no 컬럼 내림차순, emp_ no 오름차순으로 정렬해주세요.
SELECT * FROM dept_emp
ORDER BY dept_no DESC, emp_no;

SELECT distinct emp_no, dept_no FROM dept_emp; # 중복이 일어나지 않으므로 distinct 쓰나 마나

SELECT * FROM salaries
ORDER BY salary DESC 
LIMIT 5, 5; # 5번 인덱스 부터 5개

		# 레코드 개수 
SELECT COUNT(emp_no) FROM salaries;

		# 최대값 (집계 함수)
SELECT MAX(salary) FROM salaries;

		# 최소값 (집계 함수)
SELECT MIN(salary) FROM salaries;

		# 총합
SELECT SUM(salary) FROM salaries;

	   # 평균
SELECT AVG(salary) FROM salaries;

SELECT (SUM(salary) / COUNT(salary)) FROM salaries;

SELECT emp_no
, MAX(salary), MIN(salary)
, SUM(salary), AVG(salary), COUNT(salary)
FROM salaries
GROUP BY emp_no
ORDER BY AVG(salary) DESC;