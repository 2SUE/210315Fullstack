-- (page-1)*recordCmt
SELECT * FROM t_board
ORDER BY iboard DESC
LIMIT 0, 5; 

-- FLOOR : 내림
-- CEIL : 올림
-- ROUND : 반올림
SELECT CEIL(COUNT(iboard) / 5) 
FROM t_board;