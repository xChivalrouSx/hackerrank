#!/bin/sh

# Cut #9
# https://www.hackerrank.com/challenges/text-processing-cut-9/problem?isFullScreen=true

while read -r line;
do
    echo "$line" | cut -f2-
done