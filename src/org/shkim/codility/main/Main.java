package org.shkim.codility.main;

import org.shkim.codility.stacksandqueues.StoneWalls;

public class Main
{

	public static void main(String[] args)
	{

		int H[] = {8,8,5,7,9,8,7,4,8};

		int t = StoneWalls.solution(H);

		System.out.println(t);
	}
}
