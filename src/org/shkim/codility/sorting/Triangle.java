package org.shkim.codility.sorting;

import java.util.Arrays;

/**
 * 
 * https://codility.com/demo/results/trainingMCR5WG-M2H/ 93 % extreme_arih_overflow? 
 * https://codility.com/demo/results/training5HKZN3-Y9Z/ 100 %
 * @author parad
 *
 */

public class Triangle
{

	public static int solution(int A[])
	{

		// A[P] + A[Q] > A[R],
		// A[Q] + A[R] > A[P],
		// A[R] + A[P] > A[Q].

		int N = A.length;

		int result = 0;

		Arrays.sort(A);

		for (int i = 0; i < N - 2; i++)
		{
			if (A[i] > A[i + 2] - A[i + 1] && A[i + 1] > A[i] - A[i + 2] && A[i + 2] > A[i + 1] - A[i])
			{
				result = 1;
				return result;
			}
		}

		return result;

	}
}
