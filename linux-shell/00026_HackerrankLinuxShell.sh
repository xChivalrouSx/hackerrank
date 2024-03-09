#!/bin/sh

# 'Tr' Command #2
# https://www.hackerrank.com/challenges/text-processing-tr-2/problem?isFullScreen=true

while read -r line;
do
    echo "$line" | tr -d "[a-z]"
done