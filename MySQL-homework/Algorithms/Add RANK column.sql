DROP DATABASE IF EXISTS scores;
CREATE DATABASE scores;
USE scores;

CREATE TABLE scores (
		id INTEGER PRIMARY KEY AUTO_INCREMENT,
        val INTEGER NOT NULL
)
;

INSERT INTO scores (val) VALUES 
(10),
(20),
(20),
(50),
(30),
(80);

-- RANKS in score table with distinct scrore values
WITH scoreTable AS (
SELECT s.val, COUNT(1) AS count
FROM scores s 
GROUP BY s.val
),
rankTable AS (
SELECT st.val, ROW_NUMBER() OVER (ORDER BY st.val DESC) AS ranking 
FROM scoreTable st
)
SELECT rt.val AS val, rt.ranking
FROM rankTable rt;






