SELECT * FROM employees
WHERE gender = 'F';

SELECT gender FROM employees
WHERE emp_no = 10110;

# 위 두 쿼리문을 하나로 합친 형태 (이중 쿼리인가 다중 쿼리인가)
SELECT * FROM employees 
WHERE gender = (
	SELECT gender FROM employees
	WHERE emp_no = 10110
);

SELECT * FROM titles
WHERE title IN (
	SELECT title FROM titles
	WHERE emp_no = 10007
);

# emp_no에 중복이 있을 때 ,를 사용해서 다른 컬럼을 정렬할 수 있다.
SELECT * FROM salaries
ORDER BY emp_no DESC, salary;

# 중복 제거
SELECT DISTINCT title FROM titles;

# 중복된 값을 찾아보자,,,
SELECT *
FROM titles
GROUP BY emp_no, title
HAVING COUNT(emp_no) > 1;