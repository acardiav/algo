package IM시험대비;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2527_직사각형 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i = 0; i < 4; i++) {
			int a1 = 0, b1 = 0, a4 = 0, b4 = 0, c1 = 0, d1 = 0, c4 = 0, d4 = 0;
			st = new StringTokenizer(in.readLine(), " ");

			a1 = Integer.parseInt(st.nextToken());
			b1 = Integer.parseInt(st.nextToken());
			a4 = Integer.parseInt(st.nextToken());
			b4 = Integer.parseInt(st.nextToken());
			c1 = Integer.parseInt(st.nextToken());
			d1 = Integer.parseInt(st.nextToken());
			c4 = Integer.parseInt(st.nextToken());
			d4 = Integer.parseInt(st.nextToken());

			if ((c1 == a4 && b4 == d1) || (a1 == c4 && b4 == d1) || (c4 == a1 && b1 == d4) || (a4 == c1 && b1 == d4)) {
				System.out.println("c");
			} else if ((a4 == c1 && b4 != d1) || (b4 == d1 && a4 != c1) || (a1 != c4 && b1 == d4)
					|| (a1 == c4 && b1 != d4)) {
				System.out.println("b");
			} else if ((a4 < c1) || (c4 < a1) || (b4 < d1) || (b1 > d4)) {
				System.out.println("d");
			} else {
				System.out.println("a");
			}
		}
	}

}
