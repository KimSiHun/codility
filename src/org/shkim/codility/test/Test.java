package org.shkim.codility.test;

import java.util.Arrays;
import java.util.HashSet;

public class Test
{

	private static int solution(int A[])
	{

		int N = A.length;

		if (N ==0)
		{
			return 0;
		}
		
		Arrays.sort(A);

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < N; i++)
		{
			set.add(A[i]);
		}

		int checker = 0;
		int cnt = 0;

		for (int i = 0; i < N; i++)
		{
			checker = A[i];
			if (set.contains(checker))
			{
				set.remove(checker);
				cnt++;
			}
		}

		return cnt + 1;
	}

	public static void main(String[] args)
	{

		int A[] = { 7, 3, 7, 3, 1, 3, 4, 1 };
		System.out.println(solution(A));
	}
}
