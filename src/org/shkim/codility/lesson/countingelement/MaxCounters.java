package org.shkim.codility.lesson.countingelement;

public class MaxCounters
{
	// 88 %. detect fail O(N+M)
	public static int[] solution(int N, int A[])
	{

		int temp[] = new int[N];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = 0;
		}

		int max = 0;

		for (int i = 0; i < A.length; i++)
		{

			if (A[i] == N + 1)
			{
				for (int j = 0; j < temp.length; j++)
				{

					temp[j] = max;
				}

			} else if (A[i] > 0 && A[i] < N + 1)
			{
				temp[A[i] - 1]++;

				if (max < temp[A[i] - 1])
				{
					max = temp[A[i] - 1];
				}
			}
		}

		return temp;
	}
}
