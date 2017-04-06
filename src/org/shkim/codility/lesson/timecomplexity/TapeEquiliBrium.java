package org.shkim.codility.lesson.timecomplexity;

public class TapeEquiliBrium
{

	public static int solution(int[] A)
	{

		long total = 0;
		long sum_left = 0;
		long sum_right = 0;

		for (int i = 0; i < A.length; i++)
		{
			{
				total += (long) A[i];
			}
		}

		int diff = 0;
		int smallest_diff = Integer.MAX_VALUE;

		for (int i = 0; i < A.length-1; i++)
		{
			sum_left += A[i];
			sum_right = total - sum_left;
			diff = (int) Math.abs(sum_left - sum_right);
			if (diff < smallest_diff)
			{
				smallest_diff = diff;
			}
		}

		return smallest_diff;
	}

}
