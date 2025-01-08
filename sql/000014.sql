-- Weather Observation Station 8
-- https://www.hackerrank.com/challenges/weather-observation-station-8/problem?isFullScreen=true

SELECT  DISTINCT(CITY)
FROM    STATION
WHERE   (
            CITY LIKE '%a'
            OR
            CITY LIKE '%e'
            OR
            CITY LIKE '%i'
            OR
            CITY LIKE '%o'
            OR
            CITY LIKE '%u'
        )
        AND
        (
            CITY LIKE 'A%'
            OR
            CITY LIKE 'E%'
            OR
            CITY LIKE 'I%'
            OR
            CITY LIKE 'O%'
            OR
            CITY LIKE 'U%'
        );