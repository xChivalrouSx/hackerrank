#!/bin/sh

# Getting started with conditionals
# https://www.hackerrank.com/challenges/bash-tutorials---getting-started-with-conditionals/problem

read inputChar

if [[ $inputChar == "Y" || $inputChar == "y" ]] 
then
    echo "YES"
elif [[ $inputChar == "N" || $inputChar == "n" ]]
then
    echo "NO"
fi