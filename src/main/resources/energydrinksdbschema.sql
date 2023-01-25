DROP TABLE IF EXISTS energy_flavors;
DROP TABLE IF EXISTS flavors;
DROP TABLE IF EXISTS nutrition_facts;
DROP TABLE IF EXISTS brands;
DROP TABLE IF EXISTS manufacturers;

  CREATE TABLE manufacturers(
  manufacturer_pk int NOT NULL AUTO_INCREMENT,
  manufacturer_name varchar(30) NOT NULL,
  PRIMARY KEY (manufacturer_PK)
  );

  CREATE TABLE brands(
  brand_pk int NOT NULL AUTO_INCREMENT,
  brand_name varchar(30) NOT NULL,
  manufacturer_fk int NOT NULL,
  PRIMARY KEY (brand_pk),
  FOREIGN KEY (manufacturer_fk) REFERENCES manufacturers (manufacturer_pk)
  );

  CREATE TABLE nutrition_facts (
  nutrition_pk int NOT NULL AUTO_INCREMENT,
  caffine varchar(30),
  calories varchar(30),
  vitamin_B6 varchar(30),
  sugar varchar(30),
  sodium varchar(30),
  PRIMARY KEY (nutrition_pk)
  );
  
  CREATE TABLE flavors (
  flavor_pk INT NOT NULL AUTO_INCREMENT,
  nutrition_fk INT NOT NULL,
  flavors VARCHAR(60) NOT NULL,
  PRIMARY KEY (flavor_pk),
  FOREIGN KEY (nutrition_fk) REFERENCES nutrition_facts (nutrition_pk) ON DELETE CASCADE
);

-- this is a conjoining table
  CREATE TABLE energy_flavors (
  brand_pk int NOT NULL,
  flavor_pk int NOT NULL,
  FOREIGN KEY (brand_pk) REFERENCES brands (brand_pk) ON DELETE CASCADE,
  FOREIGN KEY (flavor_pk) REFERENCES flavors (flavor_pk) ON DELETE CASCADE,
  UNIQUE KEY (brand_pk, flavor_pk)
);

ALTER TABLE manufacturers AUTO_INCREMENT = 1;
ALTER TABLE brands AUTO_INCREMENT = 1;
ALTER TABLE nutrition_facts AUTO_INCREMENT = 1;
ALTER TABLE flavors AUTO_INCREMENT = 1;
  
  




