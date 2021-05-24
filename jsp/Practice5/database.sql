CREATE DATABASE Practice5;

CREATE TABLE t_board (
	iboard INT UNSIGNED PRIMARY key AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	ctnt VARCHAR(500) NOT NULL,
	regdt DATETIME DEFAULT NOW()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SELECT * FROM t_board;

DELETE FROM t_board WHERE iuser = 1 AND iboard = 1;


CREATE TABLE t_user(
	iuser INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	uid VARCHAR(20) NOT NULL UNIQUE,
	upw VARCHAR(100) NOT NULL,
	unm VARCHAR(5) NOT NULL,
	gender INT(1) UNSIGNED CHECK(gender IN (0, 1)),
	regdt DATETIME DEFAULT NOW()
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
