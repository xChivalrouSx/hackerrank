-- African Cities
-- https://www.hackerrank.com/challenges/african-cities/problem?isFullScreen=true

SELECT  c1.NAME
FROM    CITY c1
        LEFT JOIN COUNTRY c2 ON (c1.COUNTRYCODE = c2.CODE)
WHERE   c2.CONTINENT = 'Africa';