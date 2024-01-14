DROP DATABASE homework1;
CREATE DATABASE homework1;
USE homework1;


-- Question 1:
CREATE TABLE regions (
    region_id INTEGER PRIMARY KEY,
    region_name VARCHAR(25)
)
;

CREATE TABLE countries (
	country_id CHAR(2) PRIMARY KEY,
    country_name VARCHAR(40),
    region_id INTEGER,
    FOREIGN KEY (region_id) REFERENCES regions (region_id)
)
;

CREATE TABLE locations (
	location_id INTEGER PRIMARY KEY,
    street_address VARCHAR(25),
    postal_code VARCHAR(12),
    city VARCHAR(30),
    state_province VARCHAR(12),
    country_id CHAR(2),
    FOREIGN KEY (country_id) REFERENCES countries (country_id)
)
;

CREATE TABLE departments (
	department_id INTEGER PRIMARY KEY,
    department_name VARCHAR(30),
    manager_id INTEGER,
    location_id INTEGER,
    FOREIGN KEY (location_id) REFERENCES locations (location_id)   
)
;

CREATE TABLE jobs (
	job_id VARCHAR(10) PRIMARY KEY,
    job_title VARCHAR(35),
    min_salary INTEGER,
    max_salary INTEGER
)
;

CREATE TABLE employees (
	employee_id INTEGER PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(25),
    email VARCHAR(25),
    phone_number VARCHAR(20),
    hire_date DATE,
    job_id VARCHAR(10),
    salary DECIMAL(8,2),
    commission_pct DECIMAL(8,2),
    manager_id INTEGER,
    department_id INTEGER,
    FOREIGN KEY (job_id) REFERENCES jobs (job_id),
    FOREIGN KEY (department_id) REFERENCES departments (department_ID)
)
;

CREATE TABLE job_history (
	employee_id INTEGER NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE,
    job_id VARCHAR(10),
    department_id INTEGER,
    PRIMARY KEY(employee_id, start_date),
    FOREIGN KEY (job_id) REFERENCES jobs (job_id),
    FOREIGN KEY (department_id) REFERENCES departments (department_id)
)
;

-- QUESTION 2
INSERT INTO regions VALUES (1, 'Berlin');
INSERT INTO regions VALUES (2, 'Washington D.C.');
INSERT INTO regions VALUES (3, 'Tokyo');
INSERT INTO regions VALUES (4, 'Rome');

INSERT INTO countries VALUES ('DE', 'Germany', 1);
INSERT INTO countries VALUES ('IT', 'Italy', 4);
INSERT INTO countries VALUES ('JP', 'Japan', 3);
INSERT INTO countries VALUES ('US', 'United States', 2);

-- SELECT *
-- FROM countries c, regions r 
-- WHERE c.region_id = r.region_id
-- ;    

INSERT INTO locations (location_id, street_address, postal_code, city, country_id) VALUES (1000, '1297 Via Cola di Rie', '989', 'Roma', 'IT');
INSERT INTO locations (location_id, street_address, postal_code, city, country_id) VALUES (1100, 'Valle della Te', '10934', 'Venice', 'IT');
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id) VALUES (1200, 'Shinjuku-ku', '1689', 'Tokyo', 'Tokyo', 'JP');
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id) VALUES (1400, 'Jabberworky Rd', '26192', 'Southlake', 'Texas', 'US');

-- SELECT *
-- FROM locations
-- ;

INSERT INTO departments VALUES (10, 'Administration', 109, 1100);
INSERT INTO departments VALUES (20, 'Marketing', 105, 1200);
INSERT INTO departments VALUES (30, 'Purchasing', 106, 1400);
INSERT INTO departments VALUES (40, 'Information Technology', 108, 1000);
INSERT INTO departments (department_id, department_name, location_id) VALUES (1, 'Management Board', 1100);

-- SELECT *
-- FROM departments
-- ;

INSERT INTO jobs VALUES ('ST_CLERK', 'Admin Clerk', 20000, 25000);
INSERT INTO jobs VALUES ('MK_REP', 'Marketing Representation', 8000, 18000);
INSERT INTO jobs VALUES ('IT_PROG', 'IT Programmer', 15000, 20000);
INSERT INTO jobs VALUES ('MO_GM', 'General Manager', 25000, 40000);

-- SELECT *
-- FROM jobs
-- ;

INSERT INTO job_history VALUES (102, CAST('1993-01-13' AS DATE), CAST('1998-07-24' AS DATE), 'IT_PROG', 20); 
INSERT INTO job_history VALUES (101, CAST('1989-09-21' AS DATE), CAST('1993-10-27' AS DATE), 'MK_REP', 30); 
INSERT INTO job_history VALUES (101, CAST('1993-10-28' AS DATE), CAST('1997-03-15' AS DATE), 'MK_REP', 30);
INSERT INTO job_history VALUES (100, CAST('1996-02-17' AS DATE), CAST('1999-12-19' AS DATE), 'ST_CLERK', 10);
INSERT INTO job_history VALUES (103, CAST('1998-03-24' AS DATE), CAST('1999-12-31' AS DATE), 'MK_REP', 30);

-- SELECT *
-- FROM job_history
-- ;

INSERT INTO employees VALUES (100, 'Steven', 'King', 'sking@gmail.com', '515-1234567', CAST('1987-06-17' AS DATE), 'ST_CLERK', 24000.00, 0.00, 109, 10);
INSERT INTO employees VALUES (102, 'Lex', 'De Hann', 'ldehann@gmail.com', '515-1234569', CAST('1987-06-19' AS DATE), 'IT_PROG', 17000.00, 0.00, 108, 40);
INSERT INTO employees VALUES (103, 'Alexander', 'Hunold', 'ahunold@gmail.com', '590-4234567', CAST('1987-06-20' AS DATE), 'MK_REP', 9000.00, 0.00, 105, 20);

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, department_id) 
VALUES (110, 'Thomas', 'Wong', 'thomas@gmail.com', '515-2234503', CAST('1980-01-15' AS DATE), 'MO_GM', 40000.00, 5000.00, 10); 

INSERT INTO employees VALUES (105, 'Tom', 'Yang', 'tom@gmail.com', '515-2222222', CAST('1985-07-01' AS DATE), 'MK_REP', 18000.00, 2000.00, 110, 20);
INSERT INTO employees VALUES (108, 'John', 'Chan', 'john@gmail.com', '515-2345678', CAST('1984-03-02' AS DATE), 'IT_PROG', 17000.00, 2000.00, 110, 40);
INSERT INTO employees VALUES (109, 'Emily', 'Lee', 'emily@gmail.com', '515-2111222', CAST('1982-02-28' AS DATE), 'ST_CLERK', 24000.00, 2000.00, 110, 10);

-- SELECT * 
-- FROM employees
-- ;

-- QUESTION 3:
SELECT l.location_id, l.street_address, l.city, COALESCE(l.state_province, 'N/A') , c.country_name 
FROM locations l, countries c
WHERE l.country_id = c.country_id;

-- QUESTION 4:
SELECT e.first_name, e.last_name, e.department_id
FROM employees e;

-- QUESTION 5:
WITH deptLoc AS (
SELECT d.department_id, l.country_id
FROM departments d, locations l
WHERE d.location_id = l.location_id
),
countryName AS (
SELECT c.country_id, c.country_name
FROM locations l, countries c
WHERE l.country_id = c.country_id
),
deptCountry AS (
SELECT d.department_id, c.country_name
FROM deptLoc d, countryName c
WHERE d.country_id = c.country_id
)
SELECT e.first_name, e.last_name, e.job_id, e.department_id
FROM employees e, deptCountry d
WHERE e.department_id = d.department_id
AND d.country_name = 'Japan'
;

-- QUESTION 6:
-- WITH deptManager AS (
-- SELECT e.department_id, d.manager_id
-- FROM departments d, employees e
-- WHERE d.department_id = e.department_id
-- GROUP BY e.department_id
-- )
-- ,
-- deptManagerName AS (
-- SELECT d.department_id AS department_id, d.manager_id AS manager_id, e.last_name AS last_name
-- FROM deptManager d, employees e
-- WHERE d.manager_id = e.employee_id
-- )

SELECT e1.employee_id, e1.first_name, e1.last_name, e1.department_id, e1.manager_id, e2.last_name
FROM employees e1, employees e2
WHERE e1.manager_id = e2.employee_id;

-- QUESTION 7:
WITH haanDate AS (
SELECT e.hire_date AS hire_date
FROM employees e
WHERE e.employee_id = 102
)
SELECT e.first_name, e.last_name, e.hire_date, h.hire_date AS Haan_hire_date
FROM employees e, haanDate h
WHERE DATEDIFF(e.hire_date, h.hire_date) > 0; 

-- QUESTION 8:
SELECT d.department_name, count(1) AS num_of_employee
FROM employees e, departments d
WHERE e.department_id = d.department_id
GROUP BY d.department_id
;

-- Question 9:
SELECT h.employee_id, j.job_title, datediff(h.end_date, h.start_date) AS numbers_of_day
FROM jobs j, job_history h
WHERE j.job_id = h.job_id
AND h.department_id = 30
;

-- Question 10:
WITH countryName AS (
SELECT l.location_id, l.city, l.country_id, c.country_name
FROM locations l, countries c
WHERE l.country_id = c.country_id
)
,
managerID AS (
SELECT d.manager_id, d.department_name, c.city, c.country_name
FROM departments d, countryName c
WHERE d.location_id = c.location_id
)
SELECT m.department_name, COALESCE(CONCAT(e.first_name, ' ', e.last_name), 'N/A') AS manager_name, m.city, m.country_name 
FROM managerID m LEFT JOIN employees e
ON m.manager_id = e.employee_id
;

-- QUESTION 11:
SELECT e.department_id, d.department_name, ROUND(AVG(e.salary), 2) AS average_salary
FROM employees e, departments d
WHERE e.department_id = d.department_id
GROUP BY e.department_id
;

-- QUESTION 12:
-- create table 'job_grade' with columns 'grade_level' as PRIMARY KEY, 'lowest_sal' and 'highest_sal'
-- IF still during the design stage, remove columns 'min_salary' and 'max_salary' from 'jobs' table.
-- add column 'grade_level' into 'jobs' table. 
-- set 'grade_level of 'jobs' as 'FOREIGN KEY' that 'REFERENCES' to 'grade_level' in 'job_grades' table
-- REMARK: Should avoid removing any column from any table once the database is being used by users

CREATE TABLE job_grades (
	grade_level VARCHAR(2) PRIMARY KEY,
    lowest_sal DECIMAL(8,2),
    highest_sal DECIMAL(8,2)
)
;

ALTER TABLE jobs DROP min_salary;
ALTER TABLE jobs DROP max_salary;
ALTER TABLE jobs ADD grade_level VARCHAR(2);
ALTER TABLE jobs ADD CONSTRAINT fk_grade_level FOREIGN KEY (grade_level) REFERENCES job_grades (grade_level);


