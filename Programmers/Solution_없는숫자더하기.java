package programmers;

class Solution_없는숫자더하기 {
	public int solution(int[] numbers) {
		int answer = 0;
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		answer = 45 - sum;
		return answer;
	}
}
