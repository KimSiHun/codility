package org.shkim.codility.maximumsliceproplem;

public class MaxDoubleSliceSum
{
	public static int double_slice(int A[], int X, int Y, int Z)
	{
		int sum = 0;
		for (int i = X + 1; i < Z; i++)
		{
			sum += A[i];
		}

		return sum - A[Y];
	}

	public static int solution(int A[])
	{

		// 0 ≤ X < Y < Z < N
		int N = A.length;

		int Y[] = new int[N];
		for (int i = 1; i < N - 1; i++)
		{
			Y[i] = Math.max(Y[i - 1] + A[i], 0);
		}

		int Z[] = new int[N];
		for (int i = N - 2; i > 0; i--)
		{
			Z[i] = Math.max(Z[i + 1] + A[i], 0);
		}

		int max = 0;

		for (int i = 1; i < N - 1; i++)
		{
			max = Math.max(max, Y[i - 1] + Z[i + 1]);
		}
		
		return max;
	}

}
