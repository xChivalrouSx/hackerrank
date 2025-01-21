-- Occupations
-- https://www.hackerrank.com/challenges/occupations/problem?isFullScreen=true

SELECT      MIN(Doctor), MIN(Professor), MIN(Singer), MIN(Actor)
FROM        (
                SELECT  RANK() OVER(PARTITION BY OCCUPATION ORDER BY name) rank,
                        CASE OCCUPATION WHEN 'Doctor'       THEN NAME END AS Doctor,
                        CASE OCCUPATION WHEN 'Professor'    THEN NAME END AS Professor,
                        CASE OCCUPATION WHEN 'Singer'       THEN NAME END AS Singer,
                        CASE OCCUPATION WHEN 'Actor'        THEN NAME END AS Actor
                FROM OCCUPATIONS
            )
GROUP BY    rank
ORDER BY    rank;