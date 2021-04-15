# emp_no가 10600번 이상인 레코드가 나타나도록 해주세요.
USE employees;
SELECT * 
FROM titles
WHERE emp_no >= 10600;

# emp_no가 10600번 이상이면서 title이 'Staff'인 레코드가 나타나도록 해주세요.
SELECT *
FROM titles
WHERE emp_no >= 10600 AND title='Staff';

# emp_no가 10000 이상이면서 20000 이하인 레코드가 나타나도록 해주세요.
SELECT * 
FROM titles
WHERE 10000 <= emp_no AND emp_no <= 20000; 

SELECT * 
FROM titles
WHERE emp_no BETWEEN 10500 AND 20000; 

# title 값이 Engineer, Staff
SELECT *
FROM titles
WHERE title = 'engineer' 
OR title = 'Staff';

SELECT *
FROM titles
WHERE title IN ('engineer', 'Staff');

SELECT * 
FROM employees
WHERE first_name LIKE 'G%' ;

SELECT *
FROM employees
WHERE last_name LIKE '%M';

SELECT * 
FROM employees
WHERE first_name LIKE '%MA%';