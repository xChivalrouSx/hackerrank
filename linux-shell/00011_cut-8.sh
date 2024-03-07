#!/bin/sh

# Cut #8
# https://www.hackerrank.com/challenges/text-processing-cut-8/problem?isFullScreen=true

while read -r line;
do
    echo "$line" | cut -d' ' -f-3
done