-- Manufacturers table
INSERT INTO manufacturers (manufacturer_name) VALUES ('coca cola');
INSERT INTO manufacturers (manufacturer_name) VALUES ('pepsi');

-- Brands table
INSERT INTO brands (brand_name, volume, manufacturer_fk) VALUES('RED_BULL', '8oz', '1');
INSERT INTO brands (brand_name, volume, manufacturer_fk) VALUES('RED_BULL', '12oz', '1');
INSERT INTO brands (brand_name, volume, manufacturer_fk) VALUES('RED_BULL', '16oz', '1');
INSERT INTO brands (brand_name, volume, manufacturer_fk) VALUES('MONSTER', '12oz', '1');
INSERT INTO brands (brand_name, volume, manufacturer_fk) VALUES('MONSTER', '16oz', '1');
INSERT INTO brands (brand_name, volume, manufacturer_fk) VALUES('MONSTER', '24oz', '2');
INSERT INTO brands (brand_name, volume, manufacturer_fk) VALUES('ROCKSTAR', '12oz', '2');
INSERT INTO brands (brand_name, volume, manufacturer_fk) VALUES('ROCKSTAR', '16oz', '2');
INSERT INTO brands (brand_name, volume, manufacturer_fk) VALUES('XYIENCE_XENERGY', '16oz', '2');

-- nutrition facts table
-- original redbull 8oz 1
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('80mg', '168cal', '360%', '37g', '230mg');

-- blueberry redbull 2
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('80mg', '168cal', '360%', '37g', '230mg');

-- original monster 16oz 3
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('86mg', '101cal', '100%', '27g', '180mg');

-- original rockstar 16oz 4
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('160mg', '270cal', '100%', '63g', '70mg');

-- sugar free redbull 8oz 5
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('80mg', '5cal', '250%', '0g', '100mg');

-- sugar free monster 16oz 6
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('140mg', '10cal', '240%', '0g', '380mg');

-- sugar free Rockstar 16oz 7
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('160mg', '5cal', '100%', '0g', '240mg');

-- Frostberry Xyience xenergy 16oz 8
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('176mg', '0cal', '500%', '0g', '320mg');

-- Cherrylime Xyience Xenergy 16oz 9
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('176mg', '0cal', '500%', '0g', '320mg');

-- Grape Xyience Xenergy 16oz 10
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('176mg', '0cal', '500%', '0g', '320mg');

-- blueberry rockstar 16oz 11
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('80mg', '0cal', '90%', '0g', '50mg');

-- mango xyience 16oz 12
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('160mg', '20cal', '200%', '0g', '230mg');

-- mango rockstar 16oz 13
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('240mg', '240cal', '100%', '61g', '150mg');

-- fig apple redbull 12oz 14
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('114mg', '160cal', '350%', '38g', '130mg');

-- Tropical redbull 12oz 15
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('114mg', '160cal', '350%', '38g', '200mg');

-- Dragon fruit redbull 16
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('114mg', '160cal', '350%', '38g', '125mg');

-- monster rehab 16oz 17
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('158mg', '25cal', '230%', '3g', '230mg');

-- monster ultra paradise 16oz 18
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('140mg', '10cal', '240%', '0g', '310mg');

-- monster java loca moca 16oz 19
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('200mg', '220cal', '220%', '35g', '450mg');

-- monster juice khaotic 16oz 20
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('188mg', '160cal', '240%', '37g', '115mg');

-- Rockstar fruit punch 16oz 21
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('240mg', '250cal', '100%', '61g', '110mg');

-- Rockstar hardcore apple 16oz 22
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('240mg', '250cal', '100%', '61g', '110mg');

-- rockstar grape pure zero 16oz 23
INSERT INTO nutrition_facts (caffine, calories, vitamin_B6, sugar, sodium) VALUES('240mg', '20cal', '100%', '0g', '260mg');


-- Flavors table
-- Multiple brands
INSERT INTO flavors (nutrition_fk, flavors) VALUES('5','Sugar free');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('6','Sugar free');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('7','Sugar free');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('1','Original');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('3','Original');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('4','Original');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('2','Blueberry');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('11','Blueberry');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('12','Mango');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('13','Mango');

-- RED BULL
INSERT INTO flavors (nutrition_fk, flavors) VALUES('14', 'Fig Apple');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('15', 'Tropical');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('16', 'Dragon Fruit');

-- Monster
INSERT INTO flavors (nutrition_fk, flavors) VALUES('17', 'Rehab');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('18', 'Ultra Paradise');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('19', 'Java Loca Moca ');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('20', 'Juice Monster Khaotic');

-- Rockstar
INSERT INTO flavors (nutrition_fk, flavors) VALUES('21', 'Fruit Punch');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('22', 'Grape Pure Zero');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('23', 'Hardcore Apple Punched');

-- Xyience_xenergy
INSERT INTO flavors (nutrition_fk, flavors) VALUES('8', 'Frostberry');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('9', 'Cherrylime');
INSERT INTO flavors (nutrition_fk, flavors) VALUES('10', 'Grape');


-- Junction table
-- RED BULLs
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('1', '1');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('1', '4');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('1', '7');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('1', '11');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('1', '12');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('1', '13');

-- MONSTER
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('5', '1');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('5', '4');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('5', '14');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('5', '15');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('5', '16');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('5', '17');

-- ROCKSTART
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('8', '1');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('8', '4');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('8', '9');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('8', '18');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('8', '19');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('8', '20');

-- Xyience Xenergy
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('9', '21');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('9', '22');
INSERT INTO energy_flavors (brand_pk, flavor_pk) VALUES('9', '23');






