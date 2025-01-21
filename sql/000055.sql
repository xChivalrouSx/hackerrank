-- Print Prime Numbers
-- https://www.hackerrank.com/challenges/print-prime-numbers/problem?isFullScreen=true

WITH NUMBERS AS (
                SELECT  LEVEL AS num
                FROM DUAL
                CONNECT BY LEVEL <= 1000
),
PRIMES AS (
    SELECT  num
    FROM    NUMBERS n
    WHERE   num > 1
            AND 
            NOT EXISTS (
                        SELECT  1
                        FROM    NUMBERS n2
                        WHERE   n2.num > 1
                                AND 
                                n2.num < n.num
                                AND 
                                MOD(n.num, n2.num) = 0
                        )
)
SELECT  LISTAGG(num, '&') WITHIN GROUP (ORDER BY num)
FROM    PRIMES;