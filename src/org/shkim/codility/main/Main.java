package org.shkim.codility.main;

import org.shkim.codility.prefixsums.PassingCar;

public class Main
{

	public static void main(String[] args)
	{

		int A[] = { 0, 1, 0, 1, 1 };

		int t = PassingCar.solution(A);

		System.out.println(t);
	}
}
