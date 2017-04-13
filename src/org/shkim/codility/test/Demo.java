package org.shkim.codility.test;

/**
 * 
 * https://codility.com/demo/results/demoUMKAHB-74G/ 64%
 * 
 * @author parad
 *
 */
public class Demo
{

	public static void main(String[] args)
	{
		int A[] = { -1, 3, -4, 5, 1, -6, 2, 1 };
		System.out.println(solution(A));
	}

	private static int solution(int A[])
	{

		int N = A.length;

		if (N == 1)
		{
			return 0;
		} else if (N == 0)
		{
			return -1;
		}

		long in_left = 0;
		long in_right = 0;

		long all_sum = 0L;
		for (int i = 0; i < N; i++)
		{
			all_sum += A[i];
		}

		long temp = 0L;
		for (int i = 0; i < N; i++)
		{

			temp += A[i];

			if (i == 0)
			{
				in_left = 0;
				in_right = all_sum - A[i];
			} else if (i == N - 1)
			{
				in_left = all_sum - A[i];
				in_right = 0;
			} else
			{
				in_left = temp - A[i];
				in_right = all_sum - in_left - A[i];
			}

			if (in_left == in_right)
			{
				return i;
			}
		}

		return -1;
	}
}
