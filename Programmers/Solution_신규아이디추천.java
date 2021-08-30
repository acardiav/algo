package programmers;

import java.io.*;

public class Solution_신규아이디추천 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		str = in.readLine();

		String str1 = str.toLowerCase();
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (('A' <= str1.charAt(i) && str1.charAt(i) <= 'Z') || ('a' <= str1.charAt(i) && str1.charAt(i) <= 'z')
					|| ('0' <= str1.charAt(i) && str1.charAt(i) <= '9') || str1.charAt(i) == '-'
					|| str1.charAt(i) == '_' || str.charAt(i) == '.') {
				str2 += str1.charAt(i);
			}
		}
		String str3 = str2;

		while (str3.contains("..")) {
			str3 = str3.replace("..", ".");
		}

		String str4 = str3;
		System.out.println(str4);
		if (str4.length() > 0) {
			if (str4.charAt(0) == '.') {
				str4 = str4.substring(1, str4.length());
			}
		}
		System.out.println(str4);
		if (str4.length() > 0) {
			if (str4.charAt(str4.length() - 1) == '.') {
				str4 = str4.substring(0, str4.length() - 1);
			}
		}

		if (str4.equals("")) {
			str4 += "a";
		}
		System.out.println(str4);
		String str5 = "";
		if (str4.length() > 15) {
			str5 = str4.substring(0, 15);
		} else {
			str5 = str4;
		}
		int e = str5.length() - 1;
		if (str5.charAt(e) == '.') {
			str5 = str5.substring(0, e);
		}
		System.out.println(str5);
		String answer = "";
		if (str5.length() == 1) {
			System.out.println(str5.concat(str5).concat(str5));
		} else if (str5.length() == 2) {
			char d = str5.charAt(1);
			str5 += d;
			System.out.println(str5);
		} else
			System.out.println(str5);

	}

}
