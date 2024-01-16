CREATE DATABASE org;
SHOW databases;
-- USE org;

DROP TABLE IF EXISTS bonus;
DROP TABLE IF EXISTS worker;


CREATE TABLE worker (
	worker_id SERIAL PRIMARY KEY NOT NULL,
	first_name CHAR(25),
	last_name CHAR(25),
	salary NUMERIC(15),
	joining_date TIMESTAMP,
	department CHAR(25)
);

INSERT INTO worker (first_name, last_name, salary, joining_date, department) VALUES
('Monika', 'Arora', 100000, '2021-02-20 09:00:00', 'HR'),
('Niharika', 'Verma', 80000, '2021-06-11 09:00:00', 'Admin'),
('Visha', 'Shinghal', 300000, '2021-02-20 09:00:00', 'HR'),
('Mohan', 'Sarah', 300000, '2012-03-19 09:00:00', 'Admin'),
('Amitabh', 'Singh', 500000, '2021-02-20 09:00:00', 'Admin'),
('Vivek', 'Bhati', 490000, '2021-06-11 09:00:00', 'Admin'),
('Vipul', 'Diwan', 200000, '2021-06-11 09:00:00', 'Account'),
('Satish', 'Kumar', 75000, '2021-01-20 09:00:00', 'Account'),
('Geetika', 'Chauhan', 90000, '2021-04-11 09:00:00', 'Admin');

-- SELECT * FROM worker;

CREATE TABLE bonus (
	worker_ref_id INTEGER,
	bonus_amount NUMERIC(10),
	bonus_date TIMESTAMP,
	CONSTRAINT fk_bonus_worker_ref_id FOREIGN KEY (worker_ref_id) REFERENCES worker (worker_id) 
);

-- Task 1:
INSERT INTO bonus VALUES 
(3, 32000, '2021-11-02 09:00:00'),
(3, 20000, '2022-11-02 09:00:00'),
(5, 21000, '2021-11-02 09:00:00'),
(9, 30000, '2021-11-02 09:00:00'),
(8, 4500, '2022-11-02 09:00:00');

-- SELECT * FROM bonus;

-- Task 2:
WITH topTwoHighest AS (
SELECT * FROM worker ORDER BY salary DESC LIMIT 2
)
SELECT * FROM topTwoHighest ORDER BY salary ASC LIMIT 1;

-- TASK 3:
SELECT w.department, MAX(salary) AS highest_salary 
FROM worker w
GROUP BY w.department
ORDER BY w.department;

-- TASK 4:
SELECT w1.*
FROM worker w1, worker w2
WHERE w1.salary = w2.salary
AND w1.worker_id != w2.worker_id;

-- TASK 5:
WITH bonus2021 AS (
SELECT *
FROM bonus b
WHERE EXTRACT(YEAR FROM b.bonus_date) = '2021' AND b.bonus_amount != 0
)
SELECT CONCAT(w.first_name, ' ', w.last_name) AS worker_name, w.salary, COALESCE(b.bonus_amount,0) AS bonus_amount
FROM worker w
LEFT JOIN bonus2021 b
ON w.worker_id = b.worker_ref_id
;


-- TASK 6:
-- TRUNCATE TABLE worker;
-- ERROR:  Table "bonus" references "worker".cannot truncate a table referenced in a foreign key constraint 
-- 
-- Since the worker (worker_id) is a PRIMARY KEY 
-- being REFERENCES by bonus (worker_ref_id) as FOREIGN KEY,
-- and currently being used by rows in bonus table, 
-- thus unable to delete all rows in worker table unless the bonus table is removed first

-- TASK 7:
-- DROP TABLE worker;
-- ERROR:  constraint fk_bonus_worker_ref_id on table bonus depends on 
-- table workercannot drop table worker because other objects depend on it 
-- 
-- Since the worker (worker_id) is a PRIMARY KEY 
-- being REFERENCES by bonus (worker_ref_id) as FOREIGN KEY,
-- table worker cannot be deleted unless the bonus table is removed first
-- 

--