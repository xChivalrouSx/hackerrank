-- The PADS
-- https://www.hackerrank.com/challenges/the-pads/problem?isFullScreen=true

SELECT      CONCAT(
                    CONCAT(NAME, '('),
                    CONCAT(SUBSTR(OCCUPATION, 0, 1), ')')
            )
FROM        OCCUPATIONS
UNION
SELECT      CONCAT(
                    CONCAT('There are a total of ', COUNT(*)),
                    CONCAT(' ', LOWER(OCCUPATION) || 's')
            ) || '.'
FROM        OCCUPATIONS
GROUP BY    OCCUPATION;