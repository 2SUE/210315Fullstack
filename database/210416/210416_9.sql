SELECT *
, CONCAT(first_name, ' ', last_name
, ' ', gender, 'ㅎ-ㅎ') AS full_name1
, CONCAT_WS(' ', first_name, last_name
, gender) AS full_name2
FROM employees;

# 소수점 자리 조절
SELECT FORMAT(1234.4565644656556, 2);

# 1000단위 콤마 -> 문자열이 되는 마법
SELECT FORMAT(34565664646500, 0);

SELECT *, INSERT(dept_no, 2, 2, 'i')
FROM dept_emp;

SELECT *
, LOWER(LEFT(first_name, 2))
, LCASE(first_name) # == lower
, UPPER(RIGHT(first_name, 3))
, UCASE(first_name) # == Upper
FROM employees;

# 10자리 공간 확보, 남은 자리 #로 채우기
SELECT 
first_name
, LPAD(first_name, 10, '#')
FROM employees;

# 양 옆 공백 제거
SELECT TRIM('                            안녕                          ') AS hi ;

# 해당 문자열 교체
SELECT REPLACE('                            안녕                          ', ' ', '!') AS hi;

SELECT birth_date
, LEFT(birth_date, 4) AS year
, SUBSTRING(birth_date, 6, 2) AS mon # 6번째부터 2개
, RIGHT(birth_date, 2) AS day
, cast(RIGHT(birth_date, 2) AS INT) AS day_int # 정수로 형변환
FROM employees;