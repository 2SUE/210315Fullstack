CREATE DATABASE apartment;

CREATE TABLE location_code (
	cd INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	local_nm nvarchar(5) NOT NULL,
	external_cd CHAR(5) NOT NULL 
);

INSERT INTO location_code
(local_nm, external_cd)
VALUES
('중구', '27110'),
('동구', '27140'),
('서구', '27170'),
('남구', '27200'),
('북구', '27230'),
('수성구', '27260'),
('달서구', '27290'),
('달성구', '27710');

CREATE TABLE apartment_info(
	i_ai INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	deal_amount INT UNSIGNED NOT NULL,
	build_year CHAR(4) NOT NULL,
	deal_year CHAR(4) NOT NULL,
	deal_month CHAR(2) NOT NULL,
	deal_day CHAR(6) NOT NULL,
	dong nvarchar(40) NOT NULL,
	apartment_name nvarchar(40) NOT NULL,
	area_for_exclusive_use FLOAT NOT NULL,
	jibun nvarchar(10) NOT NULL,
	flr INT UNSIGNED NOT NULL COMMENT '층',
	location_cd INT UNSIGNED NOT NULL,
	FOREIGN KEY(location_cd) REFERENCES location_code(cd)
);

DROP TABLE apartment_info;