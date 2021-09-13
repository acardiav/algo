package programmers;

public class Solution_로또의최고순위와최저순위 {

	public static void main(String[] args) {
		int lotto[] = { 44, 1, 0, 0, 31, 25 };
		int win[] = { 31, 10, 45, 1, 6, 19 };
		int answer[] = new int[2];
		int cnt = 0;
		int cnt0 = 0;

		for (int i = 0; i < 6; i++) {
			if (lotto[i] == 0) {
				cnt0++;
			}
			for (int j = 0; j < 6; j++) {
				if (lotto[i] == win[j]) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		System.out.println(cnt0);
		switch (cnt) {
		case 0:
			answer[1] = 6;
			break;
		case 1:
			answer[1] = 6;
			break;
		case 2:
			answer[1] = 5;
			break;
		case 3:
			answer[1] = 4;
			break;
		case 4:
			answer[1] = 3;
			break;
		case 5:
			answer[1] = 2;
			break;
		case 6:
			answer[1] = 1;
			break;
		default:
			break;
		}

		switch (cnt + cnt0) {
		case 0:
			answer[0] = 6;
			break;
		case 1:
			answer[0] = 6;
			break;
		case 2:
			answer[0] = 5;
			break;
		case 3:
			answer[0] = 4;
			break;
		case 4:
			answer[0] = 3;
			break;
		case 5:
			answer[0] = 2;
			break;
		case 6:
			answer[0] = 1;
			break;
		default:
			break;
		}

		System.out.println(answer[0] + " " + answer[1]);

	}

}
