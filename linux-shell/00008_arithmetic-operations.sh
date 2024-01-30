#!/bin/sh

# Arithmetic Operations
# https://www.hackerrank.com/challenges/bash-tutorials---arithmetic-operations/problem

read X
printf "%.3f" $(echo $X | bc -l)