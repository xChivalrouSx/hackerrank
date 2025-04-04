-- Weather Observation Station 10
-- https://www.hackerrank.com/challenges/weather-observation-station-10/problem?isFullScreen=true

SELECT  DISTINCT(CITY)
FROM    STATION
WHERE   CITY NOT LIKE '%a'
        AND
        CITY NOT LIKE '%e'
        AND
        CITY NOT LIKE '%i'
        AND
        CITY NOT LIKE '%o'
        AND
        CITY NOT LIKE '%u';