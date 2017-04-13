package org.shkim.codility.test;

import java.util.HashSet;

public class Test
{

	private static int solution(int A[])
	{

		int N = A.length;

		if (N == 1)
		{
			return 1;
		}
		
		
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < N; i++)
		{
			set.add(A[i]);
		}

		HashSet<Integer> copy;

		int temp = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++)
		{
			copy = new HashSet<>();

			copy.addAll(set);

			for (int j = i; j < N; j++)
			{
				if (copy.contains(A[j]))
				{
					copy.remove(A[j]);
				}

				if (copy.isEmpty())
				{
					if (j - i + 1 < temp)
					{
						temp = j - i + 1;
					}
					break;
				}
			}
		}

		return temp;
	}

	public static void main(String[] args)
	{

		int A[] = { 7, 3, 7, 3, 1, 3, 4, 1 };
		System.out.println(solution(A));
	}
}
