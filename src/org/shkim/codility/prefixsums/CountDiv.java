package org.shkim.codility.prefixsums;

public class CountDiv
{
	public static int solution(int A, int B, int K)
	{

		int temp = 0;

		int rotation = 0;

		int gap = B - A;

		for (int i = A; i < B + 1; i++)
		{
			if (i % K == 0)
			{
				temp++;
				temp += (gap - rotation) / K;
				break;
			}
			rotation++;
		}

		return temp;
	}
}
