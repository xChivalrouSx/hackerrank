#!/bin/sh

# The World of Numbers
# https://www.hackerrank.com/challenges/bash-tutorials---the-world-of-numbers/problem

read X
read Y

echo $(($X + $Y))
echo $(($X - $Y))
echo $(($X * $Y))
printf "%.0f" $(($X / $Y));