#!/bin/sh

# Slice an Array
# https://www.hackerrank.com/challenges/bash-tutorials-slice-an-array/problem?isFullScreen=true

readarray array
echo ${array[@]:3:5}