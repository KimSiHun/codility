package org.shkim.codility.test;

import java.util.Arrays;
import java.util.HashSet;

public class Test
{

	private static int solution(int A[])
	{

		int N = A.length;
		
		Arrays.sort(A);

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < N; i++)
		{
			set.add(A[i]);
		}
		
		int size = set.size();
		
		int checker = 0;
		int cnt = 0;
		
		int result = 0;
		
		for (int i = 0; i < N-1; i++)
		{
			checker = A[i];
			if (i == 0)
			{
				cnt++;
			}else{
				if (checker != A[i+1])
				{
					cnt++;
				}
			}
			
			if (cnt == size)
			{
				result = i;
				break;
			}
			
		}
		
		return result;
	}

	public static void main(String[] args)
	{

		int A[] = { 7, 3, 7, 3, 1, 3, 4, 1 };
		System.out.println(solution(A));
	}
}
