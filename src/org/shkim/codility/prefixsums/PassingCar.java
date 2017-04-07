package org.shkim.codility.prefixsums;

public class PassingCar
{

	public static int solution(int A[])
	{

		// A[i] == 0 east ==1 west

		int east = 0;
		int passingCar = 0;

		for (int i = 0; i < A.length; i++)
		{
			if (A[i] == 0)
			{
				east++;
			} else
			{
				passingCar += east;
			}
		}
		
		int result = 0;
		
		if (passingCar > 1000000000)
		{
			result = -1;
		}else{
			result = passingCar;
		}

		
		return result;
	}

}
