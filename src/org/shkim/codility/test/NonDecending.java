package org.shkim.codility.test;

public class NonDecending
{

	private static boolean solution(int A[])
	{

		int N = A.length;

		if (N == 0)
		{
			return false;
		}else if(N == 1)
		{
			return true;
		}
		
		
		int cnt = 0;
		int temp = 0;

		for (int i = 0; i < N; i++)
		{
			if (A[i] > temp)
			{
				temp = A[i];
			} else
			{
				if (i != N - 1 && A[i] == A[i + 1])
				{
					continue;
				}
				cnt++;
			}
			if (cnt > 1)
			{
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args)
	{
		int A[] = { 1, 3, 5, 3, 4 };
		System.out.println(solution(A));
	}
}
