#!/bin/sh

# Cut #2
# https://www.hackerrank.com/challenges/text-processing-cut-2/problem?isFullScreen=true

while read -r line;
do
    echo  $line | cut -c2,7
done