#!/bin/sh

# Cut #1
# https://www.hackerrank.com/challenges/text-processing-cut-1/problem?isFullScreen=true

while read -r line;
do
  echo $line | cut -c3
done