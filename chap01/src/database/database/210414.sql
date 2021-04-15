CREATE DATABASE java;
DROP DATABASE java;

CREATE TABLE t_examt_exam (
	i_exam INT PRIMARY KEY,
	title VARCHAR(100),
	jumin CHAR(13),
	age INT(3) NOT NULL
); 

INSERT INTO t_exam
( I_EXAM, TITLE, JUMIN, AGE )
VALUES
( 1, '안녕하세요', '1504273000000', 25);

DROP tatle t_exam;

INSERT INTO t_exam
( I_EXAM, TITLE, JUMIN, AGE )
VALUES
( 2, '안녕하세요', '0534273000000', 25); 

INSERT INTO t_exam
( I_EXAM, TITLE, AGE )
VALUES
( 3, 'ㄴㅁㅇㄴㄴ요', 25),
( 4, '안ㄴㅁㅇㄴㅁㄴㅇ', 25);

DROP tatle t_exam;

SELECT * FROM t_exam;

/* 주석 */
-- 주석
#주석 

/*
	< CRUD > - DML 데이터 조작어
	C : 쓰기 - INSERT
	R : 읽기 - SELECT
	U : 수정 - UPDATE
	D : 삭제 - DELETE
*/