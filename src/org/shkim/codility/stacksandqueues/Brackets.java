package org.shkim.codility.stacksandqueues;

import java.util.Stack;

public class Brackets
{
	private static void check_and_pop(Stack<Character> stack, char c)
	{
		if (!stack.isEmpty() && stack.peek() == c)
		{
			stack.pop();
		}
	}

	public static int solution(String s)
	{

		int N = s.length();
		if (N % 2 != 0)
		{
			return 0;
		}

		char temp[] = s.toCharArray();

		Stack<Character> stack = new Stack<>();

		for (Character t : temp)
		{
			switch (t)
			{
				case ')':
					check_and_pop(stack, '(');
					break;

				case '}':
					check_and_pop(stack, '{');
					break;
				case ']':
					check_and_pop(stack, '[');
					break;
				default:
					stack.push(t);
			}
		}

		int check = 0;
		if (stack.isEmpty())
		{
			check = 1;
		}

		return check;
	}
}
