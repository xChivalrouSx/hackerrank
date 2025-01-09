-- Top Earners
-- https://www.hackerrank.com/challenges/earnings-of-employees/problem?isFullScreen=true

SELECT  MAX(salary * months),
        COUNT(*)
FROM    Employee
WHERE   salary * months = (SELECT MAX(salary * months) FROM Employee);