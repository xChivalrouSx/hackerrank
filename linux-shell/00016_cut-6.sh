#!/bin/sh

# Cut #6
# https://www.hackerrank.com/challenges/text-processing-cut-6/problem?isFullScreen=true

while read -r line;
do
    echo  $line | cut -c13-
done