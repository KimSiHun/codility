package org.shkim.codility.leader;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * https://codility.com/demo/results/trainingFTV7XV-498/ 22%
 * 
 * @author parad
 *
 */

public class EquiLeader
{
	public static int solution(int A[])
	{

		int N = A.length;

		int cnt = 0;

		HashSet<Integer> left_key;
		HashSet<Integer> right_key;

		HashMap<Integer, Integer> left_map;
		HashMap<Integer, Integer> right_map;

		for (int i = 0; i < N; i++)
		{
			left_key = new HashSet<>();
			right_key = new HashSet<>();
			for (int j = 0; j < i + 1; j++)
			{
				left_key.add(A[j]);
			}

			left_map = new HashMap<>();
			for (int j = 0; j < i + 1; j++)
			{
				if (left_map.isEmpty())
				{
					left_map.put(A[j], 1);
				} else
				{
					if (null == left_map.get(A[j]))
					{
						left_map.put(A[j], 1);
					} else
					{
						left_map.put(A[j], left_map.get(A[j]) + 1);
					}
				}
			}
			
			
			
		}
		

		return cnt;
	}
}
