package org.shkim.codility.lessons;

/**
 * 
 * @author parad write gap of binary count 0 besides 1
 */
public abstract class BinaryGap
{
	public static int binary_get(int N)
	{

		int t = N;

		int cnt = 0;
		int big_one = 0;

		String binaries = Integer.toBinaryString(t);
		char binary_chars[] = binaries.toCharArray();

		char temp;

		for (int i = 0; i < binary_chars.length; i++)
		{
			temp = binary_chars[i];
			if (temp == '0')
			{
				cnt++;
			} else if (temp == '1')
			{
				if (cnt > big_one)
				{
					big_one = cnt;
				}
				cnt = 0;
			}
		}

		return big_one;
	}
}
