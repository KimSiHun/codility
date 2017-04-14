package org.shkim.codility.test;

import java.util.Arrays;
import java.util.HashSet;

public class task4
{



	private static int solution2(int A[])
	{

		int N = A.length;

		if (N == 1)
		{
			return 1;
		}

		HashSet<String> keys = new HashSet<>();
		for (int i = 0; i < N; i++)
		{
			keys.add(String.valueOf(A[i]));
		}
		int key_size = keys.size();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++)
		{
			sb.append(A[i]);
		}

		String line = new String(sb);
		String checker = null;

		int temp[] = new int[key_size];
		int chk;

		int result = Integer.MAX_VALUE;

		int minus = 0;

		for (int i = 0; i < N; i++)
		{

			if (i > N - key_size)
			{
				break;
			}
			checker = line.substring(i);

			chk = 0;
			for (String j : keys)
			{
				temp[chk] = checker.indexOf(j);
				chk++;
			}

			Arrays.sort(temp);

			minus = temp[key_size - 1] - temp[0];

			if (temp[0] != -1 && (minus + 1) < result)
			{
				result = minus + 1;
			}
		}

		return result;
	}

	private static int solution(int A[])
	{

		int N = A.length;

		if (N == 1)
		{
			return 1;
		}

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < N; i++)
		{
			set.add(A[i]);
		}

		HashSet<Integer> copy;

		int temp = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++)
		{
			copy = new HashSet<>();

			copy.addAll(set);

			for (int j = i; j < N; j++)
			{
				if (copy.contains(A[j]))
				{
					copy.remove(A[j]);
				}

				if (copy.isEmpty())
				{
					if (j - i + 1 < temp)
					{
						temp = j - i + 1;
					}
					break;
				}
			}
		}

		return temp;
	}

	public static void main(String[] args)
	{

		int A[] = { 7, 3, 7, 3, 1, 3, 4, 1 };
		System.out.println(solution2(A));
	}
}
