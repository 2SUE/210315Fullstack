USE employees; # 사용할 DB 선택

SHOW DATABASES;

SHOW TABLES;		 # 간단간단 
SHOW TABLE STATUS; # 세세

SELECT 
emp_no, emp_no AS 'eno'
FROM titles;

# AS (Alias) 별칭