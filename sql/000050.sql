-- Contest Leaderboard
-- https://www.hackerrank.com/challenges/contest-leaderboard/problem?isFullScreen=true

SELECT      h.HACKER_ID, MIN(h.NAME), SUM(sTbl.SCORE) AS SCORE
FROM        (
                SELECT      s.HACKER_ID, s.CHALLENGE_ID, MAX(SCORE) AS SCORE
                FROM        SUBMISSIONS s
                GROUP BY    s.HACKER_ID, s.CHALLENGE_ID
            ) sTbl
            LEFT JOIN HACKERS h ON (h.HACKER_ID = sTbl.HACKER_ID)
WHERE       SCORE <> 0
GROUP BY    h.HACKER_ID
ORDER BY    SCORE DESC, h.HACKER_ID;