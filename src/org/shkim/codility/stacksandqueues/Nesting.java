package org.shkim.codility.stacksandqueues;

public class Nesting
{
	public static int solution(String S)
	{
		int N = S.length();
		if (N % 2 != 0)
		{
			return 0;
		}

		char temp[] = S.toCharArray();

		int cnt = 0;

		for (Character c : temp)
		{
			if (c == '(')
			{
				cnt++;
			} else
			{
				if (--cnt < 0)
				{
					break;
				}
			}
		}

		int result = 0;
		if (cnt == 0)
		{
			result = 1;
		}

		return result;
	}

}
