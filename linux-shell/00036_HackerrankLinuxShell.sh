#!/bin/sh

# 'Uniq' Command #2
# https://www.hackerrank.com/challenges/text-processing-in-linux-the-uniq-command-2/problem?isFullScreen=true

uniq -c | sed 's/^ *//'