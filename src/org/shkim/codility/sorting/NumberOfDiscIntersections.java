package org.shkim.codility.sorting;

import java.util.Arrays;

/**
 * 
 * https://codility.com/demo/results/trainingYA6DMP-EUY/ 81% arih , timeout
 * 
 * @author parad
 *
 */
public class NumberOfDiscIntersections
{
	public static int solution(int A[])
	{

		int N = A.length;

		// set exception
		if (A == null || N < 2)
		{
			return 0;
		}

		int temp[] = Arrays.copyOf(A, N);
		Arrays.sort(temp);

		for (int i = 0; i < temp.length; i++)
		{
			System.out.println(i+" - "+temp[i] + " "+ A[i]+ " ");
		}
		
		
		int big_position = temp[N - 1];

		int cnt = 0;

		for (int i = 0; i < N; i++)
		{
			for (int j = i + 1; j < N; j++)
			{
				if (j - big_position > i + A[i])
				{
					break;
				}

				if (j - A[j] <= i + A[i])
				{
					cnt++;
				}

				// exception
				if (cnt > 10000000)
				{
					return -1;
				}
			}
		}

		return cnt;
	}
}