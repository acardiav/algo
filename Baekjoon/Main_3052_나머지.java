package IM시험대비;

import java.util.Scanner;

public class Main_3052_나머지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[43];
		int nam[] = new int[10];
		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			nam[i] = n % 42;
		}
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			arr[nam[i]]++;
		}
		for (int i = 0; i < 43; i++) {
			if (arr[i] != 0) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
