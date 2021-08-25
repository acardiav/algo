package a0824;

import java.io.*;
import java.util.StringTokenizer;

public class Main_10163_색종이 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		int[][] map = new int[1001][1001];

		for (int tc = 0; tc < N; tc++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			for (int i = y1 + height - 1; i >= y1; i--) {
				for (int j = x1; j < x1 + width; j++) {
					map[i][j] = (tc + 1); // 나중에 덮는 색종이일수록 값증가
				}
			}
		}
		int[] cnt = new int[N + 1];
		for (int i = 0; i < 1001; i++) {
			for (int j = 0; j < 1001; j++) {
				cnt[map[i][j]] += 1; // map에있는 숫자들의 빈도 세기
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(cnt[i + 1]);
		}

	}
}
