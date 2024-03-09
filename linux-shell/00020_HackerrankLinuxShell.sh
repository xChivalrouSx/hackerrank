#!/bin/sh

# Head of a Text File #1
# https://www.hackerrank.com/challenges/text-processing-head-1/problem?isFullScreen=true

while read -r line;
do
    echo "$line" | head -n20
done
