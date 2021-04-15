CREATE TABLE memberTBL (
	memberID CHAR(8) PRIMARY KEY, # PRIMARY KEY - NOT NULL 자동으로 들어감
	memberName CHAR(5) NOT NULL,
	memberAddress CHAR(20) # NULL 생략 가능 
);

/*
	VARCHAR(n) : 지정한 자리 만큼 용량 차지 
	CHAR(n)    : 사용한 만큼만 용량 차지
*/

CREATE TABLE productTBL (
	productName CHAR(4) PRIMARY KEY,
	cost INT NOT NULL,
	makeDate DATE,
	company CHAR(5),
	amount INT NOT NULL
);

# DML : insert select, update, delete

INSERT INTO membertbl
( memberID, memberName, memberAdress )
VALUES 
( 'Dang', '당탕이', '경기 부천시 중동' ),
( 'Jee', '지운이', '서울 은평구 증산동' ),
( 'Han', '한주연', '인천 남구 주안동' ),
( 'Sang', '상길이', '경기 성남구 분당구' );

SELECT * FROM membertbl;

INSERT INTO productTBL
( productName, cost, MAKEDATE, company, amount )
VALUES 
( '컴퓨터', 10, '2017-01-01', '삼성', 17),
( '세탁기', 20, '2018-09-01', 'LG', 3),
( '냉장고', 5, '2019-02-01', '대우', 22);

SELECT * FROM producttbl;