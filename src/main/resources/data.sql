merge into `role` values (1, 'USER');

-- insert into `product` (ID, BREAST, BUTTONS, COLOR, FABRIC, LAPEL, LINING, NAME, PRICE, QUANTITY, IMAGE_URL)
-- values (8, 'SINGLE', 2, 'BLACK', 'COTTON', 'NOTCH', 'SILK', 'MOTLEY', 1200, 4, '01-thumbnail.jpg');

insert into product (ID, BREAST, BUTTONS, COLOR, FABRIC, LAPEL, LINING, NAME, PRICE, QUANTITY, IMAGE_URL)
values (1, 'SINGLE', 2, 'BLACK', 'COTTON', 'NOTCH', 'SILK', 'MOTLEY', 1200, 4, '01-thumbnail.jpg'),
(2, 'SINGLE', 2, 'RED', 'CASHMERE', 'SHAWL', 'POLY', 'DAPPER', 1400, 3, '02-thumbnail.jpg'),
(3, 'SINGLE', 2, 'BLACK', 'COTTON', 'SLIM PEAK', 'COTTON', 'ONYX', 1100, 5, '03-thumbnail.jpg'),
(4, 'SINGLE', 2, 'GREY', 'WOOL', 'MID PEAK', 'SILK', 'TERRA FIRMA', 1100, 5, '04-thumbnail.jpg'),
(5, 'SINGLE', 2, 'BLACK', 'LINEN', 'WIDE NOTCH', 'SILK', 'MATTE', 1300, 2, '05-thumbnail.jpg'),
(6, 'SINGLE', 2, 'NAVY', 'CASHMERE', 'SLIM NOTCH', 'SILK', 'INVICTUS', 1500, 3, '06-thumbnail.jpg');

-- 1	SINGLE	2	BLACK	COTTON	NOTCH	SILK	MOTLEY	1200.0	4	/static/images/01-thumbnail.jpg
-- 2	SINGLE	2	RED	CASHMERE	SHAWL	POLY	DAPPER	1400.0	3	/static/images/02-thumbnail.jpg
-- 3	SINGLE	2	BLACK	COTTON	SLIM PEAK	COTTON	ONYX	1100.0	5	/static/images/03-thumbnail.jpg
-- 4	SINGLE	2	GREY	WOOL	MID PEAK	SILK	TERRA FIRMA	1100.0	5	/static/images/04-thumbnail.jpg
-- 5	SINGLE	2	BLACK	LINEN	WIDE NOTCH	SILK	MATTE	1300.0	2	/static/images/05-thumbnail.jpg
-- 6	SINGLE	2	NAVY	CASHMERE	SLIM NOTCH	SILK	INVICTUS	1500.0	3	/static/images/06-thumbnail.jpg