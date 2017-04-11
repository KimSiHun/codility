package org.shkim.codility.stacksandqueues;

import java.util.Stack;

public class Fish
{
	public static int solution(int A[], int B[])
	{

		int N = A.length;

		// if B[i] = 0 upstream
		// if B[i] = 1 down stream
		Stack<Integer> up = new Stack<>();
		Stack<Integer> down = new Stack<>();

		int f = 0;

		for (int i = 0; i < N; i++)
		{
			f = A[i];
			if (B[i] == 0)
			{
				while (down.size() != 0 && down.peek() < f)
				{
					down.pop();
				}
				if (down.size() == 0 || down.peek() == f)
				{
					up.push(f);
				}
			} else
			{
				down.push(f);
			}
		}

		return down.size() + up.size();
	}
}
