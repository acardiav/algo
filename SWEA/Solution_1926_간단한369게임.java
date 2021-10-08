package a1008;

import java.util.Scanner;

public class Solution_1926_간단한369게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt(); // int형으로 입력받음

		// 1자리,2자리,3자리수로 나눠서 각각 자릿수들을 따지도록 분기
		// 각각의자릿수가 0이아니고 3으로나눴을때 나머지가 0이면 "-" 출력
		for (int i = 1; i <= n; i++) { // 1부터 입력받은수까지 하나씩 따져봄
			if (i < 10) { // 한자리수일때
				if (i % 10 != 0 && (i % 10) % 3 == 0) { // 일의자리가 3,6,9일때
					sb.append("- ");
				} else {
					sb.append(i + " ");
				}
			} else if (i < 100) { // 두자리수일때
				if (i / 10 != 0 && (i / 10) % 3 == 0) { // 십의자리가 3,6,9일때
					if (i % 10 != 0 && (i % 10) % 3 == 0) { // 일의자리가 3,6,9일때
						sb.append("-- ");
					} else {
						sb.append("- ");
					}
				} else {
					if (i % 10 != 0 && (i % 10) % 3 == 0) { // 일의자리가 3,6,9일때
						sb.append("- ");
					} else {
						sb.append(i + " ");
					}
				}
			} else { // 세자리수일때
				if (i / 100 != 0 && (i / 100) % 3 == 0) { // 백의자리가 3,6,9일때
					if (((i % 100) / 10) != 0 && ((i % 100) / 10) % 3 == 0) { // 십의자리가 3,6,9일때
						if (((i % 100) % 10) != 0 && ((i % 100) % 10) % 3 == 0) { // 일의자리가 3,6,9일때
							sb.append("--- ");
						} else {
							sb.append("-- ");
						}
					} else {
						if (((i % 100) % 10) != 0 && ((i % 100) % 10) % 3 == 0) { // 십의자리가 3,6,9일때
							sb.append("-- ");
						} else {
							sb.append("- ");
						}
					}
				} else {
					if (((i % 100) / 10) != 0 && ((i % 100) / 10) % 3 == 0) { // 십의자리가 3,6,9일때
						if (((i % 100) % 10) != 0 && ((i % 100) % 10) % 3 == 0) { // 일의자리가 3,6,9일때
							sb.append("-- ");
						} else {
							sb.append("- ");
						}
					} else {
						if (((i % 100) % 10) != 0 && ((i % 100) % 10) % 3 == 0) { // 일의자리가 3,6,9일때
							sb.append("- ");
						} else {
							sb.append(i + " ");
						}
					}
				}
			}
		}

		System.out.println(sb);
	}

}
