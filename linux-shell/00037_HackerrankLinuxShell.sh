#!/bin/sh

# 'Uniq' command #3
# https://www.hackerrank.com/challenges/text-processing-in-linux-the-uniq-command-3/problem?isFullScreen=true

uniq -ic | sed 's/^ *//'

