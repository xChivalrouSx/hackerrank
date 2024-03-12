using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Result
{
    // A Very Big Sum
    // https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true

    public static long aVeryBigSum(List<long> ar)
    {
        // --- You need to fill this method ---
        return ar.Sum();
    }

}

class Solution
{
    public static void Main(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int arCount = Convert.ToInt32(Console.ReadLine().Trim());

        List<long> ar = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(arTemp => Convert.ToInt64(arTemp)).ToList();

        long result = Result.aVeryBigSum(ar);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}
