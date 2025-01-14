-- Ollivander's Inventory
-- https://www.hackerrank.com/challenges/harry-potter-and-wands/problem?isFullScreen=true

SELECT      w.ID, wp.AGE, w.COINS_NEEDED, w.POWER
FROM        WANDS_PROPERTY wp
            LEFT JOIN WANDS w ON (w.CODE = wp.CODE)
WHERE       wp.IS_EVIL = 0
            AND
            w.COINS_NEEDED = (   
                SELECT  MIN(w2.COINS_NEEDED)
                FROM    WANDS_PROPERTY wp2
                        LEFT JOIN WANDS w2 ON (w2.CODE = wp2.CODE)
                WHERE   wp2.IS_EVIL = 0
                        AND wp2.AGE = wp.AGE
                        AND w2.POWER = w.POWER
            )
ORDER BY    w.POWER DESC, wp.AGE DESC;