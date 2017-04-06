package org.shkim.codility.lesson.arrays;

public class CyclicRotation
{

	public static int[] solution(int[] A, int K)
	{

		int t = A.length;
		if (t == 0)
		{
			return A;
		}
		if (K >= t)
		{
			K %= t;
		}
		if (K == 0)
		{
			return A;
		}

		int[] temp = new int[K];

		for (int i = K - 1; i >= 0; i--)
		{
			temp[i] = A[A.length - (i + 1)];
		}

		for (int i = A.length - 1; i >= K; i--)
		{
			A[i] = A[i - K];
		}

		int k = 0;
		for (int i = K - 1; i >= 0; i--)
		{
			A[k] = temp[i];
			k++;
		}

		return A;
	}

}
