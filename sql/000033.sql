-- Average Population of Each Continent
-- https://www.hackerrank.com/challenges/average-population-of-each-continent/problem?isFullScreen=true

SELECT      c2.CONTINENT, FLOOR(AVG(c1.POPULATION))
FROM        CITY c1
            JOIN COUNTRY c2 ON (c1.COUNTRYCODE = c2.CODE)
GROUP BY    c2.CONTINENT;