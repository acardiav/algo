package IM시험대비;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2491_수열 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int arr[] = new int[N];
		StringTokenizer st = new StringTokenizer(in.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int cnt1 = 1, cnt2 = 1;
		int result1 = 0, result2 = 0;
		for (int i = 0; i < N - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				cnt1++;
			} else {
				cnt1 = 1;
			}
			result1 = Math.max(cnt1, result1);
		}
		for (int i = 0; i < N - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				cnt2++;
			} else {
				cnt2 = 1;
			}
			result2 = Math.max(cnt2, result2);
		}
		int result = Math.max(result1, result2);
		System.out.println(result);
	}

}
