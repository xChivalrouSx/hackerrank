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

            Console.WriteLine(result);

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

            Console.WriteLine(result);

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

            Console.WriteLine(result);

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

            Console.WriteLine(result);

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


        #region [ - Grading Students - ]

        // Problem Link: https://www.hackerrank.com/challenges/grading/problem

        private static int[] gradingStudents(int[] grades)
        {
            for (int i=0; i< grades.Length; i++)
            {
                int roundValue = grades[i] % 5;
                if (roundValue > 2 && grades[i] >= 38)
                {
                    grades[i] += (5 - roundValue);
                }
            }

            return grades;
        }

        public static void gradingStudents_Main()
        {
            //TextWriter tw = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int n = Convert.ToInt32(Console.ReadLine());

            int[] grades = new int[n];

            for (int gradesItr = 0; gradesItr < n; gradesItr++)
            {
                int gradesItem = Convert.ToInt32(Console.ReadLine());
                grades[gradesItr] = gradesItem;
            }

            int[] result = gradingStudents(grades);

            Console.WriteLine(string.Join("\n", result));

            //tw.WriteLine(string.Join("\n", result));

            //tw.Flush();
            //tw.Close();
        }

        #endregion


        #region [ - Apple and Orange - ]

        // Problem Link: https://www.hackerrank.com/challenges/apple-and-orange/problem

        private static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges)
        {
            int count = 0;

            for (int i=0; i < apples.Length; i++)
            {
                apples[i] += a;
                if (apples[i] >= s && apples[i] <= t)
                {
                    count++;
                }
            }
            Console.WriteLine(count);

            count = 0;

            for (int i=0; i < oranges.Length; i++)
            {
                oranges[i] += b;
                if (oranges[i] >= s && oranges[i] <= t)
                {
                    count++;
                }
            }
            Console.WriteLine(count);
        }

        public static void countApplesAndOranges_Main()
        {
            string[] st = Console.ReadLine().Split(' ');

            int s = Convert.ToInt32(st[0]);

            int t = Convert.ToInt32(st[1]);

            string[] ab = Console.ReadLine().Split(' ');

            int a = Convert.ToInt32(ab[0]);

            int b = Convert.ToInt32(ab[1]);

            string[] mn = Console.ReadLine().Split(' ');

            int m = Convert.ToInt32(mn[0]);

            int n = Convert.ToInt32(mn[1]);

            int[] apples = Array.ConvertAll(Console.ReadLine().Split(' '), applesTemp => Convert.ToInt32(applesTemp));

            int[] oranges = Array.ConvertAll(Console.ReadLine().Split(' '), orangesTemp => Convert.ToInt32(orangesTemp));

            countApplesAndOranges(s, t, a, b, apples, oranges);
        }

        #endregion


        #region [ - Kangaroo - ]

        // Problem Link: https://www.hackerrank.com/challenges/kangaroo/problem

        private static string kangaroo(int x1, int v1, int x2, int v2)
        {

            for (int t=0; t <= 10000; t++)
            {
                x1 += v1;
                x2 += v2;

                if (x1 == x2)
                {
                    return "YES";
                }
            }
            return "NO";
        }

        public static void kangaroo_Main()
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            string[] x1V1X2V2 = Console.ReadLine().Split(' ');

            int x1 = Convert.ToInt32(x1V1X2V2[0]);

            int v1 = Convert.ToInt32(x1V1X2V2[1]);

            int x2 = Convert.ToInt32(x1V1X2V2[2]);

            int v2 = Convert.ToInt32(x1V1X2V2[3]);

            string result = kangaroo(x1, v1, x2, v2);

            Console.WriteLine(result);

            //textWriter.WriteLine(result);

            //textWriter.Flush();
            //textWriter.Close();
        }

        #endregion


        #region [ - Between Two Sets - ]

        // Problem Link: https://www.hackerrank.com/challenges/between-two-sets/problem

        private static int getTotalX(int[] a, int[] b)
        {
            var totalXs = 0;
            var maxA = a.Max(); 
            var minB = b.Min(); 
            var counter = 1;
            var multipleOfMaxA = maxA;

            while (multipleOfMaxA <= minB)
            {
                var factorOfAll = true;

                foreach (var item in a) 
                {
                    if (multipleOfMaxA % item != 0)
                    {
                        factorOfAll = false;
                        break;
                    }
                }

                if (factorOfAll)
                {
                    foreach (var item in b) 
                    {
                        if (item % multipleOfMaxA != 0)
                        {
                            factorOfAll = false;
                            break;
                        }
                    }
                }

                if (factorOfAll)
                    totalXs++;

                counter++;
                multipleOfMaxA = maxA * counter; 
            }

            return totalXs;
        }

        public static void getTotalX_Main()
        {
            //TextWriter tw = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            string[] nm = Console.ReadLine().Split(' ');

            int n = Convert.ToInt32(nm[0]);

            int m = Convert.ToInt32(nm[1]);

            int[] a = Array.ConvertAll(Console.ReadLine().Split(' '), aTemp => Convert.ToInt32(aTemp));

            int[] b = Array.ConvertAll(Console.ReadLine().Split(' '), bTemp => Convert.ToInt32(bTemp));

            int total = getTotalX(a, b);

            Console.WriteLine(total);

            //tw.WriteLine(total);

            //tw.Flush();
            //tw.Close();
        }

        #endregion


        #region [ - Staircase - ]

        // Problem Link: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

        private static int[] breakingRecords(int[] scores)
        {
            int higest, lowest, score;
            int[] resultArray = new int[2];


            higest = lowest = scores[0];
            for (int i=1; i< scores.Length; i++)
            {
                score = scores[i];
                if (score > higest)
                {
                    higest = score;
                    resultArray[0]++;
                }
                else if (score < lowest)
                {
                    lowest = score;
                    resultArray[1]++;
                }
            }

            return resultArray;
        }

        public static void breakingRecords_Main()
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int n = Convert.ToInt32(Console.ReadLine());

            int[] scores = Array.ConvertAll(Console.ReadLine().Split(' '), scoresTemp => Convert.ToInt32(scoresTemp));

            int[] result = breakingRecords(scores);

            Console.WriteLine(string.Join(" ", result));

            //textWriter.WriteLine(string.Join(" ", result));

            //textWriter.Flush();
            //textWriter.Close();
        }

        #endregion


        #region [ - Birthday Chocolate - ]

        // Problem Link: https://www.hackerrank.com/challenges/the-birthday-bar/problem

        private static int birthday(List<int> s, int d, int m)
        {
            int result = 0;

            for (int i=0; i<s.Count; i++)
            {
                if (i + m > s.Count) { break; }

                int sum = s[i];
                for (int j=1; j<m; j++)
                {
                    sum += s[i + j];
                }

                if (sum == d) { result++; }
            }

            return result;
        }

        public static void birthday_Main()
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int n = Convert.ToInt32(Console.ReadLine().Trim());

            List<int> s = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(sTemp => Convert.ToInt32(sTemp)).ToList();

            string[] dm = Console.ReadLine().TrimEnd().Split(' ');

            int d = Convert.ToInt32(dm[0]);

            int m = Convert.ToInt32(dm[1]);

            int result = birthday(s, d, m);

            Console.WriteLine(result);

            //textWriter.WriteLine(result);

            //textWriter.Flush();
            //textWriter.Close();
        }

        #endregion


        #region [ - Divisible Sum Pairs - ]

        // Problem Link: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

        private static int divisibleSumPairs(int n, int k, int[] ar)
        {
            int result = 0;

            for (int i=0; i<ar.Length; i++)
            {
                for (int j=ar.Length - 1; j>i; j--)
                {
                    if ((ar[i] + ar[j]) % k == 0)
                    {
                        result++;
                    }
                }
            }

            return result;
        }

        public static void divisibleSumPairs_Main()
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            string[] nk = Console.ReadLine().Split(' ');

            int n = Convert.ToInt32(nk[0]);

            int k = Convert.ToInt32(nk[1]);

            int[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt32(arTemp));

            int result = divisibleSumPairs(n, k, ar);

            Console.WriteLine(result);

            //textWriter.WriteLine(result);

            //textWriter.Flush();
            //textWriter.Close();
        }

        #endregion


        #region [ - Migratory Birds - ]

        // Problem Link: https://www.hackerrank.com/challenges/migratory-birds/problem

        private static int migratoryBirds(List<int> arr)
        {
            Dictionary<int, int> dictionary = new Dictionary<int, int>();
            int maxValue = 0;

            foreach (int value in arr)
            {
                if (!dictionary.ContainsKey(value))
                {
                    dictionary.Add(value, 1);
                }
                else
                {
                    dictionary[value] = ++dictionary[value];
                }

                if (dictionary[value] > maxValue)
                {
                    maxValue = dictionary[value];
                }
            }

            int id = -1;
            foreach (KeyValuePair<int,int> pair in dictionary)
            {
                if (maxValue == pair.Value)
                {
                    if (id == -1)
                    {
                        id = pair.Key;
                    }
                    else if (id != -1 && pair.Key < id)
                    {
                        id = pair.Key;
                    }
                }
            }

            return id;
        }

        public static void migratoryBirds_Main()
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int arrCount = Convert.ToInt32(Console.ReadLine().Trim());

            List<int> arr = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(arrTemp => Convert.ToInt32(arrTemp)).ToList();

            int result = migratoryBirds(arr);

            Console.WriteLine(result);

            //textWriter.WriteLine(result);

            //textWriter.Flush();
            //textWriter.Close();
        }

        #endregion


        #region [ - Day of the Programmer - ]

        // Problem Link: https://www.hackerrank.com/challenges/day-of-the-programmer/problem

        private static string dayOfProgrammer(int year)
        {
            if (year == 1918) { return "26.09.1918"; }
            else if(year % 4 == 0 && (year < 1918 || year % 400 == 0 || year % 100 != 0))
            {
                return "12.09." + year;
            }
            return "13.09." + year;
        }

        public static void dayOfProgrammer_Main()
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int year = Convert.ToInt32(Console.ReadLine().Trim());

            string result = dayOfProgrammer(year);

            Console.WriteLine(result);

            //textWriter.WriteLine(result);

            //textWriter.Flush();
            //textWriter.Close();
        }

        #endregion


        #region [ - Bon Appétit - ]

        // Problem Link: https://www.hackerrank.com/challenges/bon-appetit/problem

        private static void bonAppetit(List<int> bill, int k, int b)
        {
            int sum = 0;
            for (int i=0; i<bill.Count; i++)
            {
                if (i == k) { continue; }
                sum += bill[i];
            }

            sum = sum / 2; 
            if (sum == b)
            {
                Console.WriteLine("Bon Appetit");
            }
            else
            {
                Console.WriteLine( (b - sum).ToString() );
            }
        }

        public static void bonAppetit_Main()
        {
            string[] nk = Console.ReadLine().TrimEnd().Split(' ');

            int n = Convert.ToInt32(nk[0]);

            int k = Convert.ToInt32(nk[1]);

            List<int> bill = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(billTemp => Convert.ToInt32(billTemp)).ToList();

            int b = Convert.ToInt32(Console.ReadLine().Trim());

            bonAppetit(bill, k, b);
        }

        #endregion


        #region [ - Sock Merchant - ]

        // Problem Link: https://www.hackerrank.com/challenges/sock-merchant/problem

        private static int sockMerchant(int n, int[] ar)
        {
            int pair = 0;

            Dictionary<int, int> dic = new Dictionary<int, int>();
            foreach (int value in ar)
            {
                if (!dic.ContainsKey(value))
                {
                    dic.Add(value, 1);
                }
                else
                {
                    dic[value] += 1;
                }
            }

            foreach (KeyValuePair<int, int> keyValue in dic)
            {
                int sum = keyValue.Value;
                while(true)
                {
                    if(sum - 2 == 0)
                    {
                        pair++;
                        break;
                    }
                    else if ( sum - 2 < 0)
                    {
                        break;
                    }
                    else
                    {
                        pair++;
                        sum -= 2;
                    }
                }
            }

            return pair;
        }

        public static void sockMerchant_Main()
        {
            //TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int n = Convert.ToInt32(Console.ReadLine());

            int[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt32(arTemp))
            ;
            int result = sockMerchant(n, ar);

            Console.WriteLine(result);

            //textWriter.WriteLine(result);

            //textWriter.Flush();
            //textWriter.Close();
        }

        #endregion

    }
}
