-- Revising the Select Query I
-- https://www.hackerrank.com/challenges/revising-the-select-query/problem?isFullScreen=true

SELECT  *
FROM    CITY 
WHERE   COUNTRYCODE = 'USA'
        AND
        POPULATION > 100000;