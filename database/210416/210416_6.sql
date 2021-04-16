SELECT * FROM testTBL2;

INSERT INTO testTBL2
(userName, age)
VALUES
('이지수', 24);

/*
	<수정>
	UPDATE 테이블명
	SET 컬럼명 = 수정값
	WHERE 조건식 (레코드 지정, 대부분 PRIMARY key)
*/

UPDATE testTBL2
SET userName = '이지수'
, age = 24
WHERE id = 3;

/*
	<삭제>
	DELETE FROM 테이블명
	WHERE 조건식
*/

# id = 10 삭제
DELETE FROM testTBL2
WHERE id = 10;

# 스키마 복사x (pk복사 X) 내용, 타입만 복사
CREATE TABLE testTBL3
AS # no 알리아스, 연결해주는 거
SELECT * FROM testTBL2;

CREATE TABLE testTBL4 (SELECT * FROM testTBL2);

DROP TABLE testTBL2; # 테이블 자체를 날려벌임
DELETE FROM testTBL3; # 테이블 자체는 살아있고 (스키마 존재), 데이터만 삭제
TRUNCATE testTBL4; # 테이블 자체는 살아있고 (스키마 존재), 데이터만 삭제

SELECT * FROM testTBL2;

# insert ignore into values(값);
# 오류가 발생하면 스킵함

# 있으면 지우고 없으면 스킵
# 오류 발생이 안돼서 걍 스킵하고 다음 코드 실행
DROP TABLE if exists testTBL2; 