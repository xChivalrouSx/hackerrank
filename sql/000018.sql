-- Weather Observation Station 12
-- https://www.hackerrank.com/challenges/weather-observation-station-12/problem?isFullScreen=true

SELECT  DISTINCT(CITY)
FROM    STATION
WHERE   (
            CITY NOT LIKE '%a'
            AND
            CITY NOT LIKE '%e'
            AND
            CITY NOT LIKE '%i'
            AND
            CITY NOT LIKE '%o'
            AND
            CITY NOT LIKE '%u'
        )
        AND
        (
            CITY NOT LIKE 'A%'
            AND
            CITY NOT LIKE 'E%'
            AND
            CITY NOT LIKE 'I%'
            AND
            CITY NOT LIKE 'O%'
            AND
            CITY NOT LIKE 'U%'
        );