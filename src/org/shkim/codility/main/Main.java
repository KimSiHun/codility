package org.shkim.codility.main;

import org.shkim.codility.prefixsums.GenomicRangeQuery;
import org.shkim.codility.prefixsums.PassingCar;

public class Main
{

	public static void main(String[] args)
	{

		String S = "CAGCCTA";
		int P[] = { 2, 5, 0 };
		int Q[] = { 4, 5, 6 };

		int t[] = GenomicRangeQuery.solution(S, P, Q);

		for (int i = 0; i < t.length; i++)
		{
			System.out.println(t[i]);
		}
	}
}
