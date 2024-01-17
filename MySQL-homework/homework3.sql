DROP DATABASE IF EXISTS homework2;
CREATE DATABASE homework2;
USE homework2;

-- QUESTION 1
-- Question 1a
CREATE TABLE city (
	id INTEGER PRIMARY KEY,
    city_name VARCHAR(50) NOT NULL
)
;

CREATE TABLE product (
	id INTEGER PRIMARY KEY,
    sku VARCHAR(32) NOT NULL,
    product_name VARCHAR(128) NOT NULL,
    product_description TEXT NOT NULL,
    current_price DECIMAL(8,2) NOT NULL,
    quantity_in_stock INTEGER NOT NULL
)
;

CREATE TABLE customer (
	id INTEGER PRIMARY KEY,
    customer_name VARCHAR(255) NOT NULL,
    city_id INTEGER NOT NULL,
    customer_address VARCHAR(255) NOT NULL,
    contact_person VARCHAR(255),
    email VARCHAR(128) NOT NULL,
    phone VARCHAR(128) NOT NULL,
    FOREIGN KEY (city_id) REFERENCES city (id)
)
;

CREATE TABLE invoice (
	id INTEGER PRIMARY KEY,
    invoice_number VARCHAR(255) NOT NULL,
    customer_id INTEGER NOT NULL,
    user_account_id INTEGER NOT NULL,
    total_price DECIMAL(8,2) NOT NULL,
    time_issued DATETIME,
    time_due DATETIME,
    time_paid DATETIME,
    time_cancelled DATETIME,
    time_refunded DATETIME,
    FOREIGN KEY (customer_id) REFERENCES customer (id)
)
;

CREATE TABLE invoice_item (
	id INTEGER PRIMARY KEY,
    invoice_id INTEGER NOT NULL,
    product_id INTEGER NOT NULL,
    quantity INTEGER NOT NULL,
    price DECIMAL(8,2) NOT NULL,
    line_total_price DECIMAL(8,2) NOT NULL,
    FOREIGN KEY (invoice_id) REFERENCES invoice (id),
    FOREIGN KEY (product_id) REFERENCES product (id)
)
;

-- Question 1b
-- DELETE FROM city;
INSERT INTO city VALUES 
(1, 'Cityname1'),
(2, 'Cityname2'),
(3, 'Cityname3'),
(4, 'Cityname4'),
(5, 'Cityname5'),
(6, 'Cityname6'),
(7, 'Cityname7'),
(8, 'Cityname8')
;

-- DELETE FROM customer;
INSERT INTO customer VALUES
(1, 'Daisy', 1, '128 Wealthy Rd', 'Kenneth', 'daisy@123.com', '23452345'),
(2, 'Sally', 2, '13 No Return Rd', 'Tommy', 'sally@123.com', '22232345'),
(3, 'Mary', 3, '1 Inifinity Rd', 'Lucy', 'mary@123.com', '21152345');

-- DELETE FROM product;
INSERT INTO product (id, sku, product_name, product_description, current_price, quantity_in_stock) VALUES
(1, '220-1101', 'Surgery Mask', 'N-95 Surgery Mask x 50', 100, 1000),
(2, '220-1102', 'Panadol', 'Pills for pains x 25', 50, 200),
(3, '220-1103', 'Handwasher', 'Handwash soap foam 200mL', 20, 200),
(4, '220-1104', 'Alcohol Gel', '70% Alcohol gel 50mL', 10, 200);

-- DELETE FROM invoice;
INSERT INTO invoice (id, invoice_number, customer_id, user_account_id, total_price) VALUES 
(1, 'IN-20230105001', 1, 41,  5000),
(2, 'IN-20230110002', 2, 42,  1000);

-- DELETE FROM invoice_item
INSERT INTO invoice_item (id, invoice_id, product_id, quantity, price, line_total_price) VALUES
(1, 1, 1, 40, 100, 4000),
(2, 1, 2, 10, 50, 500),
(3, 1, 4, 50, 10, 500),
(4, 2, 2, 20, 50, 1000);

-- Question 1c
SELECT 'customer' AS 'type', c.id AS id, c.customer_name AS 'name'
FROM customer c
LEFT JOIN invoice i ON i.customer_id = c.id
WHERE i.id IS NULL
UNION
SELECT 'product' AS 'type', p.id AS id, p.product_name as 'name'
FROM product p
LEFT JOIN invoice_item ii ON p.id = ii.product_id
WHERE ii.invoice_id IS NULL;

-- QUESTION 2
-- DROP TABLE department
CREATE TABLE department (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    dept_code VARCHAR(3) NOT NULL,
    dept_name VARCHAR(200) NOT NULL
);

-- DROP TABLE employee;
CREATE TABLE employee (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(30) NOT NULL,
    salary NUMERIC(8,2),
    phone NUMERIC(15),
    email VARCHAR(50),
    dept_id INTEGER NOT NULL,
    FOREIGN KEY (dept_id) REFERENCES department (id)
);


-- DELETE FROM department;
INSERT INTO department VALUES (1, 'HR', 'HUMAN RESOURCES');
INSERT INTO department VALUES (2, '9UP', '9UP RESOURCES');
INSERT INTO department VALUES (3, 'SA', 'SALES RESOURCES');
INSERT INTO department VALUES (4, 'IT', 'INFORMATION TECHNOLOGY RESOURCES');

-- DELETE FROM employee;
INSERT INTO employee VALUES (1, 'JOHN', 20000, 90234567, 'JOHN@GMAIL>COM', 1);
INSERT INTO employee VALUES (2, 'MARY', 10000, 90234561, 'MARY@GMAIL>COM', 1);
INSERT INTO employee VALUES (3, 'STEVE', 30000, 90234562, 'STEVE@GMAIL>COM', 3);
INSERT INTO employee VALUES (4, 'SUNNY', 40000, 90234563, 'SUNNY@GMAIL>COM', 4);

-- Question 2a
SELECT d.dept_code, count(e.id) AS num_of_employees
FROM department d
LEFT JOIN employee e ON e.dept_id = d.id
GROUP BY d.id
ORDER BY num_of_employees DESC, d.dept_code ASC;

-- Question 2b
INSERT INTO department VALUES (5, 'IT', 'INFORMAITON TECHNOLOGY DEPARTMENT');
-- Insertion is done sucessfully, since the only constraint in department table is department (id) as PRIMARY KEY.
-- No constraint UNIQUE is set on (dept_code) and (dept_name), so the code and name of department could be duplicated  
