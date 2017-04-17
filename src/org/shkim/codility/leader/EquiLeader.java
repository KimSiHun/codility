package org.shkim.codility.leader;

/**
 * https://codility.com/demo/results/trainingFTV7XV-498/ 22%
 * 
 * @author parad
 *
 */

public class EquiLeader
{
	public static void main(String[] args)
	{
		int A[] = { 4, 3, 4, 4, 4, 2 };
		solution(A);
	}

	public static int solution(int A[])
	{

		int N = A.length;

		int cnt = 0;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++)
		{
			sb.append(A[i]);
		}

		String temp = new String(sb);

		for (int i = 0; i < temp.length() - 1; i++)
		{
			String left = temp.substring(0, i + 1);
			String right = temp.substring(left.length());

			char left_temp[] = left.toCharArray();
			char right_temp[] = right.toCharArray();

			int left_half = left.length() / 2;
			int right_half = right.length() / 2;

			System.out.println(left_temp.toString() + " " + right_temp.toString() + " " + " " + left_half + " " + right_half);

		}

		return cnt;
	}
}
