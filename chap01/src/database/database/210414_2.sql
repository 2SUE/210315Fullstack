SELECT * FROM t_exam;

UPDATE t_exam
SET age = 30
WHERE i_exam = 1; -- WHERE절이 없으면 모든 age=30으로 세팅

UPDATE t_exam
SET age = 35
WHERE i_exam = 2;

DELETE FROM t_exam
WHERE i_exam = 3; -- WHERE절이 없으면 모두 제거