package programmers;

class Solution_124나라의숫자 {
	public String solution(int n) {
		String answer = "";
		String[] num = { "1", "2", "4" };

		while (n > 0) {
			int nam = n % 3;
			n /= 3;
			if (nam == 1) {
				answer = num[0] + answer;
			} else if (nam == 2) {
				answer = num[1] + answer;
			} else if (nam == 0) {
				n -= 1;
				answer = num[2] + answer;
			}

		}

		return answer;
	}
}