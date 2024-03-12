using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Result
{
	// Simple Array Sum
	// https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true

	public static int simpleArraySum(List<int> ar)
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

		List<int> ar = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(arTemp => Convert.ToInt32(arTemp)).ToList();

		int result = Result.simpleArraySum(ar);

		textWriter.WriteLine(result);

		textWriter.Flush();
		textWriter.Close();
	}
}
