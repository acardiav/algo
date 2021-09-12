package programmers;

public class Solution_키패드누르기 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int lefthand = 10;
		int righthand = 12;
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				sb.append("L");
				lefthand = numbers[i];
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				sb.append("R");
				righthand = numbers[i];
			} else {
				if (numbers[i] == 0) {
					numbers[i] = 11;
				}
				int row_lefthand = lefthand / 3;
				int col_lefthand = lefthand % 3;
				if (col_lefthand == 0) {
					col_lefthand = 3;
				}
				int row_righthand = (righthand - 1) / 3;
				int col_righthand = righthand % 3;
				if (col_righthand == 0) {
					col_righthand = 3;
				}
				int row_current = numbers[i] / 3;
				int col_current = numbers[i] % 3;
				if (col_current == 0) {
					col_current = 3;
				}
				int leftlength = Math.abs(row_lefthand - row_current) + Math.abs(col_lefthand - col_current);
				int rightlength = Math.abs(row_righthand - row_current) + Math.abs(col_righthand - col_current);
				if (leftlength > rightlength) {
					sb.append("R");
					righthand = numbers[i];
				} else if (leftlength < rightlength) {
					sb.append("L");
					lefthand = numbers[i];
				} else {
					if (hand.equals("left")) {
						sb.append("L");
						lefthand = numbers[i];
					} else if (hand.equals("right")) {
						sb.append("R");
						righthand = numbers[i];
					}
				}
			}
		}

		String answer = "";
		System.out.println(sb);
	}

}
