#!/bin/sh

# Cut #3
# https://www.hackerrank.com/challenges/text-processing-cut-3/problem?isFullScreen=true

while read -r line;
do
    echo  $line | cut -c2-7
done