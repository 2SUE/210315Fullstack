# 1.1
CREATE TABLE T_CUSTOMER(
	cus_no INT PRIMARY KEY,
	nm CHAR(10) NOT NULL
);

CREATE TABLE T_ORDER(
	o_no INT PRIMARY KEY,
	cus_no INT REFERENCES T_CUSTOMER(cus_no),
	o_date DATE DEFAULT NOW(),
	o_price INT DEFAULT 0
);


# 1.2
INSERT INTO T_CUSTOMER
(cus_no, nm)
VALUES
(3, '홍길동'),
(5, '이순신');

INSERT INTO T_ORDER
(o_no, cus_no, o_price)
VALUES
(1, 3, 55000),
(2, 5, 70000),
(3, 3, 60000);

UPDATE T_CUSTOMER 
SET nm = '장보고'
WHERE cus_no = 5;

DELETE FROM T_ORDER 
WHERE o_no = 2;

SELECT * FROM T_ORDER;

SELECT * FROM T_CUSTOMER
WHERE cus_no = 3;

SELECT o_no, o_price
FROM T_ORDER;

# 1.3
SHOW TABLES;

SHOW INDEX FROM T_ORDER; 

SHOW FULL TABLES WHERE TABLE_TYPE LIKE 'VIEW';

# 2.1
CREATE INDEX idx_customer_nm ON T_CUSTOMER(nm);

DROP INDEX idx_customer_nm ON T_CUSTOMER;

# 2.2
SELECT *
FROM T_ORDER A
INNER JOIN T_CUSTOMER B
ON A.cus_no = B.cus_no;

SELECT o_no, o_date, o_price, nm
FROM T_ORDER A
INNER JOIN T_CUSTOMER B
ON A.cus_no = B.cus_no;

CREATE VIEW view_order_info AS
SELECT o_no, o_date, o_price, nm
FROM T_ORDER A
INNER JOIN T_CUSTOMER B
ON A.cus_no = B.cus_no;

DROP VIEW view_order_info;

SELECT * from view_order_info;
--

SELECT * FROM T_CUSTOMER;
SELECT * FROM T_ORDER;