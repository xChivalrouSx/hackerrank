#!/bin/sh

# Comparing Numbers
# https://www.hackerrank.com/challenges/bash-tutorials---comparing-numbers/problem

read X
read Y

if (($X == $Y))
then
    echo "X is equal to Y"
elif (($X > $Y))
then
    echo "X is greater than Y"
else
    echo "X is less than Y"
fi