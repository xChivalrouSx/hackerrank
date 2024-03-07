#!/bin/sh

# Cut #7
# https://www.hackerrank.com/challenges/text-processing-cut-7/problem?isFullScreen=true

while read -r line;
do
    echo "$line" | cut -d' ' -f4
done