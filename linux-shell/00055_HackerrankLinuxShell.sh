#!/bin/sh

# Remove the First Capital Letter from Each Element
# https://www.hackerrank.com/challenges/bash-tutorials-remove-the-first-capital-letter-from-each-array-element/problem?isFullScreen=true


while read -r line;
do
  echo -n ".${line:1} "
done