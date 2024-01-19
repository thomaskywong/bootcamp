DROP DATABASE IF EXISTS homework3;
CREATE DATABASE homework3;
USE homework3;

CREATE TABLE players (
	player_id INTEGER NOT NULL UNIQUE,
    group_id INTEGER NOT NULL
);

-- two players are belong to the same group_id
CREATE TABLE matches (
	match_id INTEGER NOT NULL UNIQUE,
    first_player INTEGER NOT NULL,
    second_player INTEGER NOT NULL,
    first_score INTEGER NOT NULL,
    second_score INTEGER NOT NULL
);

INSERT INTO players VALUES 
(20, 2),
(30, 1),
(40, 3),
(45, 1),
(50, 2),
(65, 1);

INSERT INTO matches VALUES
(1, 30, 45, 10, 12),
(2, 20, 50, 5, 5),
(13, 65, 45, 10, 10),
(5, 30, 65, 3, 15),
(42, 45, 65, 8, 4);

-- SELECT * FROM players ORDER BY group_id ASC;
-- SELECT * FROM matches;

WITH firstPlayerScore AS (
	SELECT p.group_id, p.player_id, m1.first_score AS score
	FROM players p
	LEFT JOIN matches m1 ON p.player_id = m1.first_player
	-- WHERE m1.first_score IS NOT NULL
)
,
secondPlayerScore AS (
	SELECT p.group_id, p.player_id, m2.second_score AS score
	FROM players p
	LEFT JOIN matches m2 ON p.player_id = m2.second_player
	-- WHERE m2.second_score IS NOT NULL
)
,
playerScore AS (
	SELECT f1.group_id, f1.player_id, f1.score 
    FROM firstPlayerScore f1
	UNION
	SELECT f2.group_id, f2.player_id, f2.score 
    FROM secondPlayerScore f2
) 
,
groupPlayerScore AS (
	SELECT group_id, player_id, COALESCE(SUM(score),0) AS score
	FROM playerScore
	GROUP BY group_id, player_id
	ORDER BY score DESC, player_id ASC
),
groupScore AS (
	SELECT group_id, MAX(score) as max
	FROM groupPlayerScore
	GROUP BY group_id
)
SELECT gs.group_id, MIN(player_id) AS winner_id
FROM groupScore gs
LEFT JOIN groupPlayerScore gps 
ON gs.group_id = gps.group_id
AND gs.max = gps.score
GROUP BY gs.group_id
;