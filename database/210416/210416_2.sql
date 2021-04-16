# 다르다 '!=' == '<>'

SELECT * FROM titles
WHERE title != 'Staff';

SELECT * FROM titles
WHERE title <> 'Staff';

# 범위 지정 시 AND 대신 BETWEEN A AND B
SELECT * 
FROM salaries
WHERE salary >= 70000 
AND salary < 80000;

SELECT * 
FROM salaries
WHERE salary BETWEEN 70000 AND 79999; # 이상, 이하

# 복수 지정 시 컬럼명 IN ('레코드명1', '레코드명2')
SELECT * FROM titles
WHERE title = 'Staff' 
OR title = 'Engineer';

SELECT * FROM titles
WHERE title IN ('Staff', 'Engineer')

SELECT * FROM employees
WHERE first_name LIKE 'G%';