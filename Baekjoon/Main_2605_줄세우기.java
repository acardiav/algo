package IM시험대비;

import java.util.Scanner;

public class Main_2605_줄세우기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		a[0] = 1;
		for (int i = 0; i < N; i++) {
			int ticket = sc.nextInt();
			for (int j = 0; j < N; j++) {
				if (ticket == 0) {
					a[i] = i + 1;
				}
				if (ticket == j && ticket > 0 && i >= 1) {
					for (int k = i; k > i - j; k--) {
						a[k] = a[k - 1];
					}
					a[i - j] = i + 1;
				}
			}
		}
		for (int k = 0; k < N; k++) {
			System.out.print(a[k] + " ");
		}

	}

}
