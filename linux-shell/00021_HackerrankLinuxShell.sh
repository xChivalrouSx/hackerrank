#!/bin/sh

# Head of a Text File #2
# https://www.hackerrank.com/challenges/text-processing-head-2/problem?isFullScreen=true

while read -r line;
do
    echo "$line" | head -c20 
done
