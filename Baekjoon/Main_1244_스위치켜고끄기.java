package a0914;

import java.util.Scanner;

public class Main_1244_스위치켜고끄기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int swi[] = new int[N + 1];
		swi[0] = 4;
		for (int i = 1; i <= N; i++) {
			swi[i] = sc.nextInt();
		}

		int M = sc.nextInt();
		int gender = 0;
		int num = 0;
		for (int i = 0; i < M; i++) {
			gender = sc.nextInt();
			num = sc.nextInt();

			if (gender == 1) {
				for (int j = 1; j <= N; j++) {
					if (j % num == 0) {
						if (swi[j] == 0) {
							swi[j] = 1;
						} else {
							swi[j] = 0;
						}
					}
				}
			} else {
				if (swi[num] == 0) {
					swi[num] = 1;
				} else {
					swi[num] = 0;
				}
				for (int j = 1; j <= N / 2; j++) {
					if (num - j > 0 && num + j <= N) {
						if (swi[num - j] == swi[num + j]) {
							if (swi[num - j] == 0 && swi[num + j] == 0) {
								swi[num - j] = 1;
								swi[num + j] = 1;
							} else {
								swi[num - j] = 0;
								swi[num + j] = 0;
							}
						} else {
							break;
						}
					} else {
						break;
					}
				}
			}
		}

		for (int k = 1; k <= N; k++) {
			System.out.print(swi[k] + " ");
			if (k % 20 == 0) {
				System.out.println();
			}
		}

	}

}
