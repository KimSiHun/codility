package org.shkim.codility.main;

import org.shkim.codility.sorting.NumberOfDiscIntersections;
import org.shkim.codility.sorting.Triangle;

public class Main
{

	public static void main(String[] args)
	{

		int A[] = { 1,5,2,1,4,0 };

		int t = NumberOfDiscIntersections.solution(A);

		System.out.println(t);
	}
}
