-- Higher Than 75 Marks
-- https://www.hackerrank.com/challenges/more-than-75-marks/problem?isFullScreen=true

SELECT      NAME
FROM        STUDENTS
WHERE       MARKS > 75
ORDER BY    SUBSTR(NAME, -3), ID;