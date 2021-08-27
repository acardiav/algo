package a0827;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_2805_d3_농작물수확 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(in.readLine());
			int[][] map = new int[N][N];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), "");
				String str = st.nextToken();
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j) - 48;
				}
			}

			int sum = 0;
			for (int i = 0; i <= N / 2; i++) {
				for (int j = N / 2 - i; j <= N / 2 + i; j++) {
//					System.out.print(map[i][j]);
					sum += map[i][j];
				}
//				System.out.println();
			}
//			System.out.println(sum);
			for (int i = N / 2 - 1; i >= 0; i--) {
				for (int j = N / 2 - i; j <= N / 2 + i; j++) {
//					System.out.print(map[N - i - 1][j]);
					sum += map[N - i - 1][j];
				}
//				System.out.println();
			}
			System.out.println("#" + tc + " " + sum);
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
		}
	}

}
