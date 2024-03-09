#!/bin/sh

# 'Tr' Command #3
# https://www.hackerrank.com/challenges/text-processing-tr-3/problem?isFullScreen=true

while read -r line;
do
    echo "$line" | tr -s ' '
done