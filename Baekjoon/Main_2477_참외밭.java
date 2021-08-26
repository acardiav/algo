package a0825;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2477_참외밭 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int eastwest[] = new int[6];
		int northsouth[] = new int[6];
		int length[] = new int[6];
		int sero = 0, garo = 0, a = 0, b = 0;

		for (int i = 0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int dir1 = Integer.parseInt(st.nextToken());
			int len1 = Integer.parseInt(st.nextToken());

			length[i] = len1;
			if (dir1 == 1 || dir1 == 2) {
				eastwest[i] = len1;
			}
			if (dir1 == 3 || dir1 == 4) {
				northsouth[i] = len1;
			}
		}
//		for (int i = 0; i < 6; i++) {
//			System.out.print(northsouth[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < 6; i++) {
//			System.out.print(eastwest[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < 6; i++) {
//			System.out.print(length[i]);
//		}
		for (int i = 0; i < 6; i++) {
			sero = Math.max(northsouth[i], sero);
			garo = Math.max(eastwest[i], garo);
			if (length[i] == sero) {
				a = i;
			}
			if (length[i] == garo) {
				b = i;
			}
		}
		if (a + 3 >= 6) {
			a -= 3;
			a = length[a];
		} else {
			a = length[a + 3];
		}
		if (b + 3 >= 6) {
			b -= 3;
			b = length[b];
		} else {
			b = length[b + 3];
		}
		int result = 0;
		result = (garo * sero - a * b) * N;
		System.out.println(result);

	}

}