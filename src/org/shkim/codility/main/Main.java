package org.shkim.codility.main;

import org.shkim.codility.prefixsums.GenomicRangeQuery2;
import org.shkim.codility.prefixsums.MinAvgTwoSlice;

public class Main
{

	public static void main(String[] args)
	{

		int A[] = {4,2,2,5,1,5,8};

		int t = MinAvgTwoSlice.solution(A);

		System.out.println(t);
	}
}
