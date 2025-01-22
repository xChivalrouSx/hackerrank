-- Symmetric Pairs
-- https://www.hackerrank.com/challenges/symmetric-pairs/problem?isFullScreen=true

SELECT      f.X, f.Y
FROM        FUNCTIONS f
            LEFT JOIN FUNCTIONS f2 ON (f.X = f2.Y AND f.Y = f2.X)
WHERE       f.X <= f.Y
            AND
            f2.X IS NOT NULL
GROUP BY    f.X, f.Y
HAVING      f.X <> f.Y
            OR
            COUNT(*) > 1
ORDER BY    f.X;