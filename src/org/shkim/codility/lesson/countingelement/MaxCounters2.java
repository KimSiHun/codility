package org.shkim.codility.lesson.countingelement;


/**
 * 
 * @author parad
 *	100% corrected
 */
public class MaxCounters2
{
	public static int[] solution(int N, int A[])
	{

		int temp[] = new int[N];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = 0;
		}

		int max = 0;
		int max_last = 0;
		int index = 0;

		for (int i = 0; i < A.length; i++)
		{
			if (A[i] < N+1)
			{
				index = A[i] - 1;
				if (temp[index] < max_last)
				{
					temp[index] = max_last;
				}
				temp[index]++;
				if (max < temp[index])
				{
					max = temp[index];
				}
			} else
			{
				max_last = max;
			}
		}
		
		for (int i = 0; i < temp.length; i++)
		{
			if (temp[i] < max_last)
			{
				temp[i] = max_last;
			}
		}
		
		return temp;
	}
}
