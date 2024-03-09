#!/bin/sh

# Tail of a Text File #1
# https://www.hackerrank.com/challenges/text-processing-tail-1/problem?isFullScreen=true

while read -r line;
do
    echo "$line" | tail -20
done