package org.shkim.codility.lesson.countingelement;

import java.util.HashSet;

public class PermCheck
{

	public static int solution(int[] A){

		// 중복없어야 함
		int temp[] = A;
		HashSet<Integer> values = new HashSet<>();
		for (int i = 0; i < temp.length; i++)
		{
			if (values.contains(temp[i]))
			{
				return 0;
			}
			values.add(temp[i]);
		}
		// 빈 숫자 없어야 함
		long size = temp.length;
		long total = (long)size*(size+1)/2;
		for (int i = 0; i < temp.length; i++)
		{
			total -= temp[i];
		}
		
		if (total != 0L)
		{
			return 0;
		}
		
		return 1;
	}
	
}
