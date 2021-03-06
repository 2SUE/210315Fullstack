DROP TRIGGER IF EXISTS trg_DEL_CUSTOMER;
DELIMITER $$
CREATE TRIGGER trg_DEL_CUSTOMER
BEFORE DELETE ON t_customer
FOR EACH ROW
BEGIN
	DELETE FROM t_order
	WHERE cus_no = OLD.cus_no;
END $$
DELIMITER ;