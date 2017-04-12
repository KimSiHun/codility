package org.shkim.codility.leader;

import java.util.HashMap;
import java.util.HashSet;

public class Dominator
{

	public static int solution(int A[])
	{

		int N = A.length;

		if (N == 0)
		{
			return -1;
		}
		
		int half = N / 2;

		HashSet<Integer> key = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++)
		{
			key.add(A[i]);
			if (null == map.get(A[i]))
			{
				map.put(A[i], 1);
			} else
			{
				map.put(A[i], map.get(A[i]) +1);
			}
			
		}
		
		for (Integer i : key)
		{
			if (map.get(i) <= half)
			{
				map.remove(i);
			}
		}
		
		for (int i = 0; i < N; i++)
		{
			if (map.keySet().contains(A[i]))
			{
				return i;
			}
		}
		

		return -1;
	}

}
