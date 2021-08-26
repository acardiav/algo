package a0826;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_7236_저수지의물의총깊이구하기 {

	static int N, sum;
	static int result;
	static char[][] map;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(in.readLine());
			map = new char[N][N];

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = st.nextToken().charAt(0);
				}
			}
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					System.out.print(map[i][j] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println(water(1, 1));
			int cnt = 0;
			result = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 'W') {
						cnt = water(i, j);
					}
					result = Math.max(cnt, result);
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

	private static int water(int x, int y) {
		int dr[] = { -1, 1, 0, 0, -1, -1, 1, 1 };
		int dc[] = { 0, 0, -1, 1, 1, -1, -1, 1 };
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			int ni = x + dr[i];
			int nj = y + dc[i];
			if (0 <= ni && ni < N && 0 <= nj && nj < N) {
				if (map[ni][nj] == 'W') {
					cnt++;
				}
			}
		}
		if (cnt == 0)
			cnt = 1;
		return cnt;
	}

}
