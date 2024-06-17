-- Inserting into farmers_tbl
INSERT INTO farmers_tbl (farmerName, createdAt) VALUES ('John Doe', '2023-06-01');

-- Inserting into seasons_tbl
INSERT INTO seasons_tbl (farmName) VALUES ('Spring Season 2024');

-- Inserting into farm_tbl
INSERT INTO farm_tbl (abbrName) VALUES ('Farm A');

-- Inserting into fields_tbl
INSERT INTO fields_tbl (abbrName) VALUES ('Field 1');

-- Inserting into products
INSERT INTO products (productName) VALUES ('Wheat');

-- Inserting into harvest_submission_tbl
--INSERT INTO harvest_submission_tbl (seasonId, prodId, fieldId, farmId, createdAt)
--VALUES (1, 1, 1, 1, '2024-06-01');