#!/bin/sh

# Tail of a Text File #2
# https://www.hackerrank.com/challenges/text-processing-tail-2/problem?isFullScreen=true

while read -r line;
do
    echo "$line" | tail -c20
done