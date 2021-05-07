proc_INSERT_ORDERDROP PROCEDURE IF EXISTS proc_INSERT_ORDER;

DELIMITER $$
CREATE PROCEDURE proc_INSERT_ORDER (
	i_no INT,
	i_cus_no INT,
	i_price INT
)
BEGIN
	INSERT INTO t_order (o_no, cus_no, o_price)
	VALUES (i_no, i_cus_no, i_price);
	
	COMMIT;
END $$
DELIMITER ;

CALL proc_INSERT_ORDER(11, 5, 3);