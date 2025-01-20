-- Challenges
-- https://www.hackerrank.com/challenges/challenges/problem?isFullScreen=true

SELECT      h.HACKER_ID, 
            MIN(h.NAME),
            COUNT(c.CHALLENGE_ID)
FROM        CHALLENGES c
            LEFT JOIN HACKERS h ON (h.HACKER_ID = c.HACKER_ID)
GROUP BY    h.HACKER_ID
HAVING      COUNT(c.CHALLENGE_ID) NOT IN (
                                            SELECT      COUNT(CHALLENGE_ID) 
                                            FROM        CHALLENGES 
                                            WHERE       HACKER_ID <> h.HACKER_ID 
                                            GROUP BY    HACKER_ID 
                                            HAVING      COUNT(CHALLENGE_ID) <> (
                                                                                        SELECT MAX(COUNT(CHALLENGE_ID)) 
                                                                                        FROM CHALLENGES 
                                                                                        GROUP BY HACKER_ID
                                                                                )
                                        )
ORDER BY COUNT(c.CHALLENGE_ID) DESC, HACKER_ID;