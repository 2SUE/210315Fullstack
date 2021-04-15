SELECT
# 기본 | 중복 제거 |
ALL | DISTINCT | DISTINCTROW
컬럼명 | *
FROM 테이블명
WHERE 조건식 (무한대)
GROUP BY 컬럼명 (여러 컬럼명 줄 수 있음)
HAVING (GROUP BY의 조건식)
ORDER BY 레코드의 순서 조정
LIMIT 레코드 수 조정 # 게시판 글 수 제한,,, 너낌

# select문 기본 구조
SELECT 열 이름
FROM 테이블 이름
WHERE 조건