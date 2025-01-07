-- Weather Observation Station 5
-- https://www.hackerrank.com/challenges/weather-observation-station-5/problem?isFullScreen=true

SELECT  tbl1.CITY, 
        tbl1.l
FROM    (   SELECT  *
            FROM    STATION s1
                    LEFT JOIN   (   SELECT  ID, 
                                            LENGTH(CITY) AS l
                                    FROM    STATION s1
                                ) s2 ON (s1.ID = s2.ID)
            ORDER BY s2.l DESC, s1.CITY ASC
        ) tbl1
WHERE   ROWNUM = 1
UNION ALL
SELECT  tbl2.CITY, 
        tbl2.l
FROM    (   SELECT  *
            FROM    STATION s1
                    LEFT JOIN   (   SELECT  ID, 
                                            LENGTH(CITY) AS l
                                    FROM    STATION s1
                                ) s2 ON (s1.ID = s2.ID)
            ORDER BY s2.l ASC, s1.CITY ASC
        ) tbl2
WHERE   ROWNUM = 1;