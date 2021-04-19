# 데이터 모델링 툴 https://www.devart.com/dbforge/?gclid=EAIaIQobChMI5KWes8eJ8AIVBnZgCh3r0AVjEAAYASAAEgLYZ_D_BwE

SELECT 
B.nm, C.cls, A.score
FROM t_score A
INNER JOIN t_student B
ON A.s_id = B.s_id
INNER JOIN t_class C
ON A.c_id = C.c_id;

SELECT * FROM t_score;

SELECT B.ph, B.nm, B.s_id
, A.s_id, A.score, A.c_id
, B.ph, B.nm, A.s
FROM t_score A
INNER JOIN t_student B
ON A.s_id = B.s_id
INNER JOIN t_class C
ON A.c_id = C.c_id; 