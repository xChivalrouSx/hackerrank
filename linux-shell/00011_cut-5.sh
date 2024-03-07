#!/bin/sh

# Cut #5
# https://www.hackerrank.com/challenges/text-processing-cut-5/problem?isFullScreen=true

while read -r line;
do
    echo  "$line" | cut -f1-3
done