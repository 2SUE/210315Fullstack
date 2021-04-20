CREATE TABLE t_board (
	iboard INT UNSIGNED PRIMARY KEY auto_increment,
	title VARCHAR(100) NOT NULL,
	ctnt VARCHAR(500) NOT NULL,
	r_dt DATETIME DEFAULT NOW()
);

CREATE TABLE t_cmt (
	icmt INT UNSIGNED PRIMARY KEY auto_increment,
	iboard INT UNSIGNED,
	ctnt VARCHAR(100) NOT NULL,
	r_dt DATETIME DEFAULT NOW() # DEFAULT : 기본값으로 날짜 시간 입력
);

SELECT * FROM t_board;

SELECT * FROM t_cmt;

INSERT INTO t_board
(title, ctnt)
VALUES 
('mariaDB 사용법', '잘 사용하세요..');

INSERT INTO t_cmt
(iboard, ctnt)
VALUES
(1, '저도 그랬습니다.');

# 둘 다 있는 레코드 출력
SELECT A.*, B.*
FROM t_board A
INNER JOIN t_cmt B
ON A.iboard = B.iboard;

# 모든 레코드 출력
SELECT A.*, B.*, IFNULL(B.ctnt, '댓글 없음')
FROM t_board A
LEFT JOIN t_cmt B
ON A.iboard = B.iboard;

SELECT A.iboard
FROM t_board A
LEFT JOIN t_cmt B
ON A.iboard = B.iboard
WHERE B.ctnt IS NULL;