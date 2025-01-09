-- Population Census
-- https://www.hackerrank.com/challenges/asian-population/problem?isFullScreen=true

SELECT  SUM(c1.POPULATION)
FROM    CITY c1
        LEFT JOIN COUNTRY c2 ON (c1.COUNTRyCODE = c2.CODE)
WHERE   c2.CONTINENT = 'Asia';