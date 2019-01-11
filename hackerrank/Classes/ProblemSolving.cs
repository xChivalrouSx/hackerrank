using System;
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

        public static void solveMeFirst_Main()
        {
            int val1 = Convert.ToInt32(Console.ReadLine());
            int val2 = Convert.ToInt32(Console.ReadLine());
            int sum = solveMeFirst(val1, val2);
            Console.WriteLine(sum);
        }

        private static int solveMeFirst(int a, int b)
        {
            // Hint: Type return a+b; below  
            return a + b;
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
            TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int arCount = Convert.ToInt32(Console.ReadLine());

            int[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt32(arTemp))
            ;
            int result = simpleArraySum(ar);

            textWriter.WriteLine(result);

            textWriter.Flush();
            textWriter.Close();
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
            TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int arCount = Convert.ToInt32(Console.ReadLine());

            long[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt64(arTemp))
            ;
            long result = aVeryBigSum(ar);

            textWriter.WriteLine(result);

            textWriter.Flush();
            textWriter.Close();
        }

        #endregion


        #region [ - Diagonal Difference - ]

        // Problem Link: https://www.hackerrank.com/challenges/diagonal-difference/problem

        private static int diagonalDifference(int[][] arr)
        {
            


        }

        public static void diagonalDifference_Main()
        {
            TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int n = Convert.ToInt32(Console.ReadLine());

            int[][] arr = new int[n][];

            for (int i = 0; i < n; i++)
            {
                arr[i] = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
            }

            int result = diagonalDifference(arr);

            textWriter.WriteLine(result);

            textWriter.Flush();
            textWriter.Close();
        }

        #endregion

    }
}
