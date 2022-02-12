#!/bin/sh

# More on Conditionals
# https://www.hackerrank.com/challenges/bash-tutorials---more-on-conditionals/problem

read X
read Y
read Z

if (( $X == $Y && $Y == $Z ))
then
	echo "EQUILATERAL"
elif (( $X != $Y && $X != $Z && $Y != $Z ))
then
	echo "SCALENE"
else
	echo "ISOSCELES"
fi