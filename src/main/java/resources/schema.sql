DROP TABLE IF EXISTS farmers_tbl;
DROP TABLE IF EXISTS seasons_tbl;
DROP TABLE IF EXISTS farm_tbl;
DROP TABLE IF EXISTS fields_tbl;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS harvest_submission_tbl;

CREATE TABLE farmers_tbl (
    usersId INT NOT NULL AUTO_INCREMENT,
    farmerName VARCHAR(100) DEFAULT NULL,
    createdAt DATE DEFAULT NULL,
    updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (usersId),
    UNIQUE (usersId)
);

CREATE TABLE seasons_tbl (
    seasonId INT NOT NULL AUTO_INCREMENT,
    farmName VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY (seasonId),
    UNIQUE (seasonId)
);

CREATE TABLE farm_tbl (
    farmId INT NOT NULL AUTO_INCREMENT,
    abbrName VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY (farmId),
    UNIQUE (farmId)
);

CREATE TABLE fields_tbl (
    fieldId INT NOT NULL AUTO_INCREMENT,
    abbrName VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY (fieldId),
    UNIQUE (fieldId)
);

CREATE TABLE products (
    prodId INT NOT NULL AUTO_INCREMENT,
    productName VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY (prodId),
    UNIQUE (prodId)
);

CREATE TABLE harvest_submission_tbl (
    harvestId INT NOT NULL AUTO_INCREMENT,
    submitId varchar(200),
    seasonId INT,
    prodId INT,
    fieldId INT,
    farmId INT,
    plantingArea double,
    expectedYield double,
    actualYield double,
    createdAt DATE DEFAULT NULL,
    updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (harvestId),
    UNIQUE (harvestId),
    FOREIGN KEY (seasonId) REFERENCES seasons_tbl(seasonId),
    FOREIGN KEY (prodId) REFERENCES products(prodId),
    FOREIGN KEY (fieldId) REFERENCES fields_tbl(fieldId),
    FOREIGN KEY (farmId) REFERENCES farm_tbl(farmId)
);