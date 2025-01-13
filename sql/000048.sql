-- Top Competitors
-- https://www.hackerrank.com/challenges/full-score/problem?isFullScreen=true

SELECT      h.hacker_id, h.name
FROM        SUBMISSIONS s
            LEFT JOIN HACKERS h ON (h.hacker_id = s.hacker_id)
            LEFT JOIN CHALLENGES c ON (c.challenge_id = s.challenge_id)
            LEFT JOIN DIFFICULTY d ON (d.difficulty_level = c.difficulty_level)
WHERE       d.score = s.score
GROUP BY    h.hacker_id, h.name
HAVING      COUNT(*) > 1
ORDER BY    COUNT(*) DESC, h.hacker_id;