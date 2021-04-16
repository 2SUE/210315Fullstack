# DDL : create, alter, drop

DROP TABLE t_exam; 

CREATE TABLE indexTBL (
	first_name VARCHAR(14),
	last_name VARCHAR(16),
	hire_date DATE
);

# 데이터 삽입
INSERT INTO indexTBL
(first_name, last_name, hire_date)
SELECT first_name, last_name, hire_date
FROM employees.employees
LIMIT 1000; # 1000 레코드만

explain SELECT * FROM indextbl 
WHERE first_name = 'Mary';

# explain 
# type - ALL이면 전수조사 함
# type - ref이면 전수조사 안 함
# 			> 속도가 빠름

CREATE INDEX idx_indexTBL_firstname
ON indextbl(first_name);