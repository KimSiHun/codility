package org.shkim.codility.demo;

public class Demo
{
	public static int solution(int A[])
	{

		int N = A.length;
		
		long in_left = 0;
		long in_right = 0;

		for (int i = 0; i < N; i++)
		{
			in_left = 0;
			in_right = 0;

			if (i != 0)
			{
				for (int j = 0; j < i; j++)
				{
					in_left += A[j];
				}
			}

			if (i != N-1)
			{
				
				for (int j = i + 1; j < N; j++)				
				{
					in_right += A[j];
				}				
			}
			
			if (in_left == in_right)
			{
				return i;
			}	
		}
		
		return -1;
	}
}
