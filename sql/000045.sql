-- The Report
-- https://www.hackerrank.com/challenges/the-report/problem?isFullScreen=true

SELECT      CASE
                WHEN g.GRADE < 8 THEN 'NULL'
                ELSE NAME
            END,
            g.GRADE,
            MARKS
FROM        STUDENTS s
            LEFT JOIN GRADES g ON (g.MIN_MARK <= s.MARKS AND g.MAX_MARK >= s.MARKS) 
ORDER BY    g.GRADE DESC, s.NAME;