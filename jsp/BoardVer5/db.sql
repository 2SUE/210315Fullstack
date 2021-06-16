CREATE TABLE t_user(
	iuser INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	uid VARCHAR(20) NOT NULL UNIQUE,
	upw VARCHAR(100) NOT NULL,
	unm VARCHAR(5) NOT NULL,
	gender INT(1) UNSIGNED CHECK(gender IN (0, 1)),
	regdt DATETIME DEFAULT NOW(),
	profileImg VARCHAR(50)
);

SELECT * FROM t_user;

CREATE TABLE t_board(
	iboard INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	ctnt VARCHAR(2000) NOT NULL,
	iuser INT UNSIGNED,
	
	regdt DATETIME DEFAULT NOW(),
	FOREIGN KEY (iuser) REFERENCES t_user (iuser)
);

SELECT * FROM t_board;

CREATE TABLE t_board_cmt (
	icmt INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	iboard INT UNSIGNED,
	iuser INT UNSIGNED,
	cmt VARCHAR(400) NOT NULL,
	regdate DATE DEFAULT NOW(),
	FOREIGN KEY (iboard) REFERENCES t_board(iboard),
	FOREIGN KEY (iuser) REFERENCES t_user(iuser)
);

SELECT * FROM t_board_cmt;

CREATE TABLE t_board_fav (
	iboard INT UNSIGNED,
	iuser INT UNSIGNED,
	regdt DATETIME DEFAULT NOW(),
	PRIMARY KEY(iboard, iuser),
	FOREIGN KEY (iboard) REFERENCES t_board(iboard),
	FOREIGN KEY (iuser) REFERENCES t_user(iuser)
);

SELECT * FROM t_board_fav;

SELECT B.unm, A.iboard, A.title, A.ctnt, A.iuser, A.regdt
-- C.iboard가 null이면 0, not null이면 1
, if(C.iboard IS NULL, 0, 1) AS isFav
FROM t_board A
INNER JOIN t_user B
ON A.iuser = B.iuser
LEFT JOIN t_board_fav C
ON A.iboard = C.iboard
AND C.iuser = 3
WHERE A.iboard = 4;

DROP TABLE db_user;

CREATE TABLE t_user (
	i_user INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	uid VARCHAR(30) NOT NULL,
	upw VARCHAR(255) NOT NULL,
	nm VARCHAR(10) NOT NULL,
	r_dt DATETIME NOT NULL DEFAULT NOW()
);