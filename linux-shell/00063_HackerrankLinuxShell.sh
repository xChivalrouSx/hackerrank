#!/bin/sh

# 'Sed' command #5
# https://www.hackerrank.com/challenges/sed-command-5/problem?isFullScreen=true

sed -r 's/(.+ )(.+ )(.+ )(.{4})/\4 \3\2\1/'