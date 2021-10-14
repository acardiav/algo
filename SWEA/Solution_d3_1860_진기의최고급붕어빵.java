package a1014;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1번째 사람이 도착한 시간에 붕어빵이 1개이상있어야함
 * 2번째 사람이 도착한 시간에 붕어빵이 2개이상있어야함
 * 3번째 사람이 도착한 시간에 붕어빵이 3개이상있어야함
 * ...
 * i번째 사람이 도착한 시간에 붕어빵이 i개이상있어야함
 */
public class Solution_d3_1860_진기의최고급붕어빵 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();

			int[] time = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				time[i] = sc.nextInt();
			}
			Arrays.sort(time);

			String check = "Possible";
			for (int i = 1; i <= N; i++) {
				if (i > (time[i] / M) * K) {
					check = "Impossible";
					break;
				}
			}

			sb.append("#").append(tc).append(" ").append(check).append("\n");
		}
		System.out.println(sb);
	}

}
