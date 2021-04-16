# 가장 오래다닌 순서대로 (내림차순)
# 개월 수가 같다면 평균 급여가 높은 순서대로 (내림차순)

SELECT AVG(salary), COUNT(salary) 
FROM salaries
GROUP BY emp_no
HAVING COUNT(salary) = 10 # 그룹의 조건
ORDER BY COUNT(salary) DESC, AVG(salary) DESC;

# salaries 테이블
# emp_no별 평균 급여가 90,000 이상인 레코드
# emp_no과 평균 급여값 출력
# 레코드 순서는 평균 급여값 오름차순

SELECT emp_no, AVG(salary)
FROM salaries
GROUP BY emp_no
HAVING AVG(salary) >= 90000
ORDER BY AVG(salary);

# titles 테이블
# 가장 많은 인원이 있는 title 레코드 하나만 출력하라~~

SELECT max(title) from titles
GROUP BY title
HAVING count(emp_no);

# employees 테이블
# 여성이면서 first_name이 'S'로 시작하고
# 고용일이 1990년 이상이신 사람들을 출력

SELECT * FROM employees
WHERE gender = 'F' 
and first_name LIKE 'S%' 
and hire_date >= '1990-01-01'
ORDER BY hire_date;

SELECT title FROM titles
GROUP BY title
HAVING COUNT(title) = (
	SELECT MAX(A.cnt)) FROM (
		SELECT COUNT(title) AS cnt
		FROM titles
		GROUP BY title
	) A
);
