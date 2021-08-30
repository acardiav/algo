package IM시험대비;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2559_수열 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];

		st = new StringTokenizer(in.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		int result = -10000001;
		for (int i = 0; i <= N - K; i++) {
			for (int j = 0; j < K; j++) {
				sum += arr[i + j];
//				sum += Math.max(sum, arr[j]);
			}
//			System.out.println(sum);
			result = Math.max(sum, result);
			sum = 0;
		}

		System.out.println(result);
	}

}
