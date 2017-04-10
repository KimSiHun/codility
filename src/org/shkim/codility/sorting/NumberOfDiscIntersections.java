package org.shkim.codility.sorting;

import java.util.Arrays;

/**
 * 
 * http://stackoverflow.com/questions/14042447/counting-disk-intersections-using-treeset
 * @author parad
 *
 */
public class NumberOfDiscIntersections
{
	public static int solution(int A[])
	{

		int N = A.length;

		int left[] = new int[N];
		int right[] = new int[N];

		int max_length = 100000;
		
		for (int i = 0; i < N; i++)
		{
			left[i] = i - A[i];
			right[i] = i + A[i] - max_length;
		}
		
		Arrays.sort(left);
		Arrays.sort(right);

		
		
		
		return 0;
	}
}