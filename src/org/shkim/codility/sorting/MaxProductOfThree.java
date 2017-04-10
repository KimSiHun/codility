package org.shkim.codility.sorting;

import java.util.Arrays;

/**
 * https://codility.com/demo/results/trainingTR5F75-VDC/ 44% timeout
 * https://codility.com/demo/results/training5RGYMH-4PP/ 77%
 * https://codility.com/demo/results/training9H7QAW-SCH/ 100 %
 * 
 * @author parad
 *
 */
public class MaxProductOfThree
{
	public static int solution(int A[])
	{

		int N = A.length;

		int result = 1;
		if (N <= 3)
		{
			for (int i = 0; i < N; i++)
			{
				result *= A[i];
			}
			return result;
		}

		// sorting
		Arrays.sort(A);

		int max_1 = 0;
		int max_2 = 0;
		
		max_1 = A[N-1] * A[N-2] * A[N-3];
		max_2 = A[0] * A[1] * A[N-1];
		
		result = Math.max(max_1, max_2);

		return result;
	}
}
