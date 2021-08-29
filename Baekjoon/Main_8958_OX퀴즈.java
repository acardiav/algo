package IM시험대비;

import java.io.*;

public class Main_8958_OX퀴즈 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
//			StringTokenizer st = new StringTokenizer(in.readLine());
			String str = "";
			str = in.readLine();
//			int len = st.countTokens();
//			System.out.println(len);

			char arr[] = new char[str.length()];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = str.charAt(j);
			}
			int cnt = 0;
			int result = 0;
			for (int j = 0; j < arr.length; j++) {
				cnt++;
				if (arr[j] == 'X') {
					cnt = 0;
					result += cnt;
				}
				result += cnt;
			}
			System.out.println(result);
		}
	}

}
