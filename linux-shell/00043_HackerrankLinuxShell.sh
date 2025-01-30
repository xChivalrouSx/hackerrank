#!/bin/sh

# Count the number of elements in an Array
# https://www.hackerrank.com/challenges/bash-tutorials-count-the-number-of-elements-in-an-array/problem?isFullScreen=true

readarray array
echo ${#array[@]}