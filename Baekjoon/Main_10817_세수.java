package IM시험대비;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10817_세수 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[3];
		StringTokenizer st = new StringTokenizer(in.readLine());
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}

}
