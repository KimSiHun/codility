package org.shkim.codility.prefixsums;

public class MinAvgTwoSlice {

	public static int solution(int A[]) {

		// prefix
		// set slice arange (P,Q)
		// 0 <= P < Q < N
		// N is A.length
		int N = A.length;

		// 나올 수 있는 가정? count
		int T = (N - 1) * (N) / 2;
		String temp[] = new String[T];
		int t = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = 1; j < N; j++) {
				if (i >= j) {
					continue;
				}
				temp[t] = i + "," + j;
				t++;
			}
		}

		int P = 0;
		int Q = 0;
		int sum = 0;
		String set[] = new String[2];
		int temp_result[] = new int[T];
		for (int i = 0; i < temp.length; i++) {
			set = temp[i].split(",");
			P = Integer.parseInt(set[0]);
			Q = Integer.parseInt(set[1]);
			sum = 0;
			for (int j = P; j < Q + 1; j++) {
				sum += A[j];
			}
			temp_result[i] = sum / (Q+1-P);
		}

		// 계산 결과값 담아놓을

		for (int i = 0; i < N; i++) {

		}

		return 0;
	}

}
