package org.shkim.codility.lesson.timecomplexity;

public class PermMissingElem
{
	public static int solution(int[] A)
	{

		long N = A.length + 1;

		long total =  N * (N + 1) / 2;
		
		for (int i = 0; i < A.length; i++)
		{
			total -= A[i];
		}

		return (int)total;
	}
}
