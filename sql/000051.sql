-- SQL Project Planning
-- https://www.hackerrank.com/challenges/sql-projects/problem?isFullScreen=true

WITH tbl1 AS (
    SELECT      CONNECT_BY_ROOT(start_date) AS start_date, 
                end_date, 
                LEVEL lvl
    FROM        Projects
    WHERE       CONNECT_BY_ISLEAF = 1
    CONNECT BY  NOCYCLE PRIOR end_date = start_date
),
tbl2 AS (
    SELECT  start_date, 
            end_date,
            ROW_NUMBER() OVER (PARTITION BY end_date ORDER BY lvl DESC) AS ROW_NUMBER
    FROM    tbl1
)
SELECT      start_date, 
            end_date
FROM        tbl2
WHERE       tbl2.ROW_NUMBER = 1
ORDER BY    (tbl2.end_date - tbl2.start_date), tbl2.start_date;