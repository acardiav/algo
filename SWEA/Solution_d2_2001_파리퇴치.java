package a1013;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_d2_2001_파리퇴치 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {

			StringTokenizer st = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int map[][] = new int[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int ans = 0;
			for (int i = 0; i <= N - M; i++) {
				for (int j = 0; j <= N - M; j++) {
					int sum = 0;
					for (int r = 0; r < M; r++) {
						for (int c = 0; c < M; c++) {
							sum += map[i + r][j + c];

						}
					}
					ans = Math.max(ans, sum);
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
	}

}
