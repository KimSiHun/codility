package org.shkim.codility.sorting;

import java.util.HashSet;

/**
 * https://codility.com/demo/results/trainingE437UV-PU6/ 41% not allow 0
 * https://codility.com/demo/results/trainingB2WS6U-TKT/ 75% timeout
 * last this code is 100 use hashset.
 * 
 * @author parad
 *
 */
public class Distinct
{
	public static int solution(int A[])
	{

		int N = A.length;
		HashSet<Integer> set = new HashSet<>();
		
		for (int i = 0; i < N; i++)
		{
			set.add(A[i]);
		}
		
		int cnt = set.size();
		
		return cnt;
	}
}
