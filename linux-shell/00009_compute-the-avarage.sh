#!/bin/sh

# Compute the Average
# https://www.hackerrank.com/challenges/bash-tutorials---compute-the-average/problem

read number_of_input
sum=0

for ((i=1; i<=$number_of_input; i++));
do
  read number
  sum=$(($sum+$number))
done

printf "%.3f" $(echo $sum/$number_of_input | bc -l)