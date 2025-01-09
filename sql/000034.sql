-- Draw The Triangle 1
-- https://www.hackerrank.com/challenges/draw-the-triangle-1?isFullScreen=true

SELECT      LPAD('* ', (21 - LEVEL) * 2, '* ')
FROM        DUAL
CONNECT BY  LEVEL < 21;