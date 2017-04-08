package org.shkim.codility.prefixsums;

public class GenomicRangeQuery2 {

	public static int[] solution(String S, int P[], int Q[]) {
		// N is an integer within the range [1..100,000];
		// M is an integer within the range [1..50,000];
		// each element of arrays P, Q is an integer within the range [0..N −
		// 1];
		// P[K] ≤ Q[K], where 0 ≤ K < M;
		// string S consists only of upper-case English letters A, C, G, T.

		char temp[] = S.toCharArray();
		int N = S.length();
		int M = P.length;
		int set[][] = new int[N][4];
		int result[] = new int[M];

		char c = 0;
		for (int i = 0; i < temp.length; i++) {
			c = temp[i];
			switch (c) {
			case 'A':
				set[i][0] = 1;
				break;
			case 'C':
				set[i][1] = 1;
				break;
			case 'G':
				set[i][2] = 1;
				break;
			case 'T':
				set[i][3] = 1;
				break;
			default:
				break;
			}
		}

		for (int i = 1; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				set[i][j] += set[i - 1][j];
			}
		}
		int X = 0;
		int Y = 0;
		int sub = 0;
		for (int i = 0; i < M; i++) {
			X = P[i];
			Y = Q[i];
			sub = 0;
			for (int j = 0; j < 4; j++) {
				if (X-1>=0) {
					sub = set[X-1][j];
				}
				if (set[Y][j] - sub > 0) {
					result[i] = j+1;
					break;
				}
			}
		}

		return result;
	}
}
