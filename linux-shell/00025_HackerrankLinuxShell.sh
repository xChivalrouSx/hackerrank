#!/bin/sh

# 'Tr' Command #1
# https://www.hackerrank.com/challenges/text-processing-tr-1/problem?isFullScreen=true

while read -r line;
do
    echo "$line" | tr "(" "[" | tr ")" "]"
done