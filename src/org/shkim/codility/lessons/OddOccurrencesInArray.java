package org.shkim.codility.lessons;

public class OddOccurrencesInArray
{
	public static int oddOcuurencesInArray(int A[])
	{
		int elem = 0;
	
		int arr[] = A;
		
		for (int i = 0; i < arr.length; i++)
		{
			elem ^= arr[i];
		}

		return elem;
	}
}
