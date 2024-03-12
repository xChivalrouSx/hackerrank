using System;

class Solution
{
	// Solve Me First
	// https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true

	static int solveMeFirst(int a, int b)
	{
		// --- You need to fill this method ---
		return a + b;
	}

	public static void Main(String[] args)
	{
		int val1 = Convert.ToInt32(Console.ReadLine());
		int val2 = Convert.ToInt32(Console.ReadLine());
		int sum = solveMeFirst(val1, val2);
		Console.WriteLine(sum);
	}

}
