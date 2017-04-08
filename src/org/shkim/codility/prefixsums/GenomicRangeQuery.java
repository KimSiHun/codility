package org.shkim.codility.prefixsums;

/**
 * 
 * @author parad
 * get 62%. String size large -> time out.
 */
public class GenomicRangeQuery {

	public static int[] solution(String S, int P[], int Q[]) {
		// N is an integer within the range [1..100,000];
		// M is an integer within the range [1..50,000];
		// each element of arrays P, Q is an integer within the range [0..N −
		// 1];
		// P[K] ≤ Q[K], where 0 ≤ K < M;
		// string S consists only of upper-case English letters A, C, G, T.
		// Complexity:

		int M = P.length;
		int result[] = new int[M];

		char sentences[] = S.toCharArray();

		int value = 0;
		String s = "";
		for (int i = 0; i < M; i++) {
			s = "";
			for (int j = P[i]; j <= Q[i]; j++) {
				s = s + sentences[j];
			}

			if (s.indexOf('A') != -1) {
				value = 1;
			} else if (s.indexOf('C') != -1) {
				value = 2;
			} else if (s.indexOf('G') != -1) {
				value = 3;
			} else if (s.indexOf('T') != -1) {
				value = 4;
			}
			result[i] = value;
		}

		return result;
	}

}
