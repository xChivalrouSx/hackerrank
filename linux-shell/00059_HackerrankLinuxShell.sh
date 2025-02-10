#!/bin/sh

# 'Awk' - 2
# https://www.hackerrank.com/challenges/awk-2/problem?isFullScreen=true

awk '{print $1, ":", ($2 < 50 || $3 < 50 || $4 < 50 ) ? "Fail" : "Pass"}'