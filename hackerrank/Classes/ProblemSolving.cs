﻿using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace hackerrank.Classes
{
    static class ProblemSolving
    {

        #region [ - Solve Me First - ]

        // Problem Link: https://www.hackerrank.com/challenges/solve-me-first/problem

        private static int solveMeFirst(int a, int b)
        {
            // Hint: Type return a+b; below  
            return a + b;
        }

        public static void solveMeFirst_Main()
        {
            int val1 = Convert.ToInt32(Console.ReadLine());
            int val2 = Convert.ToInt32(Console.ReadLine());
            int sum = solveMeFirst(val1, val2);
            Console.WriteLine(sum);
        }

        #endregion


        #region [ - Simple Array Sum - ]

        // Problem Link: https://www.hackerrank.com/challenges/simple-array-sum/problem

        private static int simpleArraySum(int[] ar)
        {
            /*
             * Write your code here.
             */
            int sum = 0;
            foreach (int i in ar)
            {
                sum += i;
            }

            return sum;
        }

        public static void simpleArraySum_Main()
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int arCount = Convert.ToInt32(Console.ReadLine());

            int[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt32(arTemp));

            int result = simpleArraySum(ar);

            //textWriter.WriteLine(result);

            //textWriter.Flush();
            //textWriter.Close();
        }

        #endregion


        #region [ - A Very Big Sum - ]

        // Problem Link: https://www.hackerrank.com/challenges/a-very-big-sum/problem

        private static long aVeryBigSum(long[] ar)
        {

            long sum = 0;
            foreach (long l in ar)
            {
                sum += l;
            }

            return sum;
        }

        public static void aVeryBigSum_Main()
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int arCount = Convert.ToInt32(Console.ReadLine());

            long[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt64(arTemp));

            long result = aVeryBigSum(ar);

            //textWriter.WriteLine(result);

            //textWriter.Flush();
            //textWriter.Close();
        }

        #endregion


        #region [ - Diagonal Difference - ]

        // Problem Link: https://www.hackerrank.com/challenges/diagonal-difference/problem

        private static int diagonalDifference(int[][] arr)
        {
            int primaryDiagonalSum = 0;
            int secondaryDiagonalSum = 0;
            int secondaryControl = arr.Length - 1;

            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr.Length; j++)
                {
                    if (i == j)
                    {
                        primaryDiagonalSum += arr[i][j];
                    }

                    if (j == secondaryControl)
                    {
                        secondaryDiagonalSum += arr[i][j];
                    }
                }
                secondaryControl--;
            }

            return Math.Abs(primaryDiagonalSum - secondaryDiagonalSum);
        }

        public static void diagonalDifference_Main()
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int n = Convert.ToInt32(Console.ReadLine());

            int[][] arr = new int[n][];

            for (int i = 0; i < n; i++)
            {
                arr[i] = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
            }

            int result = diagonalDifference(arr);

            //textWriter.WriteLine(result);

            //textWriter.Flush();
            //textWriter.Close();
        }

        #endregion


        #region [ - Plus Minus - ]

        // Problem Link: https://www.hackerrank.com/challenges/plus-minus/problem

        private static void plusMinus(int[] arr)
        {
            double possitiveSum, negativeSum, zeroSum;
            possitiveSum = negativeSum = zeroSum = 0;

            foreach (int i in arr)
            {
                if (i < 0)
                {
                    negativeSum++;
                }
                else if (i > 0)
                {
                    possitiveSum++;
                }
                else
                {
                    zeroSum++;
                }
            }

            Console.WriteLine(possitiveSum / arr.Length);
            Console.WriteLine(negativeSum / arr.Length);
            Console.WriteLine(zeroSum / arr.Length);
        }

        public static void plusMinus_Main()
        {
            int n = Convert.ToInt32(Console.ReadLine());

            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));

            plusMinus(arr);
        }

        #endregion


        #region [ - Staircase - ]

        // Problem Link: https://www.hackerrank.com/challenges/staircase/problem

        private static void staircase(int n)
        {
            for (int i=n; i>0; i--)
            {
                for(int j=1; j<=n; j++)
                {
                    if (j < i)
                    {
                        Console.Write(" ");
                    }
                    else
                    {
                        Console.Write("#");
                    }
                }
                Console.WriteLine();
            }
        }

        public static void staircase_Main()
        {
            int n = Convert.ToInt32(Console.ReadLine());

            staircase(n);
        }

        #endregion


        #region [ - Mini-Max Sum - ]

        // Problem Link: https://www.hackerrank.com/challenges/mini-max-sum/problem

        private static void miniMaxSum(int[] arr)
        {
            Int64[] sums = new Int64[arr.Length];
            for (int i=0; i< sums.Length; i++)
            {
                sums[i] = 0;
            }

            for (int i=0; i<arr.Length; i++)
            {
                for (int j=0; j<arr.Length; j++)
                {
                    if (j != i)
                    {
                        sums[i] += arr[j];
                    }
                }
            }

            Console.Write(sums.Min() + " " + sums.Max());
        }

        public static void miniMaxSum_Main()
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));

            miniMaxSum(arr);
        }

        #endregion


        #region [ - Birthday Cake Candles - ]

        // Problem Link: https://www.hackerrank.com/challenges/birthday-cake-candles/problem

        private static int birthdayCakeCandles(int[] ar)
        {
            int max, howManyMax;
            max = howManyMax = 0;

            foreach (int value in ar)
            {
                if (max < value)
                {
                    max = value;
                    howManyMax = 1;
                }
                else if (max == value)
                {
                    howManyMax++;
                }
            }

            return howManyMax;
        }

        public static void birthdayCakeCandles_Main()
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int arCount = Convert.ToInt32(Console.ReadLine());

            int[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt32(arTemp));

            int result = birthdayCakeCandles(ar);

            //textWriter.WriteLine(result);

            //textWriter.Flush();
            //textWriter.Close();
        }

        #endregion


        #region [ - Time Conversion - ]

        // Problem Link: https://www.hackerrank.com/challenges/time-conversion/problem

        private static string timeConversion(string s)
        {
            /*
             * Write your code here.
             */
            bool isPm = s.Substring(s.Length-2, 2).Equals("PM");

            s = s.Remove(s.Length-2, 2);

            string[] splittedTime = s.Split(':');
            int hour = Int32.Parse(splittedTime[0]);

            if (isPm && hour == 12)
            {
                splittedTime[0] = "12";
            }
            else if (!isPm && hour == 12)
            {
                splittedTime[0] = "00";
            }
            else if (isPm)
            {
                hour += 12;
                splittedTime[0] = hour.ToString();
            }

            return splittedTime[0] + ":" + splittedTime[1] + ":" + splittedTime[2];
        }

        public static void timeConversion_Main()
        {
            //TextWriter tw = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            string s = Console.ReadLine();

            string result = timeConversion(s);

            Console.WriteLine(result);

            //tw.WriteLine(result);

            //tw.Flush();
            //tw.Close();
        }

        #endregion

    }
}
