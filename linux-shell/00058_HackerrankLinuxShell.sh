#!/bin/sh

# 'Awk' - 1
# https://www.hackerrank.com/challenges/awk-1/problem?isFullScreen=true

awk '(NF < 4) {print "Not all scores are available for "$1}'