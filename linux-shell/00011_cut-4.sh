#!/bin/sh

# Cut #4
# https://www.hackerrank.com/challenges/text-processing-cut-4/problem?isFullScreen=true

while read -r line;
do
    echo  $line | cut -c1-4
done