package a0825;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2477_참외밭 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int eastwest[] = new int[4];
		int northsouth[] = new int[4];

		for (int i = 0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int dir1 = Integer.parseInt(st.nextToken());
			int len1 = Integer.parseInt(st.nextToken());

			if (dir1 == 1 || dir1 == 2) {
				eastwest[i] = len1;
			} else {
				northsouth[i] = len1;
			}
		}
		for (int i = 1; i < 4; i++) {
			int sero = Math.max(northsouth[i], northsouth[i - 1]);
			int garo = Math.max(eastwest[i], eastwest[i - 1]);
		}
		int cncn = 0;
	}

}
