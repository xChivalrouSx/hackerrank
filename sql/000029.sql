-- The Blunder
-- https://www.hackerrank.com/challenges/the-blunder/problem?isFullScreen=true

SELECT  CEIL(AVG(SALARY) - AVG(TO_NUMBER(REPLACE(TO_CHAR(SALARY), '0', ''))))
FROM    EMPLOYEES;