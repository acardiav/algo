package IM시험대비;

import java.io.*;
import java.util.Stack;

public class Main_17413_단어뒤집기2 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char ch[] = in.readLine().toCharArray();
		Stack<Character> stack = new Stack<Character>();
		boolean a = true;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '<') {
				a = false;
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(ch[i]);
			} else if (ch[i] == '>') {
				a = true;
				sb.append(ch[i]);
			} else if (!a) {
				sb.append(ch[i]);
			} else {
				if (ch[i] == ' ') {
					while (!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(ch[i]);
				} else {
					stack.push(ch[i]);
				}
			}

		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);

//		StringTokenizer st = new StringTokenizer(in.readLine());
//		int cnt = st.countTokens();
//		String str = "";
//
//		for (int i = 0; i < cnt; i++) {
//			str = st.nextToken();
//			if (str.contains("<")) {
//				for (int j = 0; j < str.length(); j++) {
//					System.out.print(str.charAt(j));
//				}
//			} else {
//				for (int j = str.length() - 1; j >= 0; j--) {
//					System.out.print(str.charAt(j));
//				}
//			}
//			System.out.print(" ");
//		}

//		for (int i = 0; i < st.countTokens(); i++) {
//			str = st.nextToken();
//		}
//		System.out.println(str.charAt(0));

//		for (int i = str.length() - 1; i >= 0; i--) {
//			System.out.print(str.charAt(i));
//		}

	}

}
