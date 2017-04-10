package org.shkim.codility.prefixsums;

/**
 *  100% . it use slice avg get 2~3 is min
 * @author parad
 *
 */
public class MinAvgTwoSlice2
{

	public static int solution(int A[])
	{
		int N = A.length;

		double min = (A[0] + A[1]) / 2.0;
		int checker = 0;
		
		// 0 부터 A.length -1 까지
		for (int i = 0; i < N - 2; i++)
		{
			// slice 2
			if ((A[i] + A[i + 1]) / 2.0 < min)
			{
				min = (A[i] + A[i + 1]) / 2.0;
				checker = i;
			}
			// slice3
			if ((A[i] + A[i + 1] + A[i + 2]) / 3.0 < min)
			{
				min = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
				checker = i;
			}
		}

		// A.length -1 마지막으로 비교
		int max = A.length - 2;
		if ((A[max] + A[max + 1]) / 2.0 < min)
		{
			min = A[max] + A[max + 1] / 2.0;
			checker = max;
		}

		return checker;
	}

}
