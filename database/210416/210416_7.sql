SELECT DATE_FORMAT(NOW(), '%y년 %m월 %d일 %h:%i:%s');
SELECT DATE_FORMAT(NOW(), '%Y년 %M월 %D일 %H:%I:%S');

# 											 No Alias | Yes Alias
SELECT CAST('2020-10-19 12:35:29' AS DATE) AS d_date;
SELECT CAST('2020-10-19 12:35:29' AS DATETIME) AS d_datetime;

# DB는 정수 위주
SELECT CAST('10' AS INT) + '10' + '10';

# concat : 문자열 더하기
select CONCAT('10', '10'), 'aaa' + 'bbb';

#								  삼항식 구조로 생각!
SELECT emp_no, gender
, if(gender = 'M', '남성', '여성') AS 'if문' # if(gender = 'M', '남성', if (gender = 'F', '여성', 외계인)) AS 'if문'
, case when gender = 'M'
		 then '남성'
		 ELSE '여성'
  END AS 'case문'
FROM employees;

# null 레코드 검색
SELECT salary
, IFNULL(salary, 0) AS IFNULL
, NULLIF(salary, 77057) AS NULLIF
FROM salaries
WHERE salary IS NULL
OR emp_no = 17170;