package org.shkim.codility.prefixsums;

/**
 * 
 * https://codility.com/demo/results/trainingRC3F5N-DZ3/ has 60 % O(N **2)
 * 
 * @author parad
 *
 */
public class MinAvgTwoSlice {

	public static int solution(int A[]) {

		// prefix
		// set slice arange (P,Q)
		// 0 <= P < Q < N
		// N is A.length
		int N = A.length;

		double slice_avg = (A[0] + A[1]) / 2;
		int slice_position = 0;

		int sum = 0;
		double avg = 0;
		int t = 2;
		for (int i = 0; i < N - 1; i++) {
			sum = 0;
			t = 2;
			sum = A[i];
			for (int j = i + 1; j < N; j++) {
				sum += A[j];
				avg = (double) sum / t;

				t++;

				if (slice_avg > avg) {
					slice_avg = avg;
					slice_position = i;
				}
			}
		}

		return slice_position;
	}

}
