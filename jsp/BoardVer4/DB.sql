CREATE TABLE t_user(
	iuser INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	uid VARCHAR(20) NOT NULL UNIQUE, -- 중복된 값 제거
	upw VARCHAR(100) NOT NULL,
	unm VARCHAR(5) NOT NULL,
	gender INT(1) UNSIGNED CHECK(gender IN (0, 1)), -- 0과 1만 사용 가능
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

SELECT b.iboard, b.title, b.regdt, u.unm 
FROM t_board b
LEFT JOIN t_user u 
ON b.iuser = u.iuser;
CREATE TABLE `t_board_fav` (
	`iboard` INT(10) UNSIGNED NOT NULL,
	`iuser` INT(10) UNSIGNED NOT NULL,
	`regdt` DATETIME NULL DEFAULT current_timestamp(),
	PRIMARY KEY (`iboard`, `iuser`) USING BTREE,
	INDEX `iuser` (`iuser`) USING BTREE,
	CONSTRAINT `t_board_fav_ibfk_1` FOREIGN KEY (`iboard`) REFERENCES `bootboard`.`t_board` (`iboard`) ON UPDATE RESTRICT ON DELETE RESTRICT,
	CONSTRAINT `t_board_fav_ibfk_2` FOREIGN KEY (`iuser`) REFERENCES `bootboard`.`t_user` (`iuser`) ON UPDATE RESTRICT ON DELETE RESTRICT
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;