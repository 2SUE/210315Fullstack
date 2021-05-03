/*
	<제약조건>
	잘못된 값이 입력되는 걸 막기 위해 설정 
	ex) pk, fk, check, not null etc
	
	<정규화>
	데이터를 깔끔하게 저장하기 위해서 
	
	관리, 저장에 용이하지만 속도가 느림
*/

/*
	Foreign key FK (외래키)
*/

# 				 예약어를 피하기 위헤,,
CREATE TABLE t_student (
	s_id INT UNSIGNED PRIMARY KEY,
	nm VARCHAR(3) NOT NULL,
	ph CHAR(13)
);

SELECT * FROM t_student;

INSERT INTO t_student (s_id, nm)
VALUES (1111, '갑');n

INSERT INTO t_student (s_id, nm, ph)
VALUES
(1112, '을', '010-1111-1111'),
(1113, '병', '010-2222-2222');

INSERT INTO t_student (s_id, nm)
VALUES (1114, '정');

CREATE TABLE t_class (
	c_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,  # UNSIGNED 음수 사용x
	cls VARCHAR(5) NOT NULL,
	teacher VARCHAR(5) NOT NULL
);

SELECT * FROM t_class;

INSERT INTO t_class (cls, teacher)
VALUES
('수학', '김하나'),
('과학', '판테온'),
('국어', '오징어');

INSERT INTO t_class (cls, teacher)
VALUES ('영어', '김둘');


CREATE TABLE t_score (
	s_id INT UNSIGNED, # 타입, 조건이 같아야 함
	c_id INT UNSIGNED,
	score INT,
	PRIMARY KEY (s_id, c_id),
	/* FOREIGN KEY 이름 설정 CONSTRAINT FK_sid */ 
	FOREIGN KEY (s_id) REFERENCES t_student(s_id),
	FOREIGN KEY (c_id) REFERENCES	t_class(c_id)
); 

SELECT * FROM t_score;

INSERT INTO t_score (s_id, c_id, score)
VALUES
(1111, 2, 100);

INSERT INTO t_score (s_id, c_id, score)
VALUES
(1114, 2, 100);