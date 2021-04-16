# kang 강성헌 대구 달서구 용산동

SELECT * FROM membertbl;
INSERT INTO membertbl
(memberID, memberName, memberAdress)
VALUES 
('kang', '강성헌', '대구 달서구 용산동');

# AUTO_INCREMENT 자동으로 증가,,
# int형, primary key 컬럼에만 사용 가능
# insert로 값 넣을 때 신경 안 써도 댐

CREATE TABLE testTBL2 (
	id INT AUTO_INCREMENT,
	userName CHAR(3),
	age INT,
	PRIMARY KEY(id) # primary key를 여러 개 사용할 때
);

INSERT INTO testTBL2
(userName, age)
VALUES
('지민', 25),
('유나', 22),
('유경', 21);

SELECT * FROM testTBL2;

# 다른 테이블 값 넣기 ~.~
INSERT INTO testTBL2
(userName, age)
SELECT userName, age
FROM testTBL2;

SELECT userName, 30
FROM testTBL2;

INSERT INTO testTBL2
(userName, age)
SELECT userName, 30
FROM testTBL2;

INSERT INTO testTBL2
(userName, age)
SELECT '지수', age
FROM testTBL2
LIMIT 2;