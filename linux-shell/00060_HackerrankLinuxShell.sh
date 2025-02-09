#!/bin/sh

# 'Awk' - 3
# https://www.hackerrank.com/challenges/awk-3/problem?isFullScreen=true

awk '{
        total = ($2 + $3 + $4) / 3
        result = $1 " " $2 " " $3 " " $4
        score = ""
        if (total >= 50 && total < 60)
            score = ": C"
        else if (total >= 60 && total < 80)
            score = ": B"
        else if (total >= 80)
            score = ": A"
        else 
            score = ": FAIL" 
        print result, score
    }'