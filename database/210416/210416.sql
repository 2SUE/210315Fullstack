SELECT 컬럼명
FROM 테이블명
WHERE 조건식 (레코드 수 관련)
GROUP BY ~~별 (통계낼 때 주로 사용)
HAVING 그룹 바이의 조건식
ORDER BY 뽑아낸 레코드의 순서
LIMIT 제한 수
LIMIT 10 (처음부터 10개)
LIMIT 10, 20 (10번째부터 20개)

USE 데이터베이스명; 쿼리가 영향을 주는 DB 선택

SELECT 1 + 1 AS SUM; 컬럼명을 alias로 변경
WHERE 절에서 AS 명으로 사용 안 됨 (해빙, 오더 바이에서 사용 가능)