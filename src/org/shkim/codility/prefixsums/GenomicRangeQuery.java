package org.shkim.codility.prefixsums;

public class GenomicRangeQuery
{

	public static int[] solution(String S, int P[], int Q[])
	{

		char temp[] = S.toCharArray();

		int M = P.length;
		int result[] = new int[M];
		int value = 0;
		int round = 0;
		String s = null;

		char term[];

		for (int i = 0; i < M; i++)
		{
			round = Q[i] - P[i];
			if (round <= 0)
			{
				s = temp[P[i]] + "";
			} else
			{
				term = new char[Q[i] - P[i] + 1];
				for (int j = P[i]; j <= Q[i]; j++)
				{
					term[j-P[i]] = temp[j];
				}
				
				for (int j = 0; j < term.length; j++)
				{
					s = s+term[j];
				}
			}
			
			if (s.indexOf("A") != -1)
			{
				value = 1;
			}else if(s.indexOf("C") != -1){
				value = 2;
			}else if(s.indexOf("G") != -1){
				value = 3;
			}else if(s.indexOf("T") != -1){
				value = 4;
			}
			result[i] = value;
		}

		return result;
	}

}
