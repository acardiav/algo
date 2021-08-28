package IM시험대비;

import java.io.*;
import java.util.Arrays;

public class Main_2309_일곱난쟁이 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] a = new int[9];
		int s1 = 0, s2 = 0, sum = 0;
		for (int i = 0; i < 9; i++) {
			a[i] = Integer.parseInt(in.readLine());
			sum += a[i];
		}
		Arrays.sort(a);
//		System.out.println(sum);
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (a[i] + a[j] == sum - 100) {
//					System.out.println(a[i] + " " + a[j]);
					s1 = i;
					s2 = j;
				}
			}
		}
		for (int i = 0; i < 9; i++) {
			if (i == s1 || i == s2) {
				continue;
			}
			sb.append(a[i]).append("\n");
		}
		System.out.println(sb);

	}

}
