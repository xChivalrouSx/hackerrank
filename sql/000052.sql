-- Placements
-- https://www.hackerrank.com/challenges/placements/problem?isFullScreen=true

SELECT      s.NAME
FROM        FRIENDS f
            LEFT JOIN STUDENTS s ON (f.ID = s.ID)
            LEFT JOIN PACKAGES p ON (p.ID = f.ID)
            LEFT JOIN STUDENTS sf ON (f.FRIEND_ID = sf.ID)
            LEFT JOIN PACKAGES pf ON (pf.ID = sf.ID)
WHERE       pf.SALARY > p.SALARY
ORDER BY    pf.SALARY;