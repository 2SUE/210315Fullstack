# <전체 테이블 조회>
SHOW TABLES;

# <인덱스 조회>
SHOW INDEX FROM 테이블명; 

# <전체 뷰 조회>
SHOW FULL TABLES WHERE TABLE_TYPE LIKE 'VIEW';

SELECT 'a' = 'b';

# <인덱스 설정>
CREATE INDEX 인덱스이름 ON 테이블명(컬럼명);

CREATE INDEX idx_abcd ON membertbl(memberName);

# <인덱스 삭제>
DROP INDEX 인덱스명 ON 테이블명;

DROP INDEX idx_abcd ON membertbl;

# <View 생성 - 가상 테이블>
CREATE VIEW view_abcd AS
SELECT * FROM membertbl
WHERE memberName LIKE '%이%';

# view 내에서 조건문을 걸 수 있다!
SELECT * FROM view_abcd
WHERE memberID = 'Dang';