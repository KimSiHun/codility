package org.shkim.codility.lesson.countingelement;

import java.util.HashSet;

public class MissingInteger
{
	public static int solution(int A[])
	{

		int result = 1;

		// 중복제거용
		HashSet<Integer> checker = new HashSet<>();

		for (int i = 0; i < A.length; i++)
		{
			if (A[i] > 0)
			{
				checker.add(A[i]);
			}
		}

		while (checker.contains(result))
		{
			result++;
		}

		return result;
	}
}
