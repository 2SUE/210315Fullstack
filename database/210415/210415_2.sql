# SELECT 컬럼명 FROM 테이블명

SELECT company, cost
FROM producttbl;

SELECT *
FROM producttbl
WHERE company = 'LG';

SELECT * FROM membertbl;

# memberTBL에서 memberName인 '지운이'인 레코드의 모든 컬럼
SELECT * 
FROM membertbl
WHERE memberName = '지운이';

SELECT * FROM producttbl
WHERE cost <= 10 OR company = 'LG';