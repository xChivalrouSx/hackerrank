-- Draw The Triangle 2
-- https://www.hackerrank.com/challenges/draw-the-triangle-2/problem?isFullScreen=true

SELECT      LPAD('* ', LEVEL * 2, '* ')
FROM        DUAL
CONNECT BY  LEVEL < 21;