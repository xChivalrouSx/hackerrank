#!/bin/sh

# Middle of a Text File
# https://www.hackerrank.com/challenges/text-processing-in-linux---the-middle-of-a-text-file/problem?isFullScreen=true

while read -r line;
do
    echo "$line" | head -22 | tail -11
done