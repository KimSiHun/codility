package org.shkim.codility.lesson.countingelement;

public class FrogRiverOne
{
	public static int solution(int X, int A[])
	{

		int step = X;
		int temp[] = new int[step];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = i+1;
		}
		
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] > X || temp[A[i]-1] != 0)
			{		
				temp[A[i]-1] = 0;
				step --;
			}
			
			if (step == 0)
			{
				return i;
			}
		}
		return -1;
	}
}
